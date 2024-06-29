package javaJungsuk.객체지향;

abstract class Unit {
    int x, y;
    abstract void move(int x, int y); /* 지정된 위치로 이동 */
    void stop() {} /* 현재 위치에 정지 */
}

class Marine extends Unit{
    @Override
    void move(int x, int y) {
    // 구현부
    }
    void stimPack() {}
}

class Tank extends Unit {
    @Override
    void move(int x, int y) {

    }
    void changeMode() {}
}

class Dropship extends Unit {
    @Override
    void move(int x, int y) {

    }
    void load() { /* 선택된 대상을 태운다. */ }
    void unload() { /* 선택된 대상을 내린다. */ }
}