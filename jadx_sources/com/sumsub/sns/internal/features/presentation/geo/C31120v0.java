package com.sumsub.sns.internal.features.presentation.geo;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.data.model.SNSGeneralException;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.C28076P;
import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.C28368g;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Popup;
import com.sumsub.sns.internal.core.analytics.PrimaryAction;
import com.sumsub.sns.internal.core.analytics.PrimaryActionState;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.C28388D;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28636K;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.android.C28628C;
import com.sumsub.sns.internal.core.presentation.android.C28630E;
import com.sumsub.sns.internal.core.presentation.android.C28653h;
import com.sumsub.sns.internal.core.presentation.android.C28655i;
import com.sumsub.sns.internal.core.presentation.android.C28705t;
import com.sumsub.sns.internal.core.presentation.android.InterfaceC28657j;
import com.sumsub.sns.internal.core.presentation.android.location.C28663a;
import com.sumsub.sns.internal.core.presentation.android.location.C28676l;
import com.sumsub.sns.internal.core.presentation.android.location.C28683s;
import com.sumsub.sns.internal.core.presentation.android.location.InterfaceC28669e;
import com.sumsub.sns.internal.core.presentation.android.location.InterfaceC28670f;
import com.sumsub.sns.internal.core.presentation.android.location.LocationServiceController$Phase;
import com.sumsub.sns.internal.core.presentation.form.C28799f;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28805l;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28815I;
import com.sumsub.sns.internal.core.presentation.form.model.C28827V;
import com.sumsub.sns.internal.core.presentation.form.model.C28831Z;
import com.sumsub.sns.internal.core.presentation.form.model.C28850j;
import com.sumsub.sns.internal.core.presentation.form.model.C28859q;
import com.sumsub.sns.internal.core.presentation.form.model.C28867y;
import com.sumsub.sns.internal.core.presentation.intro.AbstractC28892d;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29103d2;
import com.sumsub.sns.internal.features.data.model.common.C29005G1;
import com.sumsub.sns.internal.features.data.model.common.C29013I1;
import com.sumsub.sns.internal.features.data.model.common.C29029M1;
import com.sumsub.sns.internal.features.data.model.common.C29037O1;
import com.sumsub.sns.internal.features.data.model.common.C29044Q0;
import com.sumsub.sns.internal.features.data.model.common.C29059U0;
import com.sumsub.sns.internal.features.data.model.common.C29085a2;
import com.sumsub.sns.internal.features.data.model.common.C29094c;
import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import com.sumsub.sns.internal.features.data.model.common.C29108e1;
import com.sumsub.sns.internal.features.data.model.common.C29707v2;
import com.sumsub.sns.internal.features.data.model.common.C29719y;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29494N;
import com.sumsub.sns.internal.features.data.model.geo.C29795e;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30270n;
import com.sumsub.sns.internal.features.domain.geo.C30190a;
import com.sumsub.sns.internal.features.domain.geo.C30191b;
import com.sumsub.sns.internal.features.domain.geo.C30192c;
import com.sumsub.sns.internal.features.domain.geo.C30193d;
import com.sumsub.sns.internal.features.domain.geo.C30210u;
import com.sumsub.sns.internal.features.domain.geo.C30213x;
import com.sumsub.sns.internal.features.domain.geo.C30215z;
import com.sumsub.sns.internal.features.domain.geo.InterfaceC30194e;
import com.sumsub.sns.internal.features.presentation.verification.C32707d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41769w;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.v0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31120v0 extends AbstractC28142p0 implements InterfaceC28804k {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ KProperty[] f62914w = {AbstractC28639a.m69485a(C31120v0.class, "addressDataCache", "getAddressDataCache()Ljava/util/List;", 0), AbstractC28639a.m69485a(C31120v0.class, "locationAccessRefusedCounter", "getLocationAccessRefusedCounter()I", 0), AbstractC28639a.m69485a(C31120v0.class, "vpnWarningCounter", "getVpnWarningCounter()I", 0)};

    /* JADX INFO: renamed from: a */
    public final C30210u f62915a;

    /* JADX INFO: renamed from: b */
    public final C30213x f62916b;

    /* JADX INFO: renamed from: c */
    public final C30215z f62917c;

    /* JADX INFO: renamed from: d */
    public final boolean f62918d;

    /* JADX INFO: renamed from: e */
    public final C30156e f62919e;

    /* JADX INFO: renamed from: f */
    public final C32707d f62920f;

    /* JADX INFO: renamed from: g */
    public final Document f62921g;

    /* JADX INFO: renamed from: h */
    public final C28683s f62922h;

    /* JADX INFO: renamed from: i */
    public final C28705t f62923i;

    /* JADX INFO: renamed from: j */
    public final C28676l f62924j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC41678w f62925k;

    /* JADX INFO: renamed from: l */
    public final C31068Y f62926l;

    /* JADX INFO: renamed from: m */
    public final C28936t f62927m;

    /* JADX INFO: renamed from: n */
    public int f62928n;

    /* JADX INFO: renamed from: o */
    public final C28936t f62929o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC41678w f62930p;

    /* JADX INFO: renamed from: q */
    public final C28936t f62931q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC41678w f62932r;

    /* JADX INFO: renamed from: s */
    public boolean f62933s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC41669n f62934t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC41669n f62935u;

    /* JADX INFO: renamed from: v */
    public Map f62936v;

    public C31120v0(SavedStateHandle savedStateHandle, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, C30210u c30210u, C30213x c30213x, C30215z c30215z, boolean z11, C30156e c30156e, C32707d c32707d, Document document, Function0 function0, Function1 function1, Function0 function2) {
        super(interfaceC29953a, interfaceC29984m, new C28076P(3));
        this.f62915a = c30210u;
        this.f62916b = c30213x;
        this.f62917c = c30215z;
        this.f62918d = z11;
        this.f62919e = c30156e;
        this.f62920f = c32707d;
        this.f62921g = document;
        this.f62922h = (C28683s) function0.invoke();
        C28705t c28705t = (C28705t) function1.invoke(SetsKt.setOf((Object[]) new AbstractC28636K[]{C28628C.f58260e, C28630E.f58261e}));
        this.f62923i = c28705t;
        this.f62924j = (C28676l) function2.invoke();
        this.f62925k = C41636g.m90916g0(c32707d.m71294b("address_by_location_countdown"), ViewModelKt.getViewModelScope(this), SharingStarted.INSTANCE.getEagerly(), null);
        this.f62926l = new C31068Y(this);
        this.f62927m = new C28936t(savedStateHandle, "addressDataCache", CollectionsKt.emptyList(), false);
        this.f62929o = new C28936t(savedStateHandle, "STATE_LOCATION_ACCESS_REFUSED_COUNTER", 0, false);
        this.f62930p = savedStateHandle.getStateFlow("STATE_LOCATION_ACCESS_REFUSED_COUNTER", 0);
        this.f62931q = new C28936t(savedStateHandle, "STATE_VPN_WARNING_COUNTER", 0, false);
        this.f62932r = savedStateHandle.getStateFlow("STATE_VPN_WARNING_COUNTER", 0);
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(C31113s.f62904a);
        this.f62934t = interfaceC41669nM91009a;
        this.f62935u = C41679x.m91009a(C28799f.f58565e);
        this.f62936v = MapsKt.emptyMap();
        InterfaceC41634e interfaceC41634eM90939v = C41636g.m90939v(new C31100l0(interfaceC41669nM91009a, this));
        AbstractC28421U.m69306b(getViewState(), ViewModelKt.getViewModelScope(this), new C31090h(this, null));
        AbstractC28421U.m69303a(interfaceC41634eM90939v, ViewModelKt.getViewModelScope(this), new C31093i(this, null));
        AbstractC28421U.m69303a(c28705t.f58366i, ViewModelKt.getViewModelScope(this), new C31095j(this, null));
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69616a() {
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: b */
    public final InterfaceC28805l mo69622b() {
        return this.f62926l;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69617a(AbstractC28841e0 abstractC28841e0) {
    }

    /* JADX WARN: Code duplicated, block: B:41:0x009c A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:39:0x0092, B:41:0x009c, B:44:0x00af, B:46:0x00b3, B:47:0x00bd, B:49:0x00c1, B:51:0x00d2, B:53:0x00da, B:54:0x00e0, B:56:0x00e4, B:57:0x00ea, B:59:0x00ee, B:79:0x017b, B:80:0x0180), top: B:91:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00af A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:39:0x0092, B:41:0x009c, B:44:0x00af, B:46:0x00b3, B:47:0x00bd, B:49:0x00c1, B:51:0x00d2, B:53:0x00da, B:54:0x00e0, B:56:0x00e4, B:57:0x00ea, B:59:0x00ee, B:79:0x017b, B:80:0x0180), top: B:91:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3 A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:39:0x0092, B:41:0x009c, B:44:0x00af, B:46:0x00b3, B:47:0x00bd, B:49:0x00c1, B:51:0x00d2, B:53:0x00da, B:54:0x00e0, B:56:0x00e4, B:57:0x00ea, B:59:0x00ee, B:79:0x017b, B:80:0x0180), top: B:91:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bd A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:39:0x0092, B:41:0x009c, B:44:0x00af, B:46:0x00b3, B:47:0x00bd, B:49:0x00c1, B:51:0x00d2, B:53:0x00da, B:54:0x00e0, B:56:0x00e4, B:57:0x00ea, B:59:0x00ee, B:79:0x017b, B:80:0x0180), top: B:91:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1 A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:39:0x0092, B:41:0x009c, B:44:0x00af, B:46:0x00b3, B:47:0x00bd, B:49:0x00c1, B:51:0x00d2, B:53:0x00da, B:54:0x00e0, B:56:0x00e4, B:57:0x00ea, B:59:0x00ee, B:79:0x017b, B:80:0x0180), top: B:91:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2 A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:39:0x0092, B:41:0x009c, B:44:0x00af, B:46:0x00b3, B:47:0x00bd, B:49:0x00c1, B:51:0x00d2, B:53:0x00da, B:54:0x00e0, B:56:0x00e4, B:57:0x00ea, B:59:0x00ee, B:79:0x017b, B:80:0x0180), top: B:91:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00da A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:39:0x0092, B:41:0x009c, B:44:0x00af, B:46:0x00b3, B:47:0x00bd, B:49:0x00c1, B:51:0x00d2, B:53:0x00da, B:54:0x00e0, B:56:0x00e4, B:57:0x00ea, B:59:0x00ee, B:79:0x017b, B:80:0x0180), top: B:91:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e0 A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:39:0x0092, B:41:0x009c, B:44:0x00af, B:46:0x00b3, B:47:0x00bd, B:49:0x00c1, B:51:0x00d2, B:53:0x00da, B:54:0x00e0, B:56:0x00e4, B:57:0x00ea, B:59:0x00ee, B:79:0x017b, B:80:0x0180), top: B:91:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4 A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:39:0x0092, B:41:0x009c, B:44:0x00af, B:46:0x00b3, B:47:0x00bd, B:49:0x00c1, B:51:0x00d2, B:53:0x00da, B:54:0x00e0, B:56:0x00e4, B:57:0x00ea, B:59:0x00ee, B:79:0x017b, B:80:0x0180), top: B:91:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:39:0x0092, B:41:0x009c, B:44:0x00af, B:46:0x00b3, B:47:0x00bd, B:49:0x00c1, B:51:0x00d2, B:53:0x00da, B:54:0x00e0, B:56:0x00e4, B:57:0x00ea, B:59:0x00ee, B:79:0x017b, B:80:0x0180), top: B:91:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ee A[Catch: all -> 0x00ac, TRY_LEAVE, TryCatch #2 {all -> 0x00ac, blocks: (B:39:0x0092, B:41:0x009c, B:44:0x00af, B:46:0x00b3, B:47:0x00bd, B:49:0x00c1, B:51:0x00d2, B:53:0x00da, B:54:0x00e0, B:56:0x00e4, B:57:0x00ea, B:59:0x00ee, B:79:0x017b, B:80:0x0180), top: B:91:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x010f  */
    /* JADX WARN: Code duplicated, block: B:65:0x011d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0141  */
    /* JADX WARN: Code duplicated, block: B:70:0x014a  */
    /* JADX WARN: Code duplicated, block: B:71:0x014f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0153  */
    /* JADX WARN: Code duplicated, block: B:76:0x015a  */
    /* JADX WARN: Code duplicated, block: B:79:0x017b A[Catch: all -> 0x00ac, TRY_ENTER, TryCatch #2 {all -> 0x00ac, blocks: (B:39:0x0092, B:41:0x009c, B:44:0x00af, B:46:0x00b3, B:47:0x00bd, B:49:0x00c1, B:51:0x00d2, B:53:0x00da, B:54:0x00e0, B:56:0x00e4, B:57:0x00ea, B:59:0x00ee, B:79:0x017b, B:80:0x0180), top: B:91:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m70584b(ContinuationImpl continuationImpl) throws Throwable {
        C31094i0 c31094i0;
        C31120v0 c31120v0;
        Object c31119v;
        String simpleName;
        InterfaceC31109q interfaceC31109q;
        Object c31121w;
        if (continuationImpl instanceof C31094i0) {
            c31094i0 = (C31094i0) continuationImpl;
            int i11 = c31094i0.f62875d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31094i0.f62875d = i11 - Integer.MIN_VALUE;
            } else {
                c31094i0 = new C31094i0(this, continuationImpl);
            }
        } else {
            c31094i0 = new C31094i0(this, continuationImpl);
        }
        Object objM70582a = c31094i0.f62873b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31094i0.f62875d;
        String str = null;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70582a);
            this.f62928n++;
            c31094i0.f62875d = 1;
            objM70582a = m70582a(c31094i0);
            if (objM70582a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C31120v0 c31120v1 = c31094i0.f62872a;
            try {
                ResultKt.throwOnFailure(objM70582a);
                c31120v0 = c31120v1;
                try {
                    interfaceC31109q = (InterfaceC31109q) objM70582a;
                    if (!Intrinsics.areEqual(interfaceC31109q, C31105o.f62892a)) {
                        if (!(interfaceC31109q instanceof C31107p)) {
                            if (interfaceC31109q instanceof C31103n) {
                                c31121w = new C31121w((String) CollectionsKt.firstOrNull((List) ((C31103n) interfaceC31109q).f62889a));
                            } else if (Intrinsics.areEqual(interfaceC31109q, C31097k.f62881a)) {
                                c31119v = new C31119v(0);
                            } else if (interfaceC31109q instanceof C31099l) {
                                c31119v = new C31119v();
                            } else {
                                if (interfaceC31109q instanceof C31101m) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                AbstractC28052C.throwError$default(this, new C29107e0(((C31101m) interfaceC31109q).f62885a, null, null, 6), this.f62921g.getType().f59014a, false, null, 12, null);
                            }
                            c31120v0.showProgress(false);
                            if (c31119v != null || (simpleName = Reflection.getOrCreateKotlinClass(c31119v.getClass()).getSimpleName()) == null) {
                                simpleName = "null";
                            }
                            C31070a.m70567a("sendAddress: attempt=" + this.f62928n + ", state=" + simpleName);
                            if (c31119v != null) {
                                this.f62934t.setValue(c31119v);
                                if (c31119v instanceof C31121w) {
                                    str = ((C31121w) c31119v).f62937a;
                                } else if (c31119v instanceof C31119v) {
                                    str = ((C31119v) c31119v).f62913a;
                                }
                                if (str != null) {
                                    C28367f.m69259a(m70585e(), Screen.ProofOfAddressScreen, this.f62921g.getType().f59014a, MapsKt.mapOf(TuplesKt.m90091to("violation", str)), 8);
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        c31121w = new C31111r(((C31107p) interfaceC31109q).f62895a);
                        c31119v = c31121w;
                        c31120v0.showProgress(false);
                        if (c31119v != null) {
                            simpleName = "null";
                        } else {
                            simpleName = "null";
                        }
                        C31070a.m70567a("sendAddress: attempt=" + this.f62928n + ", state=" + simpleName);
                        if (c31119v != null) {
                            this.f62934t.setValue(c31119v);
                            if (c31119v instanceof C31121w) {
                                str = ((C31121w) c31119v).f62937a;
                            } else if (c31119v instanceof C31119v) {
                                str = ((C31119v) c31119v).f62913a;
                            }
                            if (str != null) {
                                C28367f.m69259a(m70585e(), Screen.ProofOfAddressScreen, this.f62921g.getType().f59014a, MapsKt.mapOf(TuplesKt.m90091to("violation", str)), 8);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    AbstractC28052C.finish$default(this, new C28494t(), null, null, null, 14, null);
                    c31119v = null;
                    c31120v0.showProgress(false);
                    if (c31119v != null) {
                        simpleName = "null";
                    } else {
                        simpleName = "null";
                    }
                    C31070a.m70567a("sendAddress: attempt=" + this.f62928n + ", state=" + simpleName);
                    if (c31119v != null) {
                        this.f62934t.setValue(c31119v);
                        if (c31119v instanceof C31121w) {
                            str = ((C31121w) c31119v).f62937a;
                        } else if (c31119v instanceof C31119v) {
                            str = ((C31119v) c31119v).f62913a;
                        }
                        if (str != null) {
                            C28367f.m69259a(m70585e(), Screen.ProofOfAddressScreen, this.f62921g.getType().f59014a, MapsKt.mapOf(TuplesKt.m90091to("violation", str)), 8);
                        }
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    c31120v0.showProgress(false);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c31120v0 = c31120v1;
                c31120v0.showProgress(false);
                throw th;
            }
        }
        ResultKt.throwOnFailure(objM70582a);
        InterfaceC31041C interfaceC31041C = (InterfaceC31041C) objM70582a;
        if (Intrinsics.areEqual(interfaceC31041C, C31037A.f62734a)) {
            c31119v = C31115t.f62907a;
        } else if (Intrinsics.areEqual(interfaceC31041C, C31127z.f62946a)) {
            c31119v = C31117u.f62910a;
        } else {
            if (!Intrinsics.areEqual(interfaceC31041C, C31039B.f62737a)) {
                if (!(interfaceC31041C instanceof C31125y)) {
                    throw new NoWhenBranchMatchedException();
                }
                showProgress(true);
                try {
                    C29795e c29795e = ((C31125y) interfaceC31041C).f62943a;
                    c31094i0.f62872a = this;
                    c31094i0.f62875d = 2;
                    objM70582a = m70581a(c29795e, c31094i0);
                    if (objM70582a != coroutine_suspended) {
                        c31120v0 = this;
                        interfaceC31109q = (InterfaceC31109q) objM70582a;
                        if (!Intrinsics.areEqual(interfaceC31109q, C31105o.f62892a)) {
                            AbstractC28052C.finish$default(this, new C28494t(), null, null, null, 14, null);
                        } else {
                            if (!(interfaceC31109q instanceof C31107p)) {
                                c31121w = new C31111r(((C31107p) interfaceC31109q).f62895a);
                            } else {
                                if (interfaceC31109q instanceof C31103n) {
                                    c31121w = new C31121w((String) CollectionsKt.firstOrNull((List) ((C31103n) interfaceC31109q).f62889a));
                                } else if (Intrinsics.areEqual(interfaceC31109q, C31097k.f62881a)) {
                                    c31119v = new C31119v(0);
                                } else if (interfaceC31109q instanceof C31099l) {
                                    c31119v = new C31119v();
                                } else {
                                    if (interfaceC31109q instanceof C31101m) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    AbstractC28052C.throwError$default(this, new C29107e0(((C31101m) interfaceC31109q).f62885a, null, null, 6), this.f62921g.getType().f59014a, false, null, 12, null);
                                }
                                c31120v0.showProgress(false);
                            }
                            c31119v = c31121w;
                            c31120v0.showProgress(false);
                        }
                        c31119v = null;
                        c31120v0.showProgress(false);
                    }
                    return coroutine_suspended;
                } catch (Throwable th4) {
                    th = th4;
                    c31120v0 = this;
                    c31120v0.showProgress(false);
                    throw th;
                }
            }
            c31119v = new C31119v(0);
        }
        if (c31119v != null) {
            simpleName = "null";
        } else {
            simpleName = "null";
        }
        C31070a.m70567a("sendAddress: attempt=" + this.f62928n + ", state=" + simpleName);
        if (c31119v != null) {
            this.f62934t.setValue(c31119v);
            if (c31119v instanceof C31121w) {
                str = ((C31121w) c31119v).f62937a;
            } else if (c31119v instanceof C31119v) {
                str = ((C31119v) c31119v).f62913a;
            }
            if (str != null) {
                C28367f.m69259a(m70585e(), Screen.ProofOfAddressScreen, this.f62921g.getType().f59014a, MapsKt.mapOf(TuplesKt.m90091to("violation", str)), 8);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final InterfaceC41634e buildViewStateFlow(C28075O c28075o) {
        return C41636g.m90887K(new C31059O(c28075o, this, null));
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: d */
    public final InterfaceC41678w mo69624d() {
        return this.f62935u;
    }

    /* JADX INFO: renamed from: e */
    public final C28367f m70585e() {
        return new C28367f(((InterfaceC31123x) this.f62934t.getValue()) instanceof C31111r ? Screen.ProofOfAddressFormScreen : Screen.ProofOfAddressScreen, this.f62921g.getType().f59014a, MapsKt.emptyMap());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final String getDocumentType() {
        return this.f62921g.getType().f59014a;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final void intent(InterfaceC28077Q interfaceC28077Q) {
        if (!(interfaceC28077Q instanceof AbstractC31050G0)) {
            super.intent(interfaceC28077Q);
            return;
        }
        AbstractC31050G0 abstractC31050G0 = (AbstractC31050G0) interfaceC28077Q;
        if (Intrinsics.areEqual(abstractC31050G0, C31046E0.f62752a)) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31071a0(this, null), 3, null);
            return;
        }
        if (Intrinsics.areEqual(abstractC31050G0, C31044D0.f62745a)) {
            showProgress(true);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C31074b0(this, null, this), 2, null);
        } else if (Intrinsics.areEqual(abstractC31050G0, C31048F0.f62757a)) {
            C28367f.m69256a(m70585e(), Control.SkipButton, (Map) null, (Popup) null, 6);
            fireEvent(C31043D.f62744a);
        } else {
            if (!Intrinsics.areEqual(abstractC31050G0, C31042C0.f62743a)) {
                throw new NoWhenBranchMatchedException();
            }
            C28367f.m69256a(m70585e(), Control.CannotShareButton, (Map) null, (Popup) null, 6);
            showProgress(true);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C31069Z(this, null, this), 2, null);
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69618a(AbstractC28841e0 abstractC28841e0, String str) {
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69619a(AbstractC28841e0 abstractC28841e0, List list) {
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final boolean mo69621a(String str) {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static final void m70578a(C31120v0 c31120v0, C29795e c29795e) {
        C28368g c28368gM69264a = new C28368g().m69264a(PrimaryAction.Geolocation);
        c28368gM69264a.f57846b.add(PrimaryActionState.Completed);
        c28368gM69264a.f57847c = MapsKt.toMap(ArraysKt.filterNotNull(new Pair[]{TuplesKt.m90091to("attempt", Integer.valueOf(c31120v0.f62928n)), TuplesKt.m90091to("isAuthorized", Boolean.TRUE), TuplesKt.m90091to("accuracy", String.valueOf(c29795e.f59869c)), TuplesKt.m90091to("is_mock_geo", String.valueOf(c29795e.f59870d))}));
        c28368gM69264a.m69267a(false);
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC41634e m70577a(C31120v0 c31120v0, C29983l c29983l, InterfaceC31123x interfaceC31123x) {
        if (Intrinsics.areEqual(interfaceC31123x, C31113s.f62904a)) {
            return new C31066W(C41636g.m90927m(new C31063T(c31120v0.f62925k, c31120v0, c29983l, "sns_geolocation_action_allowAccessInTime", "sns_geolocation_action_allowAccess"), C41636g.m90927m(c31120v0.f62930p, c31120v0.f62932r, new C31060P(c29983l, c31120v0, null)), new C31067X(null)), new C31040B0(SNSIconHandler.SNSCommonIcons.LOCATION_ON, c29983l.m70061a("sns_geolocation_intro_title"), c29983l.m70061a("sns_geolocation_intro_subtitle_location"), c31120v0.f62933s ? null : c29983l.m70061a("sns_geolocation_intro_subtitle_divider"), c31120v0.f62933s ? null : c29983l.m70061a("sns_geolocation_intro_subtitle_document")));
        }
        if (!(interfaceC31123x instanceof C31115t) && !(interfaceC31123x instanceof C31117u)) {
            if (interfaceC31123x instanceof C31121w) {
                return new C31116t0(C41636g.m90927m(new C31063T(c31120v0.f62925k, c31120v0, c29983l, "sns_geolocation_vpnWarning_action_retryInTime", "sns_geolocation_vpnWarning_action_retry"), C41636g.m90927m(c31120v0.f62930p, c31120v0.f62932r, new C31060P(c29983l, c31120v0, null)), new C31118u0(null)), new C31040B0(SNSIconHandler.SNSCommonIcons.LOCATION_OFF, c29983l.m70061a("sns_geolocation_vpnWarning_title"), c29983l.m70061a("sns_geolocation_vpnWarning_subtitle_location"), c31120v0.f62933s ? null : c29983l.m70061a("sns_geolocation_vpnWarning_subtitle_divider"), c31120v0.f62933s ? null : c29983l.m70061a("sns_geolocation_vpnWarning_subtitle_document")));
            }
            if (interfaceC31123x instanceof C31119v) {
                SNSIconHandler.SNSCommonIcons sNSCommonIcons = SNSIconHandler.SNSCommonIcons.LOCATION_OFF;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                return new C31106o0(C41636g.m90927m(new C31063T(c31120v0.f62925k, c31120v0, c29983l, "sns_geolocation_action_allowAccessInTime", "sns_geolocation_action_allowAccess"), C41636g.m90887K(new C28388D(new C31108p0(c29983l, c31120v0, null), null)), new C31110q0(null)), new C31040B0(sNSCommonIcons, AbstractC28892d.m69671a(new Object[]{c31120v0.f62921g.getType().f59014a}, 1, "sns_step_%s_title", c29983l), c29983l.m70061a("sns_geolocation_detection_invalidLocation"), c31120v0.f62933s ? null : c29983l.m70061a("sns_geolocation_intro_subtitle_divider"), c31120v0.f62933s ? null : c29983l.m70061a("sns_geolocation_intro_subtitle_document")));
            }
            if (interfaceC31123x instanceof C31111r) {
                List list = ((C31111r) interfaceC31123x).f62900a;
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                return new C31055K(C41636g.m90927m(C41636g.m90887K(new C28388D(new C31056L(c29983l, c31120v0, null), null)), new C31063T(c31120v0.f62925k, c31120v0, c29983l, "sns_geolocation_form_action_retryInTime", "sns_geolocation_form_action_retry"), new C31057M(null)), AbstractC28892d.m69671a(new Object[]{c31120v0.f62921g.getType().f59014a}, 1, "sns_geolocation_form_title", c29983l), c29983l.m70061a("sns_geolocation_form_subtitle"), list);
            }
            throw new NoWhenBranchMatchedException();
        }
        return new C31085f0(C41636g.m90927m(C41636g.m90887K(new C28388D(new C31088g0(c29983l, c31120v0, null), null)), C41636g.m90927m(c31120v0.f62930p, c31120v0.f62932r, new C31060P(c29983l, c31120v0, null)), new C31091h0(null)), new C31040B0(SNSIconHandler.SNSCommonIcons.LOCATION_OFF, c29983l.m70061a("sns_geolocation_intro_title"), c29983l.m70061a("sns_geolocation_intro_subtitle_location"), c31120v0.f62933s ? null : c29983l.m70061a("sns_geolocation_intro_subtitle_divider"), c31120v0.f62933s ? null : c29983l.m70061a("sns_geolocation_intro_subtitle_document")));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m70579b(C31120v0 c31120v0, ContinuationImpl continuationImpl) {
        C31051H c31051h;
        C28368g c28368gM69264a;
        Pair[] pairArr;
        Pair[] pairArr2;
        String str;
        if (continuationImpl instanceof C31051H) {
            c31051h = (C31051H) continuationImpl;
            int i11 = c31051h.f62771g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31051h.f62771g = i11 - Integer.MIN_VALUE;
            } else {
                c31051h = new C31051H(continuationImpl);
            }
        } else {
            c31051h = new C31051H(continuationImpl);
        }
        Object obj = c31051h.f62770f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31051h.f62771g;
        int i13 = 1;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c28368gM69264a = new C28368g().m69264a(PrimaryAction.Geolocation);
            c28368gM69264a.f57846b.add(PrimaryActionState.Started);
            Pair[] pairArr3 = new Pair[2];
            pairArr3[0] = TuplesKt.m90091to("attempt", Boxing.boxInt(c31120v0.f62928n));
            C28705t c28705t = c31120v0.f62923i;
            c31051h.f62765a = pairArr3;
            c31051h.f62766b = c28368gM69264a;
            c31051h.f62767c = pairArr3;
            c31051h.f62768d = "isAuthorized";
            c31051h.f62769e = 1;
            c31051h.f62771g = 1;
            Object objM70580a = c31120v0.m70580a(c28705t, c31051h);
            if (objM70580a == coroutine_suspended) {
                return coroutine_suspended;
            }
            pairArr = pairArr3;
            pairArr2 = pairArr;
            obj = objM70580a;
            str = "isAuthorized";
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = c31051h.f62769e;
            str = c31051h.f62768d;
            pairArr2 = c31051h.f62767c;
            c28368gM69264a = c31051h.f62766b;
            pairArr = c31051h.f62765a;
            ResultKt.throwOnFailure(obj);
        }
        pairArr2[i13] = TuplesKt.m90091to(str, obj);
        c28368gM69264a.getClass();
        c28368gM69264a.f57847c = MapsKt.toMap(ArraysKt.filterNotNull(pairArr));
        c28368gM69264a.m69267a(false);
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: b */
    public final void mo69623b(AbstractC28841e0 abstractC28841e0, String str) {
        C28936t c28936t = this.f62927m;
        KProperty kProperty = f62914w[0];
        ArrayList arrayList = new ArrayList((List) c28936t.m69705a());
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= size) {
                i12 = -1;
                break;
            }
            Object obj = arrayList.get(i11);
            i11++;
            AbstractC29103d2 abstractC29103d2 = ((C29094c) obj).f59041a.f59781b;
            if (Intrinsics.areEqual(abstractC29103d2 != null ? abstractC29103d2.mo69715b() : null, abstractC28841e0.mo69642c().f59466a)) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 < 0) {
            return;
        }
        C29094c c29094c = (C29094c) arrayList.get(i12);
        arrayList.set(i12, new C29094c(c29094c.f59041a, str, c29094c.f59043c));
        C28936t c28936t2 = this.f62927m;
        KProperty kProperty2 = f62914w[0];
        c28936t2.f58834a.set(c28936t2.f58835b, arrayList);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69620a(C28850j c28850j) {
        C31070a.m70567a("onAction: " + c28850j);
        if (Intrinsics.areEqual(c28850j.f58677a, "upload_document")) {
            C28367f.m69256a(m70585e(), Control.SkipButton, (Map) null, (Popup) null, 6);
            fireEvent(C31043D.f62744a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092 A[PHI: r8
      0x0092: PHI (r8v7 java.lang.Object) = (r8v5 java.lang.Object), (r8v1 java.lang.Object) binds: [B:32:0x008e, B:23:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d5 A[PHI: r8
      0x00d5: PHI (r8v21 java.lang.Object) = (r8v11 java.lang.Object), (r8v1 java.lang.Object) binds: [B:42:0x00d1, B:21:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:51:0x010c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0114  */
    /* JADX WARN: Code duplicated, block: B:57:0x0125  */
    /* JADX WARN: Code duplicated, block: B:60:0x012c A[Catch: all -> 0x014d, TRY_LEAVE, TryCatch #2 {all -> 0x014d, blocks: (B:18:0x0039, B:58:0x0126, B:60:0x012c, B:65:0x014f, B:67:0x0153, B:74:0x0166, B:75:0x016b), top: B:87:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x014f A[Catch: all -> 0x014d, TRY_ENTER, TryCatch #2 {all -> 0x014d, blocks: (B:18:0x0039, B:58:0x0126, B:60:0x012c, B:65:0x014f, B:67:0x0153, B:74:0x0166, B:75:0x016b), top: B:87:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0153 A[Catch: all -> 0x014d, TRY_LEAVE, TryCatch #2 {all -> 0x014d, blocks: (B:18:0x0039, B:58:0x0126, B:60:0x012c, B:65:0x014f, B:67:0x0153, B:74:0x0166, B:75:0x016b), top: B:87:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x015f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0166 A[Catch: all -> 0x014d, TRY_ENTER, TryCatch #2 {all -> 0x014d, blocks: (B:18:0x0039, B:58:0x0126, B:60:0x012c, B:65:0x014f, B:67:0x0153, B:74:0x0166, B:75:0x016b), top: B:87:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x0173  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
    
        if (m70576a(r7, r0) == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0106, code lost:
    
        if (m70576a(r7, r0) == r1) goto L69;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70582a(ContinuationImpl continuationImpl) throws Throwable {
        C31047F c31047f;
        C28683s c28683s;
        InterfaceC41769w interfaceC41769w;
        InterfaceC28657j interfaceC28657j;
        AbstractC28142p0 abstractC28142p0;
        AbstractC28142p0 abstractC28142p1;
        InterfaceC28670f interfaceC28670f;
        if (continuationImpl instanceof C31047F) {
            c31047f = (C31047F) continuationImpl;
            int i11 = c31047f.f62756d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31047f.f62756d = i11 - Integer.MIN_VALUE;
            } else {
                c31047f = new C31047F(this, continuationImpl);
            }
        } else {
            c31047f = new C31047F(this, continuationImpl);
        }
        Object objMo91198h = c31047f.f62754b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c31047f.f62756d) {
            case 0:
                ResultKt.throwOnFailure(objMo91198h);
                c31047f.f62756d = 1;
                if (m70579b(this, c31047f) != coroutine_suspended) {
                    c28683s = this.f62922h;
                    c31047f.f62756d = 2;
                    interfaceC41769w = c28683s.f58331e;
                    if (interfaceC41769w != null) {
                        c28683s.m69496a("requestLocationEnabled: awaiting in-flight check");
                        objMo91198h = interfaceC41769w.mo91198h(c31047f);
                    } else {
                        InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
                        c28683s.f58331e = interfaceC41769wM91388c;
                        c28683s.f58329c.setValue(LocationServiceController$Phase.CheckRequested);
                        c28683s.m69496a("requestLocationEnabled -> CheckRequested");
                        objMo91198h = interfaceC41769wM91388c.mo91198h(c31047f);
                    }
                    if (objMo91198h != coroutine_suspended) {
                        if (!((Boolean) objMo91198h).booleanValue()) {
                            C28936t c28936t = this.f62929o;
                            KProperty[] kPropertyArr = f62914w;
                            KProperty kProperty = kPropertyArr[1];
                            int iIntValue = ((Number) c28936t.m69705a()).intValue() + 1;
                            C28936t c28936t2 = this.f62929o;
                            KProperty kProperty2 = kPropertyArr[1];
                            c28936t2.f58834a.set(c28936t2.f58835b, Integer.valueOf(iIntValue));
                            c31047f.f62756d = 3;
                            break;
                        } else {
                            C28705t c28705t = this.f62923i;
                            c31047f.f62756d = 4;
                            objMo91198h = c28705t.m69505a(c31047f);
                            if (objMo91198h != coroutine_suspended) {
                                interfaceC28657j = (InterfaceC28657j) objMo91198h;
                                if (Intrinsics.areEqual(interfaceC28657j, C28653h.f58285a)) {
                                    C28936t c28936t3 = this.f62929o;
                                    KProperty[] kPropertyArr2 = f62914w;
                                    KProperty kProperty3 = kPropertyArr2[1];
                                    int iIntValue2 = ((Number) c28936t3.m69705a()).intValue() + 1;
                                    C28936t c28936t4 = this.f62929o;
                                    KProperty kProperty4 = kPropertyArr2[1];
                                    c28936t4.f58834a.set(c28936t4.f58835b, Integer.valueOf(iIntValue2));
                                    c31047f.f62756d = 5;
                                    break;
                                } else if (Intrinsics.areEqual(interfaceC28657j, C28655i.f58286a)) {
                                    showProgress(true);
                                    try {
                                        C28676l c28676l = this.f62924j;
                                        c31047f.f62753a = this;
                                        c31047f.f62756d = 6;
                                        objMo91198h = c28676l.m69489a(c31047f);
                                        if (objMo91198h != coroutine_suspended) {
                                            abstractC28142p1 = this;
                                            interfaceC28670f = (InterfaceC28670f) objMo91198h;
                                            if (interfaceC28670f instanceof C28663a) {
                                                C29795e c29795e = ((C28663a) interfaceC28670f).f58293a;
                                                C28936t c28936t5 = this.f62929o;
                                                KProperty kProperty5 = f62914w[1];
                                                c28936t5.f58834a.set(c28936t5.f58835b, 0);
                                                m70578a(this, c29795e);
                                                C31125y c31125y = new C31125y(c29795e);
                                                abstractC28142p1.showProgress(false);
                                                return c31125y;
                                            }
                                            if (interfaceC28670f instanceof InterfaceC28669e) {
                                                c31047f.f62753a = abstractC28142p1;
                                                c31047f.f62756d = 7;
                                                if (m70576a(this, c31047f) != coroutine_suspended) {
                                                    abstractC28142p0 = abstractC28142p1;
                                                    C31039B c31039b = C31039B.f62737a;
                                                    abstractC28142p0.showProgress(false);
                                                    return c31039b;
                                                }
                                            } else {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        abstractC28142p0 = this;
                                        abstractC28142p1 = abstractC28142p0;
                                        abstractC28142p1.showProgress(false);
                                        throw th;
                                    }
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                ResultKt.throwOnFailure(objMo91198h);
                c28683s = this.f62922h;
                c31047f.f62756d = 2;
                interfaceC41769w = c28683s.f58331e;
                if (interfaceC41769w != null) {
                    c28683s.m69496a("requestLocationEnabled: awaiting in-flight check");
                    objMo91198h = interfaceC41769w.mo91198h(c31047f);
                } else {
                    InterfaceC41769w interfaceC41769wM91388c2 = C41777y.m91388c(null, 1, null);
                    c28683s.f58331e = interfaceC41769wM91388c2;
                    c28683s.f58329c.setValue(LocationServiceController$Phase.CheckRequested);
                    c28683s.m69496a("requestLocationEnabled -> CheckRequested");
                    objMo91198h = interfaceC41769wM91388c2.mo91198h(c31047f);
                }
                if (objMo91198h != coroutine_suspended) {
                    if (!((Boolean) objMo91198h).booleanValue()) {
                        C28936t c28936t6 = this.f62929o;
                        KProperty[] kPropertyArr3 = f62914w;
                        KProperty kProperty6 = kPropertyArr3[1];
                        int iIntValue3 = ((Number) c28936t6.m69705a()).intValue() + 1;
                        C28936t c28936t7 = this.f62929o;
                        KProperty kProperty7 = kPropertyArr3[1];
                        c28936t7.f58834a.set(c28936t7.f58835b, Integer.valueOf(iIntValue3));
                        c31047f.f62756d = 3;
                        break;
                    } else {
                        C28705t c28705t2 = this.f62923i;
                        c31047f.f62756d = 4;
                        objMo91198h = c28705t2.m69505a(c31047f);
                        if (objMo91198h != coroutine_suspended) {
                            interfaceC28657j = (InterfaceC28657j) objMo91198h;
                            if (Intrinsics.areEqual(interfaceC28657j, C28653h.f58285a)) {
                                C28936t c28936t8 = this.f62929o;
                                KProperty[] kPropertyArr4 = f62914w;
                                KProperty kProperty8 = kPropertyArr4[1];
                                int iIntValue4 = ((Number) c28936t8.m69705a()).intValue() + 1;
                                C28936t c28936t9 = this.f62929o;
                                KProperty kProperty9 = kPropertyArr4[1];
                                c28936t9.f58834a.set(c28936t9.f58835b, Integer.valueOf(iIntValue4));
                                c31047f.f62756d = 5;
                                break;
                            } else if (Intrinsics.areEqual(interfaceC28657j, C28655i.f58286a)) {
                                showProgress(true);
                                C28676l c28676l2 = this.f62924j;
                                c31047f.f62753a = this;
                                c31047f.f62756d = 6;
                                objMo91198h = c28676l2.m69489a(c31047f);
                                if (objMo91198h != coroutine_suspended) {
                                    abstractC28142p1 = this;
                                    interfaceC28670f = (InterfaceC28670f) objMo91198h;
                                    if (interfaceC28670f instanceof C28663a) {
                                        C29795e c29795e2 = ((C28663a) interfaceC28670f).f58293a;
                                        C28936t c28936t10 = this.f62929o;
                                        KProperty kProperty10 = f62914w[1];
                                        c28936t10.f58834a.set(c28936t10.f58835b, 0);
                                        m70578a(this, c29795e2);
                                        C31125y c31125y2 = new C31125y(c29795e2);
                                        abstractC28142p1.showProgress(false);
                                        return c31125y2;
                                    }
                                    if (interfaceC28670f instanceof InterfaceC28669e) {
                                        c31047f.f62753a = abstractC28142p1;
                                        c31047f.f62756d = 7;
                                        if (m70576a(this, c31047f) != coroutine_suspended) {
                                            abstractC28142p0 = abstractC28142p1;
                                            C31039B c31039b2 = C31039B.f62737a;
                                            abstractC28142p0.showProgress(false);
                                            return c31039b2;
                                        }
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 2:
                ResultKt.throwOnFailure(objMo91198h);
                if (!((Boolean) objMo91198h).booleanValue()) {
                    C28936t c28936t11 = this.f62929o;
                    KProperty[] kPropertyArr5 = f62914w;
                    KProperty kProperty11 = kPropertyArr5[1];
                    int iIntValue5 = ((Number) c28936t11.m69705a()).intValue() + 1;
                    C28936t c28936t12 = this.f62929o;
                    KProperty kProperty12 = kPropertyArr5[1];
                    c28936t12.f58834a.set(c28936t12.f58835b, Integer.valueOf(iIntValue5));
                    c31047f.f62756d = 3;
                    break;
                } else {
                    C28705t c28705t3 = this.f62923i;
                    c31047f.f62756d = 4;
                    objMo91198h = c28705t3.m69505a(c31047f);
                    if (objMo91198h != coroutine_suspended) {
                        interfaceC28657j = (InterfaceC28657j) objMo91198h;
                        if (Intrinsics.areEqual(interfaceC28657j, C28653h.f58285a)) {
                            C28936t c28936t13 = this.f62929o;
                            KProperty[] kPropertyArr6 = f62914w;
                            KProperty kProperty13 = kPropertyArr6[1];
                            int iIntValue6 = ((Number) c28936t13.m69705a()).intValue() + 1;
                            C28936t c28936t14 = this.f62929o;
                            KProperty kProperty14 = kPropertyArr6[1];
                            c28936t14.f58834a.set(c28936t14.f58835b, Integer.valueOf(iIntValue6));
                            c31047f.f62756d = 5;
                            break;
                        } else if (Intrinsics.areEqual(interfaceC28657j, C28655i.f58286a)) {
                            showProgress(true);
                            C28676l c28676l3 = this.f62924j;
                            c31047f.f62753a = this;
                            c31047f.f62756d = 6;
                            objMo91198h = c28676l3.m69489a(c31047f);
                            if (objMo91198h != coroutine_suspended) {
                                abstractC28142p1 = this;
                                interfaceC28670f = (InterfaceC28670f) objMo91198h;
                                if (interfaceC28670f instanceof C28663a) {
                                    C29795e c29795e3 = ((C28663a) interfaceC28670f).f58293a;
                                    C28936t c28936t15 = this.f62929o;
                                    KProperty kProperty15 = f62914w[1];
                                    c28936t15.f58834a.set(c28936t15.f58835b, 0);
                                    m70578a(this, c29795e3);
                                    C31125y c31125y3 = new C31125y(c29795e3);
                                    abstractC28142p1.showProgress(false);
                                    return c31125y3;
                                }
                                if (interfaceC28670f instanceof InterfaceC28669e) {
                                    c31047f.f62753a = abstractC28142p1;
                                    c31047f.f62756d = 7;
                                    if (m70576a(this, c31047f) != coroutine_suspended) {
                                        abstractC28142p0 = abstractC28142p1;
                                        C31039B c31039b3 = C31039B.f62737a;
                                        abstractC28142p0.showProgress(false);
                                        return c31039b3;
                                    }
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                return coroutine_suspended;
            case 3:
                ResultKt.throwOnFailure(objMo91198h);
                return C31037A.f62734a;
            case 4:
                ResultKt.throwOnFailure(objMo91198h);
                interfaceC28657j = (InterfaceC28657j) objMo91198h;
                if (Intrinsics.areEqual(interfaceC28657j, C28653h.f58285a)) {
                    C28936t c28936t16 = this.f62929o;
                    KProperty[] kPropertyArr7 = f62914w;
                    KProperty kProperty16 = kPropertyArr7[1];
                    int iIntValue7 = ((Number) c28936t16.m69705a()).intValue() + 1;
                    C28936t c28936t17 = this.f62929o;
                    KProperty kProperty17 = kPropertyArr7[1];
                    c28936t17.f58834a.set(c28936t17.f58835b, Integer.valueOf(iIntValue7));
                    c31047f.f62756d = 5;
                    break;
                } else if (Intrinsics.areEqual(interfaceC28657j, C28655i.f58286a)) {
                    showProgress(true);
                    C28676l c28676l4 = this.f62924j;
                    c31047f.f62753a = this;
                    c31047f.f62756d = 6;
                    objMo91198h = c28676l4.m69489a(c31047f);
                    if (objMo91198h != coroutine_suspended) {
                        abstractC28142p1 = this;
                        interfaceC28670f = (InterfaceC28670f) objMo91198h;
                        if (interfaceC28670f instanceof C28663a) {
                            C29795e c29795e4 = ((C28663a) interfaceC28670f).f58293a;
                            C28936t c28936t18 = this.f62929o;
                            KProperty kProperty18 = f62914w[1];
                            c28936t18.f58834a.set(c28936t18.f58835b, 0);
                            m70578a(this, c29795e4);
                            C31125y c31125y4 = new C31125y(c29795e4);
                            abstractC28142p1.showProgress(false);
                            return c31125y4;
                        }
                        if (interfaceC28670f instanceof InterfaceC28669e) {
                            c31047f.f62753a = abstractC28142p1;
                            c31047f.f62756d = 7;
                            if (m70576a(this, c31047f) != coroutine_suspended) {
                                abstractC28142p0 = abstractC28142p1;
                                C31039B c31039b4 = C31039B.f62737a;
                                abstractC28142p0.showProgress(false);
                                return c31039b4;
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return coroutine_suspended;
            case 5:
                ResultKt.throwOnFailure(objMo91198h);
                return C31127z.f62946a;
            case 6:
                abstractC28142p1 = c31047f.f62753a;
                try {
                    ResultKt.throwOnFailure(objMo91198h);
                    interfaceC28670f = (InterfaceC28670f) objMo91198h;
                    if (interfaceC28670f instanceof C28663a) {
                        C29795e c29795e5 = ((C28663a) interfaceC28670f).f58293a;
                        C28936t c28936t19 = this.f62929o;
                        KProperty kProperty19 = f62914w[1];
                        c28936t19.f58834a.set(c28936t19.f58835b, 0);
                        m70578a(this, c29795e5);
                        C31125y c31125y5 = new C31125y(c29795e5);
                        abstractC28142p1.showProgress(false);
                        return c31125y5;
                    }
                    if (interfaceC28670f instanceof InterfaceC28669e) {
                        c31047f.f62753a = abstractC28142p1;
                        c31047f.f62756d = 7;
                        if (m70576a(this, c31047f) != coroutine_suspended) {
                            abstractC28142p0 = abstractC28142p1;
                            C31039B c31039b5 = C31039B.f62737a;
                            abstractC28142p0.showProgress(false);
                            return c31039b5;
                        }
                        return coroutine_suspended;
                    }
                    throw new NoWhenBranchMatchedException();
                } catch (Throwable th3) {
                    th = th3;
                    abstractC28142p1.showProgress(false);
                    throw th;
                }
            case 7:
                abstractC28142p0 = c31047f.f62753a;
                try {
                    ResultKt.throwOnFailure(objMo91198h);
                    C31039B c31039b6 = C31039B.f62737a;
                    abstractC28142p0.showProgress(false);
                    return c31039b6;
                } catch (Throwable th4) {
                    th = th4;
                    abstractC28142p1 = abstractC28142p0;
                    abstractC28142p1.showProgress(false);
                    throw th;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m70576a(C31120v0 c31120v0, ContinuationImpl continuationImpl) {
        C31049G c31049g;
        C28368g c28368gM69264a;
        Pair[] pairArr;
        Pair[] pairArr2;
        String str;
        if (continuationImpl instanceof C31049G) {
            c31049g = (C31049G) continuationImpl;
            int i11 = c31049g.f62764g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31049g.f62764g = i11 - Integer.MIN_VALUE;
            } else {
                c31049g = new C31049G(continuationImpl);
            }
        } else {
            c31049g = new C31049G(continuationImpl);
        }
        Object obj = c31049g.f62763f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31049g.f62764g;
        int i13 = 1;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c28368gM69264a = new C28368g().m69264a(PrimaryAction.Geolocation);
            c28368gM69264a.f57846b.add(PrimaryActionState.Failed);
            Pair[] pairArr3 = new Pair[2];
            pairArr3[0] = TuplesKt.m90091to("attempt", Boxing.boxInt(c31120v0.f62928n));
            C28705t c28705t = c31120v0.f62923i;
            c31049g.f62758a = pairArr3;
            c31049g.f62759b = c28368gM69264a;
            c31049g.f62760c = pairArr3;
            c31049g.f62761d = "isAuthorized";
            c31049g.f62762e = 1;
            c31049g.f62764g = 1;
            Object objM70580a = c31120v0.m70580a(c28705t, c31049g);
            if (objM70580a == coroutine_suspended) {
                return coroutine_suspended;
            }
            pairArr = pairArr3;
            pairArr2 = pairArr;
            obj = objM70580a;
            str = "isAuthorized";
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = c31049g.f62762e;
            str = c31049g.f62761d;
            pairArr2 = c31049g.f62760c;
            c28368gM69264a = c31049g.f62759b;
            pairArr = c31049g.f62758a;
            ResultKt.throwOnFailure(obj);
        }
        pairArr2[i13] = TuplesKt.m90091to(str, obj);
        c28368gM69264a.getClass();
        c28368gM69264a.f57847c = MapsKt.toMap(ArraysKt.filterNotNull(pairArr));
        c28368gM69264a.m69267a(false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:47:0x0104  */
    /* JADX WARN: Code duplicated, block: B:51:0x010c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0139  */
    /* JADX WARN: Code duplicated, block: B:56:0x0156  */
    /* JADX WARN: Code duplicated, block: B:65:0x017e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0182  */
    /* JADX WARN: Code duplicated, block: B:68:0x0185  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:75:0x01be  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f8  */
    /* JADX INFO: renamed from: a */
    public final Object m70581a(C29795e c29795e, ContinuationImpl continuationImpl) {
        C31045E c31045e;
        Object objM70120a;
        Map map;
        InterfaceC30194e interfaceC30194e;
        boolean z11;
        Long l11;
        long jLongValue;
        Long l12;
        Object c31101m;
        C30191b c30191b;
        ArrayList arrayList;
        Object strings;
        InterfaceC30194e interfaceC30194e2;
        Map map2;
        C31120v0 c31120v0;
        int i11;
        C29094c c29094c;
        String str;
        Long l13;
        C29795e c29795e2 = c29795e;
        if (continuationImpl instanceof C31045E) {
            c31045e = (C31045E) continuationImpl;
            int i12 = c31045e.f62751f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c31045e.f62751f = i12 - Integer.MIN_VALUE;
            } else {
                c31045e = new C31045E(this, continuationImpl);
            }
        } else {
            c31045e = new C31045E(this, continuationImpl);
        }
        Object obj = c31045e.f62749d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c31045e.f62751f;
        if (i13 == 0) {
            ResultKt.throwOnFailure(obj);
            C31070a.m70567a("onLocationAcquired: accuracy=" + c29795e2.f59869c + ", isMock=" + c29795e2.f59870d);
            C30156e c30156e = this.f62919e;
            c31045e.f62746a = c29795e2;
            c31045e.f62751f = 1;
            objM70120a = c30156e.m70120a(false, (ContinuationImpl) c31045e);
            if (objM70120a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i13 == 1) {
            c29795e2 = (C29795e) c31045e.f62746a;
            ResultKt.throwOnFailure(obj);
            objM70120a = ((Result) obj).getValue();
        } else {
            if (i13 == 2) {
                map = (Map) c31045e.f62746a;
                ResultKt.throwOnFailure(obj);
                interfaceC30194e = (InterfaceC30194e) obj;
                z11 = interfaceC30194e instanceof C30191b;
                if (z11) {
                    l13 = ((C30191b) interfaceC30194e).f60682b;
                    if (l13 != null) {
                        jLongValue = l13.longValue();
                    } else {
                        jLongValue = 10;
                    }
                    this.f62920f.m71293a("address_by_location_countdown", (jLongValue * 1000) + System.currentTimeMillis());
                } else if (interfaceC30194e instanceof C30193d) {
                    l12 = ((C30193d) interfaceC30194e).f60685b;
                    if (l12 != null) {
                        jLongValue = l12.longValue();
                    } else {
                        jLongValue = 10;
                    }
                    this.f62920f.m71293a("address_by_location_countdown", (jLongValue * 1000) + System.currentTimeMillis());
                } else if (interfaceC30194e instanceof C30192c) {
                    l11 = ((C30192c) interfaceC30194e).f60683a;
                    if (l11 != null) {
                        jLongValue = l11.longValue();
                    } else {
                        jLongValue = 10;
                    }
                    this.f62920f.m71293a("address_by_location_countdown", (jLongValue * 1000) + System.currentTimeMillis());
                } else if (!(interfaceC30194e instanceof C30190a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (interfaceC30194e instanceof C30193d) {
                    C28936t c28936t = this.f62931q;
                    KProperty[] kPropertyArr = f62914w;
                    KProperty kProperty = kPropertyArr[2];
                    int iIntValue = ((Number) c28936t.m69705a()).intValue() + 1;
                    C28936t c28936t2 = this.f62931q;
                    KProperty kProperty2 = kPropertyArr[2];
                    c28936t2.f58834a.set(c28936t2.f58835b, Integer.valueOf(iIntValue));
                    c31101m = new C31103n(((C30193d) interfaceC30194e).f60684a);
                } else if (z11) {
                    C28936t c28936t3 = this.f62931q;
                    KProperty kProperty3 = f62914w[2];
                    c28936t3.f58834a.set(c28936t3.f58835b, 0);
                    c30191b = (C30191b) interfaceC30194e;
                    arrayList = c30191b.f60681a;
                    if (arrayList.isEmpty()) {
                        int size = arrayList.size();
                        i11 = 0;
                        while (i11 < size) {
                            Object obj2 = arrayList.get(i11);
                            i11++;
                            c29094c = (C29094c) obj2;
                            if (!Intrinsics.areEqual(c29094c.f59041a.f59781b, C29059U0.f59007b) && ((str = c29094c.f59042b) == null || StringsKt.isBlank(str))) {
                                c31101m = C31097k.f62881a;
                            }
                        }
                        if (this.f62918d) {
                            c31101m = C31105o.f62892a;
                        } else {
                            ArrayList arrayList2 = c30191b.f60681a;
                            C28936t c28936t4 = this.f62927m;
                            KProperty kProperty4 = f62914w[0];
                            c28936t4.f58834a.set(c28936t4.f58835b, arrayList2);
                            c31045e.f62746a = map;
                            c31045e.f62747b = c30191b;
                            c31045e.f62748c = this;
                            c31045e.f62751f = 3;
                            strings = getStrings(c31045e);
                            if (strings != coroutine_suspended) {
                                interfaceC30194e2 = interfaceC30194e;
                                obj = strings;
                                map2 = map;
                                c31120v0 = this;
                            }
                            return coroutine_suspended;
                        }
                    } else if (this.f62918d) {
                        c31101m = C31105o.f62892a;
                    } else {
                        ArrayList arrayList3 = c30191b.f60681a;
                        C28936t c28936t5 = this.f62927m;
                        KProperty kProperty5 = f62914w[0];
                        c28936t5.f58834a.set(c28936t5.f58835b, arrayList3);
                        c31045e.f62746a = map;
                        c31045e.f62747b = c30191b;
                        c31045e.f62748c = this;
                        c31045e.f62751f = 3;
                        strings = getStrings(c31045e);
                        if (strings != coroutine_suspended) {
                            interfaceC30194e2 = interfaceC30194e;
                            obj = strings;
                            map2 = map;
                            c31120v0 = this;
                        }
                        return coroutine_suspended;
                    }
                } else if (interfaceC30194e instanceof C30192c) {
                    c31101m = new C31099l();
                } else if (interfaceC30194e instanceof C30190a) {
                    c31101m = new C31101m(((C30190a) interfaceC30194e).f60680a);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                C31070a.m70567a("acquireAddress: result=" + Reflection.getOrCreateKotlinClass(c31101m.getClass()).getSimpleName());
                return c31101m;
            }
            if (i13 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c31120v0 = c31045e.f62748c;
            interfaceC30194e2 = c31045e.f62747b;
            map2 = (Map) c31045e.f62746a;
            ResultKt.throwOnFailure(obj);
        }
        c31101m = new C31107p(c31120v0.m70583a((C29983l) obj, ((C30191b) interfaceC30194e2).f60681a, map2, this.f62936v));
        C31070a.m70567a("acquireAddress: result=" + Reflection.getOrCreateKotlinClass(c31101m.getClass()).getSimpleName());
        return c31101m;
        if (Result.m103851isSuccessimpl(objM70120a)) {
            objM70120a = ((C30270n) objM70120a).f60856c;
        }
        Object objM103844constructorimpl = Result.m103844constructorimpl(objM70120a);
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) == null) {
            Map map3 = (Map) objM103844constructorimpl;
            C30210u c30210u = this.f62915a;
            String str2 = this.f62921g.getType().f59014a;
            c31045e.f62746a = map3;
            c31045e.f62751f = 2;
            Object objM70138a = c30210u.m70138a(str2, c29795e2, c31045e);
            if (objM70138a != coroutine_suspended) {
                obj = objM70138a;
                map = map3;
                interfaceC30194e = (InterfaceC30194e) obj;
                z11 = interfaceC30194e instanceof C30191b;
                if (z11) {
                    l13 = ((C30191b) interfaceC30194e).f60682b;
                    if (l13 != null) {
                        jLongValue = l13.longValue();
                    } else {
                        jLongValue = 10;
                    }
                    this.f62920f.m71293a("address_by_location_countdown", (jLongValue * 1000) + System.currentTimeMillis());
                } else if (interfaceC30194e instanceof C30193d) {
                    l12 = ((C30193d) interfaceC30194e).f60685b;
                    if (l12 != null) {
                        jLongValue = l12.longValue();
                    } else {
                        jLongValue = 10;
                    }
                    this.f62920f.m71293a("address_by_location_countdown", (jLongValue * 1000) + System.currentTimeMillis());
                } else if (interfaceC30194e instanceof C30192c) {
                    l11 = ((C30192c) interfaceC30194e).f60683a;
                    if (l11 != null) {
                        jLongValue = l11.longValue();
                    } else {
                        jLongValue = 10;
                    }
                    this.f62920f.m71293a("address_by_location_countdown", (jLongValue * 1000) + System.currentTimeMillis());
                } else if (!(interfaceC30194e instanceof C30190a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (interfaceC30194e instanceof C30193d) {
                    C28936t c28936t6 = this.f62931q;
                    KProperty[] kPropertyArr2 = f62914w;
                    KProperty kProperty6 = kPropertyArr2[2];
                    int iIntValue2 = ((Number) c28936t6.m69705a()).intValue() + 1;
                    C28936t c28936t7 = this.f62931q;
                    KProperty kProperty7 = kPropertyArr2[2];
                    c28936t7.f58834a.set(c28936t7.f58835b, Integer.valueOf(iIntValue2));
                    c31101m = new C31103n(((C30193d) interfaceC30194e).f60684a);
                } else if (z11) {
                    C28936t c28936t8 = this.f62931q;
                    KProperty kProperty8 = f62914w[2];
                    c28936t8.f58834a.set(c28936t8.f58835b, 0);
                    c30191b = (C30191b) interfaceC30194e;
                    arrayList = c30191b.f60681a;
                    if (arrayList.isEmpty()) {
                        int size2 = arrayList.size();
                        i11 = 0;
                        while (true) {
                            Object obj3 = arrayList.get(i11);
                            i11++;
                            c29094c = (C29094c) obj3;
                            if (!Intrinsics.areEqual(c29094c.f59041a.f59781b, C29059U0.f59007b)) {
                            }
                        }
                    } else if (this.f62918d) {
                        c31101m = C31105o.f62892a;
                    } else {
                        ArrayList arrayList4 = c30191b.f60681a;
                        C28936t c28936t9 = this.f62927m;
                        KProperty kProperty9 = f62914w[0];
                        c28936t9.f58834a.set(c28936t9.f58835b, arrayList4);
                        c31045e.f62746a = map;
                        c31045e.f62747b = c30191b;
                        c31045e.f62748c = this;
                        c31045e.f62751f = 3;
                        strings = getStrings(c31045e);
                        if (strings != coroutine_suspended) {
                            interfaceC30194e2 = interfaceC30194e;
                            obj = strings;
                            map2 = map;
                            c31120v0 = this;
                            c31101m = new C31107p(c31120v0.m70583a((C29983l) obj, ((C30191b) interfaceC30194e2).f60681a, map2, this.f62936v));
                        }
                    }
                } else if (interfaceC30194e instanceof C30192c) {
                    c31101m = new C31099l();
                } else if (interfaceC30194e instanceof C30190a) {
                    c31101m = new C31101m(((C30190a) interfaceC30194e).f60680a);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                C31070a.m70567a("acquireAddress: result=" + Reflection.getOrCreateKotlinClass(c31101m.getClass()).getSimpleName());
                return c31101m;
            }
            return coroutine_suspended;
        }
        return new C31101m(new SNSGeneralException("Send address countries data error", null, null, 6, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX INFO: renamed from: a */
    public static C31124x0 m70575a(C29983l c29983l, String str, long j11) {
        String strReplace$default;
        String strM70061a = c29983l.m70061a(str);
        if (strM70061a != null) {
            strReplace$default = StringsKt.replace$default(strM70061a, "{time}", j11 + CmcdData.Factory.STREAMING_FORMAT_SS, false, 4, (Object) null);
            if (strReplace$default == null) {
                strReplace$default = "";
            }
        } else {
            strReplace$default = "";
        }
        return new C31124x0(strReplace$default, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70580a(C28705t c28705t, ContinuationImpl continuationImpl) {
        C31077c0 c31077c0;
        if (continuationImpl instanceof C31077c0) {
            c31077c0 = (C31077c0) continuationImpl;
            int i11 = c31077c0.f62840c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31077c0.f62840c = i11 - Integer.MIN_VALUE;
            } else {
                c31077c0 = new C31077c0(this, continuationImpl);
            }
        } else {
            c31077c0 = new C31077c0(this, continuationImpl);
        }
        Object objM69509b = c31077c0.f62838a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31077c0.f62840c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM69509b);
            c31077c0.f62840c = 1;
            objM69509b = c28705t.m69509b(c31077c0);
            if (objM69509b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM69509b);
        }
        return Boxing.boxBoolean(Intrinsics.areEqual(objM69509b, C28655i.f58286a));
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0234  */
    /* JADX INFO: renamed from: a */
    public final List m70583a(C29983l c29983l, List list, Map map, Map map2) {
        Object next;
        int iNextIndex;
        int i11;
        Parcelable c28831z;
        Parcelable parcelable;
        ArrayList arrayList;
        Set<Map.Entry> setEntrySet;
        C29707v2 c29707v2;
        String str;
        int i12 = 1;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29094c c29094c = (C29094c) it.next();
            C29719y c29719y = c29094c.f59041a;
            AbstractC29103d2 abstractC29103d2 = c29719y.f59781b;
            if (abstractC29103d2 == null) {
                c29707v2 = null;
            } else {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String strM69671a = AbstractC28892d.m69671a(new Object[]{abstractC29103d2.mo69715b()}, 1, "sns_data_field_%s", c29983l);
                String strM69671a2 = AbstractC28892d.m69671a(new Object[]{abstractC29103d2.mo69715b()}, 1, "sns_data_field_%s_placeholder", c29983l);
                String strM70061a = c29983l.m70061a("sns_data_error_fieldIsRequired");
                c29707v2 = new C29707v2(c29719y, strM69671a, strM69671a2, (strM70061a != null && c29094c.f59041a.f59782c && ((str = c29094c.f59042b) == null || StringsKt.isBlank(str))) ? strM70061a : null, c29094c.f59043c);
            }
            if (c29707v2 != null) {
                arrayList2.add(c29707v2);
            }
        }
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.areEqual(((C29094c) next).f59041a.f59781b, C29059U0.f59007b));
        C29094c c29094c2 = (C29094c) next;
        String str2 = c29094c2 != null ? c29094c2.f59042b : null;
        String strValueOf = String.valueOf(System.currentTimeMillis());
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList2.get(i13);
            i13 += i12;
            C29707v2 c29707v3 = (C29707v2) obj;
            String strMo69727c = c29707v3.f59769a.mo69727c();
            CharSequence charSequence = c29707v3.f59770b;
            String string = charSequence != null ? charSequence.toString() : null;
            CharSequence charSequence2 = c29707v3.f59771c;
            C29470F c29470f = new C29470F(strMo69727c, string, charSequence2 != null ? charSequence2.toString() : null, (String) null, Boolean.valueOf(c29707v3.f59769a.f59782c), "android_tetxt_cap_words", (String) null, (String) null, (List) null, 968);
            AbstractC29103d2 abstractC29103d3 = c29707v3.f59769a.f59781b;
            if (Intrinsics.areEqual(abstractC29103d3, C29059U0.f59007b)) {
                c28831z = new C28859q("geo+poa", c29470f, map == null ? MapsKt.emptyMap() : map, (String) null, !c29707v3.f59773e, c29707v3.f59772d, strValueOf);
            } else {
                if (Intrinsics.areEqual(abstractC29103d3, C29085a2.f59036b)) {
                    c28831z = new C28831Z(c29470f, "geo+poa", (String) null, !c29707v3.f59773e, c29707v3.f59772d, (List) null, strValueOf, 96);
                } else {
                    if (!Intrinsics.areEqual(abstractC29103d3, C29029M1.f58972b) && !Intrinsics.areEqual(abstractC29103d3, C29037O1.f58977b) && !Intrinsics.areEqual(abstractC29103d3, C29005G1.f58950b) && !Intrinsics.areEqual(abstractC29103d3, C29108e1.f59058b) && !Intrinsics.areEqual(abstractC29103d3, C29044Q0.f58980b)) {
                        if (Intrinsics.areEqual(abstractC29103d3, C29013I1.f58955b)) {
                            Map map3 = (Map) map2.get(str2 == null ? "" : str2);
                            if (map3 == null || (setEntrySet = map3.entrySet()) == null) {
                                i11 = i12;
                                arrayList = null;
                            } else {
                                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
                                for (Map.Entry entry : setEntrySet) {
                                    arrayList4.add(new C29494N((String) entry.getKey(), (String) entry.getValue()));
                                    i12 = i12;
                                }
                                i11 = i12;
                                arrayList = arrayList4;
                            }
                            if (arrayList != null && !arrayList.isEmpty()) {
                                boolean z11 = !c29707v3.f59773e;
                                CharSequence charSequence3 = c29707v3.f59772d;
                                String strMo69715b = c29707v3.f59769a.f59781b.mo69715b();
                                CharSequence charSequence4 = c29707v3.f59770b;
                                String string2 = charSequence4 != null ? charSequence4.toString() : null;
                                CharSequence charSequence5 = c29707v3.f59771c;
                                c28831z = new C28827V(new C29470F(strMo69715b, string2, charSequence5 != null ? charSequence5.toString() : null, (String) null, Boolean.valueOf(c29707v3.f59769a.f59782c), (String) null, (String) null, (String) null, arrayList, 744), "geo+poa", (String) null, z11, charSequence3, strValueOf);
                            } else {
                                c28831z = new C28831Z(c29470f, "geo+poa", (String) null, !c29707v3.f59773e, c29707v3.f59772d, (List) null, strValueOf, 96);
                            }
                        } else {
                            i11 = i12;
                            parcelable = null;
                        }
                    } else {
                        i11 = i12;
                        c28831z = new C28831Z(c29470f, "geo+poa", (String) null, false, c29707v3.f59772d, (List) null, strValueOf, 104);
                    }
                    parcelable = c28831z;
                }
                if (parcelable != null) {
                    arrayList3.add(parcelable);
                }
                i12 = i11;
            }
            i11 = i12;
            parcelable = c28831z;
            if (parcelable != null) {
                arrayList3.add(parcelable);
            }
            i12 = i11;
        }
        List list2 = arrayList3;
        if (!this.f62933s) {
            C28815I c28815i = new C28815I(c29983l.m70061a("sns_geolocation_form_documentFallback_text"), c29983l.m70061a("sns_geolocation_form_documentFallback_action_upload"), new C28850j());
            ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                }
                if (Intrinsics.areEqual(((AbstractC28841e0) listIterator.previous()).mo69642c().f59470e, Boolean.TRUE)) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            int i14 = iNextIndex + 1;
            List mutableList = CollectionsKt.toMutableList((Collection) arrayList3);
            mutableList.add(i14, c28815i);
            int size2 = mutableList.size() - 1;
            list2 = mutableList;
            if (i14 < size2) {
                mutableList.add(iNextIndex + 2, new C28867y("geo+poa"));
                list2 = mutableList;
            }
        }
        return list2;
    }
}
