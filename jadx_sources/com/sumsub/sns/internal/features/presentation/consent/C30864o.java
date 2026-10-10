package com.sumsub.sns.internal.features.presentation.consent;

import com.sumsub.sns.internal.features.data.model.common.remote.C29380i;
import java.util.Iterator;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.consent.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30864o extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public Object f62333a;

    /* JADX INFO: renamed from: b */
    public Object f62334b;

    /* JADX INFO: renamed from: c */
    public Iterator f62335c;

    /* JADX INFO: renamed from: d */
    public C29380i f62336d;

    /* JADX INFO: renamed from: e */
    public String f62337e;

    /* JADX INFO: renamed from: f */
    public int f62338f;

    /* JADX INFO: renamed from: g */
    public int f62339g;

    /* JADX INFO: renamed from: h */
    public int f62340h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f62341i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C30870u f62342j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30864o(C30870u c30870u, Continuation continuation) {
        super(2, continuation);
        this.f62342j = c30870u;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30864o c30864o = new C30864o(this.f62342j, continuation);
        c30864o.f62341i = obj;
        return c30864o;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30864o c30864o = new C30864o(this.f62342j, (Continuation) obj2);
        c30864o.f62341i = (InterfaceC41635f) obj;
        return c30864o.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009d  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:36:0x00db  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:51:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b3 -> B:50:0x0106). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00db -> B:37:0x00e0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.features.presentation.consent.C30864o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
