package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sns.internal.core.analytics.C28368g;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.analytics.StepAction;
import com.sumsub.sns.internal.core.common.AbstractC28476n;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29884y;
import com.sumsub.sns.internal.features.data.repository.applicant.C29950z;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.sumsubid.C30059h;
import com.sumsub.sns.internal.features.data.repository.sumsubid.InterfaceC30056e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.D0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32465D0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f66190a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66191b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32487O0 f66192c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32487O0 f66193d;

    /* JADX INFO: renamed from: e */
    public Object f66194e;

    /* JADX INFO: renamed from: f */
    public Object f66195f;

    /* JADX INFO: renamed from: g */
    public C29983l f66196g;

    /* JADX INFO: renamed from: h */
    public C29124h f66197h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32465D0(C32487O0 c32487o0, Continuation continuation, C32487O0 c32487o1) {
        super(2, continuation);
        this.f66192c = c32487o0;
        this.f66193d = c32487o1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32465D0 c32465d0 = new C32465D0(this.f66192c, continuation, this.f66193d);
        c32465d0.f66191b = obj;
        return c32465d0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32465D0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c8 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:7:0x001e, B:96:0x0242, B:98:0x0246, B:100:0x0251, B:12:0x0032, B:91:0x0228, B:93:0x0230, B:15:0x003f, B:85:0x0209, B:87:0x0211, B:18:0x0055, B:55:0x0130, B:57:0x013d, B:62:0x017c, B:64:0x0182, B:70:0x01a2, B:77:0x01b6, B:71:0x01a5, B:72:0x01aa, B:73:0x01ab, B:74:0x01ae, B:75:0x01b1, B:76:0x01b4, B:79:0x01e0, B:81:0x01e6, B:58:0x014c, B:60:0x0152, B:61:0x0161, B:21:0x0068, B:51:0x010f, B:24:0x007e, B:47:0x00ef, B:38:0x00c2, B:40:0x00c8, B:42:0x00d7, B:44:0x00dd, B:31:0x0094, B:37:0x00b7, B:26:0x0085, B:35:0x00af, B:32:0x009b), top: B:105:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d7 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:7:0x001e, B:96:0x0242, B:98:0x0246, B:100:0x0251, B:12:0x0032, B:91:0x0228, B:93:0x0230, B:15:0x003f, B:85:0x0209, B:87:0x0211, B:18:0x0055, B:55:0x0130, B:57:0x013d, B:62:0x017c, B:64:0x0182, B:70:0x01a2, B:77:0x01b6, B:71:0x01a5, B:72:0x01aa, B:73:0x01ab, B:74:0x01ae, B:75:0x01b1, B:76:0x01b4, B:79:0x01e0, B:81:0x01e6, B:58:0x014c, B:60:0x0152, B:61:0x0161, B:21:0x0068, B:51:0x010f, B:24:0x007e, B:47:0x00ef, B:38:0x00c2, B:40:0x00c8, B:42:0x00d7, B:44:0x00dd, B:31:0x0094, B:37:0x00b7, B:26:0x0085, B:35:0x00af, B:32:0x009b), top: B:105:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ef A[Catch: all -> 0x0025, PHI: r0 r10 r11 r12
      0x00ef: PHI (r0v14 java.util.Map) = (r0v12 java.util.Map), (r0v68 java.util.Map) binds: [B:45:0x00eb, B:25:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x00ef: PHI (r10v3 com.sumsub.sns.internal.features.data.model.sumsubid.y) = 
      (r10v2 com.sumsub.sns.internal.features.data.model.sumsubid.y)
      (r10v21 com.sumsub.sns.internal.features.data.model.sumsubid.y)
     binds: [B:45:0x00eb, B:25:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x00ef: PHI (r11v1 java.lang.Object) = (r11v0 java.lang.Object), (r11v12 java.lang.Object) binds: [B:45:0x00eb, B:25:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x00ef: PHI (r12v2 java.lang.Object) = (r12v1 java.lang.Object), (r12v7 java.lang.Object) binds: [B:45:0x00eb, B:25:0x0081] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0025, blocks: (B:7:0x001e, B:96:0x0242, B:98:0x0246, B:100:0x0251, B:12:0x0032, B:91:0x0228, B:93:0x0230, B:15:0x003f, B:85:0x0209, B:87:0x0211, B:18:0x0055, B:55:0x0130, B:57:0x013d, B:62:0x017c, B:64:0x0182, B:70:0x01a2, B:77:0x01b6, B:71:0x01a5, B:72:0x01aa, B:73:0x01ab, B:74:0x01ae, B:75:0x01b1, B:76:0x01b4, B:79:0x01e0, B:81:0x01e6, B:58:0x014c, B:60:0x0152, B:61:0x0161, B:21:0x0068, B:51:0x010f, B:24:0x007e, B:47:0x00ef, B:38:0x00c2, B:40:0x00c8, B:42:0x00d7, B:44:0x00dd, B:31:0x0094, B:37:0x00b7, B:26:0x0085, B:35:0x00af, B:32:0x009b), top: B:105:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0103  */
    /* JADX WARN: Code duplicated, block: B:50:0x0105  */
    /* JADX WARN: Code duplicated, block: B:53:0x0129  */
    /* JADX WARN: Code duplicated, block: B:54:0x012b  */
    /* JADX WARN: Code duplicated, block: B:57:0x013d A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:7:0x001e, B:96:0x0242, B:98:0x0246, B:100:0x0251, B:12:0x0032, B:91:0x0228, B:93:0x0230, B:15:0x003f, B:85:0x0209, B:87:0x0211, B:18:0x0055, B:55:0x0130, B:57:0x013d, B:62:0x017c, B:64:0x0182, B:70:0x01a2, B:77:0x01b6, B:71:0x01a5, B:72:0x01aa, B:73:0x01ab, B:74:0x01ae, B:75:0x01b1, B:76:0x01b4, B:79:0x01e0, B:81:0x01e6, B:58:0x014c, B:60:0x0152, B:61:0x0161, B:21:0x0068, B:51:0x010f, B:24:0x007e, B:47:0x00ef, B:38:0x00c2, B:40:0x00c8, B:42:0x00d7, B:44:0x00dd, B:31:0x0094, B:37:0x00b7, B:26:0x0085, B:35:0x00af, B:32:0x009b), top: B:105:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x014c A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:7:0x001e, B:96:0x0242, B:98:0x0246, B:100:0x0251, B:12:0x0032, B:91:0x0228, B:93:0x0230, B:15:0x003f, B:85:0x0209, B:87:0x0211, B:18:0x0055, B:55:0x0130, B:57:0x013d, B:62:0x017c, B:64:0x0182, B:70:0x01a2, B:77:0x01b6, B:71:0x01a5, B:72:0x01aa, B:73:0x01ab, B:74:0x01ae, B:75:0x01b1, B:76:0x01b4, B:79:0x01e0, B:81:0x01e6, B:58:0x014c, B:60:0x0152, B:61:0x0161, B:21:0x0068, B:51:0x010f, B:24:0x007e, B:47:0x00ef, B:38:0x00c2, B:40:0x00c8, B:42:0x00d7, B:44:0x00dd, B:31:0x0094, B:37:0x00b7, B:26:0x0085, B:35:0x00af, B:32:0x009b), top: B:105:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0152 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:7:0x001e, B:96:0x0242, B:98:0x0246, B:100:0x0251, B:12:0x0032, B:91:0x0228, B:93:0x0230, B:15:0x003f, B:85:0x0209, B:87:0x0211, B:18:0x0055, B:55:0x0130, B:57:0x013d, B:62:0x017c, B:64:0x0182, B:70:0x01a2, B:77:0x01b6, B:71:0x01a5, B:72:0x01aa, B:73:0x01ab, B:74:0x01ae, B:75:0x01b1, B:76:0x01b4, B:79:0x01e0, B:81:0x01e6, B:58:0x014c, B:60:0x0152, B:61:0x0161, B:21:0x0068, B:51:0x010f, B:24:0x007e, B:47:0x00ef, B:38:0x00c2, B:40:0x00c8, B:42:0x00d7, B:44:0x00dd, B:31:0x0094, B:37:0x00b7, B:26:0x0085, B:35:0x00af, B:32:0x009b), top: B:105:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0161 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:7:0x001e, B:96:0x0242, B:98:0x0246, B:100:0x0251, B:12:0x0032, B:91:0x0228, B:93:0x0230, B:15:0x003f, B:85:0x0209, B:87:0x0211, B:18:0x0055, B:55:0x0130, B:57:0x013d, B:62:0x017c, B:64:0x0182, B:70:0x01a2, B:77:0x01b6, B:71:0x01a5, B:72:0x01aa, B:73:0x01ab, B:74:0x01ae, B:75:0x01b1, B:76:0x01b4, B:79:0x01e0, B:81:0x01e6, B:58:0x014c, B:60:0x0152, B:61:0x0161, B:21:0x0068, B:51:0x010f, B:24:0x007e, B:47:0x00ef, B:38:0x00c2, B:40:0x00c8, B:42:0x00d7, B:44:0x00dd, B:31:0x0094, B:37:0x00b7, B:26:0x0085, B:35:0x00af, B:32:0x009b), top: B:105:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0182 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:7:0x001e, B:96:0x0242, B:98:0x0246, B:100:0x0251, B:12:0x0032, B:91:0x0228, B:93:0x0230, B:15:0x003f, B:85:0x0209, B:87:0x0211, B:18:0x0055, B:55:0x0130, B:57:0x013d, B:62:0x017c, B:64:0x0182, B:70:0x01a2, B:77:0x01b6, B:71:0x01a5, B:72:0x01aa, B:73:0x01ab, B:74:0x01ae, B:75:0x01b1, B:76:0x01b4, B:79:0x01e0, B:81:0x01e6, B:58:0x014c, B:60:0x0152, B:61:0x0161, B:21:0x0068, B:51:0x010f, B:24:0x007e, B:47:0x00ef, B:38:0x00c2, B:40:0x00c8, B:42:0x00d7, B:44:0x00dd, B:31:0x0094, B:37:0x00b7, B:26:0x0085, B:35:0x00af, B:32:0x009b), top: B:105:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x019a  */
    /* JADX WARN: Code duplicated, block: B:67:0x019c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x01b1 A[ADDED_TO_REGION, Catch: all -> 0x0025, REMOVE, TryCatch #0 {all -> 0x0025, blocks: (B:7:0x001e, B:96:0x0242, B:98:0x0246, B:100:0x0251, B:12:0x0032, B:91:0x0228, B:93:0x0230, B:15:0x003f, B:85:0x0209, B:87:0x0211, B:18:0x0055, B:55:0x0130, B:57:0x013d, B:62:0x017c, B:64:0x0182, B:70:0x01a2, B:77:0x01b6, B:71:0x01a5, B:72:0x01aa, B:73:0x01ab, B:74:0x01ae, B:75:0x01b1, B:76:0x01b4, B:79:0x01e0, B:81:0x01e6, B:58:0x014c, B:60:0x0152, B:61:0x0161, B:21:0x0068, B:51:0x010f, B:24:0x007e, B:47:0x00ef, B:38:0x00c2, B:40:0x00c8, B:42:0x00d7, B:44:0x00dd, B:31:0x0094, B:37:0x00b7, B:26:0x0085, B:35:0x00af, B:32:0x009b), top: B:105:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01b4 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:7:0x001e, B:96:0x0242, B:98:0x0246, B:100:0x0251, B:12:0x0032, B:91:0x0228, B:93:0x0230, B:15:0x003f, B:85:0x0209, B:87:0x0211, B:18:0x0055, B:55:0x0130, B:57:0x013d, B:62:0x017c, B:64:0x0182, B:70:0x01a2, B:77:0x01b6, B:71:0x01a5, B:72:0x01aa, B:73:0x01ab, B:74:0x01ae, B:75:0x01b1, B:76:0x01b4, B:79:0x01e0, B:81:0x01e6, B:58:0x014c, B:60:0x0152, B:61:0x0161, B:21:0x0068, B:51:0x010f, B:24:0x007e, B:47:0x00ef, B:38:0x00c2, B:40:0x00c8, B:42:0x00d7, B:44:0x00dd, B:31:0x0094, B:37:0x00b7, B:26:0x0085, B:35:0x00af, B:32:0x009b), top: B:105:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01e0 A[Catch: all -> 0x0025, PHI: r11
      0x01e0: PHI (r11v4 java.lang.Object) = (r11v0 java.lang.Object), (r11v10 java.lang.Object) binds: [B:39:0x00c6, B:78:0x01df] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0025, blocks: (B:7:0x001e, B:96:0x0242, B:98:0x0246, B:100:0x0251, B:12:0x0032, B:91:0x0228, B:93:0x0230, B:15:0x003f, B:85:0x0209, B:87:0x0211, B:18:0x0055, B:55:0x0130, B:57:0x013d, B:62:0x017c, B:64:0x0182, B:70:0x01a2, B:77:0x01b6, B:71:0x01a5, B:72:0x01aa, B:73:0x01ab, B:74:0x01ae, B:75:0x01b1, B:76:0x01b4, B:79:0x01e0, B:81:0x01e6, B:58:0x014c, B:60:0x0152, B:61:0x0161, B:21:0x0068, B:51:0x010f, B:24:0x007e, B:47:0x00ef, B:38:0x00c2, B:40:0x00c8, B:42:0x00d7, B:44:0x00dd, B:31:0x0094, B:37:0x00b7, B:26:0x0085, B:35:0x00af, B:32:0x009b), top: B:105:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:7:0x001e, B:96:0x0242, B:98:0x0246, B:100:0x0251, B:12:0x0032, B:91:0x0228, B:93:0x0230, B:15:0x003f, B:85:0x0209, B:87:0x0211, B:18:0x0055, B:55:0x0130, B:57:0x013d, B:62:0x017c, B:64:0x0182, B:70:0x01a2, B:77:0x01b6, B:71:0x01a5, B:72:0x01aa, B:73:0x01ab, B:74:0x01ae, B:75:0x01b1, B:76:0x01b4, B:79:0x01e0, B:81:0x01e6, B:58:0x014c, B:60:0x0152, B:61:0x0161, B:21:0x0068, B:51:0x010f, B:24:0x007e, B:47:0x00ef, B:38:0x00c2, B:40:0x00c8, B:42:0x00d7, B:44:0x00dd, B:31:0x0094, B:37:0x00b7, B:26:0x0085, B:35:0x00af, B:32:0x009b), top: B:105:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0207  */
    /* JADX WARN: Code duplicated, block: B:84:0x0208  */
    /* JADX WARN: Code duplicated, block: B:87:0x0211 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:7:0x001e, B:96:0x0242, B:98:0x0246, B:100:0x0251, B:12:0x0032, B:91:0x0228, B:93:0x0230, B:15:0x003f, B:85:0x0209, B:87:0x0211, B:18:0x0055, B:55:0x0130, B:57:0x013d, B:62:0x017c, B:64:0x0182, B:70:0x01a2, B:77:0x01b6, B:71:0x01a5, B:72:0x01aa, B:73:0x01ab, B:74:0x01ae, B:75:0x01b1, B:76:0x01b4, B:79:0x01e0, B:81:0x01e6, B:58:0x014c, B:60:0x0152, B:61:0x0161, B:21:0x0068, B:51:0x010f, B:24:0x007e, B:47:0x00ef, B:38:0x00c2, B:40:0x00c8, B:42:0x00d7, B:44:0x00dd, B:31:0x0094, B:37:0x00b7, B:26:0x0085, B:35:0x00af, B:32:0x009b), top: B:105:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0222  */
    /* JADX WARN: Code duplicated, block: B:90:0x0223  */
    /* JADX WARN: Code duplicated, block: B:93:0x0230 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:7:0x001e, B:96:0x0242, B:98:0x0246, B:100:0x0251, B:12:0x0032, B:91:0x0228, B:93:0x0230, B:15:0x003f, B:85:0x0209, B:87:0x0211, B:18:0x0055, B:55:0x0130, B:57:0x013d, B:62:0x017c, B:64:0x0182, B:70:0x01a2, B:77:0x01b6, B:71:0x01a5, B:72:0x01aa, B:73:0x01ab, B:74:0x01ae, B:75:0x01b1, B:76:0x01b4, B:79:0x01e0, B:81:0x01e6, B:58:0x014c, B:60:0x0152, B:61:0x0161, B:21:0x0068, B:51:0x010f, B:24:0x007e, B:47:0x00ef, B:38:0x00c2, B:40:0x00c8, B:42:0x00d7, B:44:0x00dd, B:31:0x0094, B:37:0x00b7, B:26:0x0085, B:35:0x00af, B:32:0x009b), top: B:105:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0250  */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x023f, code lost:
    
        if (r3 == r2) goto L95;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        Object obj2;
        C29884y c29884y;
        C29124h c29124hM70039a;
        Map mapM69771a;
        Object strings;
        C29983l c29983l;
        Object config;
        Map map;
        Object obj3;
        C29884y c29884y2;
        C29983l c29983l2;
        C29124h c29124h;
        Object objM70022c;
        Object obj4;
        C29124h c29124h2;
        Throwable thM103847exceptionOrNullimpl;
        Object objM71154a;
        Object obj5;
        List listM71172a;
        C32487O0 c32487o0;
        int i11;
        Screen screen;
        C32487O0 c32487o1;
        Object strings2;
        Throwable th2;
        C32487O0 c32487o2;
        String strM69377a;
        Object config2;
        Object objM70087a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        String strM69770a = null;
        try {
            try {
                switch (this.f66190a) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        AbstractC32493S.m71164a("loadDocuments()");
                        C32487O0 c32487o3 = this.f66193d;
                        Result.Companion companion = Result.INSTANCE;
                        InterfaceC30056e interfaceC30056e = c32487o3.f66263b;
                        this.f66190a = 1;
                        objM70087a = ((C30059h) interfaceC30056e).f60399a.f60391a.m70087a(this);
                        if (objM70087a != coroutine_suspended) {
                            objM103844constructorimpl = Result.m103844constructorimpl((C29884y) objM70087a);
                            obj2 = objM103844constructorimpl;
                            if (Result.m103851isSuccessimpl(obj2)) {
                                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                                if (thM103847exceptionOrNullimpl != null) {
                                    C33272c.f67816e.f67810a.mo68956e("SnsId", "loadDocuments error", thM103847exceptionOrNullimpl);
                                    C32487O0 c32487o4 = this.f66193d;
                                    this.f66191b = obj2;
                                    this.f66194e = thM103847exceptionOrNullimpl;
                                    this.f66195f = null;
                                    this.f66196g = null;
                                    this.f66197h = null;
                                    this.f66190a = 5;
                                    KProperty[] kPropertyArr = C32487O0.f66261v;
                                    objM71154a = c32487o4.m71154a(thM103847exceptionOrNullimpl, this);
                                    if (objM71154a != coroutine_suspended) {
                                        obj5 = obj2;
                                        if (((Boolean) objM71154a).booleanValue()) {
                                            c32487o1 = this.f66193d;
                                            this.f66191b = obj5;
                                            this.f66194e = thM103847exceptionOrNullimpl;
                                            this.f66195f = c32487o1;
                                            this.f66190a = 6;
                                            strings2 = c32487o1.getStrings(this);
                                            if (strings2 == coroutine_suspended) {
                                                th2 = thM103847exceptionOrNullimpl;
                                                c32487o2 = c32487o1;
                                                strM69377a = AbstractC28476n.m69377a(th2, (C29983l) strings2);
                                                if (strM69377a == null) {
                                                    C32487O0 c32487o5 = this.f66193d;
                                                    this.f66191b = obj5;
                                                    this.f66194e = c32487o2;
                                                    this.f66195f = null;
                                                    this.f66190a = 7;
                                                    config2 = c32487o5.getConfig(this);
                                                } else {
                                                    strM69770a = strM69377a;
                                                }
                                                KProperty[] kPropertyArr2 = C32487O0.f66261v;
                                                C32557s c32557s = new C32557s(strM69770a, c32487o2.m71160e().f66411a);
                                                C28936t c28936t = c32487o2.f66270i;
                                                KProperty kProperty = C32487O0.f66261v[1];
                                                c28936t.f58834a.set(c28936t.f58835b, c32557s);
                                                this.f66193d.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                                break;
                                            }
                                        }
                                    }
                                }
                                this.f66192c.showProgress(false);
                                return Unit.INSTANCE;
                            }
                            c29884y = (C29884y) obj2;
                            c29124hM70039a = ((C29967J) this.f66193d.f66262a).m70039a();
                            if (c29124hM70039a != null) {
                                mapM69771a = AbstractC29130i.m69771a(c29124hM70039a);
                            } else {
                                mapM69771a = null;
                            }
                            C32487O0 c32487o6 = this.f66193d;
                            this.f66191b = obj2;
                            this.f66194e = c29884y;
                            this.f66195f = mapM69771a;
                            this.f66190a = 2;
                            strings = c32487o6.getStrings(this);
                            if (strings == coroutine_suspended) {
                                c29983l = (C29983l) strings;
                                C32487O0 c32487o7 = this.f66193d;
                                this.f66191b = obj2;
                                this.f66194e = c29884y;
                                this.f66195f = mapM69771a;
                                this.f66196g = c29983l;
                                this.f66190a = 3;
                                config = c32487o7.getConfig(this);
                                if (config != coroutine_suspended) {
                                    Object obj6 = obj2;
                                    map = mapM69771a;
                                    obj3 = obj6;
                                    c29884y2 = c29884y;
                                    c29983l2 = c29983l;
                                    c29124h = (C29124h) config;
                                    InterfaceC29921d interfaceC29921d = this.f66193d.f66265d;
                                    this.f66191b = obj3;
                                    this.f66194e = c29884y2;
                                    this.f66195f = map;
                                    this.f66196g = c29983l2;
                                    this.f66197h = c29124h;
                                    this.f66190a = 4;
                                    objM70022c = ((C29950z) interfaceC29921d).m70022c(this);
                                    if (objM70022c == coroutine_suspended) {
                                        obj4 = obj3;
                                        c29124h2 = c29124h;
                                        listM71172a = new C32553q(map, c29983l2, c29124h2, (Function1) objM70022c).m71172a(c29884y2);
                                        if (listM71172a == null) {
                                            AbstractC32493S.m71164a("loadDocuments(), no documents");
                                            C32487O0 c32487o8 = this.f66193d;
                                            SNSSumsubIdStep sNSSumsubIdStep = SNSSumsubIdStep.ENTER_EMAIL;
                                            KProperty[] kPropertyArr3 = C32487O0.f66261v;
                                            c32487o8.m71156a(sNSSumsubIdStep);
                                        } else if (listM71172a.isEmpty()) {
                                            AbstractC32493S.m71164a("loadDocuments(), documents are empty");
                                            C32487O0 c32487o9 = this.f66193d;
                                            SNSSumsubIdStep sNSSumsubIdStep2 = SNSSumsubIdStep.NO_DATA;
                                            KProperty[] kPropertyArr4 = C32487O0.f66261v;
                                            c32487o9.m71156a(sNSSumsubIdStep2);
                                        } else {
                                            AbstractC32493S.m71164a("loadDocuments(), has documents");
                                            C28936t c28936t2 = this.f66193d.f66272k;
                                            KProperty kProperty2 = C32487O0.f66261v[2];
                                            c28936t2.f58834a.set(c28936t2.f58835b, listM71172a);
                                            this.f66193d.m71156a(SNSSumsubIdStep.DATA_SELECTOR);
                                        }
                                        c32487o0 = this.f66193d;
                                        if (!c32487o0.f66280s) {
                                            c32487o0.f66280s = true;
                                            C28936t c28936t3 = c32487o0.f66267f;
                                            KProperty kProperty3 = C32487O0.f66261v[0];
                                            i11 = AbstractC32530i0.f66358a[((SNSSumsubIdStep) c28936t3.m69705a()).ordinal()];
                                            if (i11 == 1) {
                                                screen = Screen.SumsubIdEmailScreen;
                                            } else if (i11 != 2 || i11 == 3) {
                                                screen = Screen.SumsubIdReuseScreen;
                                            } else if (i11 == 4) {
                                                screen = Screen.SumsubIdAgreementScreen;
                                            } else {
                                                if (i11 != 5) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                screen = Screen.SumsubIdProfileScreen;
                                            }
                                            String text = screen.getText();
                                            C28368g c28368gM69266a = new C28368g().m69266a(StepAction.Started, "SumsubId");
                                            c28368gM69266a.f57847c = MapsKt.toMap(ArraysKt.filterNotNull(new Pair[]{TuplesKt.m90091to("screenName", text)}));
                                            c28368gM69266a.m69267a(false);
                                        }
                                        obj2 = obj4;
                                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                                        if (thM103847exceptionOrNullimpl != null) {
                                            C33272c.f67816e.f67810a.mo68956e("SnsId", "loadDocuments error", thM103847exceptionOrNullimpl);
                                            C32487O0 c32487o10 = this.f66193d;
                                            this.f66191b = obj2;
                                            this.f66194e = thM103847exceptionOrNullimpl;
                                            this.f66195f = null;
                                            this.f66196g = null;
                                            this.f66197h = null;
                                            this.f66190a = 5;
                                            KProperty[] kPropertyArr5 = C32487O0.f66261v;
                                            objM71154a = c32487o10.m71154a(thM103847exceptionOrNullimpl, this);
                                            if (objM71154a != coroutine_suspended) {
                                                obj5 = obj2;
                                                if (((Boolean) objM71154a).booleanValue()) {
                                                    c32487o1 = this.f66193d;
                                                    this.f66191b = obj5;
                                                    this.f66194e = thM103847exceptionOrNullimpl;
                                                    this.f66195f = c32487o1;
                                                    this.f66190a = 6;
                                                    strings2 = c32487o1.getStrings(this);
                                                    if (strings2 == coroutine_suspended) {
                                                        th2 = thM103847exceptionOrNullimpl;
                                                        c32487o2 = c32487o1;
                                                        strM69377a = AbstractC28476n.m69377a(th2, (C29983l) strings2);
                                                        if (strM69377a == null) {
                                                            C32487O0 c32487o11 = this.f66193d;
                                                            this.f66191b = obj5;
                                                            this.f66194e = c32487o2;
                                                            this.f66195f = null;
                                                            this.f66190a = 7;
                                                            config2 = c32487o11.getConfig(this);
                                                        } else {
                                                            strM69770a = strM69377a;
                                                        }
                                                        KProperty[] kPropertyArr6 = C32487O0.f66261v;
                                                        C32557s c32557s2 = new C32557s(strM69770a, c32487o2.m71160e().f66411a);
                                                        C28936t c28936t4 = c32487o2.f66270i;
                                                        KProperty kProperty4 = C32487O0.f66261v[1];
                                                        c28936t4.f58834a.set(c28936t4.f58835b, c32557s2);
                                                        this.f66193d.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        this.f66192c.showProgress(false);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                        return coroutine_suspended;
                    case 1:
                        ResultKt.throwOnFailure(obj);
                        objM70087a = obj;
                        objM103844constructorimpl = Result.m103844constructorimpl((C29884y) objM70087a);
                        obj2 = objM103844constructorimpl;
                        if (Result.m103851isSuccessimpl(obj2)) {
                            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                            if (thM103847exceptionOrNullimpl != null) {
                                C33272c.f67816e.f67810a.mo68956e("SnsId", "loadDocuments error", thM103847exceptionOrNullimpl);
                                C32487O0 c32487o12 = this.f66193d;
                                this.f66191b = obj2;
                                this.f66194e = thM103847exceptionOrNullimpl;
                                this.f66195f = null;
                                this.f66196g = null;
                                this.f66197h = null;
                                this.f66190a = 5;
                                KProperty[] kPropertyArr7 = C32487O0.f66261v;
                                objM71154a = c32487o12.m71154a(thM103847exceptionOrNullimpl, this);
                                if (objM71154a != coroutine_suspended) {
                                    obj5 = obj2;
                                    if (((Boolean) objM71154a).booleanValue()) {
                                        c32487o1 = this.f66193d;
                                        this.f66191b = obj5;
                                        this.f66194e = thM103847exceptionOrNullimpl;
                                        this.f66195f = c32487o1;
                                        this.f66190a = 6;
                                        strings2 = c32487o1.getStrings(this);
                                        if (strings2 == coroutine_suspended) {
                                            th2 = thM103847exceptionOrNullimpl;
                                            c32487o2 = c32487o1;
                                            strM69377a = AbstractC28476n.m69377a(th2, (C29983l) strings2);
                                            if (strM69377a == null) {
                                                C32487O0 c32487o13 = this.f66193d;
                                                this.f66191b = obj5;
                                                this.f66194e = c32487o2;
                                                this.f66195f = null;
                                                this.f66190a = 7;
                                                config2 = c32487o13.getConfig(this);
                                            } else {
                                                strM69770a = strM69377a;
                                            }
                                            KProperty[] kPropertyArr8 = C32487O0.f66261v;
                                            C32557s c32557s3 = new C32557s(strM69770a, c32487o2.m71160e().f66411a);
                                            C28936t c28936t5 = c32487o2.f66270i;
                                            KProperty kProperty5 = C32487O0.f66261v[1];
                                            c28936t5.f58834a.set(c28936t5.f58835b, c32557s3);
                                            this.f66193d.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                            break;
                                        }
                                    }
                                }
                            }
                            this.f66192c.showProgress(false);
                            return Unit.INSTANCE;
                        }
                        c29884y = (C29884y) obj2;
                        c29124hM70039a = ((C29967J) this.f66193d.f66262a).m70039a();
                        if (c29124hM70039a != null) {
                            mapM69771a = AbstractC29130i.m69771a(c29124hM70039a);
                        } else {
                            mapM69771a = null;
                        }
                        C32487O0 c32487o14 = this.f66193d;
                        this.f66191b = obj2;
                        this.f66194e = c29884y;
                        this.f66195f = mapM69771a;
                        this.f66190a = 2;
                        strings = c32487o14.getStrings(this);
                        if (strings == coroutine_suspended) {
                            c29983l = (C29983l) strings;
                            C32487O0 c32487o15 = this.f66193d;
                            this.f66191b = obj2;
                            this.f66194e = c29884y;
                            this.f66195f = mapM69771a;
                            this.f66196g = c29983l;
                            this.f66190a = 3;
                            config = c32487o15.getConfig(this);
                            if (config != coroutine_suspended) {
                                Object obj7 = obj2;
                                map = mapM69771a;
                                obj3 = obj7;
                                c29884y2 = c29884y;
                                c29983l2 = c29983l;
                                c29124h = (C29124h) config;
                                InterfaceC29921d interfaceC29921d2 = this.f66193d.f66265d;
                                this.f66191b = obj3;
                                this.f66194e = c29884y2;
                                this.f66195f = map;
                                this.f66196g = c29983l2;
                                this.f66197h = c29124h;
                                this.f66190a = 4;
                                objM70022c = ((C29950z) interfaceC29921d2).m70022c(this);
                                if (objM70022c == coroutine_suspended) {
                                    obj4 = obj3;
                                    c29124h2 = c29124h;
                                    listM71172a = new C32553q(map, c29983l2, c29124h2, (Function1) objM70022c).m71172a(c29884y2);
                                    if (listM71172a == null) {
                                        AbstractC32493S.m71164a("loadDocuments(), no documents");
                                        C32487O0 c32487o16 = this.f66193d;
                                        SNSSumsubIdStep sNSSumsubIdStep3 = SNSSumsubIdStep.ENTER_EMAIL;
                                        KProperty[] kPropertyArr9 = C32487O0.f66261v;
                                        c32487o16.m71156a(sNSSumsubIdStep3);
                                    } else if (listM71172a.isEmpty()) {
                                        AbstractC32493S.m71164a("loadDocuments(), documents are empty");
                                        C32487O0 c32487o17 = this.f66193d;
                                        SNSSumsubIdStep sNSSumsubIdStep4 = SNSSumsubIdStep.NO_DATA;
                                        KProperty[] kPropertyArr10 = C32487O0.f66261v;
                                        c32487o17.m71156a(sNSSumsubIdStep4);
                                    } else {
                                        AbstractC32493S.m71164a("loadDocuments(), has documents");
                                        C28936t c28936t6 = this.f66193d.f66272k;
                                        KProperty kProperty6 = C32487O0.f66261v[2];
                                        c28936t6.f58834a.set(c28936t6.f58835b, listM71172a);
                                        this.f66193d.m71156a(SNSSumsubIdStep.DATA_SELECTOR);
                                    }
                                    c32487o0 = this.f66193d;
                                    if (!c32487o0.f66280s) {
                                        c32487o0.f66280s = true;
                                        C28936t c28936t7 = c32487o0.f66267f;
                                        KProperty kProperty7 = C32487O0.f66261v[0];
                                        i11 = AbstractC32530i0.f66358a[((SNSSumsubIdStep) c28936t7.m69705a()).ordinal()];
                                        if (i11 == 1) {
                                            screen = Screen.SumsubIdEmailScreen;
                                        } else if (i11 != 2) {
                                            screen = Screen.SumsubIdReuseScreen;
                                        } else {
                                            screen = Screen.SumsubIdReuseScreen;
                                        }
                                        String text2 = screen.getText();
                                        C28368g c28368gM69266a2 = new C28368g().m69266a(StepAction.Started, "SumsubId");
                                        c28368gM69266a2.f57847c = MapsKt.toMap(ArraysKt.filterNotNull(new Pair[]{TuplesKt.m90091to("screenName", text2)}));
                                        c28368gM69266a2.m69267a(false);
                                    }
                                    obj2 = obj4;
                                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                                    if (thM103847exceptionOrNullimpl != null) {
                                        C33272c.f67816e.f67810a.mo68956e("SnsId", "loadDocuments error", thM103847exceptionOrNullimpl);
                                        C32487O0 c32487o18 = this.f66193d;
                                        this.f66191b = obj2;
                                        this.f66194e = thM103847exceptionOrNullimpl;
                                        this.f66195f = null;
                                        this.f66196g = null;
                                        this.f66197h = null;
                                        this.f66190a = 5;
                                        KProperty[] kPropertyArr11 = C32487O0.f66261v;
                                        objM71154a = c32487o18.m71154a(thM103847exceptionOrNullimpl, this);
                                        if (objM71154a != coroutine_suspended) {
                                            obj5 = obj2;
                                            if (((Boolean) objM71154a).booleanValue()) {
                                                c32487o1 = this.f66193d;
                                                this.f66191b = obj5;
                                                this.f66194e = thM103847exceptionOrNullimpl;
                                                this.f66195f = c32487o1;
                                                this.f66190a = 6;
                                                strings2 = c32487o1.getStrings(this);
                                                if (strings2 == coroutine_suspended) {
                                                    th2 = thM103847exceptionOrNullimpl;
                                                    c32487o2 = c32487o1;
                                                    strM69377a = AbstractC28476n.m69377a(th2, (C29983l) strings2);
                                                    if (strM69377a == null) {
                                                        C32487O0 c32487o19 = this.f66193d;
                                                        this.f66191b = obj5;
                                                        this.f66194e = c32487o2;
                                                        this.f66195f = null;
                                                        this.f66190a = 7;
                                                        config2 = c32487o19.getConfig(this);
                                                    } else {
                                                        strM69770a = strM69377a;
                                                    }
                                                    KProperty[] kPropertyArr12 = C32487O0.f66261v;
                                                    C32557s c32557s4 = new C32557s(strM69770a, c32487o2.m71160e().f66411a);
                                                    C28936t c28936t8 = c32487o2.f66270i;
                                                    KProperty kProperty8 = C32487O0.f66261v[1];
                                                    c28936t8.f58834a.set(c28936t8.f58835b, c32557s4);
                                                    this.f66193d.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    this.f66192c.showProgress(false);
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                        return coroutine_suspended;
                    case 2:
                        mapM69771a = (Map) this.f66195f;
                        c29884y = (C29884y) this.f66194e;
                        obj2 = this.f66191b;
                        ResultKt.throwOnFailure(obj);
                        strings = obj;
                        c29983l = (C29983l) strings;
                        C32487O0 c32487o110 = this.f66193d;
                        this.f66191b = obj2;
                        this.f66194e = c29884y;
                        this.f66195f = mapM69771a;
                        this.f66196g = c29983l;
                        this.f66190a = 3;
                        config = c32487o110.getConfig(this);
                        if (config != coroutine_suspended) {
                            Object obj8 = obj2;
                            map = mapM69771a;
                            obj3 = obj8;
                            c29884y2 = c29884y;
                            c29983l2 = c29983l;
                            c29124h = (C29124h) config;
                            InterfaceC29921d interfaceC29921d3 = this.f66193d.f66265d;
                            this.f66191b = obj3;
                            this.f66194e = c29884y2;
                            this.f66195f = map;
                            this.f66196g = c29983l2;
                            this.f66197h = c29124h;
                            this.f66190a = 4;
                            objM70022c = ((C29950z) interfaceC29921d3).m70022c(this);
                            if (objM70022c == coroutine_suspended) {
                                obj4 = obj3;
                                c29124h2 = c29124h;
                                listM71172a = new C32553q(map, c29983l2, c29124h2, (Function1) objM70022c).m71172a(c29884y2);
                                if (listM71172a == null) {
                                    AbstractC32493S.m71164a("loadDocuments(), no documents");
                                    C32487O0 c32487o111 = this.f66193d;
                                    SNSSumsubIdStep sNSSumsubIdStep5 = SNSSumsubIdStep.ENTER_EMAIL;
                                    KProperty[] kPropertyArr13 = C32487O0.f66261v;
                                    c32487o111.m71156a(sNSSumsubIdStep5);
                                } else if (listM71172a.isEmpty()) {
                                    AbstractC32493S.m71164a("loadDocuments(), documents are empty");
                                    C32487O0 c32487o112 = this.f66193d;
                                    SNSSumsubIdStep sNSSumsubIdStep6 = SNSSumsubIdStep.NO_DATA;
                                    KProperty[] kPropertyArr14 = C32487O0.f66261v;
                                    c32487o112.m71156a(sNSSumsubIdStep6);
                                } else {
                                    AbstractC32493S.m71164a("loadDocuments(), has documents");
                                    C28936t c28936t9 = this.f66193d.f66272k;
                                    KProperty kProperty9 = C32487O0.f66261v[2];
                                    c28936t9.f58834a.set(c28936t9.f58835b, listM71172a);
                                    this.f66193d.m71156a(SNSSumsubIdStep.DATA_SELECTOR);
                                }
                                c32487o0 = this.f66193d;
                                if (!c32487o0.f66280s) {
                                    c32487o0.f66280s = true;
                                    C28936t c28936t10 = c32487o0.f66267f;
                                    KProperty kProperty10 = C32487O0.f66261v[0];
                                    i11 = AbstractC32530i0.f66358a[((SNSSumsubIdStep) c28936t10.m69705a()).ordinal()];
                                    if (i11 == 1) {
                                        screen = Screen.SumsubIdEmailScreen;
                                    } else if (i11 != 2) {
                                        screen = Screen.SumsubIdReuseScreen;
                                    } else {
                                        screen = Screen.SumsubIdReuseScreen;
                                    }
                                    String text3 = screen.getText();
                                    C28368g c28368gM69266a3 = new C28368g().m69266a(StepAction.Started, "SumsubId");
                                    c28368gM69266a3.f57847c = MapsKt.toMap(ArraysKt.filterNotNull(new Pair[]{TuplesKt.m90091to("screenName", text3)}));
                                    c28368gM69266a3.m69267a(false);
                                }
                                obj2 = obj4;
                                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                                if (thM103847exceptionOrNullimpl != null) {
                                    C33272c.f67816e.f67810a.mo68956e("SnsId", "loadDocuments error", thM103847exceptionOrNullimpl);
                                    C32487O0 c32487o113 = this.f66193d;
                                    this.f66191b = obj2;
                                    this.f66194e = thM103847exceptionOrNullimpl;
                                    this.f66195f = null;
                                    this.f66196g = null;
                                    this.f66197h = null;
                                    this.f66190a = 5;
                                    KProperty[] kPropertyArr15 = C32487O0.f66261v;
                                    objM71154a = c32487o113.m71154a(thM103847exceptionOrNullimpl, this);
                                    if (objM71154a != coroutine_suspended) {
                                        obj5 = obj2;
                                        if (((Boolean) objM71154a).booleanValue()) {
                                            c32487o1 = this.f66193d;
                                            this.f66191b = obj5;
                                            this.f66194e = thM103847exceptionOrNullimpl;
                                            this.f66195f = c32487o1;
                                            this.f66190a = 6;
                                            strings2 = c32487o1.getStrings(this);
                                            if (strings2 == coroutine_suspended) {
                                                th2 = thM103847exceptionOrNullimpl;
                                                c32487o2 = c32487o1;
                                                strM69377a = AbstractC28476n.m69377a(th2, (C29983l) strings2);
                                                if (strM69377a == null) {
                                                    C32487O0 c32487o114 = this.f66193d;
                                                    this.f66191b = obj5;
                                                    this.f66194e = c32487o2;
                                                    this.f66195f = null;
                                                    this.f66190a = 7;
                                                    config2 = c32487o114.getConfig(this);
                                                } else {
                                                    strM69770a = strM69377a;
                                                }
                                                KProperty[] kPropertyArr16 = C32487O0.f66261v;
                                                C32557s c32557s5 = new C32557s(strM69770a, c32487o2.m71160e().f66411a);
                                                C28936t c28936t11 = c32487o2.f66270i;
                                                KProperty kProperty11 = C32487O0.f66261v[1];
                                                c28936t11.f58834a.set(c28936t11.f58835b, c32557s5);
                                                this.f66193d.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                                break;
                                            }
                                        }
                                    }
                                }
                                this.f66192c.showProgress(false);
                                return Unit.INSTANCE;
                            }
                        }
                        return coroutine_suspended;
                    case 3:
                        C29983l c29983l3 = this.f66196g;
                        Map map2 = (Map) this.f66195f;
                        C29884y c29884y3 = (C29884y) this.f66194e;
                        Object obj9 = this.f66191b;
                        ResultKt.throwOnFailure(obj);
                        c29983l2 = c29983l3;
                        obj3 = obj9;
                        c29884y2 = c29884y3;
                        map = map2;
                        config = obj;
                        c29124h = (C29124h) config;
                        InterfaceC29921d interfaceC29921d4 = this.f66193d.f66265d;
                        this.f66191b = obj3;
                        this.f66194e = c29884y2;
                        this.f66195f = map;
                        this.f66196g = c29983l2;
                        this.f66197h = c29124h;
                        this.f66190a = 4;
                        objM70022c = ((C29950z) interfaceC29921d4).m70022c(this);
                        if (objM70022c == coroutine_suspended) {
                            obj4 = obj3;
                            c29124h2 = c29124h;
                            listM71172a = new C32553q(map, c29983l2, c29124h2, (Function1) objM70022c).m71172a(c29884y2);
                            if (listM71172a == null) {
                                AbstractC32493S.m71164a("loadDocuments(), no documents");
                                C32487O0 c32487o115 = this.f66193d;
                                SNSSumsubIdStep sNSSumsubIdStep7 = SNSSumsubIdStep.ENTER_EMAIL;
                                KProperty[] kPropertyArr17 = C32487O0.f66261v;
                                c32487o115.m71156a(sNSSumsubIdStep7);
                            } else if (listM71172a.isEmpty()) {
                                AbstractC32493S.m71164a("loadDocuments(), documents are empty");
                                C32487O0 c32487o116 = this.f66193d;
                                SNSSumsubIdStep sNSSumsubIdStep8 = SNSSumsubIdStep.NO_DATA;
                                KProperty[] kPropertyArr18 = C32487O0.f66261v;
                                c32487o116.m71156a(sNSSumsubIdStep8);
                            } else {
                                AbstractC32493S.m71164a("loadDocuments(), has documents");
                                C28936t c28936t12 = this.f66193d.f66272k;
                                KProperty kProperty12 = C32487O0.f66261v[2];
                                c28936t12.f58834a.set(c28936t12.f58835b, listM71172a);
                                this.f66193d.m71156a(SNSSumsubIdStep.DATA_SELECTOR);
                            }
                            c32487o0 = this.f66193d;
                            if (!c32487o0.f66280s) {
                                c32487o0.f66280s = true;
                                C28936t c28936t13 = c32487o0.f66267f;
                                KProperty kProperty13 = C32487O0.f66261v[0];
                                i11 = AbstractC32530i0.f66358a[((SNSSumsubIdStep) c28936t13.m69705a()).ordinal()];
                                if (i11 == 1) {
                                    screen = Screen.SumsubIdEmailScreen;
                                } else if (i11 != 2) {
                                    screen = Screen.SumsubIdReuseScreen;
                                } else {
                                    screen = Screen.SumsubIdReuseScreen;
                                }
                                String text4 = screen.getText();
                                C28368g c28368gM69266a4 = new C28368g().m69266a(StepAction.Started, "SumsubId");
                                c28368gM69266a4.f57847c = MapsKt.toMap(ArraysKt.filterNotNull(new Pair[]{TuplesKt.m90091to("screenName", text4)}));
                                c28368gM69266a4.m69267a(false);
                            }
                            obj2 = obj4;
                            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                            if (thM103847exceptionOrNullimpl != null) {
                                C33272c.f67816e.f67810a.mo68956e("SnsId", "loadDocuments error", thM103847exceptionOrNullimpl);
                                C32487O0 c32487o117 = this.f66193d;
                                this.f66191b = obj2;
                                this.f66194e = thM103847exceptionOrNullimpl;
                                this.f66195f = null;
                                this.f66196g = null;
                                this.f66197h = null;
                                this.f66190a = 5;
                                KProperty[] kPropertyArr19 = C32487O0.f66261v;
                                objM71154a = c32487o117.m71154a(thM103847exceptionOrNullimpl, this);
                                if (objM71154a != coroutine_suspended) {
                                    obj5 = obj2;
                                    if (((Boolean) objM71154a).booleanValue()) {
                                        c32487o1 = this.f66193d;
                                        this.f66191b = obj5;
                                        this.f66194e = thM103847exceptionOrNullimpl;
                                        this.f66195f = c32487o1;
                                        this.f66190a = 6;
                                        strings2 = c32487o1.getStrings(this);
                                        if (strings2 == coroutine_suspended) {
                                            th2 = thM103847exceptionOrNullimpl;
                                            c32487o2 = c32487o1;
                                            strM69377a = AbstractC28476n.m69377a(th2, (C29983l) strings2);
                                            if (strM69377a == null) {
                                                C32487O0 c32487o118 = this.f66193d;
                                                this.f66191b = obj5;
                                                this.f66194e = c32487o2;
                                                this.f66195f = null;
                                                this.f66190a = 7;
                                                config2 = c32487o118.getConfig(this);
                                            } else {
                                                strM69770a = strM69377a;
                                            }
                                            KProperty[] kPropertyArr110 = C32487O0.f66261v;
                                            C32557s c32557s6 = new C32557s(strM69770a, c32487o2.m71160e().f66411a);
                                            C28936t c28936t14 = c32487o2.f66270i;
                                            KProperty kProperty14 = C32487O0.f66261v[1];
                                            c28936t14.f58834a.set(c28936t14.f58835b, c32557s6);
                                            this.f66193d.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                            break;
                                        }
                                    }
                                }
                            }
                            this.f66192c.showProgress(false);
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    case 4:
                        c29124h2 = this.f66197h;
                        c29983l2 = this.f66196g;
                        map = (Map) this.f66195f;
                        c29884y2 = (C29884y) this.f66194e;
                        obj4 = this.f66191b;
                        ResultKt.throwOnFailure(obj);
                        objM70022c = obj;
                        listM71172a = new C32553q(map, c29983l2, c29124h2, (Function1) objM70022c).m71172a(c29884y2);
                        if (listM71172a == null) {
                            AbstractC32493S.m71164a("loadDocuments(), no documents");
                            C32487O0 c32487o119 = this.f66193d;
                            SNSSumsubIdStep sNSSumsubIdStep9 = SNSSumsubIdStep.ENTER_EMAIL;
                            KProperty[] kPropertyArr111 = C32487O0.f66261v;
                            c32487o119.m71156a(sNSSumsubIdStep9);
                        } else if (listM71172a.isEmpty()) {
                            AbstractC32493S.m71164a("loadDocuments(), documents are empty");
                            C32487O0 c32487o1110 = this.f66193d;
                            SNSSumsubIdStep sNSSumsubIdStep10 = SNSSumsubIdStep.NO_DATA;
                            KProperty[] kPropertyArr112 = C32487O0.f66261v;
                            c32487o1110.m71156a(sNSSumsubIdStep10);
                        } else {
                            AbstractC32493S.m71164a("loadDocuments(), has documents");
                            C28936t c28936t15 = this.f66193d.f66272k;
                            KProperty kProperty15 = C32487O0.f66261v[2];
                            c28936t15.f58834a.set(c28936t15.f58835b, listM71172a);
                            this.f66193d.m71156a(SNSSumsubIdStep.DATA_SELECTOR);
                        }
                        c32487o0 = this.f66193d;
                        if (!c32487o0.f66280s) {
                            c32487o0.f66280s = true;
                            C28936t c28936t16 = c32487o0.f66267f;
                            KProperty kProperty16 = C32487O0.f66261v[0];
                            i11 = AbstractC32530i0.f66358a[((SNSSumsubIdStep) c28936t16.m69705a()).ordinal()];
                            if (i11 == 1) {
                                screen = Screen.SumsubIdEmailScreen;
                            } else if (i11 != 2) {
                                screen = Screen.SumsubIdReuseScreen;
                            } else {
                                screen = Screen.SumsubIdReuseScreen;
                            }
                            String text5 = screen.getText();
                            C28368g c28368gM69266a5 = new C28368g().m69266a(StepAction.Started, "SumsubId");
                            c28368gM69266a5.f57847c = MapsKt.toMap(ArraysKt.filterNotNull(new Pair[]{TuplesKt.m90091to("screenName", text5)}));
                            c28368gM69266a5.m69267a(false);
                        }
                        obj2 = obj4;
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                        if (thM103847exceptionOrNullimpl != null) {
                            C33272c.f67816e.f67810a.mo68956e("SnsId", "loadDocuments error", thM103847exceptionOrNullimpl);
                            C32487O0 c32487o1111 = this.f66193d;
                            this.f66191b = obj2;
                            this.f66194e = thM103847exceptionOrNullimpl;
                            this.f66195f = null;
                            this.f66196g = null;
                            this.f66197h = null;
                            this.f66190a = 5;
                            KProperty[] kPropertyArr113 = C32487O0.f66261v;
                            objM71154a = c32487o1111.m71154a(thM103847exceptionOrNullimpl, this);
                            if (objM71154a != coroutine_suspended) {
                                obj5 = obj2;
                                if (((Boolean) objM71154a).booleanValue()) {
                                    c32487o1 = this.f66193d;
                                    this.f66191b = obj5;
                                    this.f66194e = thM103847exceptionOrNullimpl;
                                    this.f66195f = c32487o1;
                                    this.f66190a = 6;
                                    strings2 = c32487o1.getStrings(this);
                                    if (strings2 == coroutine_suspended) {
                                        th2 = thM103847exceptionOrNullimpl;
                                        c32487o2 = c32487o1;
                                        strM69377a = AbstractC28476n.m69377a(th2, (C29983l) strings2);
                                        if (strM69377a == null) {
                                            C32487O0 c32487o1112 = this.f66193d;
                                            this.f66191b = obj5;
                                            this.f66194e = c32487o2;
                                            this.f66195f = null;
                                            this.f66190a = 7;
                                            config2 = c32487o1112.getConfig(this);
                                        } else {
                                            strM69770a = strM69377a;
                                        }
                                        KProperty[] kPropertyArr114 = C32487O0.f66261v;
                                        C32557s c32557s7 = new C32557s(strM69770a, c32487o2.m71160e().f66411a);
                                        C28936t c28936t17 = c32487o2.f66270i;
                                        KProperty kProperty17 = C32487O0.f66261v[1];
                                        c28936t17.f58834a.set(c28936t17.f58835b, c32557s7);
                                        this.f66193d.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                        break;
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                        this.f66192c.showProgress(false);
                        return Unit.INSTANCE;
                    case 5:
                        thM103847exceptionOrNullimpl = (Throwable) this.f66194e;
                        Object obj10 = this.f66191b;
                        ResultKt.throwOnFailure(obj);
                        obj5 = obj10;
                        objM71154a = obj;
                        if (((Boolean) objM71154a).booleanValue()) {
                            c32487o1 = this.f66193d;
                            this.f66191b = obj5;
                            this.f66194e = thM103847exceptionOrNullimpl;
                            this.f66195f = c32487o1;
                            this.f66190a = 6;
                            strings2 = c32487o1.getStrings(this);
                            if (strings2 == coroutine_suspended) {
                                th2 = thM103847exceptionOrNullimpl;
                                c32487o2 = c32487o1;
                                strM69377a = AbstractC28476n.m69377a(th2, (C29983l) strings2);
                                if (strM69377a == null) {
                                    C32487O0 c32487o1113 = this.f66193d;
                                    this.f66191b = obj5;
                                    this.f66194e = c32487o2;
                                    this.f66195f = null;
                                    this.f66190a = 7;
                                    config2 = c32487o1113.getConfig(this);
                                } else {
                                    strM69770a = strM69377a;
                                }
                                KProperty[] kPropertyArr115 = C32487O0.f66261v;
                                C32557s c32557s8 = new C32557s(strM69770a, c32487o2.m71160e().f66411a);
                                C28936t c28936t18 = c32487o2.f66270i;
                                KProperty kProperty18 = C32487O0.f66261v[1];
                                c28936t18.f58834a.set(c28936t18.f58835b, c32557s8);
                                this.f66193d.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                break;
                            }
                            return coroutine_suspended;
                        }
                        this.f66192c.showProgress(false);
                        return Unit.INSTANCE;
                    case 6:
                        c32487o2 = (C32487O0) this.f66195f;
                        th2 = (Throwable) this.f66194e;
                        obj5 = this.f66191b;
                        ResultKt.throwOnFailure(obj);
                        strings2 = obj;
                        strM69377a = AbstractC28476n.m69377a(th2, (C29983l) strings2);
                        if (strM69377a == null) {
                            C32487O0 c32487o1114 = this.f66193d;
                            this.f66191b = obj5;
                            this.f66194e = c32487o2;
                            this.f66195f = null;
                            this.f66190a = 7;
                            config2 = c32487o1114.getConfig(this);
                            break;
                        } else {
                            strM69770a = strM69377a;
                        }
                        KProperty[] kPropertyArr116 = C32487O0.f66261v;
                        C32557s c32557s9 = new C32557s(strM69770a, c32487o2.m71160e().f66411a);
                        C28936t c28936t19 = c32487o2.f66270i;
                        KProperty kProperty19 = C32487O0.f66261v[1];
                        c28936t19.f58834a.set(c28936t19.f58835b, c32557s9);
                        this.f66193d.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                        this.f66192c.showProgress(false);
                        return Unit.INSTANCE;
                    case 7:
                        c32487o2 = (C32487O0) this.f66194e;
                        ResultKt.throwOnFailure(obj);
                        config2 = obj;
                        C29124h c29124h3 = (C29124h) config2;
                        if (c29124h3 != null) {
                            strM69770a = AbstractC29130i.m69770a("sumsubid.confirmationFailure.title", c29124h3.f59089v);
                        }
                        KProperty[] kPropertyArr117 = C32487O0.f66261v;
                        C32557s c32557s10 = new C32557s(strM69770a, c32487o2.m71160e().f66411a);
                        C28936t c28936t110 = c32487o2.f66270i;
                        KProperty kProperty110 = C32487O0.f66261v[1];
                        c28936t110.f58834a.set(c28936t110.f58835b, c32557s10);
                        this.f66193d.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                        this.f66192c.showProgress(false);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th3) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
        } catch (Throwable th4) {
            this.f66192c.showProgress(false);
            throw th4;
        }
    }
}
