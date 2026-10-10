package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.C28135m;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.internal.core.analytics.C28366e;
import com.sumsub.sns.internal.core.analytics.GlobalStatePayload;
import com.sumsub.sns.internal.core.common.C28383A0;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.android.C28651g;
import com.sumsub.sns.internal.core.presentation.camera.AbstractC28738e;
import com.sumsub.sns.internal.core.presentation.camera.C28734c;
import com.sumsub.sns.internal.core.presentation.camera.C28736d;
import com.sumsub.sns.internal.core.presentation.camera.C28740f;
import com.sumsub.sns.internal.core.presentation.camera.CameraX$Mode;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29121g2;
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
import com.sumsub.sns.internal.features.data.repository.analytics.C29903a;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.presentation.camera.C30388m;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import com.sumsub.sns.internal.features.presentation.utils.C32638P;
import com.sumsub.sns.internal.log.AbstractC33293d;
import com.sumsub.sns.internal.log.AbstractC33294e;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.C41568g;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.InterfaceC41565d;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.json.JSONObject;
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
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.B2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30440B2 extends AbstractC28073M0 {

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ KProperty[] f61279U = {AbstractC28639a.m69485a(C30440B2.class, "collectedResults", "getCollectedResults()Ljava/util/List;", 0), AbstractC28639a.m69485a(C30440B2.class, "secondSidePromptPending", "getSecondSidePromptPending()Z", 0), AbstractC28639a.m69485a(C30440B2.class, "ffAutodocToggle", "getFfAutodocToggle()Z", 0), AbstractC28118g.m69077a(C30440B2.class, "ffAutocaptureTilt", "getFfAutocaptureTilt()Z", 0), AbstractC28639a.m69485a(C30440B2.class, "useLegacyCamera", "getUseLegacyCamera()Z", 0), AbstractC28639a.m69485a(C30440B2.class, "autoCaptureRequired", "getAutoCaptureRequired$idensic_mobile_sdk_aar_defaultRelease()Z", 0)};

    /* JADX INFO: renamed from: A */
    public boolean f61280A;

    /* JADX INFO: renamed from: B */
    public boolean f61281B;

    /* JADX INFO: renamed from: C */
    public boolean f61282C;

    /* JADX INFO: renamed from: D */
    public boolean f61283D;

    /* JADX INFO: renamed from: E */
    public boolean f61284E;

    /* JADX INFO: renamed from: F */
    public final C28936t f61285F;

    /* JADX INFO: renamed from: G */
    public boolean f61286G;

    /* JADX INFO: renamed from: H */
    public final InterfaceC41669n f61287H;

    /* JADX INFO: renamed from: I */
    public boolean f61288I;

    /* JADX INFO: renamed from: J */
    public final boolean f61289J;

    /* JADX INFO: renamed from: K */
    public final List f61290K;

    /* JADX INFO: renamed from: L */
    public final boolean f61291L;

    /* JADX INFO: renamed from: M */
    public long f61292M;

    /* JADX INFO: renamed from: N */
    public boolean f61293N;

    /* JADX INFO: renamed from: O */
    public SNSPhotoDocumentPickerViewModel2$PhotoCheckResult f61294O;

    /* JADX INFO: renamed from: P */
    public final InterfaceC41565d f61295P;

    /* JADX INFO: renamed from: Q */
    public boolean f61296Q;

    /* JADX INFO: renamed from: R */
    public final InterfaceC41565d f61297R;

    /* JADX INFO: renamed from: S */
    public C30520a1 f61298S;

    /* JADX INFO: renamed from: T */
    public boolean f61299T;

    /* JADX INFO: renamed from: a */
    public final C29070X f61300a;

    /* JADX INFO: renamed from: b */
    public final String f61301b;

    /* JADX INFO: renamed from: c */
    public final boolean f61302c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC29984m f61303d;

    /* JADX INFO: renamed from: e */
    public final C33316c f61304e;

    /* JADX INFO: renamed from: f */
    public final C33353d f61305f;

    /* JADX INFO: renamed from: g */
    public final C33318e f61306g;

    /* JADX INFO: renamed from: h */
    public final C33310d f61307h;

    /* JADX INFO: renamed from: i */
    public final C33313g f61308i;

    /* JADX INFO: renamed from: j */
    public final SavedStateHandle f61309j;

    /* JADX INFO: renamed from: k */
    public final C32635M f61310k;

    /* JADX INFO: renamed from: l */
    public final C30388m f61311l;

    /* JADX INFO: renamed from: m */
    public final C30633t2 f61312m;

    /* JADX INFO: renamed from: n */
    public final C28651g f61313n;

    /* JADX INFO: renamed from: o */
    public IdentitySide f61314o;

    /* JADX INFO: renamed from: p */
    public boolean f61315p;

    /* JADX INFO: renamed from: q */
    public final C28936t f61316q;

    /* JADX INFO: renamed from: r */
    public boolean f61317r;

    /* JADX INFO: renamed from: s */
    public final C28936t f61318s;

    /* JADX INFO: renamed from: t */
    public final Lazy f61319t;

    /* JADX INFO: renamed from: u */
    public final C28936t f61320u;

    /* JADX INFO: renamed from: v */
    public final C28936t f61321v;

    /* JADX INFO: renamed from: w */
    public final Lazy f61322w;

    /* JADX INFO: renamed from: x */
    public final C28936t f61323x;

    /* JADX INFO: renamed from: y */
    public final Lazy f61324y;

    /* JADX INFO: renamed from: z */
    public File f61325z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    public C30440B2(C29070X c29070x, String str, String str2, boolean z11, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, C33316c c33316c, C33353d c33353d, C33318e c33318e, C33310d c33310d, C33313g c33313g, SavedStateHandle savedStateHandle, C32635M c32635m) {
        ?? EmptyList;
        super(interfaceC29953a, interfaceC29984m);
        this.f61300a = c29070x;
        this.f61301b = str;
        this.f61302c = z11;
        this.f61303d = interfaceC29984m;
        this.f61304e = c33316c;
        this.f61305f = c33353d;
        this.f61306g = c33318e;
        this.f61307h = c33310d;
        this.f61308i = c33313g;
        this.f61309j = savedStateHandle;
        this.f61310k = c32635m;
        this.f61311l = new C30388m(this, savedStateHandle, "DocCapture", interfaceC29984m, c29070x, str, str2);
        this.f61312m = new C30633t2(this);
        this.f61313n = new C28651g(savedStateHandle);
        this.f61316q = new C28936t(savedStateHandle, "key_collected_results", CollectionsKt.emptyList(), false);
        Boolean bool = Boolean.FALSE;
        this.f61318s = new C28936t(savedStateHandle, "key_second_side_prompt_pending", bool, false);
        this.f61319t = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.e3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C30440B2.m70277a(this.f61694b));
            }
        });
        this.f61320u = new C28936t(savedStateHandle, "ffAutodocToggle", Boolean.valueOf(C33048a.f67487t.m71434a()), true);
        this.f61321v = new C28936t(savedStateHandle, "ffAutocaptureTilt", Boolean.valueOf(C33048a.f67490w.m71434a()), true);
        this.f61322w = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.f3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30440B2.m70281e();
            }
        });
        this.f61323x = new C28936t(savedStateHandle, "key_use_legacy_camera", bool, false);
        this.f61324y = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.g3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30440B2.m70278b(this.f61719b);
            }
        });
        this.f61285F = new C28936t(savedStateHandle, "autoCaptureRequired", bool, false);
        this.f61287H = C41679x.m91009a(new C30538d1(null, 26));
        Boolean bool2 = (Boolean) savedStateHandle.get("EXTRA_IS_RETAKE");
        this.f61289J = bool2 != null ? bool2.booleanValue() : false;
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
        this.f61290K = EmptyList;
        Boolean bool3 = (Boolean) this.f61309j.get("EXTRA_IS_SEAMLESS");
        this.f61291L = bool3 != null ? bool3.booleanValue() : false;
        this.f61292M = Long.MIN_VALUE;
        this.f61295P = C41568g.m90691b(0, null, null, 7, null);
        this.f61297R = C41568g.m90691b(0, null, null, 7, null);
    }

    /* JADX INFO: renamed from: b */
    public static final C30518a m70278b(C30440B2 c30440b2) {
        return new C30518a(c30440b2.f61307h);
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m70279c(C30440B2 c30440b2) {
        c30440b2.f61283D = false;
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "photo animation finished", null);
        AbstractC28073M0.updateState$default(c30440b2, false, new C30502U1(c30440b2, null), 1, null);
        C41696j.m91104d(ViewModelKt.getViewModelScope(c30440b2), null, null, new C30505V1(c30440b2, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final C30467I2 m70281e() {
        C30464H2 c30464h2 = C30467I2.f61427d;
        String str = C33048a.f67491x.m71435b().f67504b;
        if (str == null) {
            return new C30467I2();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C30467I2((float) jSONObject.optDouble("tiltAnimationCycleDurationSec", 3.0d), jSONObject.optInt("tiltAnimationNumberOfCycles", 1), (float) jSONObject.optDouble("tiltWaitAfterAnimationSec", 3.0d));
        } catch (Throwable th2) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a(AbstractC33294e.m71624a(c30464h2), "Failed to parse w2AskToTiltDocumentOnSeamlessConfig FF", th2);
            return new C30467I2();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m70297a(Context context) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "initiateVideoRecord", null);
        File externalCacheDir = C28468k0.f57988f ? context.getExternalCacheDir() : null;
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        this.f61325z = new File(externalCacheDir, "docapture_" + UUID.randomUUID() + ".mp4");
        InterfaceC41669n interfaceC41669n = this.f61287H;
        interfaceC41669n.setValue(C30538d1.m70407a((C30538d1) interfaceC41669n.getValue(), new C30616q1(this.f61325z, true), null, null, null, null, null, 62));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011b, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(r4, r2) == r3) goto L35;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70310d(ContinuationImpl continuationImpl) {
        C30557g2 c30557g2;
        C30538d1 c30538d1;
        InterfaceC41669n interfaceC41669n;
        if (continuationImpl instanceof C30557g2) {
            c30557g2 = (C30557g2) continuationImpl;
            int i11 = c30557g2.f61718e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30557g2.f61718e = i11 - Integer.MIN_VALUE;
            } else {
                c30557g2 = new C30557g2(this, continuationImpl);
            }
        } else {
            c30557g2 = new C30557g2(this, continuationImpl);
        }
        Object obj = c30557g2.f61716c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30557g2.f61718e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "showDocumentTiltHint", null);
            this.f61296Q = true;
            AbstractC28073M0.updateState$default(this, false, new C30563h2(null), 1, null);
            InterfaceC41669n interfaceC41669n2 = this.f61287H;
            c30538d1 = (C30538d1) interfaceC41669n2.getValue();
            c30557g2.f61714a = interfaceC41669n2;
            c30557g2.f61715b = c30538d1;
            c30557g2.f61718e = 1;
            Object string = getString("sns_instructions_hint_tiltDocument", c30557g2);
            if (string != coroutine_suspended) {
                interfaceC41669n = interfaceC41669n2;
                obj = string;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            c30538d1 = c30557g2.f61715b;
            interfaceC41669n = c30557g2.f61714a;
            ResultKt.throwOnFailure(obj);
        } else if (i12 == 2) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41669n interfaceC41669n3 = this.f61287H;
            interfaceC41669n3.setValue(C30538d1.m70407a((C30538d1) interfaceC41669n3.getValue(), null, null, null, null, null, null, 47));
            long j11 = (long) (((C30467I2) this.f61322w.getValue()).f61430c * 1000);
            c30557g2.f61718e = 3;
        } else {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.f61296Q = false;
        return Unit.INSTANCE;
        C30538d1 c30538d2 = c30538d1;
        String str = (String) obj;
        if (str == null) {
            str = C33627eb.f69716f;
        }
        C30516Z0 c30516z0 = new C30516Z0(str, 6);
        String str2 = this.f61301b;
        interfaceC41669n.setValue(C30538d1.m70407a(c30538d2, null, null, c30516z0, null, new C30610p1(str2 != null ? AbstractC29121g2.m69769a(str2) : null, (IdentitySide) this.f61309j.get("current_side"), Boxing.boxFloat(((C30467I2) this.f61322w.getValue()).f61428a)), null, 35));
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "waiting for tilt hint ... ", null);
        C30467I2 c30467i2 = (C30467I2) this.f61322w.getValue();
        long j12 = (long) (c30467i2.f61429b * c30467i2.f61428a * 1000);
        c30557g2.f61714a = null;
        c30557g2.f61715b = null;
        c30557g2.f61718e = 2;
        if (DelayKt.m90350b(j12, c30557g2) != coroutine_suspended) {
            InterfaceC41669n interfaceC41669n4 = this.f61287H;
            interfaceC41669n4.setValue(C30538d1.m70407a((C30538d1) interfaceC41669n4.getValue(), null, null, null, null, null, null, 47));
            long j13 = (long) (((C30467I2) this.f61322w.getValue()).f61430c * 1000);
            c30557g2.f61718e = 3;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: f */
    public final Object m70312f(ContinuationImpl continuationImpl) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "another side requested, showing turn-document hint", null);
        Object objM70296a = m70296a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.b3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30440B2.m70282e(this.f61646b);
            }
        }, continuationImpl);
        return objM70296a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70296a : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public final CameraX$Mode m70314g() {
        CameraX$Mode cameraX$Mode;
        if (this.f61291L) {
            C28936t c28936t = this.f61323x;
            KProperty kProperty = f61279U[4];
            cameraX$Mode = ((Boolean) c28936t.m69705a()).booleanValue() ? CameraX$Mode.SEAMLESS_DOC_CAPTURE_LEGACY : CameraX$Mode.SEAMLESS_DOC_CAPTURE;
        } else {
            C28936t c28936t2 = this.f61285F;
            KProperty kProperty2 = f61279U[5];
            if (((Boolean) c28936t2.m69705a()).booleanValue()) {
                cameraX$Mode = CameraX$Mode.PHOTO_AND_ANALYZER;
                if (!this.f61307h.f67923l) {
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

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final InterfaceC28147s getDefaultState() {
        return new C30627s1();
    }

    /* JADX INFO: renamed from: h */
    public final List m70316h() {
        C28936t c28936t = this.f61316q;
        KProperty kProperty = f61279U[0];
        return (List) c28936t.m69705a();
    }

    /* JADX INFO: renamed from: i */
    public final C30538d1 m70317i() {
        C30616q1 c30616q1 = new C30616q1(this.f61325z, this.f61281B);
        if (!this.f61291L) {
            c30616q1 = null;
        }
        return new C30538d1(c30616q1, 24);
    }

    /* JADX INFO: renamed from: j */
    public final void m70318j() {
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("DocCapture", "onTakePictureClicked", null);
        if (this.f61296Q) {
            c33270a.f67810a.mo68955d("DocCapture", "ignoring take picture while side capture is delayed", null);
            return;
        }
        if (this.f61298S != null) {
            c33270a.f67810a.mo68955d("DocCapture", "Skipping manually taken picture in favour of auto.", null);
            return;
        }
        if (this.f61283D) {
            c33270a.f67810a.mo68955d("DocCapture", "ignoring take picture while photo animation is pending", null);
            return;
        }
        this.f61283D = true;
        int i11 = AbstractC30632t1.f61893b[m70314g().ordinal()];
        if (i11 == 1) {
            c33270a.f67810a.mo68955d("DocCapture", "On take picture is clicked", null);
            fireEvent(new C30526b1());
        } else if (i11 != 2) {
            this.f61288I = true;
        } else {
            this.f61288I = true;
            c33270a.f67810a.mo68955d("DocCapture", "On take picture is clicked", null);
            fireEvent(new C30526b1());
        }
        fireEvent(new C30598n1(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.c3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30440B2.m70279c(this.f61656b);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final void m70319k() {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "sideness unknown, prompting for a second side", null);
        C28936t c28936t = this.f61318s;
        KProperty kProperty = f61279U[1];
        c28936t.f58834a.set(c28936t.f58835b, Boolean.TRUE);
        AbstractC28073M0.updateState$default(this, false, new C30521a2(null), 1, null);
        this.f61296Q = true;
        InterfaceC41669n interfaceC41669n = this.f61287H;
        interfaceC41669n.setValue(C30538d1.m70407a((C30538d1) interfaceC41669n.getValue(), null, null, this.f61282C ? new C30516Z0(null, 7) : null, null, null, null, 59));
        fireEvent(C32638P.f66633a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0108  */
    /* JADX WARN: Code duplicated, block: B:37:0x010c  */
    /* JADX WARN: Code duplicated, block: B:39:0x011e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0132  */
    /* JADX WARN: Code duplicated, block: B:46:0x014e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x015d, code lost:
    
        if (m70315g(r0) == r1) goto L49;
     */
    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onPrepare(Continuation continuation) {
        C30493R1 c30493r1;
        IdentitySide identitySideM71283a;
        CameraX$Mode cameraX$ModeM70314g;
        Object objM70295a;
        CameraX$Mode cameraX$Mode;
        C30440B2 c30440b2;
        C28936t c28936t;
        if (continuation instanceof C30493R1) {
            c30493r1 = (C30493R1) continuation;
            int i11 = c30493r1.f61563e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30493r1.f61563e = i11 - Integer.MIN_VALUE;
            } else {
                c30493r1 = new C30493R1(this, (ContinuationImpl) continuation);
            }
        } else {
            c30493r1 = new C30493R1(this, (ContinuationImpl) continuation);
        }
        Object obj = c30493r1.f61561c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30493r1.f61563e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c30493r1.f61563e = 1;
            if (AbstractC28073M0.onPrepare$suspendImpl(this, c30493r1) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 == 2) {
                ResultKt.throwOnFailure(obj);
                if (this.f61310k != null) {
                    c28936t = this.f61318s;
                    KProperty kProperty = f61279U[1];
                    if (((Boolean) c28936t.m69705a()).booleanValue()) {
                        m70319k();
                    }
                }
                cameraX$ModeM70314g = m70314g();
                c30493r1.f61559a = cameraX$ModeM70314g;
                c30493r1.f61560b = this;
                c30493r1.f61563e = 3;
                objM70295a = m70295a(c30493r1);
                if (objM70295a != coroutine_suspended) {
                    cameraX$Mode = cameraX$ModeM70314g;
                    obj = objM70295a;
                    c30440b2 = this;
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    C28936t c28936t2 = c30440b2.f61285F;
                    KProperty kProperty2 = f61279U[5];
                    c28936t2.f58834a.set(c28936t2.f58835b, bool);
                    if (m70314g() != cameraX$Mode) {
                        fireEvent(C30580k1.f61758a);
                    }
                    c30493r1.f61559a = null;
                    c30493r1.f61560b = null;
                    c30493r1.f61563e = 4;
                }
                return coroutine_suspended;
            }
            if (i12 == 3) {
                c30440b2 = c30493r1.f61560b;
                cameraX$Mode = c30493r1.f61559a;
                ResultKt.throwOnFailure(obj);
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                C28936t c28936t3 = c30440b2.f61285F;
                KProperty kProperty3 = f61279U[5];
                c28936t3.f58834a.set(c28936t3.f58835b, bool2);
                if (m70314g() != cameraX$Mode) {
                    fireEvent(C30580k1.f61758a);
                }
                c30493r1.f61559a = null;
                c30493r1.f61560b = null;
                c30493r1.f61563e = 4;
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30451E1(this, new C30496S1(this, null), null), 3, null);
        return Unit.INSTANCE;
        Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Camera is started. Side - " + ((IdentitySide) this.f61309j.get("current_side")), null, 4, null);
        C29903a c29903a = C28366e.f57832a;
        C28366e.f57834c.put(GlobalStatePayload.IdDocType, this.f61300a.f59014a);
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "onPrepare: docType: " + this.f61300a + ", idType: " + this.f61301b + ", sides: " + this.f61290K, null);
        C32635M c32635m = this.f61310k;
        if ((c32635m == null || (identitySideM71283a = c32635m.f66620l.m71283a()) == null) && (identitySideM71283a = (IdentitySide) CollectionsKt.firstOrNull(this.f61290K)) == null) {
            identitySideM71283a = IdentitySide.Front;
        }
        m70299a(identitySideM71283a);
        List listEmptyList = CollectionsKt.emptyList();
        C28936t c28936t4 = this.f61316q;
        KProperty kProperty4 = f61279U[0];
        c28936t4.f58834a.set(c28936t4.f58835b, listEmptyList);
        C32635M c32635m2 = this.f61310k;
        if (c32635m2 != null) {
            String str = (String) this.f61309j.get("EXTRA_COUNTRY_CODE");
            String str2 = this.f61301b;
            c30493r1.f61563e = 2;
            if (c32635m2.m71230a(str, str2, c30493r1) != coroutine_suspended) {
                if (this.f61310k != null) {
                    c28936t = this.f61318s;
                    KProperty kProperty5 = f61279U[1];
                    if (((Boolean) c28936t.m69705a()).booleanValue()) {
                        m70319k();
                    }
                }
                cameraX$ModeM70314g = m70314g();
                c30493r1.f61559a = cameraX$ModeM70314g;
                c30493r1.f61560b = this;
                c30493r1.f61563e = 3;
                objM70295a = m70295a(c30493r1);
                if (objM70295a != coroutine_suspended) {
                    cameraX$Mode = cameraX$ModeM70314g;
                    obj = objM70295a;
                    c30440b2 = this;
                    Boolean bool3 = (Boolean) obj;
                    bool3.getClass();
                    C28936t c28936t5 = c30440b2.f61285F;
                    KProperty kProperty6 = f61279U[5];
                    c28936t5.f58834a.set(c28936t5.f58835b, bool3);
                    if (m70314g() != cameraX$Mode) {
                        fireEvent(C30580k1.f61758a);
                    }
                    c30493r1.f61559a = null;
                    c30493r1.f61560b = null;
                    c30493r1.f61563e = 4;
                }
            }
        } else {
            if (this.f61310k != null) {
                c28936t = this.f61318s;
                KProperty kProperty7 = f61279U[1];
                if (((Boolean) c28936t.m69705a()).booleanValue()) {
                    m70319k();
                }
            }
            cameraX$ModeM70314g = m70314g();
            c30493r1.f61559a = cameraX$ModeM70314g;
            c30493r1.f61560b = this;
            c30493r1.f61563e = 3;
            objM70295a = m70295a(c30493r1);
            if (objM70295a != coroutine_suspended) {
                cameraX$Mode = cameraX$ModeM70314g;
                obj = objM70295a;
                c30440b2 = this;
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                C28936t c28936t6 = c30440b2.f61285F;
                KProperty kProperty8 = f61279U[5];
                c28936t6.f58834a.set(c28936t6.f58835b, bool4);
                if (m70314g() != cameraX$Mode) {
                    fireEvent(C30580k1.f61758a);
                }
                c30493r1.f61559a = null;
                c30493r1.f61560b = null;
                c30493r1.f61563e = 4;
            }
        }
        return coroutine_suspended;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30455F1(this, null), 3, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onHandleError(AbstractC29149l0 abstractC29149l0) {
        AbstractC30574j1 abstractC30574j1;
        Parcelable parcelableMo69766d = abstractC29149l0.mo69766d();
        if (parcelableMo69766d instanceof AbstractC30574j1) {
            abstractC30574j1 = (AbstractC30574j1) parcelableMo69766d;
        } else {
            abstractC30574j1 = null;
        }
        if (abstractC30574j1 != null) {
            m70302a(abstractC30574j1);
        } else {
            super.onHandleError(abstractC29149l0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m70308b(File file) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "onVideoRecordingStarted: " + file, null);
        this.f61315p = false;
        this.f61281B = true;
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30517Z1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m70313f() {
        if (!this.f61291L || !this.f61282C) {
            return false;
        }
        C28936t c28936t = this.f61321v;
        KProperty kProperty = f61279U[3];
        return ((Boolean) c28936t.m69705a()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (m70296a(r6, r0) == r1) goto L23;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70309c(ContinuationImpl continuationImpl) {
        C30527b2 c30527b2;
        if (continuationImpl instanceof C30527b2) {
            c30527b2 = (C30527b2) continuationImpl;
            int i11 = c30527b2.f61645c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30527b2.f61645c = i11 - Integer.MIN_VALUE;
            } else {
                c30527b2 = new C30527b2(this, continuationImpl);
            }
        } else {
            c30527b2 = new C30527b2(this, continuationImpl);
        }
        Object obj = c30527b2.f61643a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30527b2.f61645c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            if (m70313f()) {
                c30527b2.f61645c = 1;
                if (m70310d(c30527b2) != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.h3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30440B2.m70280d(this.f61725b);
            }
        };
        c30527b2.f61645c = 2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
    
        if (m70284a(r12, r3, r11, r4, r6) == r0) goto L39;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70305b(Context context, Bitmap bitmap, ContinuationImpl continuationImpl) {
        C30499T1 c30499t1;
        Context context2;
        Bitmap bitmap2;
        Bitmap bitmap3;
        C30556g1 c30556g1;
        C30556g1 c30556g2;
        if (continuationImpl instanceof C30499T1) {
            c30499t1 = (C30499T1) continuationImpl;
            int i11 = c30499t1.f61583e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30499t1.f61583e = i11 - Integer.MIN_VALUE;
            } else {
                c30499t1 = new C30499T1(this, continuationImpl);
            }
        } else {
            c30499t1 = new C30499T1(this, continuationImpl);
        }
        C30499T1 c30499t2 = c30499t1;
        Object objM70290a = c30499t2.f61581c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30499t2.f61583e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70290a);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "onRequestedPictureTaken: waiting=" + this.f61283D, null);
            this.f61288I = false;
            if (this.f61283D) {
                InterfaceC41565d interfaceC41565d = this.f61297R;
                c30499t2.f61579a = context;
                c30499t2.f61580b = bitmap;
                c30499t2.f61583e = 1;
                if (interfaceC41565d.mo90550D(c30499t2) != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            bitmap = c30499t2.f61580b;
            context = c30499t2.f61579a;
            ResultKt.throwOnFailure(objM70290a);
        } else if (i12 == 2) {
            bitmap2 = c30499t2.f61580b;
            context2 = c30499t2.f61579a;
            ResultKt.throwOnFailure(objM70290a);
            c30556g2 = (C30556g1) objM70290a;
            if (c30556g2 != null) {
                c30556g1 = new C30556g1(c30556g2.f61710a, false, c30556g2.f61712c, c30556g2.f61713d);
                bitmap3 = bitmap2;
            } else {
                Context context3 = context2;
                bitmap = bitmap2;
                context = context3;
                bitmap3 = bitmap;
                c30556g1 = null;
                context2 = context;
            }
            Rect rect = new Rect(0, 0, 0, 0);
            c30499t2.f61579a = null;
            c30499t2.f61580b = null;
            c30499t2.f61583e = 3;
        } else {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70290a);
        }
        return Unit.INSTANCE;
        if (this.f61291L || this.f61286G) {
            c30499t2.f61579a = context;
            c30499t2.f61580b = bitmap;
            c30499t2.f61583e = 2;
            objM70290a = m70290a(bitmap, true, (ContinuationImpl) c30499t2);
            if (objM70290a != coroutine_suspended) {
                Bitmap bitmap4 = bitmap;
                context2 = context;
                bitmap2 = bitmap4;
                c30556g2 = (C30556g1) objM70290a;
                if (c30556g2 != null) {
                    c30556g1 = new C30556g1(c30556g2.f61710a, false, c30556g2.f61712c, c30556g2.f61713d);
                    bitmap3 = bitmap2;
                } else {
                    Context context4 = context2;
                    bitmap = bitmap2;
                    context = context4;
                    bitmap3 = bitmap;
                    c30556g1 = null;
                    context2 = context;
                }
                Rect rect2 = new Rect(0, 0, 0, 0);
                c30499t2.f61579a = null;
                c30499t2.f61580b = null;
                c30499t2.f61583e = 3;
            }
        } else {
            bitmap3 = bitmap;
            c30556g1 = null;
            context2 = context;
            Rect rect3 = new Rect(0, 0, 0, 0);
            c30499t2.f61579a = null;
            c30499t2.f61580b = null;
            c30499t2.f61583e = 3;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70276a(C30440B2 c30440b2, Context context, C30520a1 c30520a1, Rect rect, InterfaceC41565d interfaceC41565d) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "photo animation finished", null);
        C41696j.m91104d(ViewModelKt.getViewModelScope(c30440b2), null, null, new C30605o2(c30440b2, context, c30520a1, rect, interfaceC41565d, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: e */
    public final Object m70311e(ContinuationImpl continuationImpl) {
        C30569i2 c30569i2;
        DocCapture$PreferredMode docCapture$PreferredMode;
        if (continuationImpl instanceof C30569i2) {
            c30569i2 = (C30569i2) continuationImpl;
            int i11 = c30569i2.f61735c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30569i2.f61735c = i11 - Integer.MIN_VALUE;
            } else {
                c30569i2 = new C30569i2(this, continuationImpl);
            }
        } else {
            c30569i2 = new C30569i2(this, continuationImpl);
        }
        Object objM70042a = c30569i2.f61733a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30569i2.f61735c;
        boolean z11 = false;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            this.f61287H.setValue(C30538d1.m70407a(m70317i(), null, null, null, null, null, null, 55));
            if (!this.f61286G) {
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30599n2(this, null), 3, null);
            } else {
                if (m70314g() == CameraX$Mode.SEAMLESS_DOC_CAPTURE_LEGACY) {
                    docCapture$PreferredMode = DocCapture$PreferredMode.MANUAL;
                } else {
                    String str = (String) this.f61309j.get("EXTRA_PREFER_AUTO_CAPTURE");
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
                    C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30593m2(this, null), 3, null);
                } else {
                    C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30599n2(this, null), 3, null);
                }
            }
            InterfaceC29984m interfaceC29984m = this.f61303d;
            c30569i2.f61735c = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c30569i2);
            if (objM70042a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70042a);
        }
        AbstractC29172p abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
        if (abstractC29172p == null) {
            C33272c.f67816e.f67810a.mo68956e("DocCapture", "showInitialViewState: error. Applicant null", null);
            finishAbnormal("showInitialViewState: error. Applicant null");
            return Unit.INSTANCE;
        }
        AbstractC29180q2 abstractC29180q2 = (AbstractC29180q2) CollectionsKt.firstOrNull(abstractC29172p.m69796b(this.f61300a));
        if (((IdentitySide) this.f61309j.get("current_side")) == IdentitySide.Back) {
            boolean z12 = this.f61286G;
            if (z12 && !this.f61289J) {
                z11 = true;
            }
            this.f61317r = z11;
            if (!z12 && !this.f61289J) {
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30575j2(this, null), 3, null);
            }
        }
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "SDK is using - " + abstractC29180q2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m70315g(ContinuationImpl continuationImpl) {
        C30587l2 c30587l2;
        C30538d1 c30538d1;
        InterfaceC41669n interfaceC41669n;
        String str;
        C30516Z0 c30516z0;
        if (continuationImpl instanceof C30587l2) {
            c30587l2 = (C30587l2) continuationImpl;
            int i11 = c30587l2.f61780g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30587l2.f61780g = i11 - Integer.MIN_VALUE;
            } else {
                c30587l2 = new C30587l2(this, continuationImpl);
            }
        } else {
            c30587l2 = new C30587l2(this, continuationImpl);
        }
        Object obj = c30587l2.f61778e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30587l2.f61780g;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "showWaitPopup", null);
            InterfaceC41669n interfaceC41669n2 = this.f61287H;
            c30538d1 = (C30538d1) interfaceC41669n2.getValue();
            C30516Z0 c30516z1 = new C30516Z0(null, 7);
            if (!this.f61282C) {
                c30516z1 = null;
            }
            c30587l2.f61774a = interfaceC41669n2;
            c30587l2.f61775b = c30538d1;
            c30587l2.f61776c = c30516z1;
            c30587l2.f61777d = "";
            c30587l2.f61780g = 1;
            Object string = getString("sns_general_progress_text", c30587l2);
            if (string == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC41669n = interfaceC41669n2;
            obj = string;
            str = "";
            c30516z0 = c30516z1;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c30587l2.f61777d;
            C30516Z0 c30516z2 = c30587l2.f61776c;
            C30538d1 c30538d2 = c30587l2.f61775b;
            interfaceC41669n = c30587l2.f61774a;
            ResultKt.throwOnFailure(obj);
            c30516z0 = c30516z2;
            c30538d1 = c30538d2;
        }
        String str2 = (String) obj;
        if (str2 == null) {
            str2 = C33627eb.f69716f;
        }
        interfaceC41669n.setValue(C30538d1.m70407a(c30538d1, null, null, c30516z0, new C30544e1(str, str2), null, null, 51));
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
    public static final Object m70275a(C30440B2 c30440b2, C28734c c28734c, ContinuationImpl continuationImpl) {
        C30447D1 c30447d1;
        String str;
        c30440b2.getClass();
        if (continuationImpl instanceof C30447D1) {
            c30447d1 = (C30447D1) continuationImpl;
            int i11 = c30447d1.f61381d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30447d1.f61381d = i11 - Integer.MIN_VALUE;
            } else {
                c30447d1 = new C30447D1(c30440b2, continuationImpl);
            }
        } else {
            c30447d1 = new C30447D1(c30440b2, continuationImpl);
        }
        Object string = c30447d1.f61379b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30447d1.f61381d;
        String str2 = C33627eb.f69716f;
        if (i12 == 0) {
            ResultKt.throwOnFailure(string);
            c30447d1.f61378a = c28734c;
            c30447d1.f61381d = 1;
            string = c30440b2.getString("sns_seamless_error_general", c30447d1);
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
                c30440b2.m70301a(new C30568i1(str2));
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
            c30440b2.m70301a(new C30568i1(str2));
            return Unit.INSTANCE;
        }
        c28734c = c30447d1.f61378a;
        ResultKt.throwOnFailure(string);
        str = (String) string;
        if (str == null) {
            str = C33627eb.f69716f;
        }
        int i13 = c28734c.f58436a;
        if (i13 == 3) {
            c30447d1.f61378a = null;
            c30447d1.f61381d = 2;
            string = c30440b2.getString("sns_seamless_error_notEnoughStorage", c30447d1);
        } else {
            if (i13 == 9 || i13 == 2) {
                c30447d1.f61378a = null;
                c30447d1.f61381d = 3;
                string = c30440b2.getString("sns_seamless_error_timeExceeded", c30447d1);
            } else {
                str2 = str;
            }
            c30440b2.m70301a(new C30568i1(str2));
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007e A[PHI: r11
      0x007e: PHI (r11v4 java.lang.Object) = (r11v3 java.lang.Object), (r11v13 java.lang.Object) binds: [B:31:0x007b, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
    
        if (m70310d(r0) == r1) goto L44;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70306b(Context context, ContinuationImpl continuationImpl) {
        C30479M1 c30479m1;
        Object objMo90611p;
        if (continuationImpl instanceof C30479M1) {
            c30479m1 = (C30479M1) continuationImpl;
            int i11 = c30479m1.f61518d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30479m1.f61518d = i11 - Integer.MIN_VALUE;
            } else {
                c30479m1 = new C30479M1(this, continuationImpl);
            }
        } else {
            c30479m1 = new C30479M1(this, continuationImpl);
        }
        Object obj = c30479m1.f61516b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30479m1.f61518d;
        if (i12 != 0) {
            if (i12 == 1) {
                context = c30479m1.f61515a;
                ResultKt.throwOnFailure(obj);
                if (this.f61291L && this.f61325z == null) {
                    this.f61315p = true;
                    m70297a(context);
                }
                InterfaceC41565d interfaceC41565d = this.f61295P;
                c30479m1.f61515a = null;
                c30479m1.f61518d = 2;
                objMo90611p = interfaceC41565d.mo90611p(c30479m1);
                if (objMo90611p != coroutine_suspended) {
                    if (ChannelResult.m90676i(objMo90611p)) {
                        return Unit.INSTANCE;
                    }
                    c30479m1.f61518d = 3;
                    if (DelayKt.m90350b(2000L, c30479m1) != coroutine_suspended) {
                        if (m70313f()) {
                            c30479m1.f61518d = 4;
                        }
                    }
                }
                return coroutine_suspended;
            }
            if (i12 == 2) {
                ResultKt.throwOnFailure(obj);
                objMo90611p = ((ChannelResult) obj).getHolder();
                if (ChannelResult.m90676i(objMo90611p)) {
                    return Unit.INSTANCE;
                }
                c30479m1.f61518d = 3;
                if (DelayKt.m90350b(2000L, c30479m1) != coroutine_suspended) {
                    if (m70313f()) {
                        c30479m1.f61518d = 4;
                    }
                }
                return coroutine_suspended;
            }
            if (i12 == 3) {
                ResultKt.throwOnFailure(obj);
                if (m70313f()) {
                    c30479m1.f61518d = 4;
                }
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30482N1(this, null), 3, null);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        this.f61296Q = true;
        if (!this.f61281B) {
            c30479m1.f61515a = context;
            c30479m1.f61518d = 1;
            if (m70315g(c30479m1) != coroutine_suspended) {
                if (this.f61291L) {
                    this.f61315p = true;
                    m70297a(context);
                }
                InterfaceC41565d interfaceC41565d2 = this.f61295P;
                c30479m1.f61515a = null;
                c30479m1.f61518d = 2;
                objMo90611p = interfaceC41565d2.mo90611p(c30479m1);
                if (objMo90611p != coroutine_suspended) {
                    if (ChannelResult.m90676i(objMo90611p)) {
                        return Unit.INSTANCE;
                    }
                    c30479m1.f61518d = 3;
                    if (DelayKt.m90350b(2000L, c30479m1) != coroutine_suspended) {
                        if (m70313f()) {
                            c30479m1.f61518d = 4;
                        }
                        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30482N1(this, null), 3, null);
                        return Unit.INSTANCE;
                    }
                }
            }
        } else {
            if (m70313f()) {
                c30479m1.f61518d = 4;
            }
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30482N1(this, null), 3, null);
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: a */
    public final void m70299a(IdentitySide identitySide) {
        C32635M c32635m;
        boolean z11 = this.f61314o != identitySide;
        this.f61314o = identitySide;
        this.f61309j.set("current_side", identitySide);
        if (z11) {
            this.f61311l.m70263a(identitySide);
            if (identitySide == null || (c32635m = this.f61310k) == null) {
                return;
            }
            c32635m.m71239a(identitySide);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m70280d(C30440B2 c30440b2) {
        InterfaceC41669n interfaceC41669n = c30440b2.f61287H;
        interfaceC41669n.setValue(C30538d1.m70407a((C30538d1) interfaceC41669n.getValue(), null, null, null, null, null, null, 55));
        c30440b2.m70299a((IdentitySide) c30440b2.f61290K.get(c30440b2.m70316h().size()));
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "requestDocumentNextSide: " + ((IdentitySide) c30440b2.f61309j.get("current_side")), null);
        AbstractC28073M0.updateState$default(c30440b2, false, new C30533c2(null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final Object m70288a(Context context, File file, boolean z11, C30611p2 c30611p2) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "Picture is taken. Side - " + ((IdentitySide) this.f61309j.get("current_side")), null);
        C29054T c29054t = new C29054T(file, file, null, null, (IdentitySide) this.f61309j.get("current_side"), Boxing.boxBoolean(z11), null, 940);
        List mutableList = CollectionsKt.toMutableList((Collection) m70316h());
        mutableList.add(c29054t);
        C28936t c28936t = this.f61316q;
        KProperty kProperty = f61279U[0];
        c28936t.f58834a.set(c28936t.f58835b, mutableList);
        if (!this.f61291L) {
            C32635M c32635m = this.f61310k;
            if (c32635m != null) {
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30435A1(this, c32635m, c29054t, null), 3, null);
            } else {
                showProgress(true);
                AbstractC28052C.finish$default(this, null, c29054t, null, null, 13, null);
            }
            return Unit.INSTANCE;
        }
        if (!this.f61290K.isEmpty() && this.f61290K.size() > m70316h().size()) {
            if (m70316h().size() != 1) {
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30491Q1(this, null), 3, null);
                return Unit.INSTANCE;
            }
            Object objM70289a = m70289a(context, c30611p2);
            return objM70289a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70289a : Unit.INSTANCE;
        }
        if (m70316h().size() != 1) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30488P1(this, null), 3, null);
            return Unit.INSTANCE;
        }
        Object objM70306b = m70306b(context, c30611p2);
        return objM70306b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70306b : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m70307b(ContinuationImpl continuationImpl) {
        C30439B1 c30439b1;
        C30538d1 c30538d1;
        String imageName;
        InterfaceC41669n interfaceC41669n;
        C30538d1 c30538d2;
        InterfaceC41669n interfaceC41669n2;
        C30544e1 c30544e1;
        if (continuationImpl instanceof C30439B1) {
            c30439b1 = (C30439B1) continuationImpl;
            int i11 = c30439b1.f61278f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30439b1.f61278f = i11 - Integer.MIN_VALUE;
            } else {
                c30439b1 = new C30439B1(this, continuationImpl);
            }
        } else {
            c30439b1 = new C30439B1(this, continuationImpl);
        }
        Object objM70292a = c30439b1.f61276d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30439b1.f61278f;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70292a);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "finishWithCurrentResults: isCapturingVideo=" + this.f61281B, null);
            if (this.f61281B) {
                this.f61280A = true;
                InterfaceC41669n interfaceC41669n3 = this.f61287H;
                c30538d1 = (C30538d1) interfaceC41669n3.getValue();
                imageName = SNSIconHandler.SNSCommonIcons.SUCCESS_CHECK.getImageName();
                c30439b1.f61273a = c30538d1;
                c30439b1.f61274b = interfaceC41669n3;
                c30439b1.f61275c = imageName;
                c30439b1.f61278f = 1;
                Object string = getString("sns_instructions_hint_allSet", c30439b1);
                if (string != coroutine_suspended) {
                    interfaceC41669n = interfaceC41669n3;
                    objM70292a = string;
                }
                return coroutine_suspended;
            }
            AbstractC28052C.finish$default(this, null, new C29015J(m70316h(), true), null, null, 13, null);
            return Unit.INSTANCE;
        }
        if (i12 == 1) {
            String str = (String) c30439b1.f61275c;
            interfaceC41669n = (InterfaceC41669n) c30439b1.f61274b;
            C30538d1 c30538d3 = c30439b1.f61273a;
            ResultKt.throwOnFailure(objM70292a);
            imageName = str;
            c30538d1 = c30538d3;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC41669n2 = (InterfaceC41669n) c30439b1.f61275c;
            C30544e1 c30544e2 = (C30544e1) c30439b1.f61274b;
            C30538d1 c30538d4 = c30439b1.f61273a;
            ResultKt.throwOnFailure(objM70292a);
            c30538d2 = c30538d4;
            c30544e1 = c30544e2;
        }
        interfaceC41669n2.setValue(C30538d1.m70407a(c30538d2, null, null, new C30516Z0(C33627eb.f69716f, ((C30516Z0) objM70292a).f61625b, SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State.DEFAULT), c30544e1, null, null, 51));
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30443C1(this, null), 3, null);
        return Unit.INSTANCE;
        String str2 = (String) objM70292a;
        if (str2 == null) {
            str2 = C33627eb.f69716f;
        }
        C30544e1 c30544e3 = new C30544e1(imageName, str2, 0);
        C30536d c30536d = new C30536d(false, CheckDetectionResult$SizeCheckResult.SMALL, false);
        c30439b1.f61273a = c30538d1;
        c30439b1.f61274b = c30544e3;
        c30439b1.f61275c = interfaceC41669n;
        c30439b1.f61278f = 2;
        objM70292a = m70292a(c30536d, false, (ContinuationImpl) c30439b1);
        if (objM70292a != coroutine_suspended) {
            c30538d2 = c30538d1;
            interfaceC41669n2 = interfaceC41669n;
            c30544e1 = c30544e3;
            interfaceC41669n2.setValue(C30538d1.m70407a(c30538d2, null, null, new C30516Z0(C33627eb.f69716f, ((C30516Z0) objM70292a).f61625b, SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State.DEFAULT), c30544e1, null, null, 51));
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30443C1(this, null), 3, null);
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m70282e(C30440B2 c30440b2) {
        InterfaceC41669n interfaceC41669n = c30440b2.f61287H;
        interfaceC41669n.setValue(C30538d1.m70407a((C30538d1) interfaceC41669n.getValue(), null, null, null, null, null, null, 55));
        AbstractC28073M0.updateState$default(c30440b2, false, new C30581k2(null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m70277a(C30440B2 c30440b2) {
        if (!c30440b2.f61291L) {
            C28936t c28936t = c30440b2.f61320u;
            KProperty kProperty = f61279U[2];
            if (!((Boolean) c28936t.m69705a()).booleanValue()) {
                return false;
            }
        }
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX INFO: renamed from: a */
    public final void m70302a(AbstractC30574j1 abstractC30574j1) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "handleVideoRecordError: " + abstractC30574j1, null);
        fireEvent(C30586l1.f61773a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70295a(ContinuationImpl continuationImpl) {
        C30642v1 c30642v1;
        Object next;
        DocCapture$PreferredMode docCapture$PreferredMode;
        if (continuationImpl instanceof C30642v1) {
            c30642v1 = (C30642v1) continuationImpl;
            int i11 = c30642v1.f61916c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30642v1.f61916c = i11 - Integer.MIN_VALUE;
            } else {
                c30642v1 = new C30642v1(this, continuationImpl);
            }
        } else {
            c30642v1 = new C30642v1(this, continuationImpl);
        }
        Object objM70042a = c30642v1.f61914a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30642v1.f61916c;
        boolean z11 = false;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            InterfaceC29984m interfaceC29984m = this.f61303d;
            c30642v1.f61916c = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c30642v1);
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
        } while (!Intrinsics.areEqual(((C29154m) next).f59132a, this.f61300a));
        C29154m c29154m = (C29154m) next;
        boolean z12 = c29154m != null && c29154m.m69787a() && Intrinsics.areEqual(c29154m.f59135d, VideoRequiredType.DocCapture.getValue());
        boolean zBooleanValue = ((Boolean) this.f61319t.getValue()).booleanValue();
        boolean z13 = this.f61291L;
        if (m70314g() == CameraX$Mode.SEAMLESS_DOC_CAPTURE_LEGACY) {
            docCapture$PreferredMode = DocCapture$PreferredMode.MANUAL;
        } else {
            String str = (String) this.f61309j.get("EXTRA_PREFER_AUTO_CAPTURE");
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
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "checkAutoCaptureAllowedForStep: auto capture ff.enabled=" + zBooleanValue + ", level.autoEnabled=" + z12 + ", seamlessDocapture.enabled=" + z13 + ", preferredMode=" + value + ", isRetake=" + this.f61289J, null);
        if (((Boolean) this.f61319t.getValue()).booleanValue() && z12) {
            z11 = true;
        }
        return Boxing.boxBoolean(z11);
    }

    /* JADX INFO: renamed from: a */
    public final void m70303a(File file) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "onPictureTaken: waiting=" + this.f61283D, null);
        if (this.f61283D) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30485O1(this, file, null), 3, null);
            return;
        }
        Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Picture is taken", null, 4, null);
        C29054T c29054t = new C29054T(file, file, null, null, (IdentitySide) this.f61309j.get("current_side"), null, null, 1004);
        C32635M c32635m = this.f61310k;
        if (c32635m != null) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30435A1(this, c32635m, c29054t, null), 3, null);
        } else {
            showProgress(true);
            AbstractC28052C.finish$default(this, null, c29054t, null, null, 13, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m70298a(C28740f c28740f) {
        File file = c28740f.f58443a;
        String str = "video recording stopped. isWaitingForVideo=" + this.f61280A + ", " + file;
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("DocCapture", str, null);
        this.f61281B = false;
        this.f61315p = false;
        this.f61325z = null;
        AbstractC28738e abstractC28738e = c28740f.f58444b;
        boolean z11 = abstractC28738e instanceof C28734c;
        if (z11) {
            c33270a.f67810a.mo68955d("DocCapture", "onVideoRecordingFinalized: " + abstractC28738e, ((C28734c) abstractC28738e).f58437b);
        }
        if (!this.f61280A) {
            c33270a.f67810a.mo68955d("DocCapture", "onVideoRecorded: removing video file", null);
            file.delete();
            if (z11) {
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30511X1(this, abstractC28738e, null), 3, null);
                return;
            }
            return;
        }
        this.f61280A = false;
        C28736d c28736d = abstractC28738e instanceof C28736d ? (C28736d) abstractC28738e : null;
        if (c28736d == null) {
            return;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) m70316h());
        mutableList.add(new C29054T(file, file, null, "IDENTITY_VIDEO", null, null, new C29050S(c28736d.f58439a, c28736d.f58440b), 868));
        C28936t c28936t = this.f61316q;
        KProperty kProperty = f61279U[0];
        c28936t.f58834a.set(c28936t.f58835b, mutableList);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30514Y1(this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (m70294a(r10, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
    
        if (m70294a(r10, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00de, code lost:
    
        if (r10 == r1) goto L48;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70293a(C32635M c32635m, C29054T c29054t, ContinuationImpl continuationImpl) {
        C30661z1 c30661z1;
        if (continuationImpl instanceof C30661z1) {
            c30661z1 = (C30661z1) continuationImpl;
            int i11 = c30661z1.f61962e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30661z1.f61962e = i11 - Integer.MIN_VALUE;
            } else {
                c30661z1 = new C30661z1(this, continuationImpl);
            }
        } else {
            c30661z1 = new C30661z1(this, continuationImpl);
        }
        Object obj = c30661z1.f61960c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30661z1.f61962e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "camera side captured, side=" + c29054t.f58998e, null);
            this.f61296Q = true;
            c30661z1.f61958a = c32635m;
            c30661z1.f61959b = c29054t;
            c30661z1.f61962e = 1;
            if (c32635m.mo70878a(c29054t, c30661z1) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i12 == 3) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        c29054t = c30661z1.f61959b;
        c32635m = c30661z1.f61958a;
        ResultKt.throwOnFailure(obj);
        IdentitySide identitySide = c29054t.f58998e;
        IdentitySide identitySide2 = IdentitySide.Back;
        if (identitySide == identitySide2) {
            c30661z1.f61958a = null;
            c30661z1.f61959b = null;
            c30661z1.f61962e = 2;
        } else {
            int i13 = AbstractC30632t1.f61892a[c32635m.m71255h().ordinal()];
            if (i13 == 1) {
                c30661z1.f61958a = null;
                c30661z1.f61959b = null;
                c30661z1.f61962e = 3;
                c32635m.m71239a(identitySide2);
                m70299a(c32635m.f66620l.m71283a());
                Object objM70312f = m70312f(c30661z1);
                if (objM70312f != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objM70312f = Unit.INSTANCE;
                }
            } else {
                if (i13 == 2) {
                    m70319k();
                    return Unit.INSTANCE;
                }
                if (i13 == 3) {
                    c30661z1.f61958a = null;
                    c30661z1.f61959b = null;
                    c30661z1.f61962e = 4;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e4, code lost:
    
        if (r1.m71235a(r4, r6, r8, r2) == r3) goto L32;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70294a(C32635M c32635m, ContinuationImpl continuationImpl) {
        C30643v2 c30643v2;
        C32635M c32635m2;
        Object string;
        if (continuationImpl instanceof C30643v2) {
            c30643v2 = (C30643v2) continuationImpl;
            int i11 = c30643v2.f61920d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30643v2.f61920d = i11 - Integer.MIN_VALUE;
            } else {
                c30643v2 = new C30643v2(this, continuationImpl);
            }
        } else {
            c30643v2 = new C30643v2(this, continuationImpl);
        }
        Object obj = c30643v2.f61918b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30643v2.f61920d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            List listM71250c = c32635m.m71250c();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM71250c, 10));
            Iterator it = listM71250c.iterator();
            while (it.hasNext()) {
                arrayList.add(((C29054T) it.next()).f58998e);
            }
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "camera upload, sides=" + arrayList, null);
            this.f61296Q = true;
            InterfaceC41669n interfaceC41669n = this.f61287H;
            interfaceC41669n.setValue(C30538d1.m70407a((C30538d1) interfaceC41669n.getValue(), null, null, this.f61282C ? new C30516Z0(null, 7) : null, null, null, null, 51));
            c32635m2 = c32635m;
            c30643v2.f61917a = c32635m2;
            c30643v2.f61920d = 1;
            string = getString("sns_general_state_uploading", c30643v2);
            if (string != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            C32635M c32635m3 = c30643v2.f61917a;
            ResultKt.throwOnFailure(obj);
            string = obj;
            c32635m2 = c32635m3;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        String str = (String) string;
        if (str == null) {
            str = C33627eb.f69716f;
        }
        AbstractC28073M0.updateState$default(this, false, new C30648w2(str, null), 1, null);
        C30652x2 c30652x2 = new C30652x2(this, c32635m2, null);
        C30657y2 c30657y2 = new C30657y2(this, null);
        C30436A2 c30436a2 = new C30436A2(this);
        c30643v2.f61917a = null;
        c30643v2.f61920d = 2;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0228  */
    /* JADX WARN: Code duplicated, block: B:106:0x022d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x0232  */
    /* JADX WARN: Code duplicated, block: B:112:0x0250  */
    /* JADX WARN: Code duplicated, block: B:115:0x025a  */
    /* JADX WARN: Code duplicated, block: B:117:0x025d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0263  */
    /* JADX WARN: Code duplicated, block: B:121:0x0287  */
    /* JADX WARN: Code duplicated, block: B:124:0x029d  */
    /* JADX WARN: Code duplicated, block: B:125:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:129:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:133:0x02bf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x0146  */
    /* JADX WARN: Code duplicated, block: B:61:0x0175  */
    /* JADX WARN: Code duplicated, block: B:67:0x0184  */
    /* JADX WARN: Code duplicated, block: B:69:0x0188  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x0200  */
    /* JADX WARN: Code duplicated, block: B:94:0x0213  */
    /* JADX WARN: Code duplicated, block: B:95:0x0216  */
    /* JADX WARN: Code duplicated, block: B:98:0x021c  */
    /* JADX WARN: Code duplicated, block: B:99:0x021e A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
    
        if (m70305b(r1, r24, r4) == r5) goto L132;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:119:0x0263, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:82:0x01bb, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70285a(Context context, Bitmap bitmap, Rect rect, ContinuationImpl continuationImpl) {
        C30470J1 c30470j1;
        long jCurrentTimeMillis;
        Rect rect2;
        Bitmap bitmap2;
        C33350a c33350a;
        C30536d c30536dM70404a;
        C30520a1 c30520a1;
        int i11;
        int i12;
        Rect rect3;
        boolean zBooleanValue;
        C30536d c30536d;
        Bitmap bitmap3;
        Context context2;
        int i13;
        int i14;
        SNSPhotoDocumentPickerViewModel2$FrameHandleResult sNSPhotoDocumentPickerViewModel2$FrameHandleResult;
        SNSPhotoDocumentPickerViewModel2$PhotoCheckResult sNSPhotoDocumentPickerViewModel2$PhotoCheckResult;
        SNSPhotoDocumentPickerViewModel2$PhotoCheckResult sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2;
        boolean z11;
        long jCurrentTimeMillis2;
        boolean z12;
        SNSPhotoDocumentPickerViewModel2$PhotoCheckResult sNSPhotoDocumentPickerViewModel2$PhotoCheckResult3;
        SNSPhotoDocumentPickerViewModel2$PhotoCheckResult sNSPhotoDocumentPickerViewModel2$PhotoCheckResult4;
        C30520a1 c30520a2;
        SNSPhotoDocumentPickerViewModel2$PhotoCheckResult sNSPhotoDocumentPickerViewModel2$PhotoCheckResult5;
        SNSPhotoDocumentPickerViewModel2$FrameHandleResult sNSPhotoDocumentPickerViewModel2$FrameHandleResult2;
        Context context3 = context;
        if (continuationImpl instanceof C30470J1) {
            c30470j1 = (C30470J1) continuationImpl;
            int i15 = c30470j1.f61457i;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c30470j1.f61457i = i15 - Integer.MIN_VALUE;
            } else {
                c30470j1 = new C30470J1(this, continuationImpl);
            }
        } else {
            c30470j1 = new C30470J1(this, continuationImpl);
        }
        Object objM91049g = c30470j1.f61455g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i16 = c30470j1.f61457i;
        if (i16 == 0) {
            ResultKt.throwOnFailure(objM91049g);
            if (this.f61317r) {
                this.f61317r = false;
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30473K1(this, null), 3, null);
            }
            if (this.f61315p) {
                return SNSPhotoDocumentPickerViewModel2$FrameHandleResult.RELEASED;
            }
            if (this.f61296Q) {
                m70300a(SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.SKIPPED);
                return SNSPhotoDocumentPickerViewModel2$FrameHandleResult.RELEASED;
            }
            if (this.f61288I) {
                c30470j1.f61457i = 1;
            } else {
                if (!Intrinsics.areEqual(((C30538d1) this.f61287H.getValue()).f61666b, Boxing.boxBoolean(true))) {
                    m70300a(SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.SKIPPED);
                    return SNSPhotoDocumentPickerViewModel2$FrameHandleResult.RELEASED;
                }
                if (this.f61305f.f67965f) {
                    C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30599n2(this, null), 3, null);
                    m70300a(SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.SKIPPED);
                    return SNSPhotoDocumentPickerViewModel2$FrameHandleResult.RELEASED;
                }
                if (!this.f61296Q && !this.f61280A) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    AbstractC41697j0 abstractC41697j0M91391a = C41782z0.m91391a();
                    C30476L1 c30476l1 = new C30476L1(this, bitmap, null);
                    c30470j1.f61449a = context3;
                    c30470j1.f61450b = bitmap;
                    rect2 = rect;
                    c30470j1.f61451c = rect2;
                    c30470j1.f61452d = jCurrentTimeMillis;
                    c30470j1.f61457i = 2;
                    objM91049g = C41686h.m91049g(abstractC41697j0M91391a, c30476l1, c30470j1);
                    if (objM91049g != coroutine_suspended) {
                        bitmap2 = bitmap;
                        c33350a = (C33350a) objM91049g;
                        if (c33350a != null) {
                            c30536dM70404a = ((C30518a) this.f61324y.getValue()).m70404a(bitmap2.getWidth() / this.f61305f.f68000h.f67909d.getWidth(), bitmap2.getHeight() / this.f61305f.f68000h.f67909d.getHeight(), rect2, c33350a);
                        } else {
                            c30536dM70404a = null;
                        }
                        if (c30536dM70404a == null) {
                            if (this.f61299T) {
                                C33272c.f67816e.f67810a.mo68955d("DocCapture", "lost document bounds", null);
                                this.f61299T = false;
                                ((C30518a) this.f61324y.getValue()).f61631c = false;
                                fireEvent(C30550f1.f61700a);
                            }
                        } else if (this.f61299T) {
                            C33272c.f67816e.f67810a.mo68955d("DocCapture", "lost document bounds", null);
                            this.f61299T = false;
                            ((C30518a) this.f61324y.getValue()).f61631c = false;
                            fireEvent(C30550f1.f61700a);
                        }
                        c30520a1 = this.f61298S;
                        if (c30520a1 != null) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        if (c30536dM70404a == null) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                        }
                        if (i12 != 0) {
                            C33272c.f67816e.f67810a.mo68955d("DocCapture", "docDetector took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms", null);
                            c30470j1.f61449a = context3;
                            c30470j1.f61450b = rect2;
                            c30470j1.f61451c = c30536dM70404a;
                            c30470j1.f61453e = i11;
                            c30470j1.f61454f = i12;
                            c30470j1.f61457i = 3;
                            objM91049g = m70286a(context3, bitmap2, c30470j1);
                            if (objM91049g != coroutine_suspended) {
                                context2 = context3;
                                rect3 = rect2;
                                i13 = i12;
                                c30536d = c30536dM70404a;
                                i14 = i11;
                                zBooleanValue = ((Boolean) objM91049g).booleanValue();
                                i12 = i13;
                                i11 = i14;
                                context3 = context2;
                                if (zBooleanValue) {
                                    sNSPhotoDocumentPickerViewModel2$FrameHandleResult = SNSPhotoDocumentPickerViewModel2$FrameHandleResult.TAKEN;
                                } else {
                                    sNSPhotoDocumentPickerViewModel2$FrameHandleResult = SNSPhotoDocumentPickerViewModel2$FrameHandleResult.RELEASED;
                                }
                                sNSPhotoDocumentPickerViewModel2$PhotoCheckResult = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.SKIPPED;
                                if (i12 != 0) {
                                    if (!zBooleanValue) {
                                        z11 = false;
                                    } else {
                                        z11 = false;
                                    }
                                    if (this.f61293N) {
                                        C33272c.f67816e.f67810a.mo68955d("DocCapture", "started waiting for better photo", null);
                                        this.f61292M = System.currentTimeMillis();
                                        this.f61293N = true;
                                    } else {
                                        C33272c.f67816e.f67810a.mo68955d("DocCapture", "started waiting for better photo", null);
                                        this.f61292M = System.currentTimeMillis();
                                        this.f61293N = true;
                                    }
                                    jCurrentTimeMillis2 = System.currentTimeMillis() - this.f61292M;
                                    if (this.f61293N) {
                                        z12 = false;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        sNSPhotoDocumentPickerViewModel2$PhotoCheckResult3 = this.f61294O;
                                        sNSPhotoDocumentPickerViewModel2$PhotoCheckResult4 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.FOCUSING;
                                        if (sNSPhotoDocumentPickerViewModel2$PhotoCheckResult3 != sNSPhotoDocumentPickerViewModel2$PhotoCheckResult4) {
                                            this.f61293N = false;
                                            C33272c.f67816e.f67810a.mo68955d("DocCapture", "timeout waiting for better photo after: " + jCurrentTimeMillis2 + " ms", null);
                                            c30520a2 = this.f61298S;
                                            if (c30520a2 != null) {
                                                this.f61298S = null;
                                                sNSPhotoDocumentPickerViewModel2$PhotoCheckResult5 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.CAPTURED;
                                                sNSPhotoDocumentPickerViewModel2$FrameHandleResult2 = SNSPhotoDocumentPickerViewModel2$FrameHandleResult.RELEASED;
                                                c30470j1.f61449a = c30536d;
                                                c30470j1.f61450b = sNSPhotoDocumentPickerViewModel2$FrameHandleResult2;
                                                c30470j1.f61451c = sNSPhotoDocumentPickerViewModel2$PhotoCheckResult5;
                                                c30470j1.f61457i = 4;
                                                if (m70287a(context3, rect3, c30520a2, c30470j1) != coroutine_suspended) {
                                                    sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel2$PhotoCheckResult5;
                                                    sNSPhotoDocumentPickerViewModel2$FrameHandleResult = sNSPhotoDocumentPickerViewModel2$FrameHandleResult2;
                                                }
                                            } else {
                                                sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel2$PhotoCheckResult4;
                                            }
                                        } else if (z12) {
                                            sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.FOCUSING;
                                        } else {
                                            sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.WAITING;
                                        }
                                    } else if (z12) {
                                        sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.FOCUSING;
                                    } else {
                                        sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.WAITING;
                                    }
                                } else {
                                    sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel2$PhotoCheckResult;
                                }
                                m70300a(sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2);
                                c30470j1.f61449a = sNSPhotoDocumentPickerViewModel2$FrameHandleResult;
                                c30470j1.f61450b = null;
                                c30470j1.f61451c = null;
                                c30470j1.f61457i = 5;
                                if (m70291a(c30536d, sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2, c30470j1) != coroutine_suspended) {
                                    return sNSPhotoDocumentPickerViewModel2$FrameHandleResult;
                                }
                            }
                        } else {
                            this.f61293N = false;
                            if (c30520a1 != null) {
                                bitmap3.recycle();
                            }
                            this.f61298S = null;
                            rect3 = rect2;
                            zBooleanValue = false;
                            c30536d = c30536dM70404a;
                            if (zBooleanValue) {
                                sNSPhotoDocumentPickerViewModel2$FrameHandleResult = SNSPhotoDocumentPickerViewModel2$FrameHandleResult.TAKEN;
                            } else {
                                sNSPhotoDocumentPickerViewModel2$FrameHandleResult = SNSPhotoDocumentPickerViewModel2$FrameHandleResult.RELEASED;
                            }
                            sNSPhotoDocumentPickerViewModel2$PhotoCheckResult = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.SKIPPED;
                            if (i12 != 0) {
                                if (!zBooleanValue) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                if (this.f61293N) {
                                    C33272c.f67816e.f67810a.mo68955d("DocCapture", "started waiting for better photo", null);
                                    this.f61292M = System.currentTimeMillis();
                                    this.f61293N = true;
                                } else {
                                    C33272c.f67816e.f67810a.mo68955d("DocCapture", "started waiting for better photo", null);
                                    this.f61292M = System.currentTimeMillis();
                                    this.f61293N = true;
                                }
                                jCurrentTimeMillis2 = System.currentTimeMillis() - this.f61292M;
                                if (this.f61293N) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    sNSPhotoDocumentPickerViewModel2$PhotoCheckResult3 = this.f61294O;
                                    sNSPhotoDocumentPickerViewModel2$PhotoCheckResult4 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.FOCUSING;
                                    if (sNSPhotoDocumentPickerViewModel2$PhotoCheckResult3 != sNSPhotoDocumentPickerViewModel2$PhotoCheckResult4) {
                                        this.f61293N = false;
                                        C33272c.f67816e.f67810a.mo68955d("DocCapture", "timeout waiting for better photo after: " + jCurrentTimeMillis2 + " ms", null);
                                        c30520a2 = this.f61298S;
                                        if (c30520a2 != null) {
                                            this.f61298S = null;
                                            sNSPhotoDocumentPickerViewModel2$PhotoCheckResult5 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.CAPTURED;
                                            sNSPhotoDocumentPickerViewModel2$FrameHandleResult2 = SNSPhotoDocumentPickerViewModel2$FrameHandleResult.RELEASED;
                                            c30470j1.f61449a = c30536d;
                                            c30470j1.f61450b = sNSPhotoDocumentPickerViewModel2$FrameHandleResult2;
                                            c30470j1.f61451c = sNSPhotoDocumentPickerViewModel2$PhotoCheckResult5;
                                            c30470j1.f61457i = 4;
                                            if (m70287a(context3, rect3, c30520a2, c30470j1) != coroutine_suspended) {
                                                sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel2$PhotoCheckResult5;
                                                sNSPhotoDocumentPickerViewModel2$FrameHandleResult = sNSPhotoDocumentPickerViewModel2$FrameHandleResult2;
                                            }
                                        } else {
                                            sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel2$PhotoCheckResult4;
                                        }
                                    } else if (z12) {
                                        sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.FOCUSING;
                                    } else {
                                        sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.WAITING;
                                    }
                                } else if (z12) {
                                    sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.FOCUSING;
                                } else {
                                    sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.WAITING;
                                }
                            } else {
                                sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel2$PhotoCheckResult;
                            }
                            m70300a(sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2);
                            c30470j1.f61449a = sNSPhotoDocumentPickerViewModel2$FrameHandleResult;
                            c30470j1.f61450b = null;
                            c30470j1.f61451c = null;
                            c30470j1.f61457i = 5;
                            if (m70291a(c30536d, sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2, c30470j1) != coroutine_suspended) {
                                return sNSPhotoDocumentPickerViewModel2$FrameHandleResult;
                            }
                        }
                    }
                } else {
                    m70300a(SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.SKIPPED);
                    return SNSPhotoDocumentPickerViewModel2$FrameHandleResult.RELEASED;
                }
            }
        } else {
            if (i16 == 1) {
                ResultKt.throwOnFailure(objM91049g);
                m70300a(SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.CAPTURED);
                return SNSPhotoDocumentPickerViewModel2$FrameHandleResult.RELEASED;
            }
            if (i16 == 2) {
                long j11 = c30470j1.f61452d;
                rect2 = (Rect) c30470j1.f61451c;
                bitmap2 = (Bitmap) c30470j1.f61450b;
                Context context4 = (Context) c30470j1.f61449a;
                ResultKt.throwOnFailure(objM91049g);
                jCurrentTimeMillis = j11;
                context3 = context4;
                c33350a = (C33350a) objM91049g;
                if (c33350a != null) {
                    c30536dM70404a = ((C30518a) this.f61324y.getValue()).m70404a(bitmap2.getWidth() / this.f61305f.f68000h.f67909d.getWidth(), bitmap2.getHeight() / this.f61305f.f68000h.f67909d.getHeight(), rect2, c33350a);
                } else {
                    c30536dM70404a = null;
                }
                if (c30536dM70404a == null && c33350a != null) {
                    C30592m1 c30592m1M70283a = m70283a(c30536dM70404a, c33350a, bitmap2);
                    if (c30592m1M70283a != null) {
                        fireEvent(c30592m1M70283a);
                    }
                } else if (this.f61299T) {
                    C33272c.f67816e.f67810a.mo68955d("DocCapture", "lost document bounds", null);
                    this.f61299T = false;
                    ((C30518a) this.f61324y.getValue()).f61631c = false;
                    fireEvent(C30550f1.f61700a);
                }
                c30520a1 = this.f61298S;
                if (c30520a1 != null) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (c30536dM70404a == null && c30536dM70404a.f61660a && c30536dM70404a.f61661b == CheckDetectionResult$SizeCheckResult.OK) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                if (i12 != 0) {
                    C33272c.f67816e.f67810a.mo68955d("DocCapture", "docDetector took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms", null);
                    c30470j1.f61449a = context3;
                    c30470j1.f61450b = rect2;
                    c30470j1.f61451c = c30536dM70404a;
                    c30470j1.f61453e = i11;
                    c30470j1.f61454f = i12;
                    c30470j1.f61457i = 3;
                    objM91049g = m70286a(context3, bitmap2, c30470j1);
                    if (objM91049g != coroutine_suspended) {
                        context2 = context3;
                        rect3 = rect2;
                        i13 = i12;
                        c30536d = c30536dM70404a;
                        i14 = i11;
                        zBooleanValue = ((Boolean) objM91049g).booleanValue();
                        i12 = i13;
                        i11 = i14;
                        context3 = context2;
                        if (zBooleanValue) {
                            sNSPhotoDocumentPickerViewModel2$FrameHandleResult = SNSPhotoDocumentPickerViewModel2$FrameHandleResult.TAKEN;
                        } else {
                            sNSPhotoDocumentPickerViewModel2$FrameHandleResult = SNSPhotoDocumentPickerViewModel2$FrameHandleResult.RELEASED;
                        }
                        sNSPhotoDocumentPickerViewModel2$PhotoCheckResult = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.SKIPPED;
                        if (i12 != 0) {
                            if (!zBooleanValue) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (this.f61293N) {
                                C33272c.f67816e.f67810a.mo68955d("DocCapture", "started waiting for better photo", null);
                                this.f61292M = System.currentTimeMillis();
                                this.f61293N = true;
                            } else {
                                C33272c.f67816e.f67810a.mo68955d("DocCapture", "started waiting for better photo", null);
                                this.f61292M = System.currentTimeMillis();
                                this.f61293N = true;
                            }
                            jCurrentTimeMillis2 = System.currentTimeMillis() - this.f61292M;
                            if (this.f61293N) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                sNSPhotoDocumentPickerViewModel2$PhotoCheckResult3 = this.f61294O;
                                sNSPhotoDocumentPickerViewModel2$PhotoCheckResult4 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.FOCUSING;
                                if (sNSPhotoDocumentPickerViewModel2$PhotoCheckResult3 != sNSPhotoDocumentPickerViewModel2$PhotoCheckResult4) {
                                    this.f61293N = false;
                                    C33272c.f67816e.f67810a.mo68955d("DocCapture", "timeout waiting for better photo after: " + jCurrentTimeMillis2 + " ms", null);
                                    c30520a2 = this.f61298S;
                                    if (c30520a2 != null) {
                                        this.f61298S = null;
                                        sNSPhotoDocumentPickerViewModel2$PhotoCheckResult5 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.CAPTURED;
                                        sNSPhotoDocumentPickerViewModel2$FrameHandleResult2 = SNSPhotoDocumentPickerViewModel2$FrameHandleResult.RELEASED;
                                        c30470j1.f61449a = c30536d;
                                        c30470j1.f61450b = sNSPhotoDocumentPickerViewModel2$FrameHandleResult2;
                                        c30470j1.f61451c = sNSPhotoDocumentPickerViewModel2$PhotoCheckResult5;
                                        c30470j1.f61457i = 4;
                                        if (m70287a(context3, rect3, c30520a2, c30470j1) != coroutine_suspended) {
                                            sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel2$PhotoCheckResult5;
                                            sNSPhotoDocumentPickerViewModel2$FrameHandleResult = sNSPhotoDocumentPickerViewModel2$FrameHandleResult2;
                                        }
                                    } else {
                                        sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel2$PhotoCheckResult4;
                                    }
                                } else if (z12) {
                                    sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.FOCUSING;
                                } else {
                                    sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.WAITING;
                                }
                            } else if (z12) {
                                sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.FOCUSING;
                            } else {
                                sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.WAITING;
                            }
                        } else {
                            sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel2$PhotoCheckResult;
                        }
                    }
                } else {
                    this.f61293N = false;
                    if (c30520a1 != null && (bitmap3 = c30520a1.f61633a) != null) {
                        bitmap3.recycle();
                    }
                    this.f61298S = null;
                    rect3 = rect2;
                    zBooleanValue = false;
                    c30536d = c30536dM70404a;
                    if (zBooleanValue) {
                        sNSPhotoDocumentPickerViewModel2$FrameHandleResult = SNSPhotoDocumentPickerViewModel2$FrameHandleResult.TAKEN;
                    } else {
                        sNSPhotoDocumentPickerViewModel2$FrameHandleResult = SNSPhotoDocumentPickerViewModel2$FrameHandleResult.RELEASED;
                    }
                    sNSPhotoDocumentPickerViewModel2$PhotoCheckResult = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.SKIPPED;
                    if (i12 != 0) {
                        if (!zBooleanValue) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (this.f61293N) {
                            C33272c.f67816e.f67810a.mo68955d("DocCapture", "started waiting for better photo", null);
                            this.f61292M = System.currentTimeMillis();
                            this.f61293N = true;
                        } else {
                            C33272c.f67816e.f67810a.mo68955d("DocCapture", "started waiting for better photo", null);
                            this.f61292M = System.currentTimeMillis();
                            this.f61293N = true;
                        }
                        jCurrentTimeMillis2 = System.currentTimeMillis() - this.f61292M;
                        if (this.f61293N) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            sNSPhotoDocumentPickerViewModel2$PhotoCheckResult3 = this.f61294O;
                            sNSPhotoDocumentPickerViewModel2$PhotoCheckResult4 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.FOCUSING;
                            if (sNSPhotoDocumentPickerViewModel2$PhotoCheckResult3 != sNSPhotoDocumentPickerViewModel2$PhotoCheckResult4) {
                                this.f61293N = false;
                                C33272c.f67816e.f67810a.mo68955d("DocCapture", "timeout waiting for better photo after: " + jCurrentTimeMillis2 + " ms", null);
                                c30520a2 = this.f61298S;
                                if (c30520a2 != null) {
                                    this.f61298S = null;
                                    sNSPhotoDocumentPickerViewModel2$PhotoCheckResult5 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.CAPTURED;
                                    sNSPhotoDocumentPickerViewModel2$FrameHandleResult2 = SNSPhotoDocumentPickerViewModel2$FrameHandleResult.RELEASED;
                                    c30470j1.f61449a = c30536d;
                                    c30470j1.f61450b = sNSPhotoDocumentPickerViewModel2$FrameHandleResult2;
                                    c30470j1.f61451c = sNSPhotoDocumentPickerViewModel2$PhotoCheckResult5;
                                    c30470j1.f61457i = 4;
                                    if (m70287a(context3, rect3, c30520a2, c30470j1) != coroutine_suspended) {
                                        sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel2$PhotoCheckResult5;
                                        sNSPhotoDocumentPickerViewModel2$FrameHandleResult = sNSPhotoDocumentPickerViewModel2$FrameHandleResult2;
                                    }
                                } else {
                                    sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel2$PhotoCheckResult4;
                                }
                            } else if (z12) {
                                sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.FOCUSING;
                            } else {
                                sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.WAITING;
                            }
                        } else if (z12) {
                            sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.FOCUSING;
                        } else {
                            sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.WAITING;
                        }
                    } else {
                        sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel2$PhotoCheckResult;
                    }
                }
            } else if (i16 == 3) {
                i13 = c30470j1.f61454f;
                i14 = c30470j1.f61453e;
                c30536d = (C30536d) c30470j1.f61451c;
                rect3 = (Rect) c30470j1.f61450b;
                context2 = (Context) c30470j1.f61449a;
                ResultKt.throwOnFailure(objM91049g);
                zBooleanValue = ((Boolean) objM91049g).booleanValue();
                i12 = i13;
                i11 = i14;
                context3 = context2;
                if (zBooleanValue) {
                    sNSPhotoDocumentPickerViewModel2$FrameHandleResult = SNSPhotoDocumentPickerViewModel2$FrameHandleResult.TAKEN;
                } else {
                    sNSPhotoDocumentPickerViewModel2$FrameHandleResult = SNSPhotoDocumentPickerViewModel2$FrameHandleResult.RELEASED;
                }
                sNSPhotoDocumentPickerViewModel2$PhotoCheckResult = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.SKIPPED;
                if (i12 != 0) {
                    if (!zBooleanValue && i11 == 0 && this.f61294O == SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.FOCUSING) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (this.f61293N || z11) {
                        C33272c.f67816e.f67810a.mo68955d("DocCapture", "started waiting for better photo", null);
                        this.f61292M = System.currentTimeMillis();
                        this.f61293N = true;
                    }
                    jCurrentTimeMillis2 = System.currentTimeMillis() - this.f61292M;
                    if (this.f61293N || jCurrentTimeMillis2 < this.f61307h.f67914c) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        sNSPhotoDocumentPickerViewModel2$PhotoCheckResult3 = this.f61294O;
                        sNSPhotoDocumentPickerViewModel2$PhotoCheckResult4 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.FOCUSING;
                        if (sNSPhotoDocumentPickerViewModel2$PhotoCheckResult3 != sNSPhotoDocumentPickerViewModel2$PhotoCheckResult4) {
                            this.f61293N = false;
                            C33272c.f67816e.f67810a.mo68955d("DocCapture", "timeout waiting for better photo after: " + jCurrentTimeMillis2 + " ms", null);
                            c30520a2 = this.f61298S;
                            if (c30520a2 != null) {
                                this.f61298S = null;
                                sNSPhotoDocumentPickerViewModel2$PhotoCheckResult5 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.CAPTURED;
                                sNSPhotoDocumentPickerViewModel2$FrameHandleResult2 = SNSPhotoDocumentPickerViewModel2$FrameHandleResult.RELEASED;
                                c30470j1.f61449a = c30536d;
                                c30470j1.f61450b = sNSPhotoDocumentPickerViewModel2$FrameHandleResult2;
                                c30470j1.f61451c = sNSPhotoDocumentPickerViewModel2$PhotoCheckResult5;
                                c30470j1.f61457i = 4;
                                if (m70287a(context3, rect3, c30520a2, c30470j1) != coroutine_suspended) {
                                    sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel2$PhotoCheckResult5;
                                    sNSPhotoDocumentPickerViewModel2$FrameHandleResult = sNSPhotoDocumentPickerViewModel2$FrameHandleResult2;
                                }
                            } else {
                                sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel2$PhotoCheckResult4;
                            }
                        } else if (z12) {
                            sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.FOCUSING;
                        } else {
                            sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.WAITING;
                        }
                    } else if (z12) {
                        sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.FOCUSING;
                    } else {
                        sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.WAITING;
                    }
                } else {
                    sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = sNSPhotoDocumentPickerViewModel2$PhotoCheckResult;
                }
            } else {
                if (i16 != 4) {
                    if (i16 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SNSPhotoDocumentPickerViewModel2$FrameHandleResult sNSPhotoDocumentPickerViewModel2$FrameHandleResult3 = (SNSPhotoDocumentPickerViewModel2$FrameHandleResult) c30470j1.f61449a;
                    ResultKt.throwOnFailure(objM91049g);
                    return sNSPhotoDocumentPickerViewModel2$FrameHandleResult3;
                }
                sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2 = (SNSPhotoDocumentPickerViewModel2$PhotoCheckResult) c30470j1.f61451c;
                sNSPhotoDocumentPickerViewModel2$FrameHandleResult = (SNSPhotoDocumentPickerViewModel2$FrameHandleResult) c30470j1.f61450b;
                c30536d = (C30536d) c30470j1.f61449a;
                ResultKt.throwOnFailure(objM91049g);
            }
            m70300a(sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2);
            c30470j1.f61449a = sNSPhotoDocumentPickerViewModel2$FrameHandleResult;
            c30470j1.f61450b = null;
            c30470j1.f61451c = null;
            c30470j1.f61457i = 5;
            if (m70291a(c30536d, sNSPhotoDocumentPickerViewModel2$PhotoCheckResult2, c30470j1) != coroutine_suspended) {
                return sNSPhotoDocumentPickerViewModel2$FrameHandleResult;
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r11 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (r11 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        if (r11 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
    
        if (r11 == r1) goto L43;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70291a(C30536d c30536d, SNSPhotoDocumentPickerViewModel2$PhotoCheckResult sNSPhotoDocumentPickerViewModel2$PhotoCheckResult, ContinuationImpl continuationImpl) {
        C30638u2 c30638u2;
        C30516Z0 c30516z0;
        if (continuationImpl instanceof C30638u2) {
            c30638u2 = (C30638u2) continuationImpl;
            int i11 = c30638u2.f61907c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30638u2.f61907c = i11 - Integer.MIN_VALUE;
            } else {
                c30638u2 = new C30638u2(this, continuationImpl);
            }
        } else {
            c30638u2 = new C30638u2(this, continuationImpl);
        }
        Object objM70292a = c30638u2.f61905a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30638u2.f61907c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70292a);
            if (c30536d == null) {
                C30536d c30536d2 = new C30536d(false, CheckDetectionResult$SizeCheckResult.SMALL, false);
                c30638u2.f61907c = 1;
                objM70292a = m70292a(c30536d2, false, (ContinuationImpl) c30638u2);
            } else if (sNSPhotoDocumentPickerViewModel2$PhotoCheckResult == SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.SKIPPED) {
                c30638u2.f61907c = 2;
                objM70292a = m70292a(c30536d, false, (ContinuationImpl) c30638u2);
            } else if (sNSPhotoDocumentPickerViewModel2$PhotoCheckResult == SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.FOCUSING) {
                c30638u2.f61907c = 3;
                objM70292a = m70292a(c30536d, true, (ContinuationImpl) c30638u2);
            } else if (sNSPhotoDocumentPickerViewModel2$PhotoCheckResult == SNSPhotoDocumentPickerViewModel2$PhotoCheckResult.WAITING) {
                c30638u2.f61907c = 4;
                objM70292a = m70292a(c30536d, false, (ContinuationImpl) c30638u2);
            } else {
                c30516z0 = null;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM70292a);
            c30516z0 = (C30516Z0) objM70292a;
        } else if (i12 == 2) {
            ResultKt.throwOnFailure(objM70292a);
            c30516z0 = (C30516Z0) objM70292a;
        } else if (i12 == 3) {
            ResultKt.throwOnFailure(objM70292a);
            c30516z0 = (C30516Z0) objM70292a;
        } else {
            if (i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70292a);
            c30516z0 = (C30516Z0) objM70292a;
        }
        C30516Z0 c30516z1 = c30516z0;
        if (c30516z1 != null) {
            InterfaceC41669n interfaceC41669n = this.f61287H;
            interfaceC41669n.setValue(C30538d1.m70407a((C30538d1) interfaceC41669n.getValue(), null, null, c30516z1, null, null, null, 59));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final Object m70287a(final Context context, final Rect rect, final C30520a1 c30520a1, C30470J1 c30470j1) {
        final InterfaceC41565d interfaceC41565dM90691b = C41568g.m90691b(0, null, null, 7, null);
        this.f61283D = true;
        fireEvent(new C30598n1(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.d3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30440B2.m70276a(this.f61679b, context, c30520a1, rect, interfaceC41565dM90691b);
            }
        }));
        Object objMo90550D = interfaceC41565dM90691b.mo90550D(c30470j1);
        return objMo90550D == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo90550D : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70286a(Context context, Bitmap bitmap, ContinuationImpl continuationImpl) {
        C30656y1 c30656y1;
        Float f11;
        if (continuationImpl instanceof C30656y1) {
            c30656y1 = (C30656y1) continuationImpl;
            int i11 = c30656y1.f61951e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30656y1.f61951e = i11 - Integer.MIN_VALUE;
            } else {
                c30656y1 = new C30656y1(this, continuationImpl);
            }
        } else {
            c30656y1 = new C30656y1(this, continuationImpl);
        }
        Object objM70290a = c30656y1.f61949c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30656y1.f61951e;
        boolean zM70304a = false;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70290a);
            c30656y1.f61947a = context;
            c30656y1.f61948b = bitmap;
            c30656y1.f61951e = 1;
            objM70290a = m70290a(bitmap, false, (ContinuationImpl) c30656y1);
            if (objM70290a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bitmap = c30656y1.f61948b;
            context = c30656y1.f61947a;
            ResultKt.throwOnFailure(objM70290a);
        }
        C30556g1 c30556g1 = (C30556g1) objM70290a;
        if (((c30556g1 == null || (f11 = c30556g1.f61710a) == null) ? -1.0f : f11.floatValue()) >= this.f61306g.f67937b && c30556g1 != null) {
            zM70304a = m70304a(context, bitmap, c30556g1);
        }
        return Boxing.boxBoolean(zM70304a);
    }

    /* JADX INFO: renamed from: a */
    public final void m70300a(SNSPhotoDocumentPickerViewModel2$PhotoCheckResult sNSPhotoDocumentPickerViewModel2$PhotoCheckResult) {
        if (sNSPhotoDocumentPickerViewModel2$PhotoCheckResult != this.f61294O) {
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "requestFrameCheckResultUpdate: -> " + sNSPhotoDocumentPickerViewModel2$PhotoCheckResult, null);
        }
        this.f61294O = sNSPhotoDocumentPickerViewModel2$PhotoCheckResult;
    }

    /* JADX INFO: renamed from: a */
    public final C30592m1 m70283a(C30536d c30536d, C33350a c33350a, Bitmap bitmap) {
        if (!this.f61299T && C28468k0.f57988f) {
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "started tracking document bounds: " + c33350a, null);
        }
        this.f61299T = true;
        if (this.f61307h.f67913b) {
            return new C30592m1(new Size(bitmap.getWidth(), bitmap.getHeight()), new Size(this.f61305f.f68000h.f67909d.getWidth(), this.f61305f.f68000h.f67909d.getHeight()), c33350a, c30536d.f61660a);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0099 A[PHI: r8 r9 r10
      0x0099: PHI (r8v30 int) = (r8v19 int), (r8v21 int), (r8v23 int), (r8v25 int), (r8v27 int), (r8v31 int) binds: [B:49:0x00d5, B:56:0x00ec, B:40:0x00b9, B:30:0x0095, B:65:0x0108, B:72:0x0121] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r9v23 com.sumsub.sns.internal.features.presentation.camera.photo.document.SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State) = 
      (r9v12 com.sumsub.sns.internal.features.presentation.camera.photo.document.SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State)
      (r9v14 com.sumsub.sns.internal.features.presentation.camera.photo.document.SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State)
      (r9v16 com.sumsub.sns.internal.features.presentation.camera.photo.document.SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State)
      (r9v18 com.sumsub.sns.internal.features.presentation.camera.photo.document.SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State)
      (r9v20 com.sumsub.sns.internal.features.presentation.camera.photo.document.SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State)
      (r9v24 com.sumsub.sns.internal.features.presentation.camera.photo.document.SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State)
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
    public final Object m70292a(C30536d c30536d, boolean z11, ContinuationImpl continuationImpl) {
        C30637u1 c30637u1;
        SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;
        int i11;
        String str;
        if (continuationImpl instanceof C30637u1) {
            c30637u1 = (C30637u1) continuationImpl;
            int i12 = c30637u1.f61904e;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c30637u1.f61904e = i12 - Integer.MIN_VALUE;
            } else {
                c30637u1 = new C30637u1(this, continuationImpl);
            }
        } else {
            c30637u1 = new C30637u1(this, continuationImpl);
        }
        Object string = c30637u1.f61902c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c30637u1.f61904e;
        String str2 = C33627eb.f69716f;
        switch (i13) {
            case 0:
                ResultKt.throwOnFailure(string);
                SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State2 = SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State.INVALID;
                if (c30536d.f61660a) {
                    int i14 = AbstractC30632t1.f61894c[c30536d.f61661b.ordinal()];
                    if (i14 == 1) {
                        SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State3 = SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State.OK;
                        if (z11) {
                            c30637u1.f61900a = sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State3;
                            c30637u1.f61901b = 0;
                            c30637u1.f61904e = 1;
                            string = getString("sns_autocapture_hint_keepFocusing", c30637u1);
                            if (string != coroutine_suspended) {
                                sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State = sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State3;
                                i11 = 0;
                                str = (String) string;
                                if (str != null) {
                                    str2 = str;
                                }
                                return new C30516Z0(str2, i11 != 0, sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State);
                            }
                        } else {
                            c30637u1.f61900a = sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State3;
                            c30637u1.f61901b = 1;
                            c30637u1.f61904e = 2;
                            string = getString("sns_autocapture_hint_holdLikeThis", c30637u1);
                            if (string != coroutine_suspended) {
                                sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State = sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State3;
                                i11 = 1;
                                str = (String) string;
                                if (str != null) {
                                    str2 = str;
                                }
                                return new C30516Z0(str2, i11 != 0, sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State);
                            }
                        }
                    } else if (i14 == 2) {
                        SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State4 = SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State.INTERMEDIATE;
                        c30637u1.f61900a = sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State4;
                        c30637u1.f61901b = 0;
                        c30637u1.f61904e = 3;
                        string = getString("sns_autocapture_hint_moveIn", c30637u1);
                        if (string != coroutine_suspended) {
                            sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State = sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State4;
                            i11 = 0;
                            str = (String) string;
                            if (str != null) {
                                str2 = str;
                            }
                            return new C30516Z0(str2, i11 != 0, sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State);
                        }
                    } else if (i14 == 3) {
                        sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State = SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State.INTERMEDIATE;
                        c30637u1.f61900a = sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;
                        c30637u1.f61901b = 0;
                        c30637u1.f61904e = 4;
                        string = getString("sns_autocapture_hint_moveOut", c30637u1);
                        if (string != coroutine_suspended) {
                            i11 = 0;
                            str = (String) string;
                            if (str != null) {
                                str2 = str;
                            }
                            return new C30516Z0(str2, i11 != 0, sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State);
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (c30536d.f61661b == CheckDetectionResult$SizeCheckResult.BIG) {
                    sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State = SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State.INTERMEDIATE;
                    c30637u1.f61900a = sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;
                    c30637u1.f61901b = 0;
                    c30637u1.f61904e = 5;
                    string = getString("sns_autocapture_hint_moveOut", c30637u1);
                    if (string != coroutine_suspended) {
                        i11 = 0;
                        str = (String) string;
                        if (str != null) {
                            str2 = str;
                        }
                        return new C30516Z0(str2, i11 != 0, sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State);
                    }
                } else {
                    c30637u1.f61900a = sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State2;
                    c30637u1.f61901b = 0;
                    c30637u1.f61904e = 6;
                    Object string2 = getString("sns_autocapture_hint_targetAt", c30637u1);
                    if (string2 != coroutine_suspended) {
                        sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State = sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State2;
                        string = string2;
                        i11 = 0;
                        str = (String) string;
                        if (str != null) {
                            str2 = str;
                        }
                        return new C30516Z0(str2, i11 != 0, sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State);
                    }
                }
                return coroutine_suspended;
            case 1:
                i11 = c30637u1.f61901b;
                sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State = c30637u1.f61900a;
                ResultKt.throwOnFailure(string);
                str = (String) string;
                if (str != null) {
                    str2 = str;
                }
                return new C30516Z0(str2, i11 != 0, sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State);
            case 2:
                i11 = c30637u1.f61901b;
                sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State = c30637u1.f61900a;
                ResultKt.throwOnFailure(string);
                str = (String) string;
                if (str != null) {
                    str2 = str;
                }
                return new C30516Z0(str2, i11 != 0, sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State);
            case 3:
                i11 = c30637u1.f61901b;
                sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State = c30637u1.f61900a;
                ResultKt.throwOnFailure(string);
                str = (String) string;
                if (str != null) {
                    str2 = str;
                }
                return new C30516Z0(str2, i11 != 0, sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State);
            case 4:
                i11 = c30637u1.f61901b;
                sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State = c30637u1.f61900a;
                ResultKt.throwOnFailure(string);
                str = (String) string;
                if (str != null) {
                    str2 = str;
                }
                return new C30516Z0(str2, i11 != 0, sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State);
            case 5:
                i11 = c30637u1.f61901b;
                sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State = c30637u1.f61900a;
                ResultKt.throwOnFailure(string);
                str = (String) string;
                if (str != null) {
                    str2 = str;
                }
                return new C30516Z0(str2, i11 != 0, sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State);
            case 6:
                i11 = c30637u1.f61901b;
                sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State = c30637u1.f61900a;
                ResultKt.throwOnFailure(string);
                str = (String) string;
                if (str != null) {
                    str2 = str;
                }
                return new C30516Z0(str2, i11 != 0, sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m70304a(Context context, Bitmap bitmap, C30556g1 c30556g1) {
        Bitmap bitmap2;
        Float f11;
        C30520a1 c30520a1 = this.f61298S;
        float fFloatValue = (c30520a1 == null || (f11 = c30520a1.f61634b.f61710a) == null) ? 0.0f : f11.floatValue();
        Float f12 = c30556g1.f61710a;
        float fFloatValue2 = f12 != null ? f12.floatValue() : 0.0f;
        if (fFloatValue2 <= fFloatValue) {
            return false;
        }
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "better frame detected: score -> " + fFloatValue2, null);
        C30520a1 c30520a2 = this.f61298S;
        if (c30520a2 != null && (bitmap2 = c30520a2.f61633a) != null) {
            bitmap2.recycle();
        }
        this.f61298S = new C30520a1(bitmap, c30556g1);
        if (this.f61291L && this.f61325z == null) {
            this.f61315p = true;
            m70297a(context);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00da  */
    /* JADX WARN: Code duplicated, block: B:55:0x015c  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0152, code lost:
    
        if (m70288a(r1, r4, r12, r6) == r7) goto L51;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70284a(Context context, Bitmap bitmap, Rect rect, C30556g1 c30556g1, ContinuationImpl continuationImpl) {
        C30611p2 c30611p2;
        Bitmap bitmapCreateBitmap;
        int i11;
        String str;
        Object objM91049g;
        String value;
        Bitmap bitmap2;
        Context context2 = context;
        Bitmap bitmap3 = bitmap;
        if (continuationImpl instanceof C30611p2) {
            c30611p2 = (C30611p2) continuationImpl;
            int i12 = c30611p2.f61849g;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c30611p2.f61849g = i12 - Integer.MIN_VALUE;
            } else {
                c30611p2 = new C30611p2(this, continuationImpl);
            }
        } else {
            c30611p2 = new C30611p2(this, continuationImpl);
        }
        Object obj = c30611p2.f61847e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c30611p2.f61849g;
        if (i13 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f61307h.getClass();
            if (bitmap3 == null) {
                bitmapCreateBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmap3, rect.left * (-1), rect.top * (-1), (Paint) null);
            } else {
                bitmapCreateBitmap = bitmap3;
            }
            i11 = (c30556g1 == null || !c30556g1.f61711b) ? 0 : 1;
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "taking picture, photo quality result=" + c30556g1, null);
            IdentitySide identitySide = (IdentitySide) this.f61309j.get("current_side");
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
            c30611p2.f61843a = context2;
            c30611p2.f61844b = bitmap3;
            c30611p2.f61845c = bitmapCreateBitmap;
            c30611p2.f61846d = i11;
            c30611p2.f61849g = 1;
            objM91049g = C41686h.m91049g(C41782z0.m91392b(), new C28383A0(bitmapCreateBitmap, str + str2, context2, null), c30611p2);
            if (objM91049g != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i13 == 1) {
            int i14 = c30611p2.f61846d;
            Bitmap bitmap4 = (Bitmap) c30611p2.f61845c;
            Bitmap bitmap5 = c30611p2.f61844b;
            Context context3 = (Context) c30611p2.f61843a;
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
            bitmap2 = c30611p2.f61844b;
            bitmap3 = (Bitmap) c30611p2.f61843a;
            ResultKt.throwOnFailure(obj);
        }
        if (!Intrinsics.areEqual(bitmap2, bitmap3)) {
            bitmap2.recycle();
        }
        return Unit.INSTANCE;
        File file = (File) objM91049g;
        if (file != null) {
            boolean z11 = i11 != 0;
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "picture taken, isAutoCaptured=" + z11 + ". Side - " + ((IdentitySide) this.f61309j.get("current_side")), null);
            boolean z12 = i11 != 0;
            c30611p2.f61843a = bitmap3;
            c30611p2.f61844b = bitmapCreateBitmap;
            c30611p2.f61845c = file;
            c30611p2.f61849g = 2;
        }
        bitmap2 = bitmapCreateBitmap;
        if (!Intrinsics.areEqual(bitmap2, bitmap3)) {
            bitmap2.recycle();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70289a(Context context, ContinuationImpl continuationImpl) {
        C30463H1 c30463h1;
        Object objMo90611p;
        if (continuationImpl instanceof C30463H1) {
            c30463h1 = (C30463H1) continuationImpl;
            int i11 = c30463h1.f61422c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30463h1.f61422c = i11 - Integer.MIN_VALUE;
            } else {
                c30463h1 = new C30463H1(this, continuationImpl);
            }
        } else {
            c30463h1 = new C30463H1(this, continuationImpl);
        }
        Object obj = c30463h1.f61420a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30463h1.f61422c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f61296Q = true;
            if (this.f61291L && this.f61325z == null) {
                this.f61315p = true;
                m70297a(context);
            }
            InterfaceC41565d interfaceC41565d = this.f61295P;
            c30463h1.f61422c = 1;
            objMo90611p = interfaceC41565d.mo90611p(c30463h1);
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
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30466I1(this, null), 3, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public final Object m70296a(Function0 function0, ContinuationImpl continuationImpl) {
        C30539d2 c30539d2;
        C30516Z0 c30516z0;
        InterfaceC41669n interfaceC41669n;
        String str;
        C30538d1 c30538d1;
        Function0 function1;
        if (continuationImpl instanceof C30539d2) {
            c30539d2 = (C30539d2) continuationImpl;
            int i11 = c30539d2.f61678h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30539d2.f61678h = i11 - Integer.MIN_VALUE;
            } else {
                c30539d2 = new C30539d2(this, continuationImpl);
            }
        } else {
            c30539d2 = new C30539d2(this, continuationImpl);
        }
        Object obj = c30539d2.f61676f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30539d2.f61678h;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "showDocumentFlipHint", null);
            this.f61296Q = true;
            AbstractC28073M0.updateState$default(this, false, new C30545e2(null), 1, null);
            InterfaceC41669n interfaceC41669n2 = this.f61287H;
            C30538d1 c30538d2 = (C30538d1) interfaceC41669n2.getValue();
            C30516Z0 c30516z1 = new C30516Z0(null, 7);
            if (!this.f61282C) {
                c30516z1 = null;
            }
            String imageName = SNSIconHandler.SNSCommonIcons.FLIP.getImageName();
            c30539d2.f61671a = function0;
            c30539d2.f61672b = interfaceC41669n2;
            c30539d2.f61673c = c30538d2;
            c30539d2.f61674d = c30516z1;
            c30539d2.f61675e = imageName;
            c30539d2.f61678h = 1;
            Object string = getString("sns_instructions_hint_turnOver", c30539d2);
            if (string == coroutine_suspended) {
                return coroutine_suspended;
            }
            c30516z0 = c30516z1;
            interfaceC41669n = interfaceC41669n2;
            str = imageName;
            c30538d1 = c30538d2;
            obj = string;
            function1 = function0;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c30539d2.f61675e;
            C30516Z0 c30516z2 = c30539d2.f61674d;
            C30538d1 c30538d3 = c30539d2.f61673c;
            InterfaceC41669n interfaceC41669n3 = c30539d2.f61672b;
            function1 = c30539d2.f61671a;
            ResultKt.throwOnFailure(obj);
            c30516z0 = c30516z2;
            interfaceC41669n = interfaceC41669n3;
            c30538d1 = c30538d3;
        }
        String str2 = (String) obj;
        if (str2 == null) {
            str2 = C33627eb.f69716f;
        }
        interfaceC41669n.setValue(C30538d1.m70407a(c30538d1, null, null, c30516z0, new C30544e1(str, str2, 0), null, null, 51));
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30551f2(function1, this, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m70301a(C30568i1 c30568i1) {
        if (c30568i1 != null) {
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "stopVideoRecording with error: " + c30568i1, null);
        }
        InterfaceC41669n interfaceC41669n = this.f61287H;
        interfaceC41669n.setValue(C30538d1.m70407a((C30538d1) interfaceC41669n.getValue(), new C30616q1(null, false), null, null, null, null, c30568i1 != null ? new C28135m(new C29119g0(null, c30568i1, new C29095c0(30, c30568i1.f61732a, null, null), 1), this.f61300a.f59014a, null, null) : null, 22));
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
    public final Object m70290a(Bitmap bitmap, boolean z11, ContinuationImpl continuationImpl) {
        C30647w1 c30647w1;
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
        if (continuationImpl instanceof C30647w1) {
            c30647w1 = (C30647w1) continuationImpl;
            int i11 = c30647w1.f61931e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30647w1.f61931e = i11 - Integer.MIN_VALUE;
            } else {
                c30647w1 = new C30647w1(this, continuationImpl);
            }
        } else {
            c30647w1 = new C30647w1(this, continuationImpl);
        }
        Object objM91049g = c30647w1.f61929c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30647w1.f61931e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM91049g);
            jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f61284E) {
                AbstractC41697j0 abstractC41697j0M91391a = C41782z0.m91391a();
                C30651x1 c30651x1 = new C30651x1(this, bitmap, null);
                c30647w1.f61927a = z11;
                c30647w1.f61928b = jCurrentTimeMillis;
                c30647w1.f61931e = 1;
                objM91049g = C41686h.m91049g(abstractC41697j0M91391a, c30651x1, c30647w1);
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
            if (!this.f61282C) {
                C33272c.f67816e.f67810a.mo68955d("DocCapture", "badPhotos result: " + c33332k, null);
            }
            if (c33333l != null) {
                C33272c.f67816e.f67810a.mo68955d("DocCapture", "badPhotoDetector took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms, score=" + ((C33319a) c33333l.f67967a).f67943a, null);
                f11 = ((C33319a) c33333l.f67967a).f67943a;
            } else {
                f11 = -1.0f;
            }
            if (f11 >= this.f61306g.f67937b) {
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
            fireEvent(new C30604o1(z14, f11, j12));
            if (c33333l != null || (c33319a = (C33319a) c33333l.f67967a) == null) {
                fBoxFloat = null;
            } else {
                fBoxFloat = Boxing.boxFloat(c33319a.f67943a);
            }
            C33318e c33318e = this.f61306g;
            C30556g1 c30556g1 = new C30556g1(fBoxFloat, true, c33318e.f67938c, c33318e.f67937b);
            if (f11 <= 0.0f || z11) {
                return c30556g1;
            }
            return null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j11 = c30647w1.f61928b;
        z12 = c30647w1.f61927a;
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
        if (!this.f61282C) {
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "badPhotos result: " + c33332k, null);
        }
        if (c33333l != null) {
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "badPhotoDetector took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms, score=" + ((C33319a) c33333l.f67967a).f67943a, null);
            f11 = ((C33319a) c33333l.f67967a).f67943a;
        } else {
            f11 = -1.0f;
        }
        if (f11 >= this.f61306g.f67937b) {
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
        fireEvent(new C30604o1(z14, f11, j12));
        if (c33333l != null) {
            fBoxFloat = null;
        } else {
            fBoxFloat = null;
        }
        C33318e c33318e2 = this.f61306g;
        C30556g1 c30556g2 = new C30556g1(fBoxFloat, true, c33318e2.f67938c, c33318e2.f67937b);
        if (f11 <= 0.0f) {
        }
        return c30556g2;
    }
}
