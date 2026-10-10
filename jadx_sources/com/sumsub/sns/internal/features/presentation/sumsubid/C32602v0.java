package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sns.internal.core.common.AbstractC28476n;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29848F;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29871l;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29872m;
import com.sumsub.sns.internal.features.data.model.sumsubid.SNSSumsubIdCheckCodeResponse$Status;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.sumsubid.C30059h;
import com.sumsub.sns.internal.features.data.repository.sumsubid.InterfaceC30056e;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.v0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32602v0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f66490a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66491b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32487O0 f66492c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f66493d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C32487O0 f66494e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Long f66495f;

    /* JADX INFO: renamed from: g */
    public Object f66496g;

    /* JADX INFO: renamed from: h */
    public C32487O0 f66497h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32602v0(C32487O0 c32487o0, Continuation continuation, String str, C32487O0 c32487o1, Long l11) {
        super(2, continuation);
        this.f66492c = c32487o0;
        this.f66493d = str;
        this.f66494e = c32487o1;
        this.f66495f = l11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32602v0 c32602v0 = new C32602v0(this.f66492c, continuation, this.f66493d, this.f66494e, this.f66495f);
        c32602v0.f66491b = obj;
        return c32602v0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32602v0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0210 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:101:0x021e A[Catch: all -> 0x001e, PHI: r1
      0x021e: PHI (r1v6 java.lang.Object) = 
      (r1v2 java.lang.Object)
      (r1v2 java.lang.Object)
      (r1v2 java.lang.Object)
      (r1v2 java.lang.Object)
      (r1v2 java.lang.Object)
      (r1v5 java.lang.Object)
      (r1v7 java.lang.Object)
      (r1v25 java.lang.Object)
     binds: [B:46:0x00e1, B:100:0x0210, B:75:0x0177, B:70:0x0152, B:63:0x013c, B:93:0x01e4, B:99:0x0206, B:24:0x0051] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0224 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0241  */
    /* JADX WARN: Code duplicated, block: B:106:0x0242  */
    /* JADX WARN: Code duplicated, block: B:109:0x024e A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x025f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0260  */
    /* JADX WARN: Code duplicated, block: B:115:0x026b A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x027d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0282 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x028d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e8 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:53:0x0102 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0105  */
    /* JADX WARN: Code duplicated, block: B:57:0x0112 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x011e A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0131 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x013e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0140 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0144 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x014f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0152 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0160 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x016b A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0176  */
    /* JADX WARN: Code duplicated, block: B:76:0x017c A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0188 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0198 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x019c  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bf A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ce A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e6 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01f2 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0204  */
    /* JADX WARN: Code duplicated, block: B:99:0x0206 A[Catch: all -> 0x001e, PHI: r1
      0x0206: PHI (r1v7 java.lang.Object) = (r1v2 java.lang.Object), (r1v27 java.lang.Object) binds: [B:97:0x0202, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:119:0x027e, B:121:0x0282, B:124:0x028e, B:12:0x0029, B:113:0x0263, B:115:0x026b, B:15:0x0034, B:107:0x0246, B:109:0x024e, B:18:0x003d, B:99:0x0206, B:101:0x021e, B:103:0x0224, B:21:0x004a, B:86:0x01b7, B:88:0x01bf, B:89:0x01ce, B:92:0x01da, B:24:0x0051, B:45:0x00dd, B:47:0x00e3, B:49:0x00e8, B:51:0x00ec, B:53:0x0102, B:55:0x0106, B:57:0x0112, B:59:0x011e, B:60:0x0125, B:62:0x0131, B:65:0x0140, B:67:0x0144, B:70:0x0152, B:71:0x0160, B:73:0x016b, B:75:0x0177, B:76:0x017c, B:78:0x0188, B:80:0x0198, B:82:0x019d, B:94:0x01e6, B:96:0x01f2, B:100:0x0210, B:31:0x0064, B:33:0x0098, B:34:0x00a6, B:44:0x00d2, B:26:0x0056, B:42:0x00ca, B:35:0x00a8, B:37:0x00b8, B:39:0x00bc), top: B:129:0x000a, inners: #0 }] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        Object obj2;
        C29872m c29872m;
        String str;
        String str2;
        C32487O0 c32487o0;
        C29848F c29848f;
        Integer num;
        C32487O0 c32487o1;
        Object string;
        C32487O0 c32487o2;
        Object obj3;
        String str3;
        C29871l c29871l;
        boolean zAreEqual;
        C29871l c29871l2;
        boolean zAreEqual2;
        C32487O0 c32487o3;
        String str4;
        Long l11;
        String str5;
        Throwable thM103847exceptionOrNullimpl;
        Object objM71154a;
        Throwable th2;
        Object obj4;
        C32487O0 c32487o4;
        Object strings;
        C32487O0 c32487o5;
        String strM69377a;
        C32487O0 c32487o6;
        C29124h c29124h;
        String str6;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        String strM69770a = null;
        try {
            try {
                switch (this.f66490a) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        String str7 = this.f66493d;
                        C28936t c28936t = this.f66494e.f66278q;
                        KProperty[] kPropertyArr = C32487O0.f66261v;
                        KProperty kProperty = kPropertyArr[5];
                        AbstractC32493S.m71164a("check code, code=" + str7 + ", lastResponse=" + ((C29848F) c28936t.m69705a()));
                        if (StringsKt.isBlank(this.f66493d)) {
                            this.f66494e.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                            AbstractC32493S.m71164a("check code, empty code");
                        } else {
                            C32487O0 c32487o7 = this.f66494e;
                            Result.Companion companion = Result.INSTANCE;
                            InterfaceC30056e interfaceC30056e = c32487o7.f66263b;
                            C28936t c28936t2 = c32487o7.f66278q;
                            KProperty kProperty2 = kPropertyArr[5];
                            C29848F c29848f2 = (C29848F) c28936t2.m69705a();
                            if (c29848f2 != null) {
                                str6 = c29848f2.f59935a;
                            } else {
                                str6 = null;
                            }
                            String str8 = this.f66493d;
                            this.f66490a = 1;
                            obj = ((C30059h) interfaceC30056e).m70082a(str6, str8, this);
                            if (obj != coroutine_suspended) {
                                objM103844constructorimpl = Result.m103844constructorimpl((C29872m) obj);
                                obj2 = objM103844constructorimpl;
                                if (!Result.m103851isSuccessimpl(obj2)) {
                                    c29872m = (C29872m) obj2;
                                    if (c29872m != null) {
                                        str = c29872m.f59952a;
                                    } else {
                                        str = null;
                                    }
                                    AbstractC32493S.m71164a("check code, status=" + str);
                                    if (c29872m != null) {
                                        str2 = c29872m.f59952a;
                                    } else {
                                        str2 = null;
                                    }
                                    if (Intrinsics.areEqual(str2, SNSSumsubIdCheckCodeResponse$Status.VERIFIED.getStatus())) {
                                        C32487O0 c32487o8 = this.f66494e;
                                        KProperty[] kPropertyArr2 = C32487O0.f66261v;
                                        str3 = c32487o8.m71160e().f66411a;
                                        if (str3 != null) {
                                            this.f66494e.f66266e.m71295c(str3);
                                        }
                                        if (Intrinsics.areEqual(c29872m.f59953b, Boxing.boxBoolean(true))) {
                                            c32487o3 = this.f66494e;
                                            this.f66491b = obj2;
                                            this.f66490a = 2;
                                            if (c32487o3.m71157b((Throwable) null, this) == coroutine_suspended) {
                                            }
                                        } else {
                                            c29871l = c29872m.f59955d;
                                            if (c29871l != null) {
                                                zAreEqual = Intrinsics.areEqual(c29871l.f59950a, Boxing.boxBoolean(false));
                                            } else {
                                                zAreEqual = false;
                                            }
                                            if (zAreEqual) {
                                                AbstractC32493S.m71164a("check code, show agreement");
                                                this.f66494e.m71156a(SNSSumsubIdStep.AGREEMENT);
                                            } else {
                                                AbstractC32493S.m71164a("check code, agreement accepted");
                                                C32487O0 c32487o9 = this.f66494e;
                                                c29871l2 = c29872m.f59955d;
                                                if (c29871l2 != null) {
                                                    zAreEqual2 = Intrinsics.areEqual(c29871l2.f59951b, Boxing.boxBoolean(true));
                                                } else {
                                                    zAreEqual2 = false;
                                                }
                                                c32487o9.m71159c(zAreEqual2);
                                            }
                                        }
                                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                                        if (thM103847exceptionOrNullimpl != null) {
                                            C33272c.f67816e.f67810a.mo68956e("SnsId", "check code error", thM103847exceptionOrNullimpl);
                                            C32487O0 c32487o10 = this.f66494e;
                                            this.f66491b = obj2;
                                            this.f66496g = thM103847exceptionOrNullimpl;
                                            this.f66497h = null;
                                            this.f66490a = 5;
                                            KProperty[] kPropertyArr3 = C32487O0.f66261v;
                                            objM71154a = c32487o10.m71154a(thM103847exceptionOrNullimpl, this);
                                            if (objM71154a != coroutine_suspended) {
                                                th2 = thM103847exceptionOrNullimpl;
                                                obj = objM71154a;
                                                obj4 = obj2;
                                                if (((Boolean) obj).booleanValue()) {
                                                    c32487o4 = this.f66494e;
                                                    this.f66491b = obj4;
                                                    this.f66496g = th2;
                                                    this.f66497h = c32487o4;
                                                    this.f66490a = 6;
                                                    strings = c32487o4.getStrings(this);
                                                    if (strings == coroutine_suspended) {
                                                        c32487o5 = c32487o4;
                                                        obj = strings;
                                                        strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                                        if (strM69377a == null) {
                                                            C32487O0 c32487o11 = this.f66494e;
                                                            this.f66491b = obj4;
                                                            this.f66496g = c32487o5;
                                                            this.f66497h = null;
                                                            this.f66490a = 7;
                                                            obj = c32487o11.getConfig(this);
                                                            if (obj != coroutine_suspended) {
                                                                c32487o6 = c32487o5;
                                                                c29124h = (C29124h) obj;
                                                                if (c29124h != null) {
                                                                    strM69770a = AbstractC29130i.m69770a("sumsubid.confirmationFailure.title", c29124h.f59089v);
                                                                }
                                                                c32487o5 = c32487o6;
                                                            }
                                                        } else {
                                                            strM69770a = strM69377a;
                                                        }
                                                        KProperty[] kPropertyArr4 = C32487O0.f66261v;
                                                        C32557s c32557s = new C32557s(strM69770a, c32487o5.m71160e().f66411a);
                                                        C28936t c28936t3 = c32487o5.f66270i;
                                                        KProperty kProperty3 = C32487O0.f66261v[1];
                                                        c28936t3.f58834a.set(c28936t3.f58835b, c32557s);
                                                        this.f66494e.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                                    }
                                                }
                                            }
                                        }
                                    } else if (Intrinsics.areEqual(str2, SNSSumsubIdCheckCodeResponse$Status.RETRY.getStatus())) {
                                        C28936t c28936t4 = this.f66494e.f66278q;
                                        KProperty kProperty4 = C32487O0.f66261v[5];
                                        c29848f = (C29848F) c28936t4.m69705a();
                                        if (c29848f != null) {
                                            num = c29848f.f59936b;
                                        } else {
                                            num = null;
                                        }
                                        c32487o1 = this.f66494e;
                                        this.f66491b = obj2;
                                        this.f66496g = num;
                                        this.f66497h = c32487o1;
                                        this.f66490a = 3;
                                        string = c32487o1.getString("sns_confirmation_code_isNotValid", this);
                                        if (string == coroutine_suspended) {
                                            c32487o2 = c32487o1;
                                            obj = string;
                                            obj3 = obj2;
                                            str4 = (String) obj;
                                            l11 = this.f66495f;
                                            KProperty[] kPropertyArr5 = C32487O0.f66261v;
                                            if (num == null) {
                                                c32487o2.getClass();
                                                AbstractC32493S.m71164a("requestOtp, code length is 0");
                                                c32487o2.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                            } else {
                                                str5 = c32487o2.m71160e().f66411a;
                                                if (str5 == null) {
                                                    str5 = "";
                                                }
                                                c32487o2.fireEvent(new C32523g(num.intValue(), l11, str5, str4));
                                            }
                                            obj2 = obj3;
                                            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                                            if (thM103847exceptionOrNullimpl != null) {
                                                C33272c.f67816e.f67810a.mo68956e("SnsId", "check code error", thM103847exceptionOrNullimpl);
                                                C32487O0 c32487o12 = this.f66494e;
                                                this.f66491b = obj2;
                                                this.f66496g = thM103847exceptionOrNullimpl;
                                                this.f66497h = null;
                                                this.f66490a = 5;
                                                KProperty[] kPropertyArr6 = C32487O0.f66261v;
                                                objM71154a = c32487o12.m71154a(thM103847exceptionOrNullimpl, this);
                                                if (objM71154a != coroutine_suspended) {
                                                    th2 = thM103847exceptionOrNullimpl;
                                                    obj = objM71154a;
                                                    obj4 = obj2;
                                                    if (((Boolean) obj).booleanValue()) {
                                                        c32487o4 = this.f66494e;
                                                        this.f66491b = obj4;
                                                        this.f66496g = th2;
                                                        this.f66497h = c32487o4;
                                                        this.f66490a = 6;
                                                        strings = c32487o4.getStrings(this);
                                                        if (strings == coroutine_suspended) {
                                                            c32487o5 = c32487o4;
                                                            obj = strings;
                                                            strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                                            if (strM69377a == null) {
                                                                C32487O0 c32487o13 = this.f66494e;
                                                                this.f66491b = obj4;
                                                                this.f66496g = c32487o5;
                                                                this.f66497h = null;
                                                                this.f66490a = 7;
                                                                obj = c32487o13.getConfig(this);
                                                                if (obj != coroutine_suspended) {
                                                                    c32487o6 = c32487o5;
                                                                    c29124h = (C29124h) obj;
                                                                    if (c29124h != null) {
                                                                        strM69770a = AbstractC29130i.m69770a("sumsubid.confirmationFailure.title", c29124h.f59089v);
                                                                    }
                                                                    c32487o5 = c32487o6;
                                                                }
                                                            } else {
                                                                strM69770a = strM69377a;
                                                            }
                                                            KProperty[] kPropertyArr7 = C32487O0.f66261v;
                                                            C32557s c32557s2 = new C32557s(strM69770a, c32487o5.m71160e().f66411a);
                                                            C28936t c28936t5 = c32487o5.f66270i;
                                                            KProperty kProperty5 = C32487O0.f66261v[1];
                                                            c28936t5.f58834a.set(c28936t5.f58835b, c32557s2);
                                                            this.f66494e.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else if (Intrinsics.areEqual(str2, SNSSumsubIdCheckCodeResponse$Status.REJECTED.getStatus())) {
                                        AbstractC32493S.m71164a("check code, rejected");
                                        c32487o0 = this.f66494e;
                                        this.f66491b = obj2;
                                        this.f66490a = 4;
                                        if (C32487O0.m71153b(c32487o0, this) == coroutine_suspended) {
                                            C32487O0 c32487o14 = this.f66494e;
                                            SNSSumsubIdStep sNSSumsubIdStep = SNSSumsubIdStep.ENTER_EMAIL;
                                            KProperty[] kPropertyArr8 = C32487O0.f66261v;
                                            c32487o14.m71156a(sNSSumsubIdStep);
                                            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                                            if (thM103847exceptionOrNullimpl != null) {
                                                C33272c.f67816e.f67810a.mo68956e("SnsId", "check code error", thM103847exceptionOrNullimpl);
                                                C32487O0 c32487o15 = this.f66494e;
                                                this.f66491b = obj2;
                                                this.f66496g = thM103847exceptionOrNullimpl;
                                                this.f66497h = null;
                                                this.f66490a = 5;
                                                KProperty[] kPropertyArr9 = C32487O0.f66261v;
                                                objM71154a = c32487o15.m71154a(thM103847exceptionOrNullimpl, this);
                                                if (objM71154a != coroutine_suspended) {
                                                    th2 = thM103847exceptionOrNullimpl;
                                                    obj = objM71154a;
                                                    obj4 = obj2;
                                                    if (((Boolean) obj).booleanValue()) {
                                                        c32487o4 = this.f66494e;
                                                        this.f66491b = obj4;
                                                        this.f66496g = th2;
                                                        this.f66497h = c32487o4;
                                                        this.f66490a = 6;
                                                        strings = c32487o4.getStrings(this);
                                                        if (strings == coroutine_suspended) {
                                                            c32487o5 = c32487o4;
                                                            obj = strings;
                                                            strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                                            if (strM69377a == null) {
                                                                C32487O0 c32487o16 = this.f66494e;
                                                                this.f66491b = obj4;
                                                                this.f66496g = c32487o5;
                                                                this.f66497h = null;
                                                                this.f66490a = 7;
                                                                obj = c32487o16.getConfig(this);
                                                                if (obj != coroutine_suspended) {
                                                                    c32487o6 = c32487o5;
                                                                    c29124h = (C29124h) obj;
                                                                    if (c29124h != null) {
                                                                        strM69770a = AbstractC29130i.m69770a("sumsubid.confirmationFailure.title", c29124h.f59089v);
                                                                    }
                                                                    c32487o5 = c32487o6;
                                                                }
                                                            } else {
                                                                strM69770a = strM69377a;
                                                            }
                                                            KProperty[] kPropertyArr10 = C32487O0.f66261v;
                                                            C32557s c32557s3 = new C32557s(strM69770a, c32487o5.m71160e().f66411a);
                                                            C28936t c28936t6 = c32487o5.f66270i;
                                                            KProperty kProperty6 = C32487O0.f66261v[1];
                                                            c28936t6.f58834a.set(c28936t6.f58835b, c32557s3);
                                                            this.f66494e.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        AbstractC32493S.m71164a("check code, unsupported status");
                                        C32487O0 c32487o17 = this.f66494e;
                                        SNSSumsubIdStep sNSSumsubIdStep2 = SNSSumsubIdStep.ENTER_EMAIL;
                                        KProperty[] kPropertyArr11 = C32487O0.f66261v;
                                        c32487o17.m71156a(sNSSumsubIdStep2);
                                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                                        if (thM103847exceptionOrNullimpl != null) {
                                            C33272c.f67816e.f67810a.mo68956e("SnsId", "check code error", thM103847exceptionOrNullimpl);
                                            C32487O0 c32487o18 = this.f66494e;
                                            this.f66491b = obj2;
                                            this.f66496g = thM103847exceptionOrNullimpl;
                                            this.f66497h = null;
                                            this.f66490a = 5;
                                            KProperty[] kPropertyArr12 = C32487O0.f66261v;
                                            objM71154a = c32487o18.m71154a(thM103847exceptionOrNullimpl, this);
                                            if (objM71154a != coroutine_suspended) {
                                                th2 = thM103847exceptionOrNullimpl;
                                                obj = objM71154a;
                                                obj4 = obj2;
                                                if (((Boolean) obj).booleanValue()) {
                                                    c32487o4 = this.f66494e;
                                                    this.f66491b = obj4;
                                                    this.f66496g = th2;
                                                    this.f66497h = c32487o4;
                                                    this.f66490a = 6;
                                                    strings = c32487o4.getStrings(this);
                                                    if (strings == coroutine_suspended) {
                                                        c32487o5 = c32487o4;
                                                        obj = strings;
                                                        strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                                        if (strM69377a == null) {
                                                            C32487O0 c32487o19 = this.f66494e;
                                                            this.f66491b = obj4;
                                                            this.f66496g = c32487o5;
                                                            this.f66497h = null;
                                                            this.f66490a = 7;
                                                            obj = c32487o19.getConfig(this);
                                                            if (obj != coroutine_suspended) {
                                                                c32487o6 = c32487o5;
                                                                c29124h = (C29124h) obj;
                                                                if (c29124h != null) {
                                                                    strM69770a = AbstractC29130i.m69770a("sumsubid.confirmationFailure.title", c29124h.f59089v);
                                                                }
                                                                c32487o5 = c32487o6;
                                                            }
                                                        } else {
                                                            strM69770a = strM69377a;
                                                        }
                                                        KProperty[] kPropertyArr13 = C32487O0.f66261v;
                                                        C32557s c32557s4 = new C32557s(strM69770a, c32487o5.m71160e().f66411a);
                                                        C28936t c28936t7 = c32487o5.f66270i;
                                                        KProperty kProperty7 = C32487O0.f66261v[1];
                                                        c28936t7.f58834a.set(c28936t7.f58835b, c32557s4);
                                                        this.f66494e.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                                    if (thM103847exceptionOrNullimpl != null) {
                                        C33272c.f67816e.f67810a.mo68956e("SnsId", "check code error", thM103847exceptionOrNullimpl);
                                        C32487O0 c32487o110 = this.f66494e;
                                        this.f66491b = obj2;
                                        this.f66496g = thM103847exceptionOrNullimpl;
                                        this.f66497h = null;
                                        this.f66490a = 5;
                                        KProperty[] kPropertyArr14 = C32487O0.f66261v;
                                        objM71154a = c32487o110.m71154a(thM103847exceptionOrNullimpl, this);
                                        if (objM71154a != coroutine_suspended) {
                                            th2 = thM103847exceptionOrNullimpl;
                                            obj = objM71154a;
                                            obj4 = obj2;
                                            if (((Boolean) obj).booleanValue()) {
                                                c32487o4 = this.f66494e;
                                                this.f66491b = obj4;
                                                this.f66496g = th2;
                                                this.f66497h = c32487o4;
                                                this.f66490a = 6;
                                                strings = c32487o4.getStrings(this);
                                                if (strings == coroutine_suspended) {
                                                    c32487o5 = c32487o4;
                                                    obj = strings;
                                                    strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                                    if (strM69377a == null) {
                                                        C32487O0 c32487o111 = this.f66494e;
                                                        this.f66491b = obj4;
                                                        this.f66496g = c32487o5;
                                                        this.f66497h = null;
                                                        this.f66490a = 7;
                                                        obj = c32487o111.getConfig(this);
                                                        if (obj != coroutine_suspended) {
                                                            c32487o6 = c32487o5;
                                                            c29124h = (C29124h) obj;
                                                            if (c29124h != null) {
                                                                strM69770a = AbstractC29130i.m69770a("sumsubid.confirmationFailure.title", c29124h.f59089v);
                                                            }
                                                            c32487o5 = c32487o6;
                                                        }
                                                    } else {
                                                        strM69770a = strM69377a;
                                                    }
                                                    KProperty[] kPropertyArr15 = C32487O0.f66261v;
                                                    C32557s c32557s5 = new C32557s(strM69770a, c32487o5.m71160e().f66411a);
                                                    C28936t c28936t8 = c32487o5.f66270i;
                                                    KProperty kProperty8 = C32487O0.f66261v[1];
                                                    c28936t8.f58834a.set(c28936t8.f58835b, c32557s5);
                                                    this.f66494e.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                        this.f66492c.showProgress(false);
                        return Unit.INSTANCE;
                    case 1:
                        ResultKt.throwOnFailure(obj);
                        objM103844constructorimpl = Result.m103844constructorimpl((C29872m) obj);
                        obj2 = objM103844constructorimpl;
                        if (!Result.m103851isSuccessimpl(obj2)) {
                            c29872m = (C29872m) obj2;
                            if (c29872m != null) {
                                str = c29872m.f59952a;
                            } else {
                                str = null;
                            }
                            AbstractC32493S.m71164a("check code, status=" + str);
                            if (c29872m != null) {
                                str2 = c29872m.f59952a;
                            } else {
                                str2 = null;
                            }
                            if (Intrinsics.areEqual(str2, SNSSumsubIdCheckCodeResponse$Status.VERIFIED.getStatus())) {
                                C32487O0 c32487o20 = this.f66494e;
                                KProperty[] kPropertyArr16 = C32487O0.f66261v;
                                str3 = c32487o20.m71160e().f66411a;
                                if (str3 != null) {
                                    this.f66494e.f66266e.m71295c(str3);
                                }
                                if (Intrinsics.areEqual(c29872m.f59953b, Boxing.boxBoolean(true))) {
                                    c32487o3 = this.f66494e;
                                    this.f66491b = obj2;
                                    this.f66490a = 2;
                                    if (c32487o3.m71157b((Throwable) null, this) == coroutine_suspended) {
                                    }
                                } else {
                                    c29871l = c29872m.f59955d;
                                    if (c29871l != null) {
                                        zAreEqual = Intrinsics.areEqual(c29871l.f59950a, Boxing.boxBoolean(false));
                                    } else {
                                        zAreEqual = false;
                                    }
                                    if (zAreEqual) {
                                        AbstractC32493S.m71164a("check code, show agreement");
                                        this.f66494e.m71156a(SNSSumsubIdStep.AGREEMENT);
                                    } else {
                                        AbstractC32493S.m71164a("check code, agreement accepted");
                                        C32487O0 c32487o21 = this.f66494e;
                                        c29871l2 = c29872m.f59955d;
                                        if (c29871l2 != null) {
                                            zAreEqual2 = Intrinsics.areEqual(c29871l2.f59951b, Boxing.boxBoolean(true));
                                        } else {
                                            zAreEqual2 = false;
                                        }
                                        c32487o21.m71159c(zAreEqual2);
                                    }
                                }
                                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                                if (thM103847exceptionOrNullimpl != null) {
                                    C33272c.f67816e.f67810a.mo68956e("SnsId", "check code error", thM103847exceptionOrNullimpl);
                                    C32487O0 c32487o112 = this.f66494e;
                                    this.f66491b = obj2;
                                    this.f66496g = thM103847exceptionOrNullimpl;
                                    this.f66497h = null;
                                    this.f66490a = 5;
                                    KProperty[] kPropertyArr17 = C32487O0.f66261v;
                                    objM71154a = c32487o112.m71154a(thM103847exceptionOrNullimpl, this);
                                    if (objM71154a != coroutine_suspended) {
                                        th2 = thM103847exceptionOrNullimpl;
                                        obj = objM71154a;
                                        obj4 = obj2;
                                        if (((Boolean) obj).booleanValue()) {
                                            c32487o4 = this.f66494e;
                                            this.f66491b = obj4;
                                            this.f66496g = th2;
                                            this.f66497h = c32487o4;
                                            this.f66490a = 6;
                                            strings = c32487o4.getStrings(this);
                                            if (strings == coroutine_suspended) {
                                                c32487o5 = c32487o4;
                                                obj = strings;
                                                strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                                if (strM69377a == null) {
                                                    C32487O0 c32487o113 = this.f66494e;
                                                    this.f66491b = obj4;
                                                    this.f66496g = c32487o5;
                                                    this.f66497h = null;
                                                    this.f66490a = 7;
                                                    obj = c32487o113.getConfig(this);
                                                    if (obj != coroutine_suspended) {
                                                        c32487o6 = c32487o5;
                                                        c29124h = (C29124h) obj;
                                                        if (c29124h != null) {
                                                            strM69770a = AbstractC29130i.m69770a("sumsubid.confirmationFailure.title", c29124h.f59089v);
                                                        }
                                                        c32487o5 = c32487o6;
                                                    }
                                                } else {
                                                    strM69770a = strM69377a;
                                                }
                                                KProperty[] kPropertyArr18 = C32487O0.f66261v;
                                                C32557s c32557s6 = new C32557s(strM69770a, c32487o5.m71160e().f66411a);
                                                C28936t c28936t9 = c32487o5.f66270i;
                                                KProperty kProperty9 = C32487O0.f66261v[1];
                                                c28936t9.f58834a.set(c28936t9.f58835b, c32557s6);
                                                this.f66494e.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                            }
                                        }
                                    }
                                }
                            } else if (Intrinsics.areEqual(str2, SNSSumsubIdCheckCodeResponse$Status.RETRY.getStatus())) {
                                C28936t c28936t10 = this.f66494e.f66278q;
                                KProperty kProperty10 = C32487O0.f66261v[5];
                                c29848f = (C29848F) c28936t10.m69705a();
                                if (c29848f != null) {
                                    num = c29848f.f59936b;
                                } else {
                                    num = null;
                                }
                                c32487o1 = this.f66494e;
                                this.f66491b = obj2;
                                this.f66496g = num;
                                this.f66497h = c32487o1;
                                this.f66490a = 3;
                                string = c32487o1.getString("sns_confirmation_code_isNotValid", this);
                                if (string == coroutine_suspended) {
                                    c32487o2 = c32487o1;
                                    obj = string;
                                    obj3 = obj2;
                                    str4 = (String) obj;
                                    l11 = this.f66495f;
                                    KProperty[] kPropertyArr19 = C32487O0.f66261v;
                                    if (num == null) {
                                        c32487o2.getClass();
                                        AbstractC32493S.m71164a("requestOtp, code length is 0");
                                        c32487o2.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                    } else {
                                        str5 = c32487o2.m71160e().f66411a;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        c32487o2.fireEvent(new C32523g(num.intValue(), l11, str5, str4));
                                    }
                                    obj2 = obj3;
                                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                                    if (thM103847exceptionOrNullimpl != null) {
                                        C33272c.f67816e.f67810a.mo68956e("SnsId", "check code error", thM103847exceptionOrNullimpl);
                                        C32487O0 c32487o114 = this.f66494e;
                                        this.f66491b = obj2;
                                        this.f66496g = thM103847exceptionOrNullimpl;
                                        this.f66497h = null;
                                        this.f66490a = 5;
                                        KProperty[] kPropertyArr110 = C32487O0.f66261v;
                                        objM71154a = c32487o114.m71154a(thM103847exceptionOrNullimpl, this);
                                        if (objM71154a != coroutine_suspended) {
                                            th2 = thM103847exceptionOrNullimpl;
                                            obj = objM71154a;
                                            obj4 = obj2;
                                            if (((Boolean) obj).booleanValue()) {
                                                c32487o4 = this.f66494e;
                                                this.f66491b = obj4;
                                                this.f66496g = th2;
                                                this.f66497h = c32487o4;
                                                this.f66490a = 6;
                                                strings = c32487o4.getStrings(this);
                                                if (strings == coroutine_suspended) {
                                                    c32487o5 = c32487o4;
                                                    obj = strings;
                                                    strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                                    if (strM69377a == null) {
                                                        C32487O0 c32487o115 = this.f66494e;
                                                        this.f66491b = obj4;
                                                        this.f66496g = c32487o5;
                                                        this.f66497h = null;
                                                        this.f66490a = 7;
                                                        obj = c32487o115.getConfig(this);
                                                        if (obj != coroutine_suspended) {
                                                            c32487o6 = c32487o5;
                                                            c29124h = (C29124h) obj;
                                                            if (c29124h != null) {
                                                                strM69770a = AbstractC29130i.m69770a("sumsubid.confirmationFailure.title", c29124h.f59089v);
                                                            }
                                                            c32487o5 = c32487o6;
                                                        }
                                                    } else {
                                                        strM69770a = strM69377a;
                                                    }
                                                    KProperty[] kPropertyArr111 = C32487O0.f66261v;
                                                    C32557s c32557s7 = new C32557s(strM69770a, c32487o5.m71160e().f66411a);
                                                    C28936t c28936t11 = c32487o5.f66270i;
                                                    KProperty kProperty11 = C32487O0.f66261v[1];
                                                    c28936t11.f58834a.set(c28936t11.f58835b, c32557s7);
                                                    this.f66494e.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (Intrinsics.areEqual(str2, SNSSumsubIdCheckCodeResponse$Status.REJECTED.getStatus())) {
                                AbstractC32493S.m71164a("check code, rejected");
                                c32487o0 = this.f66494e;
                                this.f66491b = obj2;
                                this.f66490a = 4;
                                if (C32487O0.m71153b(c32487o0, this) == coroutine_suspended) {
                                    C32487O0 c32487o116 = this.f66494e;
                                    SNSSumsubIdStep sNSSumsubIdStep3 = SNSSumsubIdStep.ENTER_EMAIL;
                                    KProperty[] kPropertyArr20 = C32487O0.f66261v;
                                    c32487o116.m71156a(sNSSumsubIdStep3);
                                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                                    if (thM103847exceptionOrNullimpl != null) {
                                        C33272c.f67816e.f67810a.mo68956e("SnsId", "check code error", thM103847exceptionOrNullimpl);
                                        C32487O0 c32487o117 = this.f66494e;
                                        this.f66491b = obj2;
                                        this.f66496g = thM103847exceptionOrNullimpl;
                                        this.f66497h = null;
                                        this.f66490a = 5;
                                        KProperty[] kPropertyArr112 = C32487O0.f66261v;
                                        objM71154a = c32487o117.m71154a(thM103847exceptionOrNullimpl, this);
                                        if (objM71154a != coroutine_suspended) {
                                            th2 = thM103847exceptionOrNullimpl;
                                            obj = objM71154a;
                                            obj4 = obj2;
                                            if (((Boolean) obj).booleanValue()) {
                                                c32487o4 = this.f66494e;
                                                this.f66491b = obj4;
                                                this.f66496g = th2;
                                                this.f66497h = c32487o4;
                                                this.f66490a = 6;
                                                strings = c32487o4.getStrings(this);
                                                if (strings == coroutine_suspended) {
                                                    c32487o5 = c32487o4;
                                                    obj = strings;
                                                    strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                                    if (strM69377a == null) {
                                                        C32487O0 c32487o118 = this.f66494e;
                                                        this.f66491b = obj4;
                                                        this.f66496g = c32487o5;
                                                        this.f66497h = null;
                                                        this.f66490a = 7;
                                                        obj = c32487o118.getConfig(this);
                                                        if (obj != coroutine_suspended) {
                                                            c32487o6 = c32487o5;
                                                            c29124h = (C29124h) obj;
                                                            if (c29124h != null) {
                                                                strM69770a = AbstractC29130i.m69770a("sumsubid.confirmationFailure.title", c29124h.f59089v);
                                                            }
                                                            c32487o5 = c32487o6;
                                                        }
                                                    } else {
                                                        strM69770a = strM69377a;
                                                    }
                                                    KProperty[] kPropertyArr113 = C32487O0.f66261v;
                                                    C32557s c32557s8 = new C32557s(strM69770a, c32487o5.m71160e().f66411a);
                                                    C28936t c28936t12 = c32487o5.f66270i;
                                                    KProperty kProperty12 = C32487O0.f66261v[1];
                                                    c28936t12.f58834a.set(c28936t12.f58835b, c32557s8);
                                                    this.f66494e.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC32493S.m71164a("check code, unsupported status");
                                C32487O0 c32487o119 = this.f66494e;
                                SNSSumsubIdStep sNSSumsubIdStep4 = SNSSumsubIdStep.ENTER_EMAIL;
                                KProperty[] kPropertyArr114 = C32487O0.f66261v;
                                c32487o119.m71156a(sNSSumsubIdStep4);
                                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                                if (thM103847exceptionOrNullimpl != null) {
                                    C33272c.f67816e.f67810a.mo68956e("SnsId", "check code error", thM103847exceptionOrNullimpl);
                                    C32487O0 c32487o1110 = this.f66494e;
                                    this.f66491b = obj2;
                                    this.f66496g = thM103847exceptionOrNullimpl;
                                    this.f66497h = null;
                                    this.f66490a = 5;
                                    KProperty[] kPropertyArr115 = C32487O0.f66261v;
                                    objM71154a = c32487o1110.m71154a(thM103847exceptionOrNullimpl, this);
                                    if (objM71154a != coroutine_suspended) {
                                        th2 = thM103847exceptionOrNullimpl;
                                        obj = objM71154a;
                                        obj4 = obj2;
                                        if (((Boolean) obj).booleanValue()) {
                                            c32487o4 = this.f66494e;
                                            this.f66491b = obj4;
                                            this.f66496g = th2;
                                            this.f66497h = c32487o4;
                                            this.f66490a = 6;
                                            strings = c32487o4.getStrings(this);
                                            if (strings == coroutine_suspended) {
                                                c32487o5 = c32487o4;
                                                obj = strings;
                                                strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                                if (strM69377a == null) {
                                                    C32487O0 c32487o1111 = this.f66494e;
                                                    this.f66491b = obj4;
                                                    this.f66496g = c32487o5;
                                                    this.f66497h = null;
                                                    this.f66490a = 7;
                                                    obj = c32487o1111.getConfig(this);
                                                    if (obj != coroutine_suspended) {
                                                        c32487o6 = c32487o5;
                                                        c29124h = (C29124h) obj;
                                                        if (c29124h != null) {
                                                            strM69770a = AbstractC29130i.m69770a("sumsubid.confirmationFailure.title", c29124h.f59089v);
                                                        }
                                                        c32487o5 = c32487o6;
                                                    }
                                                } else {
                                                    strM69770a = strM69377a;
                                                }
                                                KProperty[] kPropertyArr116 = C32487O0.f66261v;
                                                C32557s c32557s9 = new C32557s(strM69770a, c32487o5.m71160e().f66411a);
                                                C28936t c28936t13 = c32487o5.f66270i;
                                                KProperty kProperty13 = C32487O0.f66261v[1];
                                                c28936t13.f58834a.set(c28936t13.f58835b, c32557s9);
                                                this.f66494e.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                            }
                                        }
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                        if (thM103847exceptionOrNullimpl != null) {
                            C33272c.f67816e.f67810a.mo68956e("SnsId", "check code error", thM103847exceptionOrNullimpl);
                            C32487O0 c32487o1112 = this.f66494e;
                            this.f66491b = obj2;
                            this.f66496g = thM103847exceptionOrNullimpl;
                            this.f66497h = null;
                            this.f66490a = 5;
                            KProperty[] kPropertyArr117 = C32487O0.f66261v;
                            objM71154a = c32487o1112.m71154a(thM103847exceptionOrNullimpl, this);
                            if (objM71154a != coroutine_suspended) {
                                th2 = thM103847exceptionOrNullimpl;
                                obj = objM71154a;
                                obj4 = obj2;
                                if (((Boolean) obj).booleanValue()) {
                                    c32487o4 = this.f66494e;
                                    this.f66491b = obj4;
                                    this.f66496g = th2;
                                    this.f66497h = c32487o4;
                                    this.f66490a = 6;
                                    strings = c32487o4.getStrings(this);
                                    if (strings == coroutine_suspended) {
                                        c32487o5 = c32487o4;
                                        obj = strings;
                                        strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                        if (strM69377a == null) {
                                            C32487O0 c32487o1113 = this.f66494e;
                                            this.f66491b = obj4;
                                            this.f66496g = c32487o5;
                                            this.f66497h = null;
                                            this.f66490a = 7;
                                            obj = c32487o1113.getConfig(this);
                                            if (obj != coroutine_suspended) {
                                                c32487o6 = c32487o5;
                                                c29124h = (C29124h) obj;
                                                if (c29124h != null) {
                                                    strM69770a = AbstractC29130i.m69770a("sumsubid.confirmationFailure.title", c29124h.f59089v);
                                                }
                                                c32487o5 = c32487o6;
                                            }
                                        } else {
                                            strM69770a = strM69377a;
                                        }
                                        KProperty[] kPropertyArr118 = C32487O0.f66261v;
                                        C32557s c32557s10 = new C32557s(strM69770a, c32487o5.m71160e().f66411a);
                                        C28936t c28936t14 = c32487o5.f66270i;
                                        KProperty kProperty14 = C32487O0.f66261v[1];
                                        c28936t14.f58834a.set(c28936t14.f58835b, c32557s10);
                                        this.f66494e.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                        this.f66492c.showProgress(false);
                        return Unit.INSTANCE;
                    case 2:
                        obj2 = this.f66491b;
                        ResultKt.throwOnFailure(obj);
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                        if (thM103847exceptionOrNullimpl != null) {
                            C33272c.f67816e.f67810a.mo68956e("SnsId", "check code error", thM103847exceptionOrNullimpl);
                            C32487O0 c32487o1114 = this.f66494e;
                            this.f66491b = obj2;
                            this.f66496g = thM103847exceptionOrNullimpl;
                            this.f66497h = null;
                            this.f66490a = 5;
                            KProperty[] kPropertyArr119 = C32487O0.f66261v;
                            objM71154a = c32487o1114.m71154a(thM103847exceptionOrNullimpl, this);
                            if (objM71154a != coroutine_suspended) {
                                th2 = thM103847exceptionOrNullimpl;
                                obj = objM71154a;
                                obj4 = obj2;
                                if (((Boolean) obj).booleanValue()) {
                                    c32487o4 = this.f66494e;
                                    this.f66491b = obj4;
                                    this.f66496g = th2;
                                    this.f66497h = c32487o4;
                                    this.f66490a = 6;
                                    strings = c32487o4.getStrings(this);
                                    if (strings == coroutine_suspended) {
                                        c32487o5 = c32487o4;
                                        obj = strings;
                                        strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                        if (strM69377a == null) {
                                            C32487O0 c32487o1115 = this.f66494e;
                                            this.f66491b = obj4;
                                            this.f66496g = c32487o5;
                                            this.f66497h = null;
                                            this.f66490a = 7;
                                            obj = c32487o1115.getConfig(this);
                                            if (obj != coroutine_suspended) {
                                                c32487o6 = c32487o5;
                                                c29124h = (C29124h) obj;
                                                if (c29124h != null) {
                                                    strM69770a = AbstractC29130i.m69770a("sumsubid.confirmationFailure.title", c29124h.f59089v);
                                                }
                                                c32487o5 = c32487o6;
                                            }
                                        } else {
                                            strM69770a = strM69377a;
                                        }
                                        KProperty[] kPropertyArr1110 = C32487O0.f66261v;
                                        C32557s c32557s11 = new C32557s(strM69770a, c32487o5.m71160e().f66411a);
                                        C28936t c28936t15 = c32487o5.f66270i;
                                        KProperty kProperty15 = C32487O0.f66261v[1];
                                        c28936t15.f58834a.set(c28936t15.f58835b, c32557s11);
                                        this.f66494e.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                        this.f66492c.showProgress(false);
                        return Unit.INSTANCE;
                    case 3:
                        c32487o2 = this.f66497h;
                        num = (Integer) this.f66496g;
                        obj3 = this.f66491b;
                        ResultKt.throwOnFailure(obj);
                        str4 = (String) obj;
                        l11 = this.f66495f;
                        KProperty[] kPropertyArr120 = C32487O0.f66261v;
                        if (num == null) {
                            c32487o2.getClass();
                            AbstractC32493S.m71164a("requestOtp, code length is 0");
                            c32487o2.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                        } else {
                            str5 = c32487o2.m71160e().f66411a;
                            if (str5 == null) {
                                str5 = "";
                            }
                            c32487o2.fireEvent(new C32523g(num.intValue(), l11, str5, str4));
                        }
                        obj2 = obj3;
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                        if (thM103847exceptionOrNullimpl != null) {
                            C33272c.f67816e.f67810a.mo68956e("SnsId", "check code error", thM103847exceptionOrNullimpl);
                            C32487O0 c32487o1116 = this.f66494e;
                            this.f66491b = obj2;
                            this.f66496g = thM103847exceptionOrNullimpl;
                            this.f66497h = null;
                            this.f66490a = 5;
                            KProperty[] kPropertyArr1111 = C32487O0.f66261v;
                            objM71154a = c32487o1116.m71154a(thM103847exceptionOrNullimpl, this);
                            if (objM71154a != coroutine_suspended) {
                                th2 = thM103847exceptionOrNullimpl;
                                obj = objM71154a;
                                obj4 = obj2;
                                if (((Boolean) obj).booleanValue()) {
                                    c32487o4 = this.f66494e;
                                    this.f66491b = obj4;
                                    this.f66496g = th2;
                                    this.f66497h = c32487o4;
                                    this.f66490a = 6;
                                    strings = c32487o4.getStrings(this);
                                    if (strings == coroutine_suspended) {
                                        c32487o5 = c32487o4;
                                        obj = strings;
                                        strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                        if (strM69377a == null) {
                                            C32487O0 c32487o1117 = this.f66494e;
                                            this.f66491b = obj4;
                                            this.f66496g = c32487o5;
                                            this.f66497h = null;
                                            this.f66490a = 7;
                                            obj = c32487o1117.getConfig(this);
                                            if (obj != coroutine_suspended) {
                                                c32487o6 = c32487o5;
                                                c29124h = (C29124h) obj;
                                                if (c29124h != null) {
                                                    strM69770a = AbstractC29130i.m69770a("sumsubid.confirmationFailure.title", c29124h.f59089v);
                                                }
                                                c32487o5 = c32487o6;
                                            }
                                        } else {
                                            strM69770a = strM69377a;
                                        }
                                        KProperty[] kPropertyArr1112 = C32487O0.f66261v;
                                        C32557s c32557s12 = new C32557s(strM69770a, c32487o5.m71160e().f66411a);
                                        C28936t c28936t16 = c32487o5.f66270i;
                                        KProperty kProperty16 = C32487O0.f66261v[1];
                                        c28936t16.f58834a.set(c28936t16.f58835b, c32557s12);
                                        this.f66494e.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                        this.f66492c.showProgress(false);
                        return Unit.INSTANCE;
                    case 4:
                        obj2 = this.f66491b;
                        ResultKt.throwOnFailure(obj);
                        C32487O0 c32487o1118 = this.f66494e;
                        SNSSumsubIdStep sNSSumsubIdStep5 = SNSSumsubIdStep.ENTER_EMAIL;
                        KProperty[] kPropertyArr21 = C32487O0.f66261v;
                        c32487o1118.m71156a(sNSSumsubIdStep5);
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                        if (thM103847exceptionOrNullimpl != null) {
                            C33272c.f67816e.f67810a.mo68956e("SnsId", "check code error", thM103847exceptionOrNullimpl);
                            C32487O0 c32487o1119 = this.f66494e;
                            this.f66491b = obj2;
                            this.f66496g = thM103847exceptionOrNullimpl;
                            this.f66497h = null;
                            this.f66490a = 5;
                            KProperty[] kPropertyArr1113 = C32487O0.f66261v;
                            objM71154a = c32487o1119.m71154a(thM103847exceptionOrNullimpl, this);
                            if (objM71154a != coroutine_suspended) {
                                th2 = thM103847exceptionOrNullimpl;
                                obj = objM71154a;
                                obj4 = obj2;
                                if (((Boolean) obj).booleanValue()) {
                                    c32487o4 = this.f66494e;
                                    this.f66491b = obj4;
                                    this.f66496g = th2;
                                    this.f66497h = c32487o4;
                                    this.f66490a = 6;
                                    strings = c32487o4.getStrings(this);
                                    if (strings == coroutine_suspended) {
                                        c32487o5 = c32487o4;
                                        obj = strings;
                                        strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                        if (strM69377a == null) {
                                            C32487O0 c32487o11110 = this.f66494e;
                                            this.f66491b = obj4;
                                            this.f66496g = c32487o5;
                                            this.f66497h = null;
                                            this.f66490a = 7;
                                            obj = c32487o11110.getConfig(this);
                                            if (obj != coroutine_suspended) {
                                                c32487o6 = c32487o5;
                                                c29124h = (C29124h) obj;
                                                if (c29124h != null) {
                                                    strM69770a = AbstractC29130i.m69770a("sumsubid.confirmationFailure.title", c29124h.f59089v);
                                                }
                                                c32487o5 = c32487o6;
                                            }
                                        } else {
                                            strM69770a = strM69377a;
                                        }
                                        KProperty[] kPropertyArr1114 = C32487O0.f66261v;
                                        C32557s c32557s13 = new C32557s(strM69770a, c32487o5.m71160e().f66411a);
                                        C28936t c28936t17 = c32487o5.f66270i;
                                        KProperty kProperty17 = C32487O0.f66261v[1];
                                        c28936t17.f58834a.set(c28936t17.f58835b, c32557s13);
                                        this.f66494e.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                        this.f66492c.showProgress(false);
                        return Unit.INSTANCE;
                    case 5:
                        Throwable th3 = (Throwable) this.f66496g;
                        Object obj5 = this.f66491b;
                        ResultKt.throwOnFailure(obj);
                        obj4 = obj5;
                        th2 = th3;
                        if (((Boolean) obj).booleanValue()) {
                            c32487o4 = this.f66494e;
                            this.f66491b = obj4;
                            this.f66496g = th2;
                            this.f66497h = c32487o4;
                            this.f66490a = 6;
                            strings = c32487o4.getStrings(this);
                            if (strings == coroutine_suspended) {
                                c32487o5 = c32487o4;
                                obj = strings;
                                strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                if (strM69377a == null) {
                                    C32487O0 c32487o11111 = this.f66494e;
                                    this.f66491b = obj4;
                                    this.f66496g = c32487o5;
                                    this.f66497h = null;
                                    this.f66490a = 7;
                                    obj = c32487o11111.getConfig(this);
                                    if (obj != coroutine_suspended) {
                                        c32487o6 = c32487o5;
                                        c29124h = (C29124h) obj;
                                        if (c29124h != null) {
                                            strM69770a = AbstractC29130i.m69770a("sumsubid.confirmationFailure.title", c29124h.f59089v);
                                        }
                                        c32487o5 = c32487o6;
                                    }
                                } else {
                                    strM69770a = strM69377a;
                                }
                                KProperty[] kPropertyArr1115 = C32487O0.f66261v;
                                C32557s c32557s14 = new C32557s(strM69770a, c32487o5.m71160e().f66411a);
                                C28936t c28936t18 = c32487o5.f66270i;
                                KProperty kProperty18 = C32487O0.f66261v[1];
                                c28936t18.f58834a.set(c28936t18.f58835b, c32557s14);
                                this.f66494e.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                            }
                            return coroutine_suspended;
                        }
                        this.f66492c.showProgress(false);
                        return Unit.INSTANCE;
                    case 6:
                        c32487o5 = this.f66497h;
                        th2 = (Throwable) this.f66496g;
                        obj4 = this.f66491b;
                        ResultKt.throwOnFailure(obj);
                        strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                        if (strM69377a == null) {
                            C32487O0 c32487o11112 = this.f66494e;
                            this.f66491b = obj4;
                            this.f66496g = c32487o5;
                            this.f66497h = null;
                            this.f66490a = 7;
                            obj = c32487o11112.getConfig(this);
                            if (obj != coroutine_suspended) {
                                c32487o6 = c32487o5;
                                c29124h = (C29124h) obj;
                                if (c29124h != null) {
                                    strM69770a = AbstractC29130i.m69770a("sumsubid.confirmationFailure.title", c29124h.f59089v);
                                }
                                c32487o5 = c32487o6;
                            }
                            return coroutine_suspended;
                        }
                        strM69770a = strM69377a;
                        KProperty[] kPropertyArr1116 = C32487O0.f66261v;
                        C32557s c32557s15 = new C32557s(strM69770a, c32487o5.m71160e().f66411a);
                        C28936t c28936t19 = c32487o5.f66270i;
                        KProperty kProperty19 = C32487O0.f66261v[1];
                        c28936t19.f58834a.set(c28936t19.f58835b, c32557s15);
                        this.f66494e.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                        this.f66492c.showProgress(false);
                        return Unit.INSTANCE;
                    case 7:
                        c32487o6 = (C32487O0) this.f66496g;
                        ResultKt.throwOnFailure(obj);
                        c29124h = (C29124h) obj;
                        if (c29124h != null) {
                            strM69770a = AbstractC29130i.m69770a("sumsubid.confirmationFailure.title", c29124h.f59089v);
                        }
                        c32487o5 = c32487o6;
                        KProperty[] kPropertyArr1117 = C32487O0.f66261v;
                        C32557s c32557s16 = new C32557s(strM69770a, c32487o5.m71160e().f66411a);
                        C28936t c28936t110 = c32487o5.f66270i;
                        KProperty kProperty110 = C32487O0.f66261v[1];
                        c28936t110.f58834a.set(c28936t110.f58835b, c32557s16);
                        this.f66494e.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                        this.f66492c.showProgress(false);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th4) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th4));
            }
        } catch (Throwable th5) {
            this.f66492c.showProgress(false);
            throw th5;
        }
    }
}
