package com.dianping.logan;

/* JADX INFO: loaded from: classes.dex */
public class LoganModel {

    /* JADX INFO: renamed from: a */
    public Action f7431a;

    /* JADX INFO: renamed from: b */
    public C5468k f7432b;

    /* JADX INFO: renamed from: c */
    public C5465h f7433c;

    public enum Action {
        WRITE,
        SEND,
        FLUSH
    }

    /* JADX INFO: renamed from: a */
    public boolean m7492a() {
        C5468k c5468k;
        C5465h c5465h;
        Action action = this.f7431a;
        if (action == null) {
            return false;
        }
        if (action == Action.SEND && (c5465h = this.f7433c) != null && c5465h.m7545a()) {
            return true;
        }
        return (this.f7431a == Action.WRITE && (c5468k = this.f7432b) != null && c5468k.m7550a()) || this.f7431a == Action.FLUSH;
    }
}
