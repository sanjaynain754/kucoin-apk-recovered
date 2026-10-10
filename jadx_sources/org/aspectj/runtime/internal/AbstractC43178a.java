package org.aspectj.runtime.internal;

import org.aspectj.lang.InterfaceC43176b;

/* JADX INFO: renamed from: org.aspectj.runtime.internal.a */
/* JADX INFO: compiled from: AroundClosure.java */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC43178a {
    protected int bitflags = 1048576;
    protected Object[] preInitializationState;
    protected Object[] state;

    public AbstractC43178a() {
    }

    public InterfaceC43176b linkClosureAndJoinPoint() {
        Object[] objArr = this.state;
        InterfaceC43176b interfaceC43176b = (InterfaceC43176b) objArr[objArr.length - 1];
        interfaceC43176b.mo82132c(this);
        return interfaceC43176b;
    }

    public abstract Object run(Object[] objArr) throws Throwable;

    public int getFlags() {
        return this.bitflags;
    }

    public Object[] getPreInitializationState() {
        return this.preInitializationState;
    }

    public Object[] getState() {
        return this.state;
    }

    public InterfaceC43176b linkStackClosureAndJoinPoint(int i11) {
        Object[] objArr = this.state;
        InterfaceC43176b interfaceC43176b = (InterfaceC43176b) objArr[objArr.length - 1];
        interfaceC43176b.mo82134e(this);
        this.bitflags = i11;
        return interfaceC43176b;
    }

    public void unlink() {
        Object[] objArr = this.state;
        ((InterfaceC43176b) objArr[objArr.length - 1]).mo82134e(null);
    }

    public AbstractC43178a(Object[] objArr) {
        this.state = objArr;
    }

    public InterfaceC43176b linkClosureAndJoinPoint(int i11) {
        Object[] objArr = this.state;
        InterfaceC43176b interfaceC43176b = (InterfaceC43176b) objArr[objArr.length - 1];
        interfaceC43176b.mo82132c(this);
        this.bitflags = i11;
        return interfaceC43176b;
    }
}
