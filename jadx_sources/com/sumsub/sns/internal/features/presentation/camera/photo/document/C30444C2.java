package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Size;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.internal.view.SupportMenu;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.C28135m;
import com.sumsub.sns.internal.core.common.C28383A0;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.camera.AbstractC28738e;
import com.sumsub.sns.internal.core.presentation.camera.C28732b;
import com.sumsub.sns.internal.core.presentation.camera.C28734c;
import com.sumsub.sns.internal.core.presentation.camera.C28736d;
import com.sumsub.sns.internal.core.presentation.camera.C28740f;
import com.sumsub.sns.internal.core.presentation.camera.CameraX$Mode;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29180q2;
import com.sumsub.sns.internal.features.data.model.common.C29015J;
import com.sumsub.sns.internal.features.data.model.common.C29050S;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29095c0;
import com.sumsub.sns.internal.features.data.model.common.C29115f2;
import com.sumsub.sns.internal.features.data.model.common.C29119g0;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.model.common.VideoRequiredType;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.presentation.camera.AbstractC30359W;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.sumsub.sns.internal.p126ml.autocapture.C33310d;
import com.sumsub.sns.internal.p126ml.autocapture.C33313g;
import com.sumsub.sns.internal.p126ml.badphotos.C33316c;
import com.sumsub.sns.internal.p126ml.badphotos.C33318e;
import com.sumsub.sns.internal.p126ml.badphotos.models.C33319a;
import com.sumsub.sns.internal.p126ml.core.AbstractC33335n;
import com.sumsub.sns.internal.p126ml.core.C33332k;
import com.sumsub.sns.internal.p126ml.core.C33333l;
import com.sumsub.sns.internal.p126ml.docdetector.C33350a;
import com.sumsub.sns.internal.p126ml.docdetector.C33353d;
import com.tencent.bugly.proguard.C33627eb;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.channels.C41568g;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.InterfaceC41565d;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.C2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30444C2 extends AbstractC30359W {

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ KProperty[] f61336U = {AbstractC28639a.m69485a(C30444C2.class, "collectedResults", "getCollectedResults()Ljava/util/List;", 0), AbstractC28639a.m69485a(C30444C2.class, "ffAutodocToggle", "getFfAutodocToggle()Z", 0), AbstractC28639a.m69485a(C30444C2.class, "useLegacyCamera", "getUseLegacyCamera()Z", 0), AbstractC28639a.m69485a(C30444C2.class, "autoCaptureRequired", "getAutoCaptureRequired()Z", 0)};

    /* JADX INFO: renamed from: A */
    public boolean f61337A;

    /* JADX INFO: renamed from: B */
    public boolean f61338B;

    /* JADX INFO: renamed from: C */
    public boolean f61339C;

    /* JADX INFO: renamed from: D */
    public boolean f61340D;

    /* JADX INFO: renamed from: E */
    public final C28936t f61341E;

    /* JADX INFO: renamed from: F */
    public boolean f61342F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC41669n f61343G;

    /* JADX INFO: renamed from: H */
    public boolean f61344H;

    /* JADX INFO: renamed from: I */
    public final boolean f61345I;

    /* JADX INFO: renamed from: J */
    public final List f61346J;

    /* JADX INFO: renamed from: K */
    public final boolean f61347K;

    /* JADX INFO: renamed from: L */
    public long f61348L;

    /* JADX INFO: renamed from: M */
    public boolean f61349M;

    /* JADX INFO: renamed from: N */
    public SNSPhotoDocumentPickerViewModel$PhotoCheckResult f61350N;

    /* JADX INFO: renamed from: O */
    public final InterfaceC41565d f61351O;

    /* JADX INFO: renamed from: P */
    public final InterfaceC41565d f61352P;

    /* JADX INFO: renamed from: Q */
    public boolean f61353Q;

    /* JADX INFO: renamed from: R */
    public C30480N f61354R;

    /* JADX INFO: renamed from: S */
    public boolean f61355S;

    /* JADX INFO: renamed from: T */
    public boolean f61356T;

    /* JADX INFO: renamed from: k */
    public final InterfaceC29984m f61357k;

    /* JADX INFO: renamed from: l */
    public final C33316c f61358l;

    /* JADX INFO: renamed from: m */
    public final C33353d f61359m;

    /* JADX INFO: renamed from: n */
    public final C33318e f61360n;

    /* JADX INFO: renamed from: o */
    public final C33310d f61361o;

    /* JADX INFO: renamed from: p */
    public final C33313g f61362p;

    /* JADX INFO: renamed from: q */
    public final SavedStateHandle f61363q;

    /* JADX INFO: renamed from: r */
    public boolean f61364r;

    /* JADX INFO: renamed from: s */
    public final C28936t f61365s;

    /* JADX INFO: renamed from: t */
    public boolean f61366t;

    /* JADX INFO: renamed from: u */
    public final Lazy f61367u;

    /* JADX INFO: renamed from: v */
    public final C28936t f61368v;

    /* JADX INFO: renamed from: w */
    public final C28936t f61369w;

    /* JADX INFO: renamed from: x */
    public final Lazy f61370x;

    /* JADX INFO: renamed from: y */
    public File f61371y;

    /* JADX INFO: renamed from: z */
    public boolean f61372z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List] */
    public C30444C2(C29070X c29070x, String str, String str2, boolean z11, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, C33316c c33316c, C33353d c33353d, C33318e c33318e, C33310d c33310d, C33313g c33313g, SavedStateHandle savedStateHandle) {
        ?? EmptyList;
        super(c29070x, str, str2, z11, interfaceC29953a, interfaceC29984m, savedStateHandle);
        this.f61357k = interfaceC29984m;
        this.f61358l = c33316c;
        this.f61359m = c33353d;
        this.f61360n = c33318e;
        this.f61361o = c33310d;
        this.f61362p = c33313g;
        this.f61363q = savedStateHandle;
        this.f61365s = new C28936t(savedStateHandle, "key_collected_results", CollectionsKt.emptyList(), false);
        this.f61367u = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.j3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C30444C2.m70324a(this.f61751b));
            }
        });
        this.f61368v = new C28936t(savedStateHandle, "ffAutodocToggle", Boolean.valueOf(C33048a.f67487t.m71434a()), true);
        Boolean bool = Boolean.FALSE;
        this.f61369w = new C28936t(savedStateHandle, "key_use_legacy_camera", bool, false);
        this.f61370x = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.k3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30444C2.m70325b(this.f61760b);
            }
        });
        this.f61341E = new C28936t(savedStateHandle, "autoCaptureRequired", bool, false);
        this.f61343G = C41679x.m91009a(new C30486P(null, new C30483O(null, null, null, null), null, null, null));
        Boolean bool2 = (Boolean) savedStateHandle.get("EXTRA_IS_RETAKE");
        this.f61345I = bool2 != null ? bool2.booleanValue() : false;
        List<String> list = (List) savedStateHandle.get("EXTRA_DOCUMENT_SIDES");
        if (list != null) {
            EmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (String str3 : list) {
                IdentitySide.Companion.getClass();
                IdentitySide identitySideM69768a = C29115f2.m69768a(str3);
                if (identitySideM69768a == null) {
                    identitySideM69768a = IdentitySide.Front;
                }
                EmptyList.add(identitySideM69768a);
            }
        } else {
            EmptyList = CollectionsKt.emptyList();
        }
        this.f61346J = EmptyList;
        Boolean bool3 = (Boolean) this.f61363q.get("EXTRA_IS_SEAMLESS");
        this.f61347K = bool3 != null ? bool3.booleanValue() : false;
        this.f61348L = Long.MIN_VALUE;
        this.f61351O = C41568g.m90691b(0, null, null, 7, null);
        this.f61352P = C41568g.m90691b(0, null, null, 7, null);
    }

    /* JADX INFO: renamed from: b */
    public static final C30518a m70325b(C30444C2 c30444c2) {
        return new C30518a(c30444c2.f61361o, 0);
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m70326c(C30444C2 c30444c2) {
        c30444c2.f61339C = false;
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "photo animation finished", null);
        AbstractC28073M0.updateState$default(c30444c2, false, new C30454F0(null), 1, null);
        C41696j.m91104d(ViewModelKt.getViewModelScope(c30444c2), null, null, new C30458G0(c30444c2, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final Object m70333a(Context context, File file, boolean z11, C30510X0 c30510x0) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "Picture is taken. Side - " + ((IdentitySide) this.f61060f.get("current_side")), null);
        C29054T c29054t = new C29054T(file, file, null, null, (IdentitySide) this.f61060f.get("current_side"), Boxing.boxBoolean(z11), null, 940);
        List mutableList = CollectionsKt.toMutableList((Collection) m70356i());
        mutableList.add(c29054t);
        C28936t c28936t = this.f61365s;
        KProperty kProperty = f61336U[0];
        c28936t.f58834a.set(c28936t.f58835b, mutableList);
        if (!this.f61347K) {
            showProgress(true);
            AbstractC28073M0.updateState$default(this, false, new C30660z0(null), 1, null);
            AbstractC28052C.finish$default(this, null, c29054t, null, null, 13, null);
            return Unit.INSTANCE;
        }
        boolean z12 = this.f61338B;
        if (this.f61346J.isEmpty() || this.f61346J.size() <= m70356i().size()) {
            if (m70356i().size() != 1 || z12) {
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30434A0(this, null), 3, null);
                return Unit.INSTANCE;
            }
            Object objM70347b = m70347b(context, c30510x0);
            return objM70347b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70347b : Unit.INSTANCE;
        }
        if (m70356i().size() != 1 || z12) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30438B0(this, null), 3, null);
            return Unit.INSTANCE;
        }
        Object objM70334a = m70334a(context, c30510x0);
        return objM70334a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70334a : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m70352d(ContinuationImpl continuationImpl) {
        C30603o0 c30603o0;
        Boolean boolBoxBoolean;
        C30531c0 c30531c0;
        String str;
        C30531c0 c30531c1;
        String str2;
        if (continuationImpl instanceof C30603o0) {
            c30603o0 = (C30603o0) continuationImpl;
            int i11 = c30603o0.f61825f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30603o0.f61825f = i11 - Integer.MIN_VALUE;
            } else {
                c30603o0 = new C30603o0(this, continuationImpl);
            }
        } else {
            c30603o0 = new C30603o0(this, continuationImpl);
        }
        Object obj = c30603o0.f61823d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30603o0.f61825f;
        String str3 = C33627eb.f69716f;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C30531c0 c30531c2 = new C30531c0(this.f61371y, this.f61337A);
            if (!this.f61347K) {
                c30531c2 = null;
            }
            boolBoxBoolean = Boxing.boxBoolean(false);
            c30603o0.f61820a = c30531c2;
            c30603o0.f61821b = boolBoxBoolean;
            c30603o0.f61825f = 1;
            Object string = getString("sns_autocapture_action_auto", c30603o0);
            if (string != coroutine_suspended) {
                c30531c0 = c30531c2;
                obj = string;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            boolBoxBoolean = c30603o0.f61821b;
            c30531c0 = c30603o0.f61820a;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c30603o0.f61822c;
            boolBoxBoolean = c30603o0.f61821b;
            C30531c0 c30531c3 = c30603o0.f61820a;
            ResultKt.throwOnFailure(obj);
            c30531c1 = c30531c3;
        }
        str2 = (String) obj;
        if (str2 != null) {
            str3 = str2;
        }
        return new C30486P(c30531c1, new C30483O(boolBoxBoolean, str, str3, Boxing.boxBoolean(true)), null, null, null);
        String str4 = (String) obj;
        if (str4 == null) {
            str4 = C33627eb.f69716f;
        }
        c30603o0.f61820a = c30531c0;
        c30603o0.f61821b = boolBoxBoolean;
        c30603o0.f61822c = str4;
        c30603o0.f61825f = 2;
        Object string2 = getString("sns_autocapture_action_manual", c30603o0);
        if (string2 != coroutine_suspended) {
            str = str4;
            obj = string2;
            c30531c1 = c30531c0;
            str2 = (String) obj;
            if (str2 != null) {
                str3 = str2;
            }
            return new C30486P(c30531c1, new C30483O(boolBoxBoolean, str, str3, Boxing.boxBoolean(true)), null, null, null);
        }
        return coroutine_suspended;
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30359W
    /* JADX INFO: renamed from: e */
    public final Size mo70249e() {
        Size size = this.f61361o.f67922k;
        if (size != null) {
            if (!this.f61342F) {
                size = null;
            }
            if (size != null) {
                return size;
            }
        }
        return null;
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30359W
    /* JADX INFO: renamed from: f */
    public final C28732b mo70250f() {
        C33313g c33313g = this.f61362p;
        return new C28732b(c33313g.f67926a, AbstractC30566i.m70409a(c33313g.f67928c), AbstractC30566i.m70409a(this.f61362p.f67929d), TimeUnit.SECONDS.toMillis(this.f61362p.f67927b), ((long) this.f61362p.f67930e) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30359W
    /* JADX INFO: renamed from: g */
    public final void mo70251g() {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "onTakePictureClicked", null);
        this.f61339C = true;
        int i11 = AbstractC30537d0.f61663a[m70355h().ordinal()];
        if (i11 == 1) {
            super.mo70251g();
        } else if (i11 != 2) {
            this.f61344H = true;
        } else {
            this.f61344H = true;
            super.mo70251g();
        }
        fireEvent(new C30519a0(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.i3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30444C2.m70326c(this.f61736b);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public final CameraX$Mode m70355h() {
        CameraX$Mode cameraX$Mode;
        if (this.f61347K) {
            C28936t c28936t = this.f61369w;
            KProperty kProperty = f61336U[2];
            cameraX$Mode = ((Boolean) c28936t.m69705a()).booleanValue() ? CameraX$Mode.SEAMLESS_DOC_CAPTURE_LEGACY : CameraX$Mode.SEAMLESS_DOC_CAPTURE;
        } else {
            C28936t c28936t2 = this.f61341E;
            KProperty kProperty2 = f61336U[3];
            if (((Boolean) c28936t2.m69705a()).booleanValue()) {
                cameraX$Mode = CameraX$Mode.PHOTO_AND_ANALYZER;
                if (!this.f61361o.f67923l) {
                    cameraX$Mode = null;
                }
                if (cameraX$Mode == null) {
                    cameraX$Mode = CameraX$Mode.ANALYZER;
                }
            } else {
                cameraX$Mode = CameraX$Mode.PHOTO;
            }
        }
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "cameraMode: " + cameraX$Mode, null);
        return cameraX$Mode;
    }

    /* JADX INFO: renamed from: i */
    public final List m70356i() {
        C28936t c28936t = this.f61365s;
        KProperty kProperty = f61336U[0];
        return (List) c28936t.m69705a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ca, code lost:
    
        if (m70354f(r0) == r1) goto L30;
     */
    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30359W, com.sumsub.sns.core.presentation.base.AbstractC28073M0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onPrepare(Continuation continuation) {
        C30442C0 c30442c0;
        C30444C2 c30444c2;
        if (continuation instanceof C30442C0) {
            c30442c0 = (C30442C0) continuation;
            int i11 = c30442c0.f61333d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30442c0.f61333d = i11 - Integer.MIN_VALUE;
            } else {
                c30442c0 = new C30442C0(this, (ContinuationImpl) continuation);
            }
        } else {
            c30442c0 = new C30442C0(this, (ContinuationImpl) continuation);
        }
        Object objM70348b = c30442c0.f61331b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30442c0.f61333d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70348b);
            c30442c0.f61333d = 1;
            if (AbstractC30359W.m70243a(this, c30442c0) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM70348b);
        } else if (i12 == 2) {
            c30444c2 = c30442c0.f61330a;
            ResultKt.throwOnFailure(objM70348b);
            Boolean bool = (Boolean) objM70348b;
            bool.getClass();
            C28936t c28936t = c30444c2.f61341E;
            KProperty kProperty = f61336U[3];
            c28936t.f58834a.set(c28936t.f58835b, bool);
            c30442c0.f61330a = null;
            c30442c0.f61333d = 3;
        } else {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70348b);
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30597n0(this, new C30446D0(this, null), null), 3, null);
        return Unit.INSTANCE;
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "onPrepare: docType: " + this.f61055a + ", idType: " + this.f61056b + ", sides: " + this.f61346J, null);
        IdentitySide identitySide = (IdentitySide) CollectionsKt.firstOrNull(this.f61346J);
        if (identitySide == null) {
            identitySide = IdentitySide.Front;
        }
        m70246a(identitySide);
        List listEmptyList = CollectionsKt.emptyList();
        C28936t c28936t2 = this.f61365s;
        KProperty kProperty2 = f61336U[0];
        c28936t2.f58834a.set(c28936t2.f58835b, listEmptyList);
        c30442c0.f61330a = this;
        c30442c0.f61333d = 2;
        objM70348b = m70348b(c30442c0);
        if (objM70348b != coroutine_suspended) {
            c30444c2 = this;
            Boolean bool2 = (Boolean) objM70348b;
            bool2.getClass();
            C28936t c28936t3 = c30444c2.f61341E;
            KProperty kProperty3 = f61336U[3];
            c28936t3.f58834a.set(c28936t3.f58835b, bool2);
            c30442c0.f61330a = null;
            c30442c0.f61333d = 3;
        }
        return coroutine_suspended;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30609p0(this, null), 3, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onHandleError(AbstractC29149l0 abstractC29149l0) {
        AbstractC30506W abstractC30506W;
        Parcelable parcelableMo69766d = abstractC29149l0.mo69766d();
        if (parcelableMo69766d instanceof AbstractC30506W) {
            abstractC30506W = (AbstractC30506W) parcelableMo69766d;
        } else {
            abstractC30506W = null;
        }
        if (abstractC30506W != null) {
            m70344a(abstractC30506W);
        } else {
            super.onHandleError(abstractC29149l0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m70349b(File file) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "onVideoRecordingStarted: " + file, null);
        this.f61364r = false;
        this.f61337A = true;
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30469J0(this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:
    
        if (r15 == r1) goto L39;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70353e(ContinuationImpl continuationImpl) {
        C30484O0 c30484o0;
        InterfaceC41669n interfaceC41669n;
        DocCapture$PreferredMode docCapture$PreferredMode;
        if (continuationImpl instanceof C30484O0) {
            c30484o0 = (C30484O0) continuationImpl;
            int i11 = c30484o0.f61533d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30484o0.f61533d = i11 - Integer.MIN_VALUE;
            } else {
                c30484o0 = new C30484O0(this, continuationImpl);
            }
        } else {
            c30484o0 = new C30484O0(this, continuationImpl);
        }
        Object objM70352d = c30484o0.f61531b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30484o0.f61533d;
        boolean z11 = false;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70352d);
            interfaceC41669n = this.f61343G;
            c30484o0.f61530a = interfaceC41669n;
            c30484o0.f61533d = 1;
            objM70352d = m70352d(c30484o0);
            if (objM70352d != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            interfaceC41669n = c30484o0.f61530a;
            ResultKt.throwOnFailure(objM70352d);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70352d);
        }
        AbstractC29172p abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70352d).m70051c();
        if (abstractC29172p == null) {
            C33272c.f67816e.f67810a.mo68956e("DocCapture", "showInitialViewState: error. Applicant null", null);
            finishAbnormal("showInitialViewState: error. Applicant null");
            return Unit.INSTANCE;
        }
        AbstractC29180q2 abstractC29180q2 = (AbstractC29180q2) CollectionsKt.firstOrNull(abstractC29172p.m69796b(this.f61055a));
        if (((IdentitySide) this.f61060f.get("current_side")) == IdentitySide.Back) {
            boolean z12 = this.f61342F;
            if (z12 && !this.f61345I) {
                z11 = true;
            }
            this.f61366t = z11;
            if (!z12 && !this.f61345I) {
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30487P0(this, null), 3, null);
            }
        }
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "SDK is using - " + abstractC29180q2, null);
        return Unit.INSTANCE;
        interfaceC41669n.setValue(C30486P.m70403a((C30486P) objM70352d, null, null, null, null, null, 23));
        if (this.f61342F) {
            if (m70355h() == CameraX$Mode.SEAMLESS_DOC_CAPTURE_LEGACY) {
                docCapture$PreferredMode = DocCapture$PreferredMode.MANUAL;
            } else {
                String str = (String) this.f61363q.get("EXTRA_PREFER_AUTO_CAPTURE");
                if (str == null) {
                    docCapture$PreferredMode = null;
                    break;
                }
                DocCapture$PreferredMode.Companion.getClass();
                DocCapture$PreferredMode[] docCapture$PreferredModeArrValues = DocCapture$PreferredMode.values();
                int length = docCapture$PreferredModeArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        docCapture$PreferredMode = null;
                        break;
                    }
                    DocCapture$PreferredMode docCapture$PreferredMode2 = docCapture$PreferredModeArrValues[i13];
                    if (Intrinsics.areEqual(docCapture$PreferredMode2.getValue(), str)) {
                        docCapture$PreferredMode = docCapture$PreferredMode2;
                        break;
                    }
                    i13++;
                }
            }
            if (docCapture$PreferredMode != DocCapture$PreferredMode.MANUAL) {
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30498T0(this, null), 3, null);
            } else {
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30504V0(this, this.f61342F, null), 3, null);
            }
        } else {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30504V0(this, this.f61342F, null), 3, null);
        }
        InterfaceC29984m interfaceC29984m = this.f61357k;
        c30484o0.f61530a = null;
        c30484o0.f61533d = 2;
        objM70352d = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c30484o0);
    }

    /* JADX INFO: renamed from: c */
    public final void m70351c(boolean z11) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "onAutoEnabled: " + z11, null);
        if (z11) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30498T0(this, null), 3, null);
        } else {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30504V0(this, true, null), 3, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m70348b(ContinuationImpl continuationImpl) {
        C30549f0 c30549f0;
        Object next;
        DocCapture$PreferredMode docCapture$PreferredMode;
        if (continuationImpl instanceof C30549f0) {
            c30549f0 = (C30549f0) continuationImpl;
            int i11 = c30549f0.f61699c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30549f0.f61699c = i11 - Integer.MIN_VALUE;
            } else {
                c30549f0 = new C30549f0(this, continuationImpl);
            }
        } else {
            c30549f0 = new C30549f0(this, continuationImpl);
        }
        Object objM70042a = c30549f0.f61697a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30549f0.f61699c;
        boolean z11 = false;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            InterfaceC29984m interfaceC29984m = this.f61357k;
            c30549f0.f61699c = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c30549f0);
            if (objM70042a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70042a);
        }
        AbstractC29172p abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70050b();
        if (abstractC29172p == null) {
            return Boxing.boxBoolean(false);
        }
        Iterator it = abstractC29172p.mo69760k().f59151a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((C29154m) next).f59132a, this.f61055a));
        C29154m c29154m = (C29154m) next;
        boolean z12 = c29154m != null && c29154m.m69787a() && Intrinsics.areEqual(c29154m.f59135d, VideoRequiredType.DocCapture.getValue());
        boolean zBooleanValue = ((Boolean) this.f61367u.getValue()).booleanValue();
        boolean z13 = this.f61347K;
        if (m70355h() == CameraX$Mode.SEAMLESS_DOC_CAPTURE_LEGACY) {
            docCapture$PreferredMode = DocCapture$PreferredMode.MANUAL;
        } else {
            String str = (String) this.f61363q.get("EXTRA_PREFER_AUTO_CAPTURE");
            if (str == null) {
                docCapture$PreferredMode = null;
                break;
            }
            DocCapture$PreferredMode.Companion.getClass();
            DocCapture$PreferredMode[] docCapture$PreferredModeArrValues = DocCapture$PreferredMode.values();
            int length = docCapture$PreferredModeArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    docCapture$PreferredMode = null;
                    break;
                }
                DocCapture$PreferredMode docCapture$PreferredMode2 = docCapture$PreferredModeArrValues[i13];
                if (Intrinsics.areEqual(docCapture$PreferredMode2.getValue(), str)) {
                    docCapture$PreferredMode = docCapture$PreferredMode2;
                    break;
                }
                i13++;
            }
        }
        String value = docCapture$PreferredMode != null ? docCapture$PreferredMode.getValue() : null;
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "checkAutoCaptureAllowedForStep: auto capture ff.enabled=" + zBooleanValue + ", level.autoEnabled=" + z12 + ", seamlessDocapture.enabled=" + z13 + ", preferredMode=" + value + ", isRetake=" + this.f61345I, null);
        if (((Boolean) this.f61367u.getValue()).booleanValue() && z12) {
            z11 = true;
        }
        return Boxing.boxBoolean(z11);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m70327d(C30444C2 c30444c2) {
        InterfaceC41669n interfaceC41669n = c30444c2.f61343G;
        interfaceC41669n.setValue(C30486P.m70403a((C30486P) interfaceC41669n.getValue(), null, null, null, null, null, 23));
        c30444c2.m70246a((IdentitySide) c30444c2.f61346J.get(c30444c2.m70356i().size()));
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "requestDocumentNextSide: " + ((IdentitySide) c30444c2.f61060f.get("current_side")), null);
        AbstractC28073M0.updateState$default(c30444c2, false, new C30472K0(c30444c2, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: c */
    public final Object m70350c(ContinuationImpl continuationImpl) {
        C30573j0 c30573j0;
        C30486P c30486p;
        InterfaceC41669n interfaceC41669n;
        String str;
        InterfaceC41669n interfaceC41669n2;
        C30489Q c30489q;
        C30486P c30486p2;
        if (continuationImpl instanceof C30573j0) {
            c30573j0 = (C30573j0) continuationImpl;
            int i11 = c30573j0.f61748f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30573j0.f61748f = i11 - Integer.MIN_VALUE;
            } else {
                c30573j0 = new C30573j0(this, continuationImpl);
            }
        } else {
            c30573j0 = new C30573j0(this, continuationImpl);
        }
        Object objM70337a = c30573j0.f61746d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30573j0.f61748f;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70337a);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "finishWithCurrentResults: isCapturingVideo=" + this.f61337A, null);
            if (this.f61337A) {
                this.f61372z = true;
                InterfaceC41669n interfaceC41669n3 = this.f61343G;
                c30486p = (C30486P) interfaceC41669n3.getValue();
                String imageName = SNSIconHandler.SNSCommonIcons.SUCCESS_CHECK.getImageName();
                c30573j0.f61743a = c30486p;
                c30573j0.f61744b = interfaceC41669n3;
                c30573j0.f61745c = imageName;
                c30573j0.f61748f = 1;
                Object string = getString("sns_instructions_hint_allSet", c30573j0);
                if (string != coroutine_suspended) {
                    interfaceC41669n = interfaceC41669n3;
                    objM70337a = string;
                    str = imageName;
                }
                return coroutine_suspended;
            }
            AbstractC28052C.finish$default(this, null, new C29015J(m70356i(), true), null, null, 13, null);
            return Unit.INSTANCE;
        }
        if (i12 == 1) {
            String str2 = (String) c30573j0.f61745c;
            interfaceC41669n = (InterfaceC41669n) c30573j0.f61744b;
            C30486P c30486p3 = c30573j0.f61743a;
            ResultKt.throwOnFailure(objM70337a);
            str = str2;
            c30486p = c30486p3;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC41669n2 = (InterfaceC41669n) c30573j0.f61745c;
            C30489Q c30489q2 = (C30489Q) c30573j0.f61744b;
            C30486P c30486p4 = c30573j0.f61743a;
            ResultKt.throwOnFailure(objM70337a);
            c30486p2 = c30486p4;
            c30489q = c30489q2;
        }
        interfaceC41669n2.setValue(C30486P.m70403a(c30486p2, null, null, new C30477M(C33627eb.f69716f, ((C30477M) objM70337a).f61512b, SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State.DEFAULT), c30489q, null, 19));
        AbstractC28073M0.updateState$default(this, false, new C30579k0(null), 1, null);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30585l0(this, null), 3, null);
        return Unit.INSTANCE;
        String str3 = (String) objM70337a;
        if (str3 == null) {
            str3 = C33627eb.f69716f;
        }
        C30489Q c30489q3 = new C30489Q(str, str3, 0);
        C30536d c30536d = new C30536d(false, CheckDetectionResult$SizeCheckResult.SMALL, false);
        c30573j0.f61743a = c30486p;
        c30573j0.f61744b = c30489q3;
        c30573j0.f61745c = interfaceC41669n;
        c30573j0.f61748f = 2;
        objM70337a = m70337a(c30536d, false, (ContinuationImpl) c30573j0);
        if (objM70337a != coroutine_suspended) {
            interfaceC41669n2 = interfaceC41669n;
            c30489q = c30489q3;
            c30486p2 = c30486p;
            interfaceC41669n2.setValue(C30486P.m70403a(c30486p2, null, null, new C30477M(C33627eb.f69716f, ((C30477M) objM70337a).f61512b, SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State.DEFAULT), c30489q, null, 19));
            AbstractC28073M0.updateState$default(this, false, new C30579k0(null), 1, null);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30585l0(this, null), 3, null);
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m70354f(ContinuationImpl continuationImpl) {
        C30490Q0 c30490q0;
        C30486P c30486p;
        C30477M c30477m;
        InterfaceC41669n interfaceC41669n;
        String str;
        if (continuationImpl instanceof C30490Q0) {
            c30490q0 = (C30490Q0) continuationImpl;
            int i11 = c30490q0.f61555g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30490q0.f61555g = i11 - Integer.MIN_VALUE;
            } else {
                c30490q0 = new C30490Q0(this, continuationImpl);
            }
        } else {
            c30490q0 = new C30490Q0(this, continuationImpl);
        }
        Object obj = c30490q0.f61553e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30490q0.f61555g;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "showWaitPopup", null);
            InterfaceC41669n interfaceC41669n2 = this.f61343G;
            c30486p = (C30486P) interfaceC41669n2.getValue();
            c30477m = new C30477M();
            if (!this.f61338B) {
                c30477m = null;
            }
            c30490q0.f61549a = interfaceC41669n2;
            c30490q0.f61550b = c30486p;
            c30490q0.f61551c = c30477m;
            c30490q0.f61552d = "";
            c30490q0.f61555g = 1;
            Object string = getString("sns_general_progress_text", c30490q0);
            if (string == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC41669n = interfaceC41669n2;
            obj = string;
            str = "";
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c30490q0.f61552d;
            c30477m = c30490q0.f61551c;
            c30486p = c30490q0.f61550b;
            interfaceC41669n = c30490q0.f61549a;
            ResultKt.throwOnFailure(obj);
        }
        C30477M c30477m2 = c30477m;
        String str2 = (String) obj;
        if (str2 == null) {
            str2 = C33627eb.f69716f;
        }
        interfaceC41669n.setValue(C30486P.m70403a(c30486p, null, null, c30477m2, new C30489Q(str, str2), null, 19));
        AbstractC28073M0.updateState$default(this, false, new C30492R0(null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007b A[PHI: r9
      0x007b: PHI (r9v12 java.lang.String) = (r9v6 java.lang.String), (r9v11 java.lang.String), (r9v14 java.lang.String) binds: [B:34:0x0078, B:30:0x0071, B:41:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (r9 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        if (r9 == r1) goto L39;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m70320a(C30444C2 c30444c2, C28734c c28734c, ContinuationImpl continuationImpl) {
        C30591m0 c30591m0;
        String str;
        c30444c2.getClass();
        if (continuationImpl instanceof C30591m0) {
            c30591m0 = (C30591m0) continuationImpl;
            int i11 = c30591m0.f61786d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30591m0.f61786d = i11 - Integer.MIN_VALUE;
            } else {
                c30591m0 = new C30591m0(c30444c2, continuationImpl);
            }
        } else {
            c30591m0 = new C30591m0(c30444c2, continuationImpl);
        }
        Object string = c30591m0.f61784b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30591m0.f61786d;
        String str2 = C33627eb.f69716f;
        if (i12 == 0) {
            ResultKt.throwOnFailure(string);
            c30591m0.f61783a = c28734c;
            c30591m0.f61786d = 1;
            string = c30444c2.getString("sns_seamless_error_general", c30591m0);
            if (string != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(string);
                str = (String) string;
                if (str != null) {
                    str2 = str;
                }
                c30444c2.m70343a(new C30503V(str2));
                return Unit.INSTANCE;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(string);
            str = (String) string;
            if (str != null) {
                str2 = str;
            }
            c30444c2.m70343a(new C30503V(str2));
            return Unit.INSTANCE;
        }
        c28734c = c30591m0.f61783a;
        ResultKt.throwOnFailure(string);
        str = (String) string;
        if (str == null) {
            str = C33627eb.f69716f;
        }
        int i13 = c28734c.f58436a;
        if (i13 == 3) {
            c30591m0.f61783a = null;
            c30591m0.f61786d = 2;
            string = c30444c2.getString("sns_seamless_error_notEnoughStorage", c30591m0);
        } else {
            if (i13 == 9 || i13 == 2) {
                c30591m0.f61783a = null;
                c30591m0.f61786d = 3;
                string = c30444c2.getString("sns_seamless_error_timeExceeded", c30591m0);
            } else {
                str2 = str;
            }
            c30444c2.m70343a(new C30503V(str2));
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
    
        if (m70329a(r12, r3, r11, r4, r6) == r0) goto L39;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70346b(Context context, Bitmap bitmap, ContinuationImpl continuationImpl) {
        C30450E0 c30450e0;
        Context context2;
        Bitmap bitmap2;
        Bitmap bitmap3;
        C30497T c30497t;
        C30497T c30497t2;
        if (continuationImpl instanceof C30450E0) {
            c30450e0 = (C30450E0) continuationImpl;
            int i11 = c30450e0.f61388e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30450e0.f61388e = i11 - Integer.MIN_VALUE;
            } else {
                c30450e0 = new C30450E0(this, continuationImpl);
            }
        } else {
            c30450e0 = new C30450E0(this, continuationImpl);
        }
        C30450E0 c30450e1 = c30450e0;
        Object objM70335a = c30450e1.f61386c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30450e1.f61388e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70335a);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "onRequestedPictureTaken: waiting=" + this.f61339C, null);
            this.f61344H = false;
            if (this.f61339C) {
                InterfaceC41565d interfaceC41565d = this.f61352P;
                c30450e1.f61384a = context;
                c30450e1.f61385b = bitmap;
                c30450e1.f61388e = 1;
                if (interfaceC41565d.mo90550D(c30450e1) != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            bitmap = c30450e1.f61385b;
            context = c30450e1.f61384a;
            ResultKt.throwOnFailure(objM70335a);
        } else if (i12 == 2) {
            bitmap2 = c30450e1.f61385b;
            context2 = c30450e1.f61384a;
            ResultKt.throwOnFailure(objM70335a);
            c30497t2 = (C30497T) objM70335a;
            if (c30497t2 != null) {
                c30497t = new C30497T(c30497t2.f61570a, false, c30497t2.f61572c, c30497t2.f61573d);
                bitmap3 = bitmap2;
            } else {
                Context context3 = context2;
                bitmap = bitmap2;
                context = context3;
                bitmap3 = bitmap;
                c30497t = null;
                context2 = context;
            }
            Rect rect = new Rect(0, 0, 0, 0);
            c30450e1.f61384a = null;
            c30450e1.f61385b = null;
            c30450e1.f61388e = 3;
        } else {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70335a);
        }
        return Unit.INSTANCE;
        if (this.f61347K || this.f61342F) {
            c30450e1.f61384a = context;
            c30450e1.f61385b = bitmap;
            c30450e1.f61388e = 2;
            objM70335a = m70335a(bitmap, true, (ContinuationImpl) c30450e1);
            if (objM70335a != coroutine_suspended) {
                Bitmap bitmap4 = bitmap;
                context2 = context;
                bitmap2 = bitmap4;
                c30497t2 = (C30497T) objM70335a;
                if (c30497t2 != null) {
                    c30497t = new C30497T(c30497t2.f61570a, false, c30497t2.f61572c, c30497t2.f61573d);
                    bitmap3 = bitmap2;
                } else {
                    Context context4 = context2;
                    bitmap = bitmap2;
                    context = context4;
                    bitmap3 = bitmap;
                    c30497t = null;
                    context2 = context;
                }
                Rect rect2 = new Rect(0, 0, 0, 0);
                c30450e1.f61384a = null;
                c30450e1.f61385b = null;
                c30450e1.f61388e = 3;
            }
        } else {
            bitmap3 = bitmap;
            c30497t = null;
            context2 = context;
            Rect rect3 = new Rect(0, 0, 0, 0);
            c30450e1.f61384a = null;
            c30450e1.f61385b = null;
            c30450e1.f61388e = 3;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: a */
    public final void m70340a(Context context) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "initiateVideoRecord", null);
        File externalCacheDir = C28468k0.f57988f ? context.getExternalCacheDir() : null;
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        this.f61371y = new File(externalCacheDir, "docapture_" + UUID.randomUUID() + ".mp4");
        InterfaceC41669n interfaceC41669n = this.f61343G;
        interfaceC41669n.setValue(C30486P.m70403a((C30486P) interfaceC41669n.getValue(), new C30531c0(this.f61371y, true), null, null, null, null, 30));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0076 A[PHI: r11
      0x0076: PHI (r11v4 java.lang.Object) = (r11v3 java.lang.Object), (r11v11 java.lang.Object) binds: [B:29:0x0073, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(2000, r0) == r1) goto L37;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70347b(Context context, ContinuationImpl continuationImpl) {
        C30646w0 c30646w0;
        Object objMo90611p;
        if (continuationImpl instanceof C30646w0) {
            c30646w0 = (C30646w0) continuationImpl;
            int i11 = c30646w0.f61926d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30646w0.f61926d = i11 - Integer.MIN_VALUE;
            } else {
                c30646w0 = new C30646w0(this, continuationImpl);
            }
        } else {
            c30646w0 = new C30646w0(this, continuationImpl);
        }
        Object obj = c30646w0.f61924b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30646w0.f61926d;
        if (i12 != 0) {
            if (i12 == 1) {
                context = c30646w0.f61923a;
                ResultKt.throwOnFailure(obj);
                if (this.f61347K && this.f61371y == null) {
                    this.f61364r = true;
                    m70340a(context);
                }
                InterfaceC41565d interfaceC41565d = this.f61351O;
                c30646w0.f61923a = null;
                c30646w0.f61926d = 2;
                objMo90611p = interfaceC41565d.mo90611p(c30646w0);
                if (objMo90611p != coroutine_suspended) {
                    if (ChannelResult.m90676i(objMo90611p)) {
                        return Unit.INSTANCE;
                    }
                    c30646w0.f61926d = 3;
                }
                return coroutine_suspended;
            }
            if (i12 == 2) {
                ResultKt.throwOnFailure(obj);
                objMo90611p = ((ChannelResult) obj).getHolder();
                if (ChannelResult.m90676i(objMo90611p)) {
                    return Unit.INSTANCE;
                }
                c30646w0.f61926d = 3;
            } else {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30650x0(this, null), 3, null);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        this.f61355S = true;
        if (!this.f61337A) {
            c30646w0.f61923a = context;
            c30646w0.f61926d = 1;
            if (m70354f(c30646w0) != coroutine_suspended) {
                if (this.f61347K) {
                    this.f61364r = true;
                    m70340a(context);
                }
                InterfaceC41565d interfaceC41565d2 = this.f61351O;
                c30646w0.f61923a = null;
                c30646w0.f61926d = 2;
                objMo90611p = interfaceC41565d2.mo90611p(c30646w0);
                if (objMo90611p != coroutine_suspended) {
                    if (ChannelResult.m90676i(objMo90611p)) {
                        return Unit.INSTANCE;
                    }
                    c30646w0.f61926d = 3;
                }
            }
            return coroutine_suspended;
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30650x0(this, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70321a(C30444C2 c30444c2, Context context, C30480N c30480n, Rect rect, InterfaceC41565d interfaceC41565d) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "photo animation finished", null);
        C41696j.m91104d(ViewModelKt.getViewModelScope(c30444c2), null, null, new C30507W0(c30444c2, context, c30480n, rect, interfaceC41565d, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m70324a(C30444C2 c30444c2) {
        if (!c30444c2.f61347K) {
            C28936t c28936t = c30444c2.f61368v;
            KProperty kProperty = f61336U[1];
            if (!((Boolean) c28936t.m69705a()).booleanValue()) {
                return false;
            }
        }
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX INFO: renamed from: a */
    public final void m70344a(AbstractC30506W abstractC30506W) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "handleVideoRecordError: " + abstractC30506W, null);
        fireEvent(C30512Y.f61612a);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30359W
    /* JADX INFO: renamed from: a */
    public final void mo70248a(File file) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "onPictureTaken: waiting=" + this.f61339C, null);
        if (this.f61339C) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30655y0(this, file, null), 3, null);
        } else {
            super.mo70248a(file);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0291  */
    /* JADX WARN: Code duplicated, block: B:103:0x0293 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x029d  */
    /* JADX WARN: Code duplicated, block: B:110:0x02a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:116:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:119:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:123:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:125:0x0300  */
    /* JADX WARN: Code duplicated, block: B:128:0x0314  */
    /* JADX WARN: Code duplicated, block: B:130:0x0318  */
    /* JADX WARN: Code duplicated, block: B:131:0x031b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x031d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0320  */
    /* JADX WARN: Code duplicated, block: B:134:0x0323  */
    /* JADX WARN: Code duplicated, block: B:138:0x0339 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x0154  */
    /* JADX WARN: Code duplicated, block: B:62:0x0184  */
    /* JADX WARN: Code duplicated, block: B:63:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:76:0x0218  */
    /* JADX WARN: Code duplicated, block: B:77:0x021a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:84:0x022a  */
    /* JADX WARN: Code duplicated, block: B:86:0x022d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0264  */
    /* JADX WARN: Code duplicated, block: B:91:0x0276  */
    /* JADX WARN: Code duplicated, block: B:98:0x0288  */
    /* JADX WARN: Code duplicated, block: B:99:0x028b  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d0, code lost:
    
        if (m70346b(r1, r2, r4) == r5) goto L137;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x02dc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:86:0x022d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70330a(Context context, Bitmap bitmap, Rect rect, ContinuationImpl continuationImpl) throws IOException {
        C30631t0 c30631t0;
        boolean z11;
        long jCurrentTimeMillis;
        Rect rect2;
        C33350a c33350a;
        C30536d c30536d;
        C30480N c30480n;
        int i11;
        int i12;
        boolean zBooleanValue;
        Bitmap bitmap2;
        int i13;
        C30536d c30536d2;
        Rect rect3;
        Context context2;
        int i14;
        float width;
        float height;
        SNSPhotoDocumentPickerViewModel$FrameHandleResult sNSPhotoDocumentPickerViewModel$FrameHandleResult;
        SNSPhotoDocumentPickerViewModel$PhotoCheckResult sNSPhotoDocumentPickerViewModel$PhotoCheckResult;
        SNSPhotoDocumentPickerViewModel$PhotoCheckResult sNSPhotoDocumentPickerViewModel$PhotoCheckResult2;
        C30536d c30536d3;
        boolean z12;
        Rect rect4;
        long jCurrentTimeMillis2;
        boolean z13;
        SNSPhotoDocumentPickerViewModel$PhotoCheckResult sNSPhotoDocumentPickerViewModel$PhotoCheckResult3;
        SNSPhotoDocumentPickerViewModel$PhotoCheckResult sNSPhotoDocumentPickerViewModel$PhotoCheckResult4;
        C30480N c30480n2;
        SNSPhotoDocumentPickerViewModel$PhotoCheckResult sNSPhotoDocumentPickerViewModel$PhotoCheckResult5;
        SNSPhotoDocumentPickerViewModel$FrameHandleResult sNSPhotoDocumentPickerViewModel$FrameHandleResult2;
        Context context3 = context;
        Bitmap bitmap3 = bitmap;
        if (continuationImpl instanceof C30631t0) {
            c30631t0 = (C30631t0) continuationImpl;
            int i15 = c30631t0.f61891j;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c30631t0.f61891j = i15 - Integer.MIN_VALUE;
            } else {
                c30631t0 = new C30631t0(this, continuationImpl);
            }
        } else {
            c30631t0 = new C30631t0(this, continuationImpl);
        }
        Object objM91049g = c30631t0.f61889h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i16 = c30631t0.f61891j;
        if (i16 == 0) {
            ResultKt.throwOnFailure(objM91049g);
            if (this.f61366t) {
                this.f61366t = false;
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30636u0(this, null), 3, null);
            }
            if (this.f61364r) {
                return SNSPhotoDocumentPickerViewModel$FrameHandleResult.RELEASED;
            }
            if (this.f61355S) {
                m70342a(SNSPhotoDocumentPickerViewModel$PhotoCheckResult.SKIPPED);
                return SNSPhotoDocumentPickerViewModel$FrameHandleResult.RELEASED;
            }
            if (this.f61344H) {
                c30631t0.f61891j = 1;
            } else {
                if (!Intrinsics.areEqual(((C30486P) this.f61343G.getValue()).f61538b.f61526a, Boxing.boxBoolean(true))) {
                    m70342a(SNSPhotoDocumentPickerViewModel$PhotoCheckResult.SKIPPED);
                    return SNSPhotoDocumentPickerViewModel$FrameHandleResult.RELEASED;
                }
                if (this.f61359m.f67965f) {
                    C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30504V0(this, false, null), 3, null);
                    m70342a(SNSPhotoDocumentPickerViewModel$PhotoCheckResult.SKIPPED);
                    return SNSPhotoDocumentPickerViewModel$FrameHandleResult.RELEASED;
                }
                if (!this.f61355S && !this.f61372z) {
                    z11 = this.f61353Q;
                    this.f61353Q = false;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    AbstractC41697j0 abstractC41697j0M91391a = C41782z0.m91391a();
                    C30641v0 c30641v0 = new C30641v0(this, bitmap3, z11, null);
                    c30631t0.f61882a = context3;
                    c30631t0.f61883b = bitmap3;
                    c30631t0.f61884c = rect;
                    c30631t0.f61885d = z11;
                    c30631t0.f61886e = jCurrentTimeMillis;
                    c30631t0.f61891j = 2;
                    objM91049g = C41686h.m91049g(abstractC41697j0M91391a, c30641v0, c30631t0);
                    if (objM91049g != coroutine_suspended) {
                        rect2 = rect;
                        c33350a = (C33350a) objM91049g;
                        if (c33350a != null) {
                            width = bitmap3.getWidth() / this.f61359m.f68000h.f67909d.getWidth();
                            height = bitmap3.getHeight() / this.f61359m.f68000h.f67909d.getHeight();
                            C30536d c30536dM70404a = ((C30518a) this.f61370x.getValue()).m70404a(width, height, rect2, c33350a);
                            if (z11) {
                                Rect rectM70408a = AbstractC30566i.m70408a(c33350a.m71661a(), width, height);
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap3.getWidth(), bitmap3.getHeight(), Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                bitmapCreateBitmap.eraseColor(0);
                                canvas.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
                                Paint paint = new Paint();
                                paint.setColor(-16711936);
                                paint.setStyle(Paint.Style.STROKE);
                                paint.setStrokeWidth(context3.getResources().getDimensionPixelSize(R$dimen.sns_frame_stroke_width));
                                canvas.drawRect(rectM70408a, paint);
                                paint.setColor(SupportMenu.CATEGORY_MASK);
                                canvas.drawRect(rect2, paint);
                                m70322a(context3, bitmapCreateBitmap);
                                bitmapCreateBitmap.recycle();
                            }
                            c30536d = c30536dM70404a;
                        } else {
                            jCurrentTimeMillis = jCurrentTimeMillis;
                            c30536d = null;
                        }
                        if (c30536d == null) {
                            if (this.f61356T) {
                                C33272c.f67816e.f67810a.mo68955d("DocCapture", "lost document bounds", null);
                                this.f61356T = false;
                                ((C30518a) this.f61370x.getValue()).f61631c = false;
                                fireEvent(C30494S.f61564a);
                            }
                        } else if (this.f61356T) {
                            C33272c.f67816e.f67810a.mo68955d("DocCapture", "lost document bounds", null);
                            this.f61356T = false;
                            ((C30518a) this.f61370x.getValue()).f61631c = false;
                            fireEvent(C30494S.f61564a);
                        }
                        c30480n = this.f61354R;
                        if (c30480n != null) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        if (c30536d == null) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                        }
                        if (i12 != 0) {
                            C33272c.f67816e.f67810a.mo68955d("DocCapture", "docDetector took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms", null);
                            c30631t0.f61882a = context3;
                            c30631t0.f61883b = rect2;
                            c30631t0.f61884c = c30536d;
                            c30631t0.f61887f = i11;
                            c30631t0.f61888g = i12;
                            c30631t0.f61891j = 3;
                            objM91049g = m70331a(context3, bitmap3, c30631t0);
                            if (objM91049g != coroutine_suspended) {
                                i13 = i11;
                                c30536d2 = c30536d;
                                rect3 = rect2;
                                context2 = context3;
                                i14 = i12;
                                i12 = i14;
                                zBooleanValue = ((Boolean) objM91049g).booleanValue();
                                c30536d = c30536d2;
                                context3 = context2;
                                i11 = i13;
                                rect2 = rect3;
                                if (zBooleanValue) {
                                    sNSPhotoDocumentPickerViewModel$FrameHandleResult = SNSPhotoDocumentPickerViewModel$FrameHandleResult.TAKEN;
                                } else {
                                    sNSPhotoDocumentPickerViewModel$FrameHandleResult = SNSPhotoDocumentPickerViewModel$FrameHandleResult.RELEASED;
                                }
                                sNSPhotoDocumentPickerViewModel$PhotoCheckResult = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.SKIPPED;
                                if (i12 != 0) {
                                    if (!zBooleanValue) {
                                        z12 = false;
                                    } else {
                                        z12 = false;
                                    }
                                    if (this.f61349M) {
                                        C33272c.f67816e.f67810a.mo68955d("DocCapture", "started waiting for better photo", null);
                                        this.f61348L = System.currentTimeMillis();
                                        this.f61349M = true;
                                    } else {
                                        C33272c.f67816e.f67810a.mo68955d("DocCapture", "started waiting for better photo", null);
                                        this.f61348L = System.currentTimeMillis();
                                        this.f61349M = true;
                                    }
                                    rect4 = rect2;
                                    jCurrentTimeMillis2 = System.currentTimeMillis() - this.f61348L;
                                    if (this.f61349M) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        sNSPhotoDocumentPickerViewModel$PhotoCheckResult3 = this.f61350N;
                                        sNSPhotoDocumentPickerViewModel$PhotoCheckResult4 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.FOCUSING;
                                        if (sNSPhotoDocumentPickerViewModel$PhotoCheckResult3 != sNSPhotoDocumentPickerViewModel$PhotoCheckResult4) {
                                            this.f61349M = false;
                                            C33272c.f67816e.f67810a.mo68955d("DocCapture", "timeout waiting for better photo after: " + jCurrentTimeMillis2 + " ms", null);
                                            c30480n2 = this.f61354R;
                                            if (c30480n2 != null) {
                                                sNSPhotoDocumentPickerViewModel$PhotoCheckResult5 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.CAPTURED;
                                                sNSPhotoDocumentPickerViewModel$FrameHandleResult2 = SNSPhotoDocumentPickerViewModel$FrameHandleResult.RELEASED;
                                                c30631t0.f61882a = c30536d;
                                                c30631t0.f61883b = sNSPhotoDocumentPickerViewModel$FrameHandleResult2;
                                                c30631t0.f61884c = sNSPhotoDocumentPickerViewModel$PhotoCheckResult5;
                                                c30631t0.f61891j = 4;
                                                if (m70332a(context3, rect4, c30480n2, c30631t0) != coroutine_suspended) {
                                                    sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel$PhotoCheckResult5;
                                                    sNSPhotoDocumentPickerViewModel$FrameHandleResult = sNSPhotoDocumentPickerViewModel$FrameHandleResult2;
                                                }
                                            } else {
                                                c30536d3 = c30536d;
                                                sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel$PhotoCheckResult4;
                                                m70342a(sNSPhotoDocumentPickerViewModel$PhotoCheckResult2);
                                                c30631t0.f61882a = sNSPhotoDocumentPickerViewModel$FrameHandleResult;
                                                c30631t0.f61883b = null;
                                                c30631t0.f61884c = null;
                                                c30631t0.f61891j = 5;
                                                if (m70336a(c30536d3, sNSPhotoDocumentPickerViewModel$PhotoCheckResult2, c30631t0) != coroutine_suspended) {
                                                    return sNSPhotoDocumentPickerViewModel$FrameHandleResult;
                                                }
                                            }
                                        } else if (z13) {
                                            sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.FOCUSING;
                                        } else {
                                            sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.WAITING;
                                        }
                                    } else if (z13) {
                                        sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.FOCUSING;
                                    } else {
                                        sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.WAITING;
                                    }
                                } else {
                                    sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel$PhotoCheckResult;
                                }
                                c30536d3 = c30536d;
                                m70342a(sNSPhotoDocumentPickerViewModel$PhotoCheckResult2);
                                c30631t0.f61882a = sNSPhotoDocumentPickerViewModel$FrameHandleResult;
                                c30631t0.f61883b = null;
                                c30631t0.f61884c = null;
                                c30631t0.f61891j = 5;
                                if (m70336a(c30536d3, sNSPhotoDocumentPickerViewModel$PhotoCheckResult2, c30631t0) != coroutine_suspended) {
                                    return sNSPhotoDocumentPickerViewModel$FrameHandleResult;
                                }
                            }
                        } else {
                            this.f61349M = false;
                            if (c30480n != null) {
                                bitmap2.recycle();
                            }
                            this.f61354R = null;
                            zBooleanValue = false;
                            if (zBooleanValue) {
                                sNSPhotoDocumentPickerViewModel$FrameHandleResult = SNSPhotoDocumentPickerViewModel$FrameHandleResult.TAKEN;
                            } else {
                                sNSPhotoDocumentPickerViewModel$FrameHandleResult = SNSPhotoDocumentPickerViewModel$FrameHandleResult.RELEASED;
                            }
                            sNSPhotoDocumentPickerViewModel$PhotoCheckResult = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.SKIPPED;
                            if (i12 != 0) {
                                if (!zBooleanValue) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (this.f61349M) {
                                    C33272c.f67816e.f67810a.mo68955d("DocCapture", "started waiting for better photo", null);
                                    this.f61348L = System.currentTimeMillis();
                                    this.f61349M = true;
                                } else {
                                    C33272c.f67816e.f67810a.mo68955d("DocCapture", "started waiting for better photo", null);
                                    this.f61348L = System.currentTimeMillis();
                                    this.f61349M = true;
                                }
                                rect4 = rect2;
                                jCurrentTimeMillis2 = System.currentTimeMillis() - this.f61348L;
                                if (this.f61349M) {
                                    z13 = false;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    sNSPhotoDocumentPickerViewModel$PhotoCheckResult3 = this.f61350N;
                                    sNSPhotoDocumentPickerViewModel$PhotoCheckResult4 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.FOCUSING;
                                    if (sNSPhotoDocumentPickerViewModel$PhotoCheckResult3 != sNSPhotoDocumentPickerViewModel$PhotoCheckResult4) {
                                        this.f61349M = false;
                                        C33272c.f67816e.f67810a.mo68955d("DocCapture", "timeout waiting for better photo after: " + jCurrentTimeMillis2 + " ms", null);
                                        c30480n2 = this.f61354R;
                                        if (c30480n2 != null) {
                                            sNSPhotoDocumentPickerViewModel$PhotoCheckResult5 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.CAPTURED;
                                            sNSPhotoDocumentPickerViewModel$FrameHandleResult2 = SNSPhotoDocumentPickerViewModel$FrameHandleResult.RELEASED;
                                            c30631t0.f61882a = c30536d;
                                            c30631t0.f61883b = sNSPhotoDocumentPickerViewModel$FrameHandleResult2;
                                            c30631t0.f61884c = sNSPhotoDocumentPickerViewModel$PhotoCheckResult5;
                                            c30631t0.f61891j = 4;
                                            if (m70332a(context3, rect4, c30480n2, c30631t0) != coroutine_suspended) {
                                                sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel$PhotoCheckResult5;
                                                sNSPhotoDocumentPickerViewModel$FrameHandleResult = sNSPhotoDocumentPickerViewModel$FrameHandleResult2;
                                            }
                                        } else {
                                            c30536d3 = c30536d;
                                            sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel$PhotoCheckResult4;
                                            m70342a(sNSPhotoDocumentPickerViewModel$PhotoCheckResult2);
                                            c30631t0.f61882a = sNSPhotoDocumentPickerViewModel$FrameHandleResult;
                                            c30631t0.f61883b = null;
                                            c30631t0.f61884c = null;
                                            c30631t0.f61891j = 5;
                                            if (m70336a(c30536d3, sNSPhotoDocumentPickerViewModel$PhotoCheckResult2, c30631t0) != coroutine_suspended) {
                                                return sNSPhotoDocumentPickerViewModel$FrameHandleResult;
                                            }
                                        }
                                    } else if (z13) {
                                        sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.FOCUSING;
                                    } else {
                                        sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.WAITING;
                                    }
                                } else if (z13) {
                                    sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.FOCUSING;
                                } else {
                                    sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.WAITING;
                                }
                            } else {
                                sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel$PhotoCheckResult;
                            }
                            c30536d3 = c30536d;
                            m70342a(sNSPhotoDocumentPickerViewModel$PhotoCheckResult2);
                            c30631t0.f61882a = sNSPhotoDocumentPickerViewModel$FrameHandleResult;
                            c30631t0.f61883b = null;
                            c30631t0.f61884c = null;
                            c30631t0.f61891j = 5;
                            if (m70336a(c30536d3, sNSPhotoDocumentPickerViewModel$PhotoCheckResult2, c30631t0) != coroutine_suspended) {
                                return sNSPhotoDocumentPickerViewModel$FrameHandleResult;
                            }
                        }
                    }
                } else {
                    m70342a(SNSPhotoDocumentPickerViewModel$PhotoCheckResult.SKIPPED);
                    return SNSPhotoDocumentPickerViewModel$FrameHandleResult.RELEASED;
                }
            }
        } else {
            if (i16 == 1) {
                ResultKt.throwOnFailure(objM91049g);
                m70342a(SNSPhotoDocumentPickerViewModel$PhotoCheckResult.CAPTURED);
                return SNSPhotoDocumentPickerViewModel$FrameHandleResult.RELEASED;
            }
            if (i16 == 2) {
                long j11 = c30631t0.f61886e;
                z11 = c30631t0.f61885d;
                rect2 = (Rect) c30631t0.f61884c;
                Bitmap bitmap4 = (Bitmap) c30631t0.f61883b;
                Context context4 = (Context) c30631t0.f61882a;
                ResultKt.throwOnFailure(objM91049g);
                bitmap3 = bitmap4;
                context3 = context4;
                jCurrentTimeMillis = j11;
                c33350a = (C33350a) objM91049g;
                if (c33350a != null) {
                    width = bitmap3.getWidth() / this.f61359m.f68000h.f67909d.getWidth();
                    height = bitmap3.getHeight() / this.f61359m.f68000h.f67909d.getHeight();
                    C30536d c30536dM70404a2 = ((C30518a) this.f61370x.getValue()).m70404a(width, height, rect2, c33350a);
                    if (z11) {
                        Rect rectM70408a2 = AbstractC30566i.m70408a(c33350a.m71661a(), width, height);
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap3.getWidth(), bitmap3.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                        bitmapCreateBitmap2.eraseColor(0);
                        canvas2.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
                        Paint paint2 = new Paint();
                        paint2.setColor(-16711936);
                        paint2.setStyle(Paint.Style.STROKE);
                        paint2.setStrokeWidth(context3.getResources().getDimensionPixelSize(R$dimen.sns_frame_stroke_width));
                        canvas2.drawRect(rectM70408a2, paint2);
                        paint2.setColor(SupportMenu.CATEGORY_MASK);
                        canvas2.drawRect(rect2, paint2);
                        m70322a(context3, bitmapCreateBitmap2);
                        bitmapCreateBitmap2.recycle();
                    }
                    c30536d = c30536dM70404a2;
                } else {
                    jCurrentTimeMillis = jCurrentTimeMillis;
                    c30536d = null;
                }
                if (c30536d == null && c33350a != null) {
                    C30515Z c30515zM70328a = m70328a(c30536d, c33350a, bitmap3, z11);
                    if (c30515zM70328a != null) {
                        fireEvent(c30515zM70328a);
                    }
                } else if (this.f61356T) {
                    C33272c.f67816e.f67810a.mo68955d("DocCapture", "lost document bounds", null);
                    this.f61356T = false;
                    ((C30518a) this.f61370x.getValue()).f61631c = false;
                    fireEvent(C30494S.f61564a);
                }
                c30480n = this.f61354R;
                if (c30480n != null) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (c30536d == null && c30536d.f61660a && c30536d.f61661b == CheckDetectionResult$SizeCheckResult.OK) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                if (i12 != 0) {
                    C33272c.f67816e.f67810a.mo68955d("DocCapture", "docDetector took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms", null);
                    c30631t0.f61882a = context3;
                    c30631t0.f61883b = rect2;
                    c30631t0.f61884c = c30536d;
                    c30631t0.f61887f = i11;
                    c30631t0.f61888g = i12;
                    c30631t0.f61891j = 3;
                    objM91049g = m70331a(context3, bitmap3, c30631t0);
                    if (objM91049g != coroutine_suspended) {
                        i13 = i11;
                        c30536d2 = c30536d;
                        rect3 = rect2;
                        context2 = context3;
                        i14 = i12;
                        i12 = i14;
                        zBooleanValue = ((Boolean) objM91049g).booleanValue();
                        c30536d = c30536d2;
                        context3 = context2;
                        i11 = i13;
                        rect2 = rect3;
                        if (zBooleanValue) {
                            sNSPhotoDocumentPickerViewModel$FrameHandleResult = SNSPhotoDocumentPickerViewModel$FrameHandleResult.TAKEN;
                        } else {
                            sNSPhotoDocumentPickerViewModel$FrameHandleResult = SNSPhotoDocumentPickerViewModel$FrameHandleResult.RELEASED;
                        }
                        sNSPhotoDocumentPickerViewModel$PhotoCheckResult = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.SKIPPED;
                        if (i12 != 0) {
                            if (!zBooleanValue) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            if (this.f61349M) {
                                C33272c.f67816e.f67810a.mo68955d("DocCapture", "started waiting for better photo", null);
                                this.f61348L = System.currentTimeMillis();
                                this.f61349M = true;
                            } else {
                                C33272c.f67816e.f67810a.mo68955d("DocCapture", "started waiting for better photo", null);
                                this.f61348L = System.currentTimeMillis();
                                this.f61349M = true;
                            }
                            rect4 = rect2;
                            jCurrentTimeMillis2 = System.currentTimeMillis() - this.f61348L;
                            if (this.f61349M) {
                                z13 = false;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                sNSPhotoDocumentPickerViewModel$PhotoCheckResult3 = this.f61350N;
                                sNSPhotoDocumentPickerViewModel$PhotoCheckResult4 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.FOCUSING;
                                if (sNSPhotoDocumentPickerViewModel$PhotoCheckResult3 != sNSPhotoDocumentPickerViewModel$PhotoCheckResult4) {
                                    this.f61349M = false;
                                    C33272c.f67816e.f67810a.mo68955d("DocCapture", "timeout waiting for better photo after: " + jCurrentTimeMillis2 + " ms", null);
                                    c30480n2 = this.f61354R;
                                    if (c30480n2 != null) {
                                        sNSPhotoDocumentPickerViewModel$PhotoCheckResult5 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.CAPTURED;
                                        sNSPhotoDocumentPickerViewModel$FrameHandleResult2 = SNSPhotoDocumentPickerViewModel$FrameHandleResult.RELEASED;
                                        c30631t0.f61882a = c30536d;
                                        c30631t0.f61883b = sNSPhotoDocumentPickerViewModel$FrameHandleResult2;
                                        c30631t0.f61884c = sNSPhotoDocumentPickerViewModel$PhotoCheckResult5;
                                        c30631t0.f61891j = 4;
                                        if (m70332a(context3, rect4, c30480n2, c30631t0) != coroutine_suspended) {
                                            sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel$PhotoCheckResult5;
                                            sNSPhotoDocumentPickerViewModel$FrameHandleResult = sNSPhotoDocumentPickerViewModel$FrameHandleResult2;
                                        }
                                    } else {
                                        c30536d3 = c30536d;
                                        sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel$PhotoCheckResult4;
                                    }
                                } else if (z13) {
                                    sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.FOCUSING;
                                } else {
                                    sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.WAITING;
                                }
                            } else if (z13) {
                                sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.FOCUSING;
                            } else {
                                sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.WAITING;
                            }
                        } else {
                            sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel$PhotoCheckResult;
                        }
                        c30536d3 = c30536d;
                    }
                } else {
                    this.f61349M = false;
                    if (c30480n != null && (bitmap2 = c30480n.f61519a) != null) {
                        bitmap2.recycle();
                    }
                    this.f61354R = null;
                    zBooleanValue = false;
                    if (zBooleanValue) {
                        sNSPhotoDocumentPickerViewModel$FrameHandleResult = SNSPhotoDocumentPickerViewModel$FrameHandleResult.TAKEN;
                    } else {
                        sNSPhotoDocumentPickerViewModel$FrameHandleResult = SNSPhotoDocumentPickerViewModel$FrameHandleResult.RELEASED;
                    }
                    sNSPhotoDocumentPickerViewModel$PhotoCheckResult = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.SKIPPED;
                    if (i12 != 0) {
                        if (!zBooleanValue) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        if (this.f61349M) {
                            C33272c.f67816e.f67810a.mo68955d("DocCapture", "started waiting for better photo", null);
                            this.f61348L = System.currentTimeMillis();
                            this.f61349M = true;
                        } else {
                            C33272c.f67816e.f67810a.mo68955d("DocCapture", "started waiting for better photo", null);
                            this.f61348L = System.currentTimeMillis();
                            this.f61349M = true;
                        }
                        rect4 = rect2;
                        jCurrentTimeMillis2 = System.currentTimeMillis() - this.f61348L;
                        if (this.f61349M) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            sNSPhotoDocumentPickerViewModel$PhotoCheckResult3 = this.f61350N;
                            sNSPhotoDocumentPickerViewModel$PhotoCheckResult4 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.FOCUSING;
                            if (sNSPhotoDocumentPickerViewModel$PhotoCheckResult3 != sNSPhotoDocumentPickerViewModel$PhotoCheckResult4) {
                                this.f61349M = false;
                                C33272c.f67816e.f67810a.mo68955d("DocCapture", "timeout waiting for better photo after: " + jCurrentTimeMillis2 + " ms", null);
                                c30480n2 = this.f61354R;
                                if (c30480n2 != null) {
                                    sNSPhotoDocumentPickerViewModel$PhotoCheckResult5 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.CAPTURED;
                                    sNSPhotoDocumentPickerViewModel$FrameHandleResult2 = SNSPhotoDocumentPickerViewModel$FrameHandleResult.RELEASED;
                                    c30631t0.f61882a = c30536d;
                                    c30631t0.f61883b = sNSPhotoDocumentPickerViewModel$FrameHandleResult2;
                                    c30631t0.f61884c = sNSPhotoDocumentPickerViewModel$PhotoCheckResult5;
                                    c30631t0.f61891j = 4;
                                    if (m70332a(context3, rect4, c30480n2, c30631t0) != coroutine_suspended) {
                                        sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel$PhotoCheckResult5;
                                        sNSPhotoDocumentPickerViewModel$FrameHandleResult = sNSPhotoDocumentPickerViewModel$FrameHandleResult2;
                                    }
                                } else {
                                    c30536d3 = c30536d;
                                    sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel$PhotoCheckResult4;
                                }
                            } else if (z13) {
                                sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.FOCUSING;
                            } else {
                                sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.WAITING;
                            }
                        } else if (z13) {
                            sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.FOCUSING;
                        } else {
                            sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.WAITING;
                        }
                    } else {
                        sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel$PhotoCheckResult;
                    }
                    c30536d3 = c30536d;
                }
            } else if (i16 == 3) {
                i14 = c30631t0.f61888g;
                i13 = c30631t0.f61887f;
                c30536d2 = (C30536d) c30631t0.f61884c;
                rect3 = (Rect) c30631t0.f61883b;
                context2 = (Context) c30631t0.f61882a;
                ResultKt.throwOnFailure(objM91049g);
                i12 = i14;
                zBooleanValue = ((Boolean) objM91049g).booleanValue();
                c30536d = c30536d2;
                context3 = context2;
                i11 = i13;
                rect2 = rect3;
                if (zBooleanValue) {
                    sNSPhotoDocumentPickerViewModel$FrameHandleResult = SNSPhotoDocumentPickerViewModel$FrameHandleResult.TAKEN;
                } else {
                    sNSPhotoDocumentPickerViewModel$FrameHandleResult = SNSPhotoDocumentPickerViewModel$FrameHandleResult.RELEASED;
                }
                sNSPhotoDocumentPickerViewModel$PhotoCheckResult = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.SKIPPED;
                if (i12 != 0) {
                    if (!zBooleanValue && i11 == 0 && this.f61350N == SNSPhotoDocumentPickerViewModel$PhotoCheckResult.FOCUSING) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (this.f61349M || z12) {
                        C33272c.f67816e.f67810a.mo68955d("DocCapture", "started waiting for better photo", null);
                        this.f61348L = System.currentTimeMillis();
                        this.f61349M = true;
                    }
                    rect4 = rect2;
                    jCurrentTimeMillis2 = System.currentTimeMillis() - this.f61348L;
                    if (this.f61349M || jCurrentTimeMillis2 < this.f61361o.f67914c) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (z13) {
                        sNSPhotoDocumentPickerViewModel$PhotoCheckResult3 = this.f61350N;
                        sNSPhotoDocumentPickerViewModel$PhotoCheckResult4 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.FOCUSING;
                        if (sNSPhotoDocumentPickerViewModel$PhotoCheckResult3 != sNSPhotoDocumentPickerViewModel$PhotoCheckResult4) {
                            this.f61349M = false;
                            C33272c.f67816e.f67810a.mo68955d("DocCapture", "timeout waiting for better photo after: " + jCurrentTimeMillis2 + " ms", null);
                            c30480n2 = this.f61354R;
                            if (c30480n2 != null) {
                                sNSPhotoDocumentPickerViewModel$PhotoCheckResult5 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.CAPTURED;
                                sNSPhotoDocumentPickerViewModel$FrameHandleResult2 = SNSPhotoDocumentPickerViewModel$FrameHandleResult.RELEASED;
                                c30631t0.f61882a = c30536d;
                                c30631t0.f61883b = sNSPhotoDocumentPickerViewModel$FrameHandleResult2;
                                c30631t0.f61884c = sNSPhotoDocumentPickerViewModel$PhotoCheckResult5;
                                c30631t0.f61891j = 4;
                                if (m70332a(context3, rect4, c30480n2, c30631t0) != coroutine_suspended) {
                                    sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel$PhotoCheckResult5;
                                    sNSPhotoDocumentPickerViewModel$FrameHandleResult = sNSPhotoDocumentPickerViewModel$FrameHandleResult2;
                                }
                            } else {
                                c30536d3 = c30536d;
                                sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel$PhotoCheckResult4;
                            }
                        } else if (z13) {
                            sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.FOCUSING;
                        } else {
                            sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.WAITING;
                        }
                    } else if (z13) {
                        sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.FOCUSING;
                    } else {
                        sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel$PhotoCheckResult.WAITING;
                    }
                } else {
                    sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel$PhotoCheckResult;
                }
                c30536d3 = c30536d;
            } else {
                if (i16 != 4) {
                    if (i16 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SNSPhotoDocumentPickerViewModel$FrameHandleResult sNSPhotoDocumentPickerViewModel$FrameHandleResult3 = (SNSPhotoDocumentPickerViewModel$FrameHandleResult) c30631t0.f61882a;
                    ResultKt.throwOnFailure(objM91049g);
                    return sNSPhotoDocumentPickerViewModel$FrameHandleResult3;
                }
                sNSPhotoDocumentPickerViewModel$PhotoCheckResult2 = (SNSPhotoDocumentPickerViewModel$PhotoCheckResult) c30631t0.f61884c;
                sNSPhotoDocumentPickerViewModel$FrameHandleResult = (SNSPhotoDocumentPickerViewModel$FrameHandleResult) c30631t0.f61883b;
                c30536d3 = (C30536d) c30631t0.f61882a;
                ResultKt.throwOnFailure(objM91049g);
            }
            m70342a(sNSPhotoDocumentPickerViewModel$PhotoCheckResult2);
            c30631t0.f61882a = sNSPhotoDocumentPickerViewModel$FrameHandleResult;
            c30631t0.f61883b = null;
            c30631t0.f61884c = null;
            c30631t0.f61891j = 5;
            if (m70336a(c30536d3, sNSPhotoDocumentPickerViewModel$PhotoCheckResult2, c30631t0) != coroutine_suspended) {
                return sNSPhotoDocumentPickerViewModel$FrameHandleResult;
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: a */
    public final void m70341a(C28740f c28740f) {
        File file = c28740f.f58443a;
        String str = "video recording stopped. isWaitingForVideo=" + this.f61372z + ", " + file;
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("DocCapture", str, null);
        this.f61337A = false;
        this.f61364r = false;
        this.f61371y = null;
        AbstractC28738e abstractC28738e = c28740f.f58444b;
        boolean z11 = abstractC28738e instanceof C28734c;
        if (z11) {
            c33270a.f67810a.mo68955d("DocCapture", "onVideoRecordingFinalized: " + abstractC28738e, ((C28734c) abstractC28738e).f58437b);
        }
        if (!this.f61372z) {
            c33270a.f67810a.mo68955d("DocCapture", "onVideoRecorded: removing video file", null);
            file.delete();
            if (z11) {
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30462H0(this, abstractC28738e, null), 3, null);
                return;
            }
            return;
        }
        this.f61372z = false;
        C28736d c28736d = abstractC28738e instanceof C28736d ? (C28736d) abstractC28738e : null;
        if (c28736d == null) {
            return;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) m70356i());
        mutableList.add(new C29054T(file, file, null, "IDENTITY_VIDEO", null, null, new C29050S(c28736d.f58439a, c28736d.f58440b), 868));
        C28936t c28936t = this.f61365s;
        KProperty kProperty = f61336U[0];
        c28936t.f58834a.set(c28936t.f58835b, mutableList);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30465I0(this, null), 3, null);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30359W
    /* JADX INFO: renamed from: a */
    public final void mo70247a(C29054T c29054t) {
        if (!this.f61338B && (!this.f61347K || !this.f61342F)) {
            super.mo70247a(c29054t);
            return;
        }
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "Gallery picking NOT allowed here!!", null);
        C33272c.f67814c.mo68959w("DocCapture", "Gallery picking NOT allowed here!!", new RuntimeException("Gallery picking NOT allowed here!!"));
        if (C28468k0.f57988f) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70336a(C30536d c30536d, SNSPhotoDocumentPickerViewModel$PhotoCheckResult sNSPhotoDocumentPickerViewModel$PhotoCheckResult, ContinuationImpl continuationImpl) {
        C30513Y0 c30513y0;
        C30477M c30477m;
        if (continuationImpl instanceof C30513Y0) {
            c30513y0 = (C30513Y0) continuationImpl;
            int i11 = c30513y0.f61615c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30513y0.f61615c = i11 - Integer.MIN_VALUE;
            } else {
                c30513y0 = new C30513Y0(this, continuationImpl);
            }
        } else {
            c30513y0 = new C30513Y0(this, continuationImpl);
        }
        Object objM70337a = c30513y0.f61613a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30513y0.f61615c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70337a);
            if (c30536d == null) {
                C30536d c30536d2 = new C30536d(false, CheckDetectionResult$SizeCheckResult.SMALL, false);
                c30513y0.f61615c = 1;
                objM70337a = m70337a(c30536d2, false, (ContinuationImpl) c30513y0);
            } else if (sNSPhotoDocumentPickerViewModel$PhotoCheckResult == SNSPhotoDocumentPickerViewModel$PhotoCheckResult.SKIPPED) {
                c30513y0.f61615c = 2;
                objM70337a = m70337a(c30536d, false, (ContinuationImpl) c30513y0);
            } else if (sNSPhotoDocumentPickerViewModel$PhotoCheckResult == SNSPhotoDocumentPickerViewModel$PhotoCheckResult.FOCUSING) {
                c30513y0.f61615c = 3;
                objM70337a = m70337a(c30536d, true, (ContinuationImpl) c30513y0);
            } else if (sNSPhotoDocumentPickerViewModel$PhotoCheckResult == SNSPhotoDocumentPickerViewModel$PhotoCheckResult.WAITING) {
                c30513y0.f61615c = 4;
                objM70337a = m70337a(c30536d, false, (ContinuationImpl) c30513y0);
            } else {
                c30477m = null;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM70337a);
            c30477m = (C30477M) objM70337a;
        } else if (i12 == 2) {
            ResultKt.throwOnFailure(objM70337a);
            c30477m = (C30477M) objM70337a;
        } else if (i12 == 3) {
            ResultKt.throwOnFailure(objM70337a);
            c30477m = (C30477M) objM70337a;
        } else {
            if (i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70337a);
            c30477m = (C30477M) objM70337a;
        }
        C30477M c30477m2 = c30477m;
        if (c30477m2 != null) {
            InterfaceC41669n interfaceC41669n = this.f61343G;
            interfaceC41669n.setValue(C30486P.m70403a((C30486P) interfaceC41669n.getValue(), null, null, c30477m2, null, null, 27));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final Object m70332a(final Context context, final Rect rect, final C30480N c30480n, C30631t0 c30631t0) {
        final InterfaceC41565d interfaceC41565dM90691b = C41568g.m90691b(0, null, null, 7, null);
        fireEvent(new C30519a0(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.m3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30444C2.m70321a(this.f61796b, context, c30480n, rect, interfaceC41565dM90691b);
            }
        }));
        Object objMo90550D = interfaceC41565dM90691b.mo90550D(c30631t0);
        return objMo90550D == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo90550D : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70331a(Context context, Bitmap bitmap, ContinuationImpl continuationImpl) {
        C30567i0 c30567i0;
        Float f11;
        if (continuationImpl instanceof C30567i0) {
            c30567i0 = (C30567i0) continuationImpl;
            int i11 = c30567i0.f61731e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30567i0.f61731e = i11 - Integer.MIN_VALUE;
            } else {
                c30567i0 = new C30567i0(this, continuationImpl);
            }
        } else {
            c30567i0 = new C30567i0(this, continuationImpl);
        }
        Object objM70335a = c30567i0.f61729c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30567i0.f61731e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70335a);
            c30567i0.f61727a = context;
            c30567i0.f61728b = bitmap;
            c30567i0.f61731e = 1;
            objM70335a = m70335a(bitmap, false, (ContinuationImpl) c30567i0);
            if (objM70335a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bitmap = c30567i0.f61728b;
            context = c30567i0.f61727a;
            ResultKt.throwOnFailure(objM70335a);
        }
        C30497T c30497t = (C30497T) objM70335a;
        if (((c30497t == null || (f11 = c30497t.f61570a) == null) ? -1.0f : f11.floatValue()) >= this.f61360n.f67937b && c30497t != null) {
            return Boxing.boxBoolean(m70345a(context, bitmap, c30497t));
        }
        return Boxing.boxBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public final void m70342a(SNSPhotoDocumentPickerViewModel$PhotoCheckResult sNSPhotoDocumentPickerViewModel$PhotoCheckResult) {
        if (sNSPhotoDocumentPickerViewModel$PhotoCheckResult != this.f61350N) {
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "requestFrameCheckResultUpdate: -> " + sNSPhotoDocumentPickerViewModel$PhotoCheckResult, null);
        }
        this.f61350N = sNSPhotoDocumentPickerViewModel$PhotoCheckResult;
    }

    /* JADX INFO: renamed from: a */
    public final C30515Z m70328a(C30536d c30536d, C33350a c33350a, Bitmap bitmap, boolean z11) {
        if (!this.f61356T && C28468k0.f57988f) {
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "started tracking document bounds: " + c33350a, null);
        }
        if (z11) {
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "detected bounds " + c33350a, null);
        }
        this.f61356T = true;
        if (this.f61361o.f67913b) {
            return new C30515Z(new Size(bitmap.getWidth(), bitmap.getHeight()), new Size(this.f61359m.f68000h.f67909d.getWidth(), this.f61359m.f68000h.f67909d.getHeight()), c33350a, c30536d.f61660a, this.f61361o.f67913b, z11);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m70322a(Context context, Bitmap bitmap) throws IOException {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return;
        }
        File file = new File(externalFilesDir, TypedValues.AttributesType.S_FRAME + "_" + System.currentTimeMillis() + ".jpg");
        String absolutePath = file.getAbsolutePath();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("saving to ");
        sb2.append(absolutePath);
        String string = sb2.toString();
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("DocCapture", string, null);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        boolean zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        if (zCompress) {
            c33270a.f67810a.mo68955d("DocCapture", "saved!", null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0099 A[PHI: r8 r9 r10
      0x0099: PHI (r8v30 int) = (r8v19 int), (r8v21 int), (r8v23 int), (r8v25 int), (r8v27 int), (r8v31 int) binds: [B:49:0x00d5, B:56:0x00ec, B:40:0x00b9, B:30:0x0095, B:65:0x0108, B:72:0x0121] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r9v23 com.sumsub.sns.internal.features.presentation.camera.photo.document.SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State) = 
      (r9v12 com.sumsub.sns.internal.features.presentation.camera.photo.document.SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State)
      (r9v14 com.sumsub.sns.internal.features.presentation.camera.photo.document.SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State)
      (r9v16 com.sumsub.sns.internal.features.presentation.camera.photo.document.SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State)
      (r9v18 com.sumsub.sns.internal.features.presentation.camera.photo.document.SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State)
      (r9v20 com.sumsub.sns.internal.features.presentation.camera.photo.document.SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State)
      (r9v24 com.sumsub.sns.internal.features.presentation.camera.photo.document.SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State)
     binds: [B:49:0x00d5, B:56:0x00ec, B:40:0x00b9, B:30:0x0095, B:65:0x0108, B:72:0x0121] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r10v22 java.lang.String) = 
      (r10v12 java.lang.String)
      (r10v14 java.lang.String)
      (r10v16 java.lang.String)
      (r10v18 java.lang.String)
      (r10v20 java.lang.String)
      (r10v24 java.lang.String)
     binds: [B:49:0x00d5, B:56:0x00ec, B:40:0x00b9, B:30:0x0095, B:65:0x0108, B:72:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0127  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70337a(C30536d c30536d, boolean z11, ContinuationImpl continuationImpl) {
        C30543e0 c30543e0;
        SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;
        int i11;
        String str;
        if (continuationImpl instanceof C30543e0) {
            c30543e0 = (C30543e0) continuationImpl;
            int i12 = c30543e0.f61689e;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c30543e0.f61689e = i12 - Integer.MIN_VALUE;
            } else {
                c30543e0 = new C30543e0(this, continuationImpl);
            }
        } else {
            c30543e0 = new C30543e0(this, continuationImpl);
        }
        Object string = c30543e0.f61687c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c30543e0.f61689e;
        String str2 = C33627eb.f69716f;
        switch (i13) {
            case 0:
                ResultKt.throwOnFailure(string);
                SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State2 = SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State.INVALID;
                if (c30536d.f61660a) {
                    int i14 = AbstractC30537d0.f61664b[c30536d.f61661b.ordinal()];
                    if (i14 == 1) {
                        SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State3 = SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State.OK;
                        if (z11) {
                            c30543e0.f61685a = sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State3;
                            c30543e0.f61686b = 0;
                            c30543e0.f61689e = 1;
                            string = getString("sns_autocapture_hint_keepFocusing", c30543e0);
                            if (string != coroutine_suspended) {
                                sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State = sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State3;
                                i11 = 0;
                                str = (String) string;
                                if (str != null) {
                                    str2 = str;
                                }
                                return new C30477M(str2, i11 != 0, sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State);
                            }
                        } else {
                            c30543e0.f61685a = sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State3;
                            c30543e0.f61686b = 1;
                            c30543e0.f61689e = 2;
                            string = getString("sns_autocapture_hint_holdLikeThis", c30543e0);
                            if (string != coroutine_suspended) {
                                sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State = sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State3;
                                i11 = 1;
                                str = (String) string;
                                if (str != null) {
                                    str2 = str;
                                }
                                return new C30477M(str2, i11 != 0, sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State);
                            }
                        }
                    } else if (i14 == 2) {
                        SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State4 = SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State.INTERMEDIATE;
                        c30543e0.f61685a = sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State4;
                        c30543e0.f61686b = 0;
                        c30543e0.f61689e = 3;
                        string = getString("sns_autocapture_hint_moveIn", c30543e0);
                        if (string != coroutine_suspended) {
                            sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State = sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State4;
                            i11 = 0;
                            str = (String) string;
                            if (str != null) {
                                str2 = str;
                            }
                            return new C30477M(str2, i11 != 0, sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State);
                        }
                    } else if (i14 == 3) {
                        sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State = SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State.INTERMEDIATE;
                        c30543e0.f61685a = sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;
                        c30543e0.f61686b = 0;
                        c30543e0.f61689e = 4;
                        string = getString("sns_autocapture_hint_moveOut", c30543e0);
                        if (string != coroutine_suspended) {
                            i11 = 0;
                            str = (String) string;
                            if (str != null) {
                                str2 = str;
                            }
                            return new C30477M(str2, i11 != 0, sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State);
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (c30536d.f61661b == CheckDetectionResult$SizeCheckResult.BIG) {
                    sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State = SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State.INTERMEDIATE;
                    c30543e0.f61685a = sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;
                    c30543e0.f61686b = 0;
                    c30543e0.f61689e = 5;
                    string = getString("sns_autocapture_hint_moveOut", c30543e0);
                    if (string != coroutine_suspended) {
                        i11 = 0;
                        str = (String) string;
                        if (str != null) {
                            str2 = str;
                        }
                        return new C30477M(str2, i11 != 0, sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State);
                    }
                } else {
                    c30543e0.f61685a = sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State2;
                    c30543e0.f61686b = 0;
                    c30543e0.f61689e = 6;
                    Object string2 = getString("sns_autocapture_hint_targetAt", c30543e0);
                    if (string2 != coroutine_suspended) {
                        sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State = sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State2;
                        string = string2;
                        i11 = 0;
                        str = (String) string;
                        if (str != null) {
                            str2 = str;
                        }
                        return new C30477M(str2, i11 != 0, sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State);
                    }
                }
                return coroutine_suspended;
            case 1:
                i11 = c30543e0.f61686b;
                sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State = c30543e0.f61685a;
                ResultKt.throwOnFailure(string);
                str = (String) string;
                if (str != null) {
                    str2 = str;
                }
                return new C30477M(str2, i11 != 0, sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State);
            case 2:
                i11 = c30543e0.f61686b;
                sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State = c30543e0.f61685a;
                ResultKt.throwOnFailure(string);
                str = (String) string;
                if (str != null) {
                    str2 = str;
                }
                return new C30477M(str2, i11 != 0, sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State);
            case 3:
                i11 = c30543e0.f61686b;
                sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State = c30543e0.f61685a;
                ResultKt.throwOnFailure(string);
                str = (String) string;
                if (str != null) {
                    str2 = str;
                }
                return new C30477M(str2, i11 != 0, sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State);
            case 4:
                i11 = c30543e0.f61686b;
                sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State = c30543e0.f61685a;
                ResultKt.throwOnFailure(string);
                str = (String) string;
                if (str != null) {
                    str2 = str;
                }
                return new C30477M(str2, i11 != 0, sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State);
            case 5:
                i11 = c30543e0.f61686b;
                sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State = c30543e0.f61685a;
                ResultKt.throwOnFailure(string);
                str = (String) string;
                if (str != null) {
                    str2 = str;
                }
                return new C30477M(str2, i11 != 0, sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State);
            case 6:
                i11 = c30543e0.f61686b;
                sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State = c30543e0.f61685a;
                ResultKt.throwOnFailure(string);
                str = (String) string;
                if (str != null) {
                    str2 = str;
                }
                return new C30477M(str2, i11 != 0, sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m70345a(Context context, Bitmap bitmap, C30497T c30497t) {
        Bitmap bitmap2;
        Float f11;
        C30480N c30480n = this.f61354R;
        float fFloatValue = (c30480n == null || (f11 = c30480n.f61520b.f61570a) == null) ? 0.0f : f11.floatValue();
        Float f12 = c30497t.f61570a;
        float fFloatValue2 = f12 != null ? f12.floatValue() : 0.0f;
        if (fFloatValue2 <= fFloatValue) {
            return false;
        }
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "better frame detected: score -> " + fFloatValue2, null);
        C30480N c30480n2 = this.f61354R;
        if (c30480n2 != null && (bitmap2 = c30480n2.f61519a) != null) {
            bitmap2.recycle();
        }
        this.f61354R = new C30480N(bitmap, c30497t);
        if (this.f61347K && this.f61371y == null) {
            this.f61364r = true;
            m70340a(context);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00da  */
    /* JADX WARN: Code duplicated, block: B:55:0x015c  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0152, code lost:
    
        if (m70333a(r1, r4, r12, r6) == r7) goto L51;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70329a(Context context, Bitmap bitmap, Rect rect, C30497T c30497t, ContinuationImpl continuationImpl) {
        C30510X0 c30510x0;
        Bitmap bitmapCreateBitmap;
        int i11;
        String str;
        Object objM91049g;
        String value;
        Bitmap bitmap2;
        Context context2 = context;
        Bitmap bitmap3 = bitmap;
        if (continuationImpl instanceof C30510X0) {
            c30510x0 = (C30510X0) continuationImpl;
            int i12 = c30510x0.f61608g;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c30510x0.f61608g = i12 - Integer.MIN_VALUE;
            } else {
                c30510x0 = new C30510X0(this, continuationImpl);
            }
        } else {
            c30510x0 = new C30510X0(this, continuationImpl);
        }
        Object obj = c30510x0.f61606e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c30510x0.f61608g;
        if (i13 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f61361o.getClass();
            if (bitmap3 == null) {
                bitmapCreateBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmap3, rect.left * (-1), rect.top * (-1), (Paint) null);
            } else {
                bitmapCreateBitmap = bitmap3;
            }
            i11 = (c30497t == null || !c30497t.f61571b) ? 0 : 1;
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "taking picture, photo quality result=" + c30497t, null);
            IdentitySide identitySide = (IdentitySide) this.f61060f.get("current_side");
            if (identitySide == null || (value = identitySide.getValue()) == null) {
                str = "";
            } else {
                str = value + "_";
                if (str == null) {
                    str = "";
                }
            }
            String str2 = i11 != 0 ? "autocapture_" : null;
            if (str2 == null) {
                str2 = "manual_";
            }
            c30510x0.f61602a = context2;
            c30510x0.f61603b = bitmap3;
            c30510x0.f61604c = bitmapCreateBitmap;
            c30510x0.f61605d = i11;
            c30510x0.f61608g = 1;
            objM91049g = C41686h.m91049g(C41782z0.m91392b(), new C28383A0(bitmapCreateBitmap, str + str2, context2, null), c30510x0);
            if (objM91049g != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i13 == 1) {
            int i14 = c30510x0.f61605d;
            Bitmap bitmap4 = (Bitmap) c30510x0.f61604c;
            Bitmap bitmap5 = c30510x0.f61603b;
            Context context3 = (Context) c30510x0.f61602a;
            ResultKt.throwOnFailure(obj);
            i11 = i14;
            context2 = context3;
            objM91049g = obj;
            bitmapCreateBitmap = bitmap4;
            bitmap3 = bitmap5;
        } else {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bitmap2 = c30510x0.f61603b;
            bitmap3 = (Bitmap) c30510x0.f61602a;
            ResultKt.throwOnFailure(obj);
        }
        if (!Intrinsics.areEqual(bitmap2, bitmap3)) {
            bitmap2.recycle();
        }
        return Unit.INSTANCE;
        File file = (File) objM91049g;
        if (file != null) {
            boolean z11 = i11 != 0;
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "picture taken, isAutoCaptured=" + z11 + ". Side - " + ((IdentitySide) this.f61060f.get("current_side")), null);
            boolean z12 = i11 != 0;
            c30510x0.f61602a = bitmap3;
            c30510x0.f61603b = bitmapCreateBitmap;
            c30510x0.f61604c = file;
            c30510x0.f61608g = 2;
        }
        bitmap2 = bitmapCreateBitmap;
        if (!Intrinsics.areEqual(bitmap2, bitmap3)) {
            bitmap2.recycle();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70334a(Context context, ContinuationImpl continuationImpl) {
        C30615q0 c30615q0;
        Object objMo90611p;
        if (continuationImpl instanceof C30615q0) {
            c30615q0 = (C30615q0) continuationImpl;
            int i11 = c30615q0.f61856c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30615q0.f61856c = i11 - Integer.MIN_VALUE;
            } else {
                c30615q0 = new C30615q0(this, continuationImpl);
            }
        } else {
            c30615q0 = new C30615q0(this, continuationImpl);
        }
        Object obj = c30615q0.f61854a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30615q0.f61856c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f61355S = true;
            AbstractC28073M0.updateState$default(this, false, new C30621r0(null), 1, null);
            if (this.f61347K && this.f61371y == null) {
                this.f61364r = true;
                m70340a(context);
            }
            InterfaceC41565d interfaceC41565d = this.f61351O;
            c30615q0.f61856c = 1;
            objMo90611p = interfaceC41565d.mo90611p(c30615q0);
            if (objMo90611p == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo90611p = ((ChannelResult) obj).getHolder();
        }
        if (!ChannelResult.m90676i(objMo90611p)) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30626s0(this, null), 3, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final Object m70338a(SuspendLambda suspendLambda) {
        Object objM70339a = m70339a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.l3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30444C2.m70327d(this.f61781b);
            }
        }, suspendLambda);
        return objM70339a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70339a : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70339a(Function0 function0, ContinuationImpl continuationImpl) {
        C30475L0 c30475l0;
        InterfaceC41669n interfaceC41669n;
        C30486P c30486p;
        C30477M c30477m;
        Function0 function1;
        String str;
        if (continuationImpl instanceof C30475L0) {
            c30475l0 = (C30475L0) continuationImpl;
            int i11 = c30475l0.f61507h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30475l0.f61507h = i11 - Integer.MIN_VALUE;
            } else {
                c30475l0 = new C30475L0(this, continuationImpl);
            }
        } else {
            c30475l0 = new C30475L0(this, continuationImpl);
        }
        Object obj = c30475l0.f61505f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30475l0.f61507h;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "showDocumentFlipHint", null);
            this.f61355S = true;
            interfaceC41669n = this.f61343G;
            c30486p = (C30486P) interfaceC41669n.getValue();
            C30477M c30477m2 = new C30477M();
            if (!this.f61338B) {
                c30477m2 = null;
            }
            String imageName = SNSIconHandler.SNSCommonIcons.FLIP.getImageName();
            c30475l0.f61500a = function0;
            c30475l0.f61501b = interfaceC41669n;
            c30475l0.f61502c = c30486p;
            c30475l0.f61503d = c30477m2;
            c30475l0.f61504e = imageName;
            c30475l0.f61507h = 1;
            Object string = getString("sns_instructions_hint_turnOver", c30475l0);
            if (string == coroutine_suspended) {
                return coroutine_suspended;
            }
            c30477m = c30477m2;
            obj = string;
            function1 = function0;
            str = imageName;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c30475l0.f61504e;
            C30477M c30477m3 = c30475l0.f61503d;
            c30486p = c30475l0.f61502c;
            interfaceC41669n = c30475l0.f61501b;
            function1 = c30475l0.f61500a;
            ResultKt.throwOnFailure(obj);
            c30477m = c30477m3;
        }
        InterfaceC41669n interfaceC41669n2 = interfaceC41669n;
        C30486P c30486p2 = c30486p;
        String str2 = (String) obj;
        if (str2 == null) {
            str2 = C33627eb.f69716f;
        }
        interfaceC41669n2.setValue(C30486P.m70403a(c30486p2, null, null, c30477m, new C30489Q(str, str2, 0), null, 19));
        if (!this.f61338B) {
            AbstractC28073M0.updateState$default(this, false, new C30478M0(null), 1, null);
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30481N0(function1, this, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m70343a(C30503V c30503v) {
        if (c30503v != null) {
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "stopVideoRecording with error: " + c30503v, null);
        }
        InterfaceC41669n interfaceC41669n = this.f61343G;
        interfaceC41669n.setValue(C30486P.m70403a((C30486P) interfaceC41669n.getValue(), new C30531c0(null, false), null, null, null, c30503v != null ? new C28135m(new C29119g0(null, c30503v, new C29095c0(30, c30503v.f61587a, null, null), 1), this.f61055a.f59014a, null, null) : null, 6));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x0072, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x008c, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public final Object m70335a(Bitmap bitmap, boolean z11, ContinuationImpl continuationImpl) {
        C30555g0 c30555g0;
        long jCurrentTimeMillis;
        Object c33332k;
        boolean z12;
        long j11;
        boolean z13;
        C33333l c33333l;
        float f11;
        boolean z14;
        C33333l c33333l2;
        long j12;
        Float fBoxFloat;
        C33319a c33319a;
        C33319a c33319a2;
        if (continuationImpl instanceof C30555g0) {
            c30555g0 = (C30555g0) continuationImpl;
            int i11 = c30555g0.f61709e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30555g0.f61709e = i11 - Integer.MIN_VALUE;
            } else {
                c30555g0 = new C30555g0(this, continuationImpl);
            }
        } else {
            c30555g0 = new C30555g0(this, continuationImpl);
        }
        Object objM91049g = c30555g0.f61707c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30555g0.f61709e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM91049g);
            jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f61340D) {
                AbstractC41697j0 abstractC41697j0M91391a = C41782z0.m91391a();
                C30561h0 c30561h0 = new C30561h0(this, bitmap, null);
                c30555g0.f61705a = z11;
                c30555g0.f61706b = jCurrentTimeMillis;
                c30555g0.f61709e = 1;
                objM91049g = C41686h.m91049g(abstractC41697j0M91391a, c30561h0, c30555g0);
                if (objM91049g == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z12 = z11;
                j11 = jCurrentTimeMillis;
            } else {
                c33332k = new C33332k();
            }
            z13 = c33332k instanceof C33333l;
            if (z13) {
                c33333l = (C33333l) c33332k;
            } else {
                c33333l = null;
            }
            if (!this.f61338B) {
                C33272c.f67816e.f67810a.mo68955d("DocCapture", "badPhotos result: " + c33332k, null);
            }
            if (c33333l != null) {
                C33272c.f67816e.f67810a.mo68955d("DocCapture", "badPhotoDetector took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms, score=" + ((C33319a) c33333l.f67967a).f67943a, null);
                f11 = ((C33319a) c33333l.f67967a).f67943a;
            } else {
                f11 = -1.0f;
            }
            if (f11 >= this.f61360n.f67937b) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z13) {
                c33333l2 = (C33333l) c33332k;
            } else {
                c33333l2 = null;
            }
            if (c33333l2 != null || (c33319a2 = (C33319a) c33333l2.f67967a) == null) {
                j12 = -1;
            } else {
                j12 = c33319a2.f67944b;
            }
            fireEvent(new C30525b0(z14, f11, j12));
            if (c33333l != null || (c33319a = (C33319a) c33333l.f67967a) == null) {
                fBoxFloat = null;
            } else {
                fBoxFloat = Boxing.boxFloat(c33319a.f67943a);
            }
            C33318e c33318e = this.f61360n;
            C30497T c30497t = new C30497T(fBoxFloat, true, c33318e.f67938c, c33318e.f67937b);
            if (f11 <= 0.0f || z11) {
                return c30497t;
            }
            return null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j11 = c30555g0.f61706b;
        z12 = c30555g0.f61705a;
        ResultKt.throwOnFailure(objM91049g);
        c33332k = (AbstractC33335n) objM91049g;
        jCurrentTimeMillis = j11;
        z11 = z12;
        z13 = c33332k instanceof C33333l;
        if (z13) {
            c33333l = (C33333l) c33332k;
        } else {
            c33333l = null;
        }
        if (!this.f61338B) {
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "badPhotos result: " + c33332k, null);
        }
        if (c33333l != null) {
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "badPhotoDetector took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms, score=" + ((C33319a) c33333l.f67967a).f67943a, null);
            f11 = ((C33319a) c33333l.f67967a).f67943a;
        } else {
            f11 = -1.0f;
        }
        if (f11 >= this.f61360n.f67937b) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13) {
            c33333l2 = (C33333l) c33332k;
        } else {
            c33333l2 = null;
        }
        if (c33333l2 != null) {
            j12 = -1;
        } else {
            j12 = -1;
        }
        fireEvent(new C30525b0(z14, f11, j12));
        if (c33333l != null) {
            fBoxFloat = null;
        } else {
            fBoxFloat = null;
        }
        C33318e c33318e2 = this.f61360n;
        C30497T c30497t2 = new C30497T(fBoxFloat, true, c33318e2.f67938c, c33318e2.f67937b);
        if (f11 <= 0.0f) {
        }
        return c30497t2;
    }
}
