package com.kubi.transfer;

import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.kubi.transfer.x0 */
/* JADX INFO: compiled from: TransferStateContract.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/transfer/TransferStateContract$LoadingState;", "Lcom/kubi/mvi/event/ISingleEvent;", "isShow", "", "<init>", "(Z)V", "()Z", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C26439x0 implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    public final boolean f52984a;

    public C26439x0() {
        this(false, 1, null);
    }

    public C26439x0(boolean z11) {
        this.f52984a = z11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF52984a() {
        return this.f52984a;
    }

    public /* synthetic */ C26439x0(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
