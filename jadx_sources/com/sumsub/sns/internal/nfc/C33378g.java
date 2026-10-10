package com.sumsub.sns.internal.nfc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jmrtd.PassportService;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.nfc.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33378g extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public PassportService f68061a;

    /* JADX INFO: renamed from: b */
    public Function1 f68062b;

    /* JADX INFO: renamed from: c */
    public List f68063c;

    /* JADX INFO: renamed from: d */
    public Iterator f68064d;

    /* JADX INFO: renamed from: e */
    public String f68065e;

    /* JADX INFO: renamed from: f */
    public List f68066f;

    /* JADX INFO: renamed from: g */
    public int f68067g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f68068h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C33381j f68069i;

    /* JADX INFO: renamed from: j */
    public int f68070j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33378g(C33381j c33381j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f68069i = c33381j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f68068h = obj;
        this.f68070j |= Integer.MIN_VALUE;
        return this.f68069i.m71679a((PassportService) null, 0, (Function1) null, (List) null, (ArrayList) null, this);
    }
}
