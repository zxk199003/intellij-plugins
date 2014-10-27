class Object {
  var x;
  int foo() {
    bar().baz();
    return 42;
  }
  bar(int x, int y, z) { }
}

class X = Y;
class X = Y implements Z;
abstract class ListBase<E> = Object with ListMixin<E>;
class Z = foo.bar.Baz<a.b.c<d.e.f, g.h.i>, j> with Y, X, foo.bar.Baz2<a.b.c<d.e.f, g.h.i>, j> implements Q, foo.bar.Baz2<a.b.c<d.e.f, g.h.i>, j>, W;

class GettersSetters {
  get x;
  set x(v);
  int get y => a + 1;
  void set y(v) => null;

  static get z {}
  static set z(v) {}
  static int get q { }
  static void set q(v) { }

  external int get e;
  external void set e(v);
  external static int get w;
  external static void set w(v);
  @Foo() @Bar static external static external int get e;
  @Foo() @Bar external static external static void set e(v);
  get get{}   // not valid, but should be parsed
  set set(){} // not valid, but should be parsed
  get get get{}   // not valid, but should be parsed
  set set set(){} // not valid, but should be parsed
}

foo() sync => 1;
void foo() sync* => throw a;
int foo() async => new X();
Future<T<Y>> foo() async* => y();
foo() sync {
  sync{}
  bar() sync{}
}
void foo() sync* {
  bar() sync*{}
  sync*{}
}
int foo() async {
  async{}
  bar() async{}
}
Future<T<Y>> foo() async* {
  bar() async*{}
  async*{}
}
