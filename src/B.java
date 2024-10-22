public class B {
    private A memberA;
    private C[] arrayC;

    public B(A memberA, C[] arrayC) {
        this.memberA = memberA;
        this.arrayC = arrayC;
    }

    public A getMemberA() {
        return memberA;
    }

    public C[] getArrayC() {
        return arrayC;
    }

    public void setMemberA(A memberA) {
        this.memberA = memberA;
    }

    public void setArrayC(C[] arrayC) {
        this.arrayC = arrayC;
    }
}