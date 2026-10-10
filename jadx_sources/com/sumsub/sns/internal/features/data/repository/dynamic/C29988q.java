package com.sumsub.sns.internal.features.data.repository.dynamic;

import androidx.camera.core.CameraInfo;
import com.sumsub.sns.core.data.model.FlowType;
import com.sumsub.sns.core.data.model.SNSInitConfig;
import com.sumsub.sns.internal.core.common.AbstractC28423V;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.domain.C28576g;
import com.sumsub.sns.internal.features.data.model.common.C28979A3;
import com.sumsub.sns.internal.features.data.model.common.C29118g;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29713w3;
import com.sumsub.sns.internal.features.data.model.common.remote.AbstractC29287U0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29277S0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29301X;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29954b;
import com.sumsub.sns.internal.log.AbstractC33293d;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.sumsub.sns.internal.p125ff.core.C33050a;
import com.sumsub.sns.internal.p125ff.core.C33051b;
import com.sumsub.sns.internal.p125ff.core.C33052c;
import com.sumsub.sns.internal.p125ff.core.FeatureFlagValueType;
import com.sumsub.sns.internal.p125ff.model.C33055c;
import com.sumsub.sns.internal.p125ff.model.C33058f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29988q extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public C29124h f60255a;

    /* JADX INFO: renamed from: b */
    public int f60256b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f60257c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ C29979h f60258d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C29967J f60259e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29988q(C29967J c29967j, Continuation continuation) {
        super(3, continuation);
        this.f60259e = c29967j;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C29988q c29988q = new C29988q(this.f60259e, (Continuation) obj3);
        c29988q.f60257c = (Boolean) obj;
        c29988q.f60258d = (C29979h) obj2;
        return c29988q.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0153  */
    /* JADX WARN: Code duplicated, block: B:102:0x0155 A[PHI: r6
      0x0155: PHI (r6v32 java.lang.Boolean) = (r6v31 java.lang.Boolean), (r6v59 java.lang.Boolean) binds: [B:99:0x014f, B:101:0x0153] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:103:0x0158  */
    /* JADX WARN: Code duplicated, block: B:106:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0160  */
    /* JADX WARN: Code duplicated, block: B:108:0x0162 A[PHI: r6
      0x0162: PHI (r6v34 java.util.Map) = (r6v33 java.util.Map), (r6v58 java.util.Map) binds: [B:105:0x015c, B:107:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x0165  */
    /* JADX WARN: Code duplicated, block: B:112:0x016b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x016d  */
    /* JADX WARN: Code duplicated, block: B:114:0x016f A[PHI: r6
      0x016f: PHI (r6v36 java.util.Map) = (r6v35 java.util.Map), (r6v57 java.util.Map) binds: [B:111:0x0169, B:113:0x016d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:115:0x0172  */
    /* JADX WARN: Code duplicated, block: B:118:0x0178 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x017a  */
    /* JADX WARN: Code duplicated, block: B:120:0x017c A[PHI: r6
      0x017c: PHI (r6v38 com.sumsub.sns.internal.features.data.model.common.remote.X) = 
      (r6v37 com.sumsub.sns.internal.features.data.model.common.remote.X)
      (r6v56 com.sumsub.sns.internal.features.data.model.common.remote.X)
     binds: [B:117:0x0176, B:119:0x017a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x017f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0185 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0187  */
    /* JADX WARN: Code duplicated, block: B:126:0x0189 A[PHI: r6
      0x0189: PHI (r6v40 com.sumsub.sns.internal.features.data.model.common.A3) = 
      (r6v39 com.sumsub.sns.internal.features.data.model.common.A3)
      (r6v55 com.sumsub.sns.internal.features.data.model.common.A3)
     binds: [B:123:0x0183, B:125:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:127:0x018c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x0194  */
    /* JADX WARN: Code duplicated, block: B:132:0x0196 A[PHI: r6
      0x0196: PHI (r6v42 java.util.Map) = (r6v41 java.util.Map), (r6v54 java.util.Map) binds: [B:129:0x0190, B:131:0x0194] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:133:0x0199  */
    /* JADX WARN: Code duplicated, block: B:136:0x019f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a3 A[PHI: r6
      0x01a3: PHI (r6v44 java.util.Map) = (r6v43 java.util.Map), (r6v53 java.util.Map) binds: [B:135:0x019d, B:137:0x01a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:139:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b0 A[PHI: r6
      0x01b0: PHI (r6v46 java.lang.String) = (r6v45 java.lang.String), (r6v52 java.lang.String) binds: [B:141:0x01aa, B:143:0x01ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:145:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:150:0x01bd A[PHI: r6
      0x01bd: PHI (r6v48 com.sumsub.sns.internal.features.data.model.common.w3) = 
      (r6v47 com.sumsub.sns.internal.features.data.model.common.w3)
      (r6v51 com.sumsub.sns.internal.features.data.model.common.w3)
     binds: [B:147:0x01b7, B:149:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:151:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:154:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:156:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:157:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:218:0x02fe A[LOOP:0: B:216:0x02f8->B:218:0x02fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:221:0x0334  */
    /* JADX WARN: Code duplicated, block: B:227:0x0364  */
    /* JADX WARN: Code duplicated, block: B:229:0x036a  */
    /* JADX WARN: Code duplicated, block: B:239:0x0347 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00af  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5 A[PHI: r6
      0x00d5: PHI (r6v12 com.sumsub.sns.internal.features.data.model.common.g) = 
      (r6v11 com.sumsub.sns.internal.features.data.model.common.g)
      (r6v69 com.sumsub.sns.internal.features.data.model.common.g)
     binds: [B:39:0x00cf, B:41:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e2 A[PHI: r6
      0x00e2: PHI (r6v14 java.lang.String) = (r6v13 java.lang.String), (r6v68 java.lang.String) binds: [B:45:0x00dc, B:47:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed A[PHI: r6
      0x00ed: PHI (r6v16 java.util.Map) = (r6v15 java.util.Map), (r6v67 java.util.Map) binds: [B:51:0x00e7, B:53:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fa A[PHI: r6
      0x00fa: PHI (r6v18 java.util.Map) = (r6v17 java.util.Map), (r6v66 java.util.Map) binds: [B:57:0x00f4, B:59:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:64:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0105  */
    /* JADX WARN: Code duplicated, block: B:66:0x0107 A[PHI: r6
      0x0107: PHI (r6v20 java.util.Map) = (r6v19 java.util.Map), (r6v65 java.util.Map) binds: [B:63:0x0101, B:65:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x010a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0112  */
    /* JADX WARN: Code duplicated, block: B:72:0x0114 A[PHI: r6
      0x0114: PHI (r6v22 java.util.Map) = (r6v21 java.util.Map), (r6v64 java.util.Map) binds: [B:69:0x010e, B:71:0x0112] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0117  */
    /* JADX WARN: Code duplicated, block: B:76:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x011f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0121 A[PHI: r6
      0x0121: PHI (r6v24 java.util.Map) = (r6v23 java.util.Map), (r6v63 java.util.Map) binds: [B:75:0x011b, B:77:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0124  */
    /* JADX WARN: Code duplicated, block: B:82:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x012c  */
    /* JADX WARN: Code duplicated, block: B:84:0x012e A[PHI: r6
      0x012e: PHI (r6v26 java.util.Map) = (r6v25 java.util.Map), (r6v62 java.util.Map) binds: [B:81:0x0128, B:83:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0131  */
    /* JADX WARN: Code duplicated, block: B:88:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0139  */
    /* JADX WARN: Code duplicated, block: B:90:0x013b A[PHI: r6
      0x013b: PHI (r6v28 java.util.Map) = (r6v27 java.util.Map), (r6v61 java.util.Map) binds: [B:87:0x0135, B:89:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x013e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0146  */
    /* JADX WARN: Code duplicated, block: B:96:0x0148 A[PHI: r6
      0x0148: PHI (r6v30 java.util.Map) = (r6v29 java.util.Map), (r6v60 java.util.Map) binds: [B:93:0x0142, B:95:0x0146] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x014b  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C29979h c29979h;
        String email;
        String phone;
        Object objM70026a;
        Boolean bool;
        C29979h c29979h2;
        Object objM70030b;
        Boolean bool2;
        C29124h c29124h;
        String str;
        FlowType flowType;
        FlowType flowTypeM69838a;
        C29118g c29118g;
        C29118g c29118g2;
        String str2;
        String str3;
        Map map;
        Map map2;
        Map map3;
        Map map4;
        Map map5;
        Map map6;
        Map map7;
        Map map8;
        Map map9;
        Map map10;
        Map map11;
        Map map12;
        Map map13;
        Map map14;
        Map map15;
        Map map16;
        Boolean bool3;
        Boolean bool4;
        Map map17;
        Map map18;
        Map map19;
        Map map20;
        C29301X c29301x;
        C29301X c29301x2;
        C28979A3 c28979a3;
        C28979A3 c28979a4;
        Map map21;
        Map map22;
        Map map23;
        Map map24;
        String str4;
        String str5;
        C29713w3 c29713w3;
        C29713w3 c29713w4;
        String str6;
        String str7;
        C29124h c29124h2;
        C29982k c29982k;
        Object objM70027a;
        C29124h c29124h3;
        ArrayList arrayList;
        C33051b c33051b;
        int size;
        int i11;
        C29981j c29981j;
        C33050a c33050a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f60256b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            Boolean bool5 = (Boolean) this.f60257c;
            c29979h = this.f60258d;
            Set set = AbstractC28423V.f57933a;
            C28468k0 c28468k0 = C28468k0.f57983a;
            String strM69307a = AbstractC28423V.m69307a(C28468k0.f57987e);
            C29124h c29124h4 = c29979h != null ? c29979h.f60237a : null;
            C33272c.f67816e.f67810a.mo68955d("DataRepository", "updating config, reinit=" + bool5 + ", language=" + strM69307a, null);
            if (Intrinsics.areEqual(bool5, Boxing.boxBoolean(true))) {
                InterfaceC29954b interfaceC29954b = this.f60259e.f60193a;
                this.f60257c = bool5;
                this.f60258d = c29979h;
                this.f60255a = c29124h4;
                this.f60256b = 1;
                objM70030b = interfaceC29954b.m70030b(strM69307a, this);
                if (objM70030b != coroutine_suspended) {
                    bool2 = bool5;
                    c29124h = c29124h4;
                    C29277S0 c29277s0 = (C29277S0) objM70030b;
                    C29124h c29124hM69839a = AbstractC29287U0.m69839a(c29277s0);
                    str = c29277s0.f59270b;
                    if (str == null) {
                        if (c29124h != null) {
                            str = c29124h.f59068a;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN;
                        }
                    }
                    String str8 = str;
                    flowType = c29277s0.f59272d;
                    if (flowType != null) {
                        if (c29124h != null) {
                            flowTypeM69838a = c29124h.f59069b;
                        } else {
                            flowTypeM69838a = FlowType.Standalone;
                        }
                    } else if (c29124h != null) {
                        flowTypeM69838a = c29124h.f59069b;
                    } else {
                        flowTypeM69838a = FlowType.Standalone;
                    }
                    FlowType flowType2 = flowTypeM69838a;
                    c29118g = c29124hM69839a.f59091x;
                    if (c29118g != null) {
                        c29118g2 = c29118g;
                    } else if (c29124h != null) {
                        c29118g = c29124h.f59091x;
                        c29118g2 = c29118g;
                    } else {
                        c29118g2 = null;
                    }
                    str2 = c29124hM69839a.f59070c;
                    if (str2 != null) {
                        str3 = str2;
                    } else if (c29124h != null) {
                        str2 = c29124h.f59070c;
                        str3 = str2;
                    } else {
                        str3 = null;
                    }
                    map = c29124hM69839a.f59071d;
                    if (map != null) {
                        map2 = map;
                    } else if (c29124h != null) {
                        map = c29124h.f59071d;
                        map2 = map;
                    } else {
                        map2 = null;
                    }
                    map3 = c29124hM69839a.f59072e;
                    if (map3 != null) {
                        map4 = map3;
                    } else if (c29124h != null) {
                        map3 = c29124h.f59072e;
                        map4 = map3;
                    } else {
                        map4 = null;
                    }
                    map5 = c29124hM69839a.f59073f;
                    if (map5 != null) {
                        map6 = map5;
                    } else if (c29124h != null) {
                        map5 = c29124h.f59073f;
                        map6 = map5;
                    } else {
                        map6 = null;
                    }
                    map7 = c29124hM69839a.f59074g;
                    if (map7 != null) {
                        map8 = map7;
                    } else if (c29124h != null) {
                        map7 = c29124h.f59074g;
                        map8 = map7;
                    } else {
                        map8 = null;
                    }
                    map9 = c29124hM69839a.f59075h;
                    if (map9 != null) {
                        map10 = map9;
                    } else if (c29124h != null) {
                        map9 = c29124h.f59075h;
                        map10 = map9;
                    } else {
                        map10 = null;
                    }
                    map11 = c29124hM69839a.f59076i;
                    if (map11 != null) {
                        map12 = map11;
                    } else if (c29124h != null) {
                        map11 = c29124h.f59076i;
                        map12 = map11;
                    } else {
                        map12 = null;
                    }
                    map13 = c29124hM69839a.f59077j;
                    if (map13 != null) {
                        map14 = map13;
                    } else if (c29124h != null) {
                        map13 = c29124h.f59077j;
                        map14 = map13;
                    } else {
                        map14 = null;
                    }
                    map15 = c29124hM69839a.f59078k;
                    if (map15 != null) {
                        map16 = map15;
                    } else if (c29124h != null) {
                        map15 = c29124h.f59078k;
                        map16 = map15;
                    } else {
                        map16 = null;
                    }
                    bool3 = c29124hM69839a.f59079l;
                    if (bool3 != null) {
                        bool4 = bool3;
                    } else if (c29124h != null) {
                        bool3 = c29124h.f59079l;
                        bool4 = bool3;
                    } else {
                        bool4 = null;
                    }
                    map17 = c29124hM69839a.f59081n;
                    if (map17 != null) {
                        map18 = map17;
                    } else if (c29124h != null) {
                        map17 = c29124h.f59081n;
                        map18 = map17;
                    } else {
                        map18 = null;
                    }
                    map19 = c29124hM69839a.f59082o;
                    if (map19 != null) {
                        map20 = map19;
                    } else if (c29124h != null) {
                        map19 = c29124h.f59082o;
                        map20 = map19;
                    } else {
                        map20 = null;
                    }
                    c29301x = c29124hM69839a.f59086s;
                    if (c29301x != null) {
                        c29301x2 = c29301x;
                    } else if (c29124h != null) {
                        c29301x = c29124h.f59086s;
                        c29301x2 = c29301x;
                    } else {
                        c29301x2 = null;
                    }
                    c28979a3 = c29124hM69839a.f59087t;
                    if (c28979a3 != null) {
                        c28979a4 = c28979a3;
                    } else if (c29124h != null) {
                        c28979a3 = c29124h.f59087t;
                        c28979a4 = c28979a3;
                    } else {
                        c28979a4 = null;
                    }
                    map21 = c29124hM69839a.f59088u;
                    if (map21 != null) {
                        map22 = map21;
                    } else if (c29124h != null) {
                        map21 = c29124h.f59088u;
                        map22 = map21;
                    } else {
                        map22 = null;
                    }
                    map23 = c29124hM69839a.f59089v;
                    if (map23 != null) {
                        map24 = map23;
                    } else if (c29124h != null) {
                        map23 = c29124h.f59089v;
                        map24 = map23;
                    } else {
                        map24 = null;
                    }
                    str4 = c29124hM69839a.f59090w;
                    if (str4 != null) {
                        str5 = str4;
                    } else if (c29124h != null) {
                        str4 = c29124h.f59090w;
                        str5 = str4;
                    } else {
                        str5 = null;
                    }
                    c29713w3 = c29124hM69839a.f59080m;
                    if (c29713w3 != null) {
                        c29713w4 = c29713w3;
                    } else if (c29124h != null) {
                        c29713w3 = c29124h.f59080m;
                        c29713w4 = c29713w3;
                    } else {
                        c29713w4 = null;
                    }
                    if (c29124h != null) {
                        str6 = c29124h.f59083p;
                    } else {
                        str6 = null;
                    }
                    if (c29124h != null) {
                        str7 = c29124h.f59084q;
                    } else {
                        str7 = null;
                    }
                    c29124h2 = new C29124h(str8, flowType2, str3, map2, map4, map6, map8, map10, map12, map14, map16, bool4, c29713w4, map18, map20, str6, str7, c29124hM69839a.f59085r, c29301x2, c28979a4, map22, map24, str5, c29118g2);
                }
            } else {
                SNSInitConfig conf = c28468k0.getConf();
                if (conf == null || (email = conf.getEmail()) == null || StringsKt.isBlank(email)) {
                    email = null;
                }
                SNSInitConfig conf2 = c28468k0.getConf();
                if (conf2 == null || (phone = conf2.getPhone()) == null || StringsKt.isBlank(phone)) {
                    phone = null;
                }
                SNSInitConfig sNSInitConfig = new SNSInitConfig(email, phone, null);
                InterfaceC29954b interfaceC29954b2 = this.f60259e.f60193a;
                this.f60257c = bool5;
                this.f60258d = c29979h;
                this.f60256b = 2;
                objM70026a = interfaceC29954b2.m70026a(sNSInitConfig, strM69307a, this);
                if (objM70026a != coroutine_suspended) {
                    bool = bool5;
                    c29979h2 = c29979h;
                    c29124h2 = AbstractC29287U0.m69839a((C29277S0) objM70026a);
                    bool2 = bool;
                    c29979h = c29979h2;
                }
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            c29124h = this.f60255a;
            C29979h c29979h3 = this.f60258d;
            Boolean bool6 = (Boolean) this.f60257c;
            ResultKt.throwOnFailure(obj);
            bool2 = bool6;
            c29979h = c29979h3;
            objM70030b = obj;
            C29277S0 c29277s1 = (C29277S0) objM70030b;
            C29124h c29124hM69839a2 = AbstractC29287U0.m69839a(c29277s1);
            str = c29277s1.f59270b;
            if (str == null) {
                if (c29124h != null) {
                    str = c29124h.f59068a;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN;
                }
            }
            String str9 = str;
            flowType = c29277s1.f59272d;
            if (flowType != null || (flowTypeM69838a = AbstractC29287U0.m69838a(flowType)) == null) {
                if (c29124h != null) {
                    flowTypeM69838a = c29124h.f59069b;
                } else {
                    flowTypeM69838a = FlowType.Standalone;
                }
            }
            FlowType flowType3 = flowTypeM69838a;
            c29118g = c29124hM69839a2.f59091x;
            if (c29118g != null) {
                c29118g2 = c29118g;
            } else if (c29124h != null) {
                c29118g = c29124h.f59091x;
                c29118g2 = c29118g;
            } else {
                c29118g2 = null;
            }
            str2 = c29124hM69839a2.f59070c;
            if (str2 != null) {
                str3 = str2;
            } else if (c29124h != null) {
                str2 = c29124h.f59070c;
                str3 = str2;
            } else {
                str3 = null;
            }
            map = c29124hM69839a2.f59071d;
            if (map != null) {
                map2 = map;
            } else if (c29124h != null) {
                map = c29124h.f59071d;
                map2 = map;
            } else {
                map2 = null;
            }
            map3 = c29124hM69839a2.f59072e;
            if (map3 != null) {
                map4 = map3;
            } else if (c29124h != null) {
                map3 = c29124h.f59072e;
                map4 = map3;
            } else {
                map4 = null;
            }
            map5 = c29124hM69839a2.f59073f;
            if (map5 != null) {
                map6 = map5;
            } else if (c29124h != null) {
                map5 = c29124h.f59073f;
                map6 = map5;
            } else {
                map6 = null;
            }
            map7 = c29124hM69839a2.f59074g;
            if (map7 != null) {
                map8 = map7;
            } else if (c29124h != null) {
                map7 = c29124h.f59074g;
                map8 = map7;
            } else {
                map8 = null;
            }
            map9 = c29124hM69839a2.f59075h;
            if (map9 != null) {
                map10 = map9;
            } else if (c29124h != null) {
                map9 = c29124h.f59075h;
                map10 = map9;
            } else {
                map10 = null;
            }
            map11 = c29124hM69839a2.f59076i;
            if (map11 != null) {
                map12 = map11;
            } else if (c29124h != null) {
                map11 = c29124h.f59076i;
                map12 = map11;
            } else {
                map12 = null;
            }
            map13 = c29124hM69839a2.f59077j;
            if (map13 != null) {
                map14 = map13;
            } else if (c29124h != null) {
                map13 = c29124h.f59077j;
                map14 = map13;
            } else {
                map14 = null;
            }
            map15 = c29124hM69839a2.f59078k;
            if (map15 != null) {
                map16 = map15;
            } else if (c29124h != null) {
                map15 = c29124h.f59078k;
                map16 = map15;
            } else {
                map16 = null;
            }
            bool3 = c29124hM69839a2.f59079l;
            if (bool3 != null) {
                bool4 = bool3;
            } else if (c29124h != null) {
                bool3 = c29124h.f59079l;
                bool4 = bool3;
            } else {
                bool4 = null;
            }
            map17 = c29124hM69839a2.f59081n;
            if (map17 != null) {
                map18 = map17;
            } else if (c29124h != null) {
                map17 = c29124h.f59081n;
                map18 = map17;
            } else {
                map18 = null;
            }
            map19 = c29124hM69839a2.f59082o;
            if (map19 != null) {
                map20 = map19;
            } else if (c29124h != null) {
                map19 = c29124h.f59082o;
                map20 = map19;
            } else {
                map20 = null;
            }
            c29301x = c29124hM69839a2.f59086s;
            if (c29301x != null) {
                c29301x2 = c29301x;
            } else if (c29124h != null) {
                c29301x = c29124h.f59086s;
                c29301x2 = c29301x;
            } else {
                c29301x2 = null;
            }
            c28979a3 = c29124hM69839a2.f59087t;
            if (c28979a3 != null) {
                c28979a4 = c28979a3;
            } else if (c29124h != null) {
                c28979a3 = c29124h.f59087t;
                c28979a4 = c28979a3;
            } else {
                c28979a4 = null;
            }
            map21 = c29124hM69839a2.f59088u;
            if (map21 != null) {
                map22 = map21;
            } else if (c29124h != null) {
                map21 = c29124h.f59088u;
                map22 = map21;
            } else {
                map22 = null;
            }
            map23 = c29124hM69839a2.f59089v;
            if (map23 != null) {
                map24 = map23;
            } else if (c29124h != null) {
                map23 = c29124h.f59089v;
                map24 = map23;
            } else {
                map24 = null;
            }
            str4 = c29124hM69839a2.f59090w;
            if (str4 != null) {
                str5 = str4;
            } else if (c29124h != null) {
                str4 = c29124h.f59090w;
                str5 = str4;
            } else {
                str5 = null;
            }
            c29713w3 = c29124hM69839a2.f59080m;
            if (c29713w3 != null) {
                c29713w4 = c29713w3;
            } else if (c29124h != null) {
                c29713w3 = c29124h.f59080m;
                c29713w4 = c29713w3;
            } else {
                c29713w4 = null;
            }
            if (c29124h != null) {
                str6 = c29124h.f59083p;
            } else {
                str6 = null;
            }
            if (c29124h != null) {
                str7 = c29124h.f59084q;
            } else {
                str7 = null;
            }
            c29124h2 = new C29124h(str9, flowType3, str3, map2, map4, map6, map8, map10, map12, map14, map16, bool4, c29713w4, map18, map20, str6, str7, c29124hM69839a2.f59085r, c29301x2, c28979a4, map22, map24, str5, c29118g2);
        } else if (i12 == 2) {
            c29979h2 = this.f60258d;
            Boolean bool7 = (Boolean) this.f60257c;
            ResultKt.throwOnFailure(obj);
            bool = bool7;
            objM70026a = obj;
            c29124h2 = AbstractC29287U0.m69839a((C29277S0) objM70026a);
            bool2 = bool;
            c29979h = c29979h2;
        } else {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c29124h3 = (C29124h) this.f60257c;
            ResultKt.throwOnFailure(obj);
            objM70027a = obj;
        }
        Set<Map.Entry> setEntrySet = ((Map) objM70027a).entrySet();
        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new C29981j((String) entry.getKey(), ((C33055c) entry.getValue()).f67507b, ((C33055c) entry.getValue()).f67508c));
        }
        c29982k = new C29982k(arrayList);
        c33051b = C33048a.f67466b;
        c33051b.getClass();
        size = arrayList.size();
        i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            c29981j = (C29981j) obj2;
            c33050a = (C33050a) c33051b.f67501a.get(c29981j.f60244a);
            if (c33050a != null) {
                boolean z11 = c29981j.f60245b;
                String str10 = c29981j.f60246c;
                AtomicReference atomicReference = c33050a.f67497d;
                FeatureFlagValueType featureFlagValueType = FeatureFlagValueType.DEFAULT;
                atomicReference.set(new C33052c(z11, str10));
            }
        }
        C33048a.m71432a();
        c29124h2 = c29124h3;
        if (!c29982k.f60247a.isEmpty()) {
            return new C29979h(c29124h2, c29982k);
        }
        C33272c c33272c = C33272c.f67812a;
        AbstractC33293d.m71623a(AbstractC33294e.m71624a(this.f60259e), "Failed to acquire remote FFs", null);
        throw new IllegalStateException("Remote feature flags are empty");
        C29967J c29967j = this.f60259e;
        String str11 = c29124h2.f59083p;
        String str12 = "";
        if (str11 != null) {
            C28576g c28576g = c29967j.f60197e;
            c28576g.getClass();
            c28576g.f58141a = str11;
        } else {
            C33050a c33050a2 = C33048a.f67444G;
            if (c33050a2.m71434a()) {
                try {
                    String str13 = c33050a2.m71435b().f67504b;
                    if (str13 == null) {
                        str13 = "";
                    }
                    String strOptString = new JSONObject(str13).optString("verificationUrl");
                    C28576g c28576g2 = c29967j.f60197e;
                    c28576g2.getClass();
                    c28576g2.f58141a = strOptString;
                } catch (Exception unused) {
                }
            }
        }
        String str14 = c29124h2.f59084q;
        if (str14 != null) {
            c29967j.f60196d.put(str14);
        } else {
            C33050a c33050a3 = C33048a.f67444G;
            if (c33050a3.m71434a()) {
                try {
                    String str15 = c33050a3.m71435b().f67504b;
                    if (str15 != null) {
                        str12 = str15;
                    }
                    c29967j.f60196d.put(new JSONObject(str12).optString("accessToken"));
                } catch (Exception unused2) {
                }
            }
        }
        c29982k = c29979h != null ? c29979h.f60238b : null;
        if (Intrinsics.areEqual(bool2, Boxing.boxBoolean(true)) || c29982k == null || c29982k.f60247a.isEmpty()) {
            InterfaceC29954b interfaceC29954b3 = this.f60259e.f60193a;
            Collection collectionValues = C33048a.f67466b.f67501a.values();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C33050a) it.next()).f67494a);
            }
            C33058f c33058f = new C33058f(arrayList2);
            this.f60257c = c29124h2;
            this.f60258d = null;
            this.f60255a = null;
            this.f60256b = 3;
            objM70027a = interfaceC29954b3.m70027a(c33058f, this);
            if (objM70027a != coroutine_suspended) {
                c29124h3 = c29124h2;
                Set<Map.Entry> setEntrySet2 = ((Map) objM70027a).entrySet();
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setEntrySet2, 10));
                while (r3.hasNext()) {
                    arrayList.add(new C29981j((String) entry.getKey(), ((C33055c) entry.getValue()).f67507b, ((C33055c) entry.getValue()).f67508c));
                }
                c29982k = new C29982k(arrayList);
                c33051b = C33048a.f67466b;
                c33051b.getClass();
                size = arrayList.size();
                i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    c29981j = (C29981j) obj3;
                    c33050a = (C33050a) c33051b.f67501a.get(c29981j.f60244a);
                    if (c33050a != null) {
                        boolean z12 = c29981j.f60245b;
                        String str16 = c29981j.f60246c;
                        AtomicReference atomicReference2 = c33050a.f67497d;
                        FeatureFlagValueType featureFlagValueType2 = FeatureFlagValueType.DEFAULT;
                        atomicReference2.set(new C33052c(z12, str16));
                    }
                }
                C33048a.m71432a();
                c29124h2 = c29124h3;
            }
            return coroutine_suspended;
        }
        if (!c29982k.f60247a.isEmpty()) {
            return new C29979h(c29124h2, c29982k);
        }
        C33272c c33272c2 = C33272c.f67812a;
        AbstractC33293d.m71623a(AbstractC33294e.m71624a(this.f60259e), "Failed to acquire remote FFs", null);
        throw new IllegalStateException("Remote feature flags are empty");
    }
}
