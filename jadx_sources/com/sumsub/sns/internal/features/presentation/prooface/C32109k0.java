package com.sumsub.sns.internal.features.presentation.prooface;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Size;
import androidx.camera.core.ImageProxy;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.log.logger.Logger;
import com.sumsub.sentry.android.C27921i;
import com.sumsub.sns.core.data.model.FlowActionType;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.C28156w;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.internal.core.common.AbstractC28396H;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28488r;
import com.sumsub.sns.internal.core.common.C28433a;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.domain.facedetector.AbstractC28568n;
import com.sumsub.sns.internal.core.domain.facedetector.C28555a;
import com.sumsub.sns.internal.core.domain.facedetector.C28558d;
import com.sumsub.sns.internal.core.domain.facedetector.C28559e;
import com.sumsub.sns.internal.core.domain.facedetector.C28564j;
import com.sumsub.sns.internal.core.domain.facedetector.C28565k;
import com.sumsub.sns.internal.core.domain.facedetector.C28566l;
import com.sumsub.sns.internal.core.domain.facedetector.C28567m;
import com.sumsub.sns.internal.core.domain.facedetector.C28569o;
import com.sumsub.sns.internal.core.presentation.android.C28651g;
import com.sumsub.sns.internal.core.presentation.intro.AbstractC28889a;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.AnswerType;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29082a;
import com.sumsub.sns.internal.features.data.model.common.C29118g;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.prooface.AbstractC29807J;
import com.sumsub.sns.internal.features.data.model.prooface.C29798A;
import com.sumsub.sns.internal.features.data.model.prooface.C29803F;
import com.sumsub.sns.internal.features.data.model.prooface.C29805H;
import com.sumsub.sns.internal.features.data.model.prooface.C29810M;
import com.sumsub.sns.internal.features.data.model.prooface.C29818c;
import com.sumsub.sns.internal.features.data.model.prooface.C29822f;
import com.sumsub.sns.internal.features.data.model.prooface.C29828l;
import com.sumsub.sns.internal.features.data.model.prooface.C29837u;
import com.sumsub.sns.internal.features.data.model.prooface.C29840x;
import com.sumsub.sns.internal.features.data.model.prooface.LivenessMessageType;
import com.sumsub.sns.internal.features.data.network.prooface.AbstractC29902q;
import com.sumsub.sns.internal.features.data.network.prooface.C29886a;
import com.sumsub.sns.internal.features.data.network.prooface.C29894i;
import com.sumsub.sns.internal.features.data.network.prooface.C29900o;
import com.sumsub.sns.internal.features.data.repository.common.C29957e;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.settings.C30034c;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32265b;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import com.sumsub.sns.internal.fingerprint.C33061b;
import com.sumsub.sns.internal.fingerprint.C33062c;
import com.sumsub.sns.internal.fingerprint.C33065f;
import com.sumsub.sns.internal.fingerprint.tools.threading.AbstractC33261a;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import com.sumsub.sns.internal.log.logger.C33296b;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.sumsub.sns.internal.util.camera.C33392b;
import com.sumsub.sns.internal.util.camera.C33394d;
import com.sumsub.sns.internal.util.camera.XposedVirtualCameraDirectory;
import com.sumsub.sns.internal.util.root.C33411b;
import com.sumsub.sns.internal.util.root.C33413d;
import com.tencent.bugly.proguard.C33627eb;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.AbstractC41710m1;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41718o1;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41669n;
import okhttp3.WebSocket;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.SafeContinuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.random.Random;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.Charsets;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.k0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32109k0 extends AbstractC28073M0 {

    /* JADX INFO: renamed from: M */
    public static final /* synthetic */ KProperty[] f65342M = {AbstractC28118g.m69077a(C32109k0.class, "livenessShowSettings", "getLivenessShowSettings()Z", 0)};

    /* JADX INFO: renamed from: N */
    public static final SimpleDateFormat f65343N = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: A */
    public int f65344A;

    /* JADX INFO: renamed from: B */
    public long f65345B;

    /* JADX INFO: renamed from: C */
    public long f65346C;

    /* JADX INFO: renamed from: D */
    public String f65347D;

    /* JADX INFO: renamed from: E */
    public Bitmap f65348E;

    /* JADX INFO: renamed from: F */
    public boolean f65349F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC41669n f65350G;

    /* JADX INFO: renamed from: H */
    public final InterfaceC41669n f65351H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC41669n f65352I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC41669n f65353J;

    /* JADX INFO: renamed from: K */
    public final InterfaceC41775x1 f65354K;

    /* JADX INFO: renamed from: L */
    public final C28433a f65355L;

    /* JADX INFO: renamed from: a */
    public final C28558d f65356a;

    /* JADX INFO: renamed from: b */
    public final C29070X f65357b;

    /* JADX INFO: renamed from: c */
    public final AbstractC46162a f65358c;

    /* JADX INFO: renamed from: d */
    public final C29886a f65359d;

    /* JADX INFO: renamed from: e */
    public final C29900o f65360e;

    /* JADX INFO: renamed from: f */
    public final C30034c f65361f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC29953a f65362g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC29984m f65363h;

    /* JADX INFO: renamed from: i */
    public final C33062c f65364i;

    /* JADX INFO: renamed from: j */
    public final C33394d f65365j;

    /* JADX INFO: renamed from: k */
    public Timer f65366k;

    /* JADX INFO: renamed from: l */
    public Timer f65367l;

    /* JADX INFO: renamed from: m */
    public final String f65368m;

    /* JADX INFO: renamed from: n */
    public String f65369n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC41668m f65370o;

    /* JADX INFO: renamed from: p */
    public final AbstractC41710m1 f65371p;

    /* JADX INFO: renamed from: q */
    public C29818c f65372q;

    /* JADX INFO: renamed from: r */
    public boolean f65373r;

    /* JADX INFO: renamed from: s */
    public InterfaceC41775x1 f65374s;

    /* JADX INFO: renamed from: t */
    public ImageProxy f65375t;

    /* JADX INFO: renamed from: u */
    public boolean f65376u;

    /* JADX INFO: renamed from: v */
    public final Lazy f65377v;

    /* JADX INFO: renamed from: w */
    public final C28651g f65378w;

    /* JADX INFO: renamed from: x */
    public final C28936t f65379x;

    /* JADX INFO: renamed from: y */
    public final C32065b0 f65380y;

    /* JADX INFO: renamed from: z */
    public int f65381z;

    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m71027a(C32109k0 c32109k0, C29894i c29894i, ContinuationImpl continuationImpl) {
        C32024O c32024o;
        C32006I c32006i;
        InterfaceC32009J interfaceC32009J;
        C29810M c29810m;
        Object string;
        C29810M c29810m2;
        InterfaceC32009J interfaceC32009J2;
        if (continuationImpl instanceof C32024O) {
            c32024o = (C32024O) continuationImpl;
            int i11 = c32024o.f65098e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32024o.f65098e = i11 - Integer.MIN_VALUE;
            } else {
                c32024o = new C32024O(c32109k0, continuationImpl);
            }
        } else {
            c32024o = new C32024O(c32109k0, continuationImpl);
        }
        Object objM71044b = c32024o.f65096c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32024o.f65098e;
        if (i12 != 0) {
            if (i12 == 1) {
                c29894i = (C29894i) c32024o.f65094a;
                ResultKt.throwOnFailure(objM71044b);
            } else {
                if (i12 == 2) {
                    c29894i = (C29894i) c32024o.f65094a;
                    ResultKt.throwOnFailure(objM71044b);
                    interfaceC32009J = (InterfaceC32009J) objM71044b;
                    c29810m = c29894i.f59995a;
                    c32024o.f65094a = interfaceC32009J;
                    c32024o.f65095b = c29810m;
                    c32024o.f65098e = 3;
                    string = c32109k0.getString("sns_facescan_action_retry", c32024o);
                    if (string != coroutine_suspended) {
                        InterfaceC32009J interfaceC32009J3 = interfaceC32009J;
                        objM71044b = string;
                        c29810m2 = c29810m;
                        interfaceC32009J2 = interfaceC32009J3;
                    }
                    return coroutine_suspended;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c29810m2 = c32024o.f65095b;
                interfaceC32009J2 = (InterfaceC32009J) c32024o.f65094a;
                ResultKt.throwOnFailure(objM71044b);
            }
            return new C32012K(c29810m2, (CharSequence) objM71044b, interfaceC32009J2);
        }
        ResultKt.throwOnFailure(objM71044b);
        C29810M c29810m3 = c29894i.f59995a;
        c32006i = null;
        String str = c29810m3 != null ? c29810m3.f59890g : null;
        if (str != null) {
            c32024o.f65094a = c29894i;
            c32024o.f65098e = 1;
            objM71044b = c32109k0.m71044b(str, c32024o);
        } else if (c32006i != null) {
            interfaceC32009J = c32006i;
            c29810m = c29894i.f59995a;
            c32024o.f65094a = interfaceC32009J;
            c32024o.f65095b = c29810m;
            c32024o.f65098e = 3;
            string = c32109k0.getString("sns_facescan_action_retry", c32024o);
            if (string != coroutine_suspended) {
                InterfaceC32009J interfaceC32009J4 = interfaceC32009J;
                objM71044b = string;
                c29810m2 = c29810m;
                interfaceC32009J2 = interfaceC32009J4;
                return new C32012K(c29810m2, (CharSequence) objM71044b, interfaceC32009J2);
            }
        } else {
            c32024o.f65094a = c29894i;
            c32024o.f65098e = 2;
            objM71044b = c32109k0.m71036a(c29894i, c32024o);
        }
        return coroutine_suspended;
        c32006i = (C32006I) objM71044b;
        if (c32006i != null) {
            interfaceC32009J = c32006i;
            c29810m = c29894i.f59995a;
            c32024o.f65094a = interfaceC32009J;
            c32024o.f65095b = c29810m;
            c32024o.f65098e = 3;
            string = c32109k0.getString("sns_facescan_action_retry", c32024o);
            if (string != coroutine_suspended) {
                InterfaceC32009J interfaceC32009J5 = interfaceC32009J;
                objM71044b = string;
                c29810m2 = c29810m;
                interfaceC32009J2 = interfaceC32009J5;
                return new C32012K(c29810m2, (CharSequence) objM71044b, interfaceC32009J2);
            }
        } else {
            c32024o.f65094a = c29894i;
            c32024o.f65098e = 2;
            objM71044b = c32109k0.m71036a(c29894i, c32024o);
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m71045b(ContinuationImpl continuationImpl) {
        C32090g0 c32090g0;
        InterfaceC41669n interfaceC41669n;
        if (continuationImpl instanceof C32090g0) {
            c32090g0 = (C32090g0) continuationImpl;
            int i11 = c32090g0.f65306d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32090g0.f65306d = i11 - Integer.MIN_VALUE;
            } else {
                c32090g0 = new C32090g0(this, continuationImpl);
            }
        } else {
            c32090g0 = new C32090g0(this, continuationImpl);
        }
        Object obj = c32090g0.f65304b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32090g0.f65306d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41669n interfaceC41669n2 = this.f65352I;
            c32090g0.f65303a = interfaceC41669n2;
            c32090g0.f65306d = 1;
            Object string = getString("sns_facescan_hint_facePosition", c32090g0);
            if (string == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC41669n = interfaceC41669n2;
            obj = string;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC41669n = c32090g0.f65303a;
            ResultKt.throwOnFailure(obj);
        }
        interfaceC41669n.setValue(new C32015L((CharSequence) obj, false));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final C28559e m71035e() {
        C28559e c28559e = new C28559e(C33048a.f67473f.m71434a(), C33048a.f67474g.m71434a(), Random.INSTANCE.nextLong(-100L, 100L) + 500);
        AbstractC32267d.m71078a("detector config: " + c28559e);
        return c28559e;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final /* bridge */ /* synthetic */ InterfaceC28147s getDefaultState() {
        return C32021N.f65086a;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onErrorCancelled(AbstractC29149l0 abstractC29149l0) {
        AbstractC32267d.m71078a("onErrorCancelled " + abstractC29149l0);
        super.onErrorCancelled(abstractC29149l0);
        m71042a(C29805H.f59881a, (String) null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onHandleError(AbstractC29149l0 abstractC29149l0) {
        AbstractC32267d.m71078a("onHandleError " + abstractC29149l0);
        super.onHandleError(abstractC29149l0);
        fireEvent(new C32277w(abstractC29149l0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (r6 == r1) goto L27;
     */
    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onPrepare(Continuation continuation) {
        C32070c0 c32070c0;
        Object objM71045b;
        if (continuation instanceof C32070c0) {
            c32070c0 = (C32070c0) continuation;
            int i11 = c32070c0.f65256c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32070c0.f65256c = i11 - Integer.MIN_VALUE;
            } else {
                c32070c0 = new C32070c0(this, (ContinuationImpl) continuation);
            }
        } else {
            c32070c0 = new C32070c0(this, (ContinuationImpl) continuation);
        }
        Object obj = c32070c0.f65254a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32070c0.f65256c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c32070c0.f65256c = 1;
            if (AbstractC28073M0.onPrepare$suspendImpl(this, c32070c0) != coroutine_suspended) {
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
        showProgress(true);
        c32070c0.f65256c = 2;
        if (C33048a.f67453P.m71434a()) {
            showProgress(false);
            objM71045b = m71045b(c32070c0);
            if (objM71045b != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objM71045b = Unit.INSTANCE;
            }
        } else {
            objM71045b = Unit.INSTANCE;
        }
    }

    public C32109k0(SavedStateHandle savedStateHandle, C28558d c28558d, C29070X c29070x, AbstractC46162a abstractC46162a, C29886a c29886a, C29900o c29900o, C30034c c30034c, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, C33062c c33062c, C33394d c33394d) {
        super(interfaceC29953a, interfaceC29984m);
        this.f65356a = c28558d;
        this.f65357b = c29070x;
        this.f65358c = abstractC46162a;
        this.f65359d = c29886a;
        this.f65360e = c29900o;
        this.f65361f = c30034c;
        this.f65362g = interfaceC29953a;
        this.f65363h = interfaceC29984m;
        this.f65364i = c33062c;
        this.f65365j = c33394d;
        this.f65368m = "msdk2 / 1.46.0 (Android " + Build.VERSION.RELEASE + ") - App " + C28468k0.f57986d + C33627eb.f69716f + C28468k0.f57984b + " / " + C28468k0.f57985c;
        this.f65369n = "";
        this.f65370o = C41674s.m91001b(0, 0, null, 7, null);
        AbstractC41710m1 abstractC41710m1M91179c = C41718o1.m91179c(Executors.newSingleThreadExecutor());
        this.f65371p = abstractC41710m1M91179c;
        this.f65377v = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.prooface.d3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32109k0.m71035e();
            }
        });
        this.f65378w = new C28651g(savedStateHandle);
        this.f65379x = new C28936t(savedStateHandle, "livenessShowSettings", Boolean.valueOf(C33048a.f67480m.m71434a()), true);
        this.f65380y = new C32065b0(this);
        this.f65344A = Integer.MAX_VALUE;
        this.f65347D = "";
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(null);
        this.f65350G = interfaceC41669nM91009a;
        this.f65351H = interfaceC41669nM91009a;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a(null);
        this.f65352I = interfaceC41669nM91009a2;
        this.f65353J = interfaceC41669nM91009a2;
        this.f65355L = new C28433a(Bitmap.Config.ARGB_8888);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), abstractC41710m1M91179c, null, new C32256t(this, null), 2, null);
        this.f65354K = C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C32273v(this, null), 3, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m71046f() {
        AbstractC32267d.m71078a("stopSession()");
        InterfaceC41775x1 interfaceC41775x1 = this.f65374s;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f65356a.m69417c();
        C29900o c29900o = this.f65360e;
        c29900o.getClass();
        AbstractC32267d.m71078a("Liveness3dFaceRepository.disconnect");
        WebSocket webSocket = c29900o.f60011h;
        if (webSocket != null) {
            webSocket.close(1000, "disconnect");
        }
        c29900o.f60011h = null;
        C28433a c28433a = this.f65355L;
        synchronized (c28433a) {
            try {
                Bitmap bitmap = c28433a.f57946b;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                c28433a.f57946b = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f65375t = null;
        try {
            this.f65371p.close();
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception unused) {
        }
        C41713n0.m91129e(this.f65356a.f58113b, null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:147:0x0275  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:79:0x0155  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v9, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v21, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v11, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v12, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v19, types: [T, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public final Object m71044b(String str, ContinuationImpl continuationImpl) {
        C32044V c32044v;
        ?? r13;
        T t11;
        CharSequence charSequence;
        CharSequence charSequence2;
        Pair pairM90091to;
        Pair pairM90091to2;
        Pair pairM90091to3;
        Pair pairM90091to4;
        if (continuationImpl instanceof C32044V) {
            c32044v = (C32044V) continuationImpl;
            int i11 = c32044v.f65192d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32044v.f65192d = i11 - Integer.MIN_VALUE;
            } else {
                c32044v = new C32044V(this, continuationImpl);
            }
        } else {
            c32044v = new C32044V(this, continuationImpl);
        }
        Object objM70045b = c32044v.f65190b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32044v.f65192d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70045b);
            InterfaceC29984m interfaceC29984m = this.f65363h;
            c32044v.f65189a = str;
            c32044v.f65192d = 1;
            objM70045b = ((C29967J) interfaceC29984m).m70045b(false, c32044v);
            if (objM70045b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c32044v.f65189a;
            ResultKt.throwOnFailure(objM70045b);
        }
        C29124h c29124h = (C29124h) ((AbstractC29971N) objM70045b).m70051c();
        list = null;
        List list = null;
        if (c29124h == null || (r13 = c29124h.f59071d) == 0) {
            return null;
        }
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"liveness", SpellCheckPlugin.SUGGESTIONS_KEY, str});
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = r13;
        Iterator itM69668a = AbstractC28889a.m69668a(listListOf, 1, 0);
        while (true) {
            if (itM69668a.hasNext()) {
                Object obj = ((Map) objectRef.element).get(listListOf.get(((IntIterator) itM69668a).nextInt()));
                Map map = obj instanceof Map ? (Map) obj : null;
                if (map != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        if (!(key instanceof String)) {
                            key = null;
                        }
                        String str2 = (String) key;
                        if (str2 != null) {
                            Object value = entry.getValue();
                            if (value == null) {
                                value = null;
                            }
                            if (value == null) {
                                pairM90091to4 = null;
                            } else {
                                pairM90091to4 = TuplesKt.m90091to(str2, value);
                            }
                        } else {
                            pairM90091to4 = null;
                        }
                        if (pairM90091to4 != null) {
                            arrayList.add(pairM90091to4);
                        }
                    }
                    ?? map2 = MapsKt.toMap(arrayList);
                    if (map2 != 0) {
                        objectRef.element = map2;
                    }
                }
                t11 = 0;
                break;
            }
            Object obj2 = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listListOf));
            if (!(obj2 instanceof Map)) {
                obj2 = null;
            }
            t11 = (Map) obj2;
            break;
        }
        if (t11 == 0) {
            return null;
        }
        List listListOf2 = CollectionsKt.listOf("title");
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = t11;
        Iterator itM69668a2 = AbstractC28889a.m69668a(listListOf2, 1, 0);
        while (true) {
            if (itM69668a2.hasNext()) {
                Object obj3 = ((Map) objectRef2.element).get(listListOf2.get(((IntIterator) itM69668a2).nextInt()));
                Map map3 = obj3 instanceof Map ? (Map) obj3 : null;
                if (map3 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry2 : map3.entrySet()) {
                        Object key2 = entry2.getKey();
                        if (!(key2 instanceof String)) {
                            key2 = null;
                        }
                        String str3 = (String) key2;
                        if (str3 != null) {
                            Object value2 = entry2.getValue();
                            if (value2 == null) {
                                value2 = null;
                            }
                            if (value2 == null) {
                                pairM90091to3 = null;
                            } else {
                                pairM90091to3 = TuplesKt.m90091to(str3, value2);
                            }
                        } else {
                            pairM90091to3 = null;
                        }
                        if (pairM90091to3 != null) {
                            arrayList2.add(pairM90091to3);
                        }
                    }
                    ?? map4 = MapsKt.toMap(arrayList2);
                    if (map4 != 0) {
                        objectRef2.element = map4;
                    }
                }
                charSequence = null;
                break;
            }
            Object obj4 = ((Map) objectRef2.element).get(CollectionsKt.lastOrNull(listListOf2));
            if (!(obj4 instanceof CharSequence)) {
                obj4 = null;
            }
            charSequence = (CharSequence) obj4;
            break;
        }
        List listListOf3 = CollectionsKt.listOf("tipsTitle");
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef3.element = t11;
        Iterator itM69668a3 = AbstractC28889a.m69668a(listListOf3, 1, 0);
        while (true) {
            if (itM69668a3.hasNext()) {
                Object obj5 = ((Map) objectRef3.element).get(listListOf3.get(((IntIterator) itM69668a3).nextInt()));
                Map map5 = obj5 instanceof Map ? (Map) obj5 : null;
                if (map5 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry3 : map5.entrySet()) {
                        Object key3 = entry3.getKey();
                        if (!(key3 instanceof String)) {
                            key3 = null;
                        }
                        String str4 = (String) key3;
                        if (str4 != null) {
                            Object value3 = entry3.getValue();
                            if (value3 == null) {
                                value3 = null;
                            }
                            if (value3 == null) {
                                pairM90091to2 = null;
                            } else {
                                pairM90091to2 = TuplesKt.m90091to(str4, value3);
                            }
                        } else {
                            pairM90091to2 = null;
                        }
                        if (pairM90091to2 != null) {
                            arrayList3.add(pairM90091to2);
                        }
                    }
                    ?? map6 = MapsKt.toMap(arrayList3);
                    if (map6 != 0) {
                        objectRef3.element = map6;
                    }
                }
                charSequence2 = null;
                break;
            }
            Object obj6 = ((Map) objectRef3.element).get(CollectionsKt.lastOrNull(listListOf3));
            if (!(obj6 instanceof CharSequence)) {
                obj6 = null;
            }
            charSequence2 = (CharSequence) obj6;
            break;
        }
        List listListOf4 = CollectionsKt.listOf("tips");
        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        objectRef4.element = t11;
        Iterator itM69668a4 = AbstractC28889a.m69668a(listListOf4, 1, 0);
        while (itM69668a4.hasNext()) {
            Object obj7 = ((Map) objectRef4.element).get(listListOf4.get(((IntIterator) itM69668a4).nextInt()));
            Map map7 = obj7 instanceof Map ? (Map) obj7 : null;
            if (map7 != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Map.Entry entry4 : map7.entrySet()) {
                    Object key4 = entry4.getKey();
                    if (!(key4 instanceof String)) {
                        key4 = null;
                    }
                    String str5 = (String) key4;
                    if (str5 != null) {
                        Object value4 = entry4.getValue();
                        if (value4 == null) {
                            value4 = null;
                        }
                        if (value4 == null) {
                            pairM90091to = null;
                        } else {
                            pairM90091to = TuplesKt.m90091to(str5, value4);
                        }
                    } else {
                        pairM90091to = null;
                    }
                    if (pairM90091to != null) {
                        arrayList4.add(pairM90091to);
                    }
                }
                ?? map8 = MapsKt.toMap(arrayList4);
                if (map8 != 0) {
                    objectRef4.element = map8;
                }
            }
            return new C32006I(charSequence, m71029a(charSequence2, list));
        }
        Object obj8 = ((Map) objectRef4.element).get(CollectionsKt.lastOrNull(listListOf4));
        list = (List) (obj8 instanceof List ? obj8 : null);
        return new C32006I(charSequence, m71029a(charSequence2, list));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public static final Object m71026a(C32109k0 c32109k0, Bitmap bitmap, Size size, String str, ContinuationImpl continuationImpl) throws IOException {
        C32030Q c32030q;
        byte[] bArrM69946a;
        AbstractC46162a abstractC46162a;
        Integer numBoxInt;
        long j11;
        Integer num;
        int i11;
        Object obj;
        byte[] bArr;
        String str2;
        String str3;
        String str4;
        Integer num2;
        C29828l c29828l;
        C29818c c29818c;
        C28569o c28569o;
        String str5;
        Integer num3;
        String str6;
        C32109k0 c32109k1 = c32109k0;
        if (continuationImpl instanceof C32030Q) {
            c32030q = (C32030Q) continuationImpl;
            int i12 = c32030q.f65134s;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c32030q.f65134s = i12 - Integer.MIN_VALUE;
            } else {
                c32030q = new C32030Q(c32109k1, continuationImpl);
            }
        } else {
            c32030q = new C32030Q(c32109k1, continuationImpl);
        }
        Object obj2 = c32030q.f65132q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c32030q.f65134s;
        if (i13 == 0) {
            ResultKt.throwOnFailure(obj2);
            try {
                bArrM69946a = AbstractC29902q.m69946a(ByteBuffer.wrap(Base64.decode(c32109k1.f65347D, 2)).getLong(0));
            } catch (Exception e11) {
                String message = e11.getMessage();
                if (message == null) {
                    message = "";
                }
                C33272c.f67816e.f67810a.mo68955d("Prooface", message, e11);
                c32109k1.m71043a(e11);
                AtomicLong atomicLong = AbstractC29902q.f60022a;
                bArrM69946a = AbstractC29902q.m69946a(System.nanoTime());
            }
            byte[] bArr2 = bArrM69946a;
            byte b11 = bArr2[0];
            long j12 = ByteBuffer.wrap(bArr2).getLong(0);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 92, byteArrayOutputStream);
            bitmap.getWidth();
            bitmap.getHeight();
            C28569o c28569o2 = new C28569o(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.close();
            if (c32109k1.f65344A == c32109k1.f65381z) {
                try {
                    Matrix matrix = new Matrix();
                    matrix.setScale(0.2f, 0.2f);
                    matrix.postScale(-1.0f, 1.0f);
                    c32109k1.f65348E = AbstractC28488r.m69383a(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true));
                } catch (Throwable th2) {
                    c32109k1.m71043a(th2);
                }
            }
            bitmap.recycle();
            abstractC46162a = c32109k1.f65358c;
            String str7 = c32109k1.f65368m;
            String str8 = c32109k1.f65369n;
            String strM69349b = AbstractC28458h.m69349b();
            Integer numBoxInt2 = Boxing.boxInt(size.getWidth());
            Integer numBoxInt3 = Boxing.boxInt(size.getHeight());
            String str9 = f65343N.format(Calendar.getInstance().getTime());
            numBoxInt = Boxing.boxInt(width);
            Integer numBoxInt4 = Boxing.boxInt(height);
            j11 = j12;
            C29828l c29828l2 = new C29828l(str);
            C29818c c29818c2 = c32109k1.f65372q;
            if (c29818c2 == null || c29818c2.f59897a == null) {
                c29818c2 = null;
            }
            c32030q.f65116a = bArr2;
            c32030q.f65117b = c28569o2;
            c32030q.f65118c = abstractC46162a;
            c32030q.f65119d = str7;
            c32030q.f65120e = str8;
            c32030q.f65121f = strM69349b;
            c32030q.f65122g = numBoxInt2;
            c32030q.f65123h = numBoxInt3;
            c32030q.f65124i = "user";
            c32030q.f65125j = str9;
            c32030q.f65126k = numBoxInt;
            c32030q.f65127l = numBoxInt4;
            c32030q.f65128m = c29828l2;
            c32030q.f65129n = c29818c2;
            c32030q.f65130o = b11;
            c32030q.f65131p = j11;
            c32030q.f65134s = 1;
            c32109k1 = c32109k0;
            Object objM71038a = c32109k1.m71038a(c32030q);
            if (objM71038a == coroutine_suspended) {
                return coroutine_suspended;
            }
            num = numBoxInt3;
            i11 = b11;
            obj = objM71038a;
            bArr = bArr2;
            str2 = str7;
            str3 = str8;
            str4 = strM69349b;
            num2 = numBoxInt2;
            c29828l = c29828l2;
            c29818c = c29818c2;
            c28569o = c28569o2;
            str5 = str9;
            num3 = numBoxInt4;
            str6 = "user";
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j13 = c32030q.f65131p;
            i11 = c32030q.f65130o;
            C29818c c29818c3 = c32030q.f65129n;
            C29828l c29828l3 = c32030q.f65128m;
            Integer num4 = c32030q.f65127l;
            Integer num5 = c32030q.f65126k;
            String str10 = c32030q.f65125j;
            String str11 = c32030q.f65124i;
            Integer num6 = c32030q.f65123h;
            Integer num7 = c32030q.f65122g;
            String str12 = c32030q.f65121f;
            String str13 = c32030q.f65120e;
            obj = obj2;
            String str14 = c32030q.f65119d;
            AbstractC46162a abstractC46162a2 = c32030q.f65118c;
            C28569o c28569o3 = c32030q.f65117b;
            bArr = c32030q.f65116a;
            ResultKt.throwOnFailure(obj);
            c29818c = c29818c3;
            str6 = str11;
            c29828l = c29828l3;
            str5 = str10;
            num3 = num4;
            numBoxInt = num5;
            j11 = j13;
            str3 = str13;
            str4 = str12;
            num = num6;
            num2 = num7;
            str2 = str14;
            c28569o = c28569o3;
            abstractC46162a = abstractC46162a2;
        }
        byte[] bArr3 = bArr;
        C28569o c28569o4 = c28569o;
        int i14 = i11;
        long j14 = j11;
        C29840x c29840x = new C29840x(str2, str3, str4, num2, num, str6, str5, numBoxInt, num3, c29828l, c29818c, (Map) obj);
        abstractC46162a.getSerializersModule();
        byte[] bytes = abstractC46162a.mo99409b(C29840x.Companion.serializer(), c29840x).getBytes(Charsets.UTF_8);
        C29818c c29818c4 = c32109k1.f65372q;
        if (c29818c4 != null && c29818c4.f59897a != null) {
            c32109k1.f65372q = null;
        }
        AtomicLong atomicLong2 = AbstractC29902q.f60022a;
        byte b12 = (byte) i14;
        byte[] bArrM69947a = AbstractC29902q.m69947a(bytes, bytes.length, b12, j14);
        byte[] bArr4 = c28569o4.f58131a;
        byte[] bArrM69947a2 = AbstractC29902q.m69947a(bArr4, bArr4.length, b12, j14);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrM69947a.length + bArrM69947a2.length + 8);
        byteBufferAllocate.putInt(bArrM69947a.length);
        byteBufferAllocate.put(bArrM69947a);
        byteBufferAllocate.putInt(bArrM69947a2.length);
        byteBufferAllocate.put(bArrM69947a2);
        return new C29798A(LivenessMessageType.livenessFragment.getType(), null, new C29837u(Base64.encodeToString(c32109k1.f65359d.m69941a(byteBufferAllocate.array(), bArr3), 2)), 26);
    }

    /* JADX INFO: renamed from: a */
    public static String m71028a(C29810M c29810m) {
        String str = c29810m != null ? c29810m.f59887d : null;
        AnswerType answerType = AnswerType.Green;
        if (Intrinsics.areEqual(str, answerType.getValue())) {
            return answerType.getValue();
        }
        return (!(c29810m != null ? Intrinsics.areEqual(c29810m.f59888e, Boolean.TRUE) : false) || Intrinsics.areEqual(c29810m.f59887d, answerType.getValue())) ? AnswerType.Red.getValue() : AnswerType.Yellow.getValue();
    }

    /* JADX INFO: renamed from: a */
    public final void m71043a(Throwable th2) {
        if (C28468k0.f57988f) {
            fireEvent(new C28156w("Error: " + th2.getMessage()));
        }
        AbstractC32267d.m71078a("ERROR: " + th2.getMessage());
        C33272c c33272c = C33272c.f67812a;
        C33296b c33296bM71618b = C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA}));
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        c33296bM71618b.mo68956e("Prooface", message, th2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ec, code lost:
    
        if (r11.m69943a(r12, r0) == r1) goto L46;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m71037a(String str, ContinuationImpl continuationImpl) {
        C32027P c32027p;
        String str2;
        C29124h c29124h;
        AbstractC29172p abstractC29172p;
        FlowActionType flowActionType;
        if (continuationImpl instanceof C32027P) {
            c32027p = (C32027P) continuationImpl;
            int i11 = c32027p.f65111e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32027p.f65111e = i11 - Integer.MIN_VALUE;
            } else {
                c32027p = new C32027P(this, continuationImpl);
            }
        } else {
            c32027p = new C32027P(this, continuationImpl);
        }
        Object objM70045b = c32027p.f65109c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32027p.f65111e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70045b);
            AbstractC32267d.m71078a("doStartSession");
            InterfaceC29984m interfaceC29984m = this.f65363h;
            c32027p.f65107a = str;
            c32027p.f65111e = 1;
            objM70045b = ((C29967J) interfaceC29984m).m70045b(false, c32027p);
            if (objM70045b != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            str = c32027p.f65107a;
            ResultKt.throwOnFailure(objM70045b);
        } else if (i12 == 2) {
            c29124h = c32027p.f65108b;
            str2 = c32027p.f65107a;
            ResultKt.throwOnFailure(objM70045b);
            abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70045b).m70051c();
            if (abstractC29172p == null && (abstractC29172p instanceof C29082a)) {
                C29118g c29118g = c29124h.f59091x;
                if (c29118g != null && (flowActionType = c29118g.f59063b) != null) {
                    flowActionType.getValue();
                }
                str = str2;
                this.f65369n = str;
                C29900o c29900o = this.f65360e;
                C32065b0 c32065b0 = this.f65380y;
                c32027p.f65107a = null;
                c32027p.f65108b = null;
                c32027p.f65111e = 3;
            } else {
                m71042a(new C29803F(new IOException("Error getting action applicant")), (String) null);
                return Unit.INSTANCE;
            }
        } else {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70045b);
        }
        this.f65356a.m69416b();
        this.f65356a.getClass();
        AbstractC32267d.m71078a("message");
        C33272c c33272c = C33272c.f67812a;
        Logger.DefaultImpls.d$default(C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})), "Prooface", "Face Detector used: CompositeFaceDetector", null, 4, null);
        this.f65346C = System.currentTimeMillis() + ((long) 100);
        return Unit.INSTANCE;
        C29124h c29124h2 = (C29124h) ((AbstractC29971N) objM70045b).m70051c();
        if (c29124h2 == null) {
            m71042a(new C29803F(new IOException("Error getting config")), (String) null);
            return Unit.INSTANCE;
        }
        C29118g c29118g2 = c29124h2.f59091x;
        if (c29118g2 != null) {
            AbstractC32267d.m71078a("starting as action: " + c29118g2.f59062a);
            InterfaceC29984m interfaceC29984m2 = this.f65363h;
            c32027p.f65107a = str;
            c32027p.f65108b = c29124h2;
            c32027p.f65111e = 2;
            Object objM70042a = ((C29967J) interfaceC29984m2).m70042a(false, (Continuation) c32027p);
            if (objM70042a != coroutine_suspended) {
                str2 = str;
                c29124h = c29124h2;
                objM70045b = objM70042a;
                abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70045b).m70051c();
                if (abstractC29172p == null) {
                }
                m71042a(new C29803F(new IOException("Error getting action applicant")), (String) null);
                return Unit.INSTANCE;
            }
        } else {
            this.f65369n = str;
            C29900o c29900o2 = this.f65360e;
            C32065b0 c32065b1 = this.f65380y;
            c32027p.f65107a = null;
            c32027p.f65108b = null;
            c32027p.f65111e = 3;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: a */
    public final void m71041a(AbstractC28568n abstractC28568n) {
        if (!(this.f65350G.getValue() instanceof C32281x) || !(abstractC28568n instanceof C28564j)) {
            AbstractC32267d.m71078a("onResult " + abstractC28568n);
        }
        if (abstractC28568n instanceof C28565k) {
            this.f65350G.setValue(new C32284y(getStrings().m70061a("sns_facescan_hint_facePosition")));
            return;
        }
        if (abstractC28568n instanceof C28567m) {
            this.f65350G.setValue(new C31982A(getStrings().m70061a("sns_facescan_hint_facePosition")));
            return;
        }
        if (abstractC28568n instanceof C28566l) {
            this.f65350G.setValue(new C32288z(((C28566l) abstractC28568n).f58129b, getStrings().m70061a("sns_facescan_hint_facePosition")));
            return;
        }
        if (abstractC28568n instanceof C28564j) {
            C28564j c28564j = (C28564j) abstractC28568n;
            this.f65350G.setValue(new C32281x(c28564j.f58128c, getStrings().m70061a("sns_facescan_hint_lookStraight")));
            if (!this.f65349F) {
                this.f65345B = System.currentTimeMillis() + ((long) 200);
                return;
            }
            int i11 = this.f65344A;
            if (i11 == this.f65381z && i11 > 0 && this.f65367l == null) {
                Timer timer = new Timer();
                timer.schedule(new C32075d0(this), TimeUnit.SECONDS.toMillis(2L));
                this.f65367l = timer;
            }
            if (this.f65344A >= this.f65381z) {
                InterfaceC41775x1 interfaceC41775x1 = this.f65354K;
                if (interfaceC41775x1 != null) {
                    InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
                    return;
                }
                return;
            }
            if (System.currentTimeMillis() - this.f65345B < 0) {
                return;
            }
            this.f65344A++;
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C32035S(this, c28564j.f58130a, c28564j.f58127b, "OK", null), 3, null);
            this.f65345B = System.currentTimeMillis() + ((long) 200);
            this.f65352I.setValue(new C32000G(this.f65344A / this.f65381z));
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public static Function0 m71033a(final long j11, final Function0 function0) {
        final Handler handler = new Handler(Looper.getMainLooper());
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new Function0() { // from class: com.sumsub.sns.internal.features.presentation.prooface.h3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32109k0.m71030a(jElapsedRealtime, j11, function0, handler);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71030a(long j11, long j12, final Function0 function0, Handler handler) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j11;
        if (jElapsedRealtime >= j12) {
            function0.invoke();
        } else {
            handler.postDelayed(new Runnable() { // from class: com.sumsub.sns.internal.features.presentation.prooface.i3
                @Override // java.lang.Runnable
                public final void run() {
                    C32109k0.m71034a(function0);
                }
            }, j12 - jElapsedRealtime);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final void m71034a(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: a */
    public final void m71040a(final ImageProxy imageProxy, RectF rectF, float f11) {
        List list;
        try {
            AbstractC32267d.m71078a("Process image");
            final Function0 function0M71033a = m71033a(((C28559e) this.f65377v.getValue()).f58118c, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.prooface.e3
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C32109k0.m71031a(imageProxy);
                }
            });
            if (!this.f65360e.f60014k) {
                AbstractC32267d.m71078a("Liveness session is not yet connected, skipping frame analyzing");
                function0M71033a.invoke();
                return;
            }
            this.f65375t = imageProxy;
            Object objM69280a = AbstractC28396H.m69280a(imageProxy, new Function2() { // from class: com.sumsub.sns.internal.features.presentation.prooface.f3
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C32109k0.m71025a(this.f65300b, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            });
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM69280a);
            if (thM103847exceptionOrNullimpl == null) {
                Bitmap bitmap = (Bitmap) objM69280a;
                C29818c c29818c = this.f65372q;
                if (c29818c != null && c29818c.f59897a == null) {
                    if (!this.f65376u) {
                        AbstractC32267d.m71078a("processImage(), Calibration is not completed");
                    }
                    this.f65376u = true;
                    if (this.f65373r) {
                        this.f65373r = false;
                        Pair pairM71072a = AbstractC32265b.m71072a(bitmap);
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(((Number) pairM71072a.getFirst()).intValue() & 16777215)}, 1));
                        AbstractC32267d.m71078a("Calibrate, color=" + str + ", brightness=" + pairM71072a + ", expositionBias=" + f11);
                        C29818c c29818c2 = this.f65372q;
                        if (c29818c2 != null && (list = c29818c2.f59898b) != null) {
                            list.add(new C29822f(f11, ((Number) pairM71072a.getSecond()).floatValue(), str));
                        }
                    }
                    bitmap.recycle();
                    function0M71033a.invoke();
                    return;
                }
                this.f65376u = false;
                C28558d c28558d = this.f65356a;
                C41696j.m91104d(c28558d.f58113b, c28558d.f58114c, null, new C28555a(c28558d, bitmap, rectF, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.prooface.g3
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C32109k0.m71032a(this.f65310b, function0M71033a, (AbstractC28568n) obj);
                    }
                }, null), 2, null);
                return;
            }
            throw new IllegalStateException("Failed to convert imageProxy to bitmap", thM103847exceptionOrNullimpl);
        } catch (Throwable th2) {
            m71043a(th2);
            imageProxy.close();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71031a(ImageProxy imageProxy) {
        imageProxy.close();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Bitmap m71025a(C32109k0 c32109k0, int i11, int i12) {
        return c32109k0.f65355L.m69317a(i11, i12);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71032a(C32109k0 c32109k0, Function0 function0, AbstractC28568n abstractC28568n) {
        C32109k0 c32109k1;
        c32109k0.getClass();
        try {
            Bitmap bitmap = abstractC28568n.f58130a;
            try {
                if (c32109k0.f65344A <= 0 && c32109k0.f65381z != 0 && System.currentTimeMillis() - c32109k0.f65346C >= 0) {
                    Size size = new Size(bitmap.getWidth(), bitmap.getHeight());
                    c32109k1 = c32109k0;
                    C41696j.m91104d(ViewModelKt.getViewModelScope(c32109k0), null, null, new C32035S(c32109k1, bitmap, size, "NOT_ALIGNED", null), 3, null);
                    c32109k1.f65346C = System.currentTimeMillis() + ((long) 8000);
                } else {
                    c32109k1 = c32109k0;
                    c32109k1.m71041a(abstractC28568n);
                }
            } catch (Throwable th2) {
                th = th2;
                c32109k1.m71043a(th);
            }
        } catch (Throwable th3) {
            th = th3;
            c32109k1 = c32109k0;
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m71039a(float f11, float f12, float f13) {
        AbstractC32267d.m71078a("Start calibration, min=" + f12 + ", max=" + f13 + ", current=" + f11);
        InterfaceC41775x1 interfaceC41775x1 = this.f65374s;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        if (f12 != f13) {
            this.f65374s = C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C32100i0(this, f12, f13, f11, null), 2, null);
            return;
        }
        AbstractC32267d.m71078a("Calibration, exposure min=max");
        C29818c.Companion.getClass();
        this.f65372q = C29818c.f59896f;
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C32095h0(this, f11, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m71038a(ContinuationImpl continuationImpl) {
        C32041U c32041u;
        if (continuationImpl instanceof C32041U) {
            c32041u = (C32041U) continuationImpl;
            int i11 = c32041u.f65186c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32041u.f65186c = i11 - Integer.MIN_VALUE;
            } else {
                c32041u = new C32041U(this, continuationImpl);
            }
        } else {
            c32041u = new C32041U(this, continuationImpl);
        }
        Object orThrow = c32041u.f65184a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32041u.f65186c;
        boolean z11 = true;
        if (i12 == 0) {
            ResultKt.throwOnFailure(orThrow);
            if (C33048a.f67445H.m71434a()) {
                Logger.DefaultImpls.d$default(C33272c.f67812a, "Fingerprinter", "Fingerprint is enabled, collecting...", null, 4, null);
                C33062c c33062c = this.f65364i;
                c32041u.f65186c = 1;
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(c32041u));
                C33065f c33065f = new C33065f(safeContinuation);
                c33062c.getClass();
                if (Result.m103847exceptionOrNullimpl(AbstractC33261a.m71612a(new C33061b(c33062c, c33065f, c33065f))) != null) {
                    safeContinuation.resumeWith(Result.m103844constructorimpl(MapsKt.emptyMap()));
                    Unit unit = Unit.INSTANCE;
                }
                orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(c32041u);
                }
                if (orThrow == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                Logger.DefaultImpls.d$default(C33272c.f67812a, "Fingerprinter", "Fingerprint is disabled", null, 4, null);
                return null;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(orThrow);
        }
        Map mutableMap = MapsKt.toMutableMap((Map) orThrow);
        C27921i c27921i = (C27921i) ((C29957e) this.f65362g).f60161g.f57039f.getValue();
        mutableMap.putAll(AbstractC28458h.m69350b(MapsKt.mapOf(TuplesKt.m90091to("root_sentry_checkTestKeys", Boolean.valueOf(c27921i.f57040a)), TuplesKt.m90091to("root_sentry_checkRootFiles", Boolean.valueOf(c27921i.f57041b)), TuplesKt.m90091to("root_sentry_checkSUExist", Boolean.valueOf(c27921i.f57042c)), TuplesKt.m90091to("root_sentry_checkRootPackages", Boolean.valueOf(c27921i.f57043d)))));
        mutableMap.putAll(AbstractC28458h.m69350b(((C33411b) ((C29957e) this.f65362g).f60160f.f68113a.getValue()).m71697a()));
        C33413d c33413d = (C33413d) ((C29957e) this.f65362g).f60162h.f68123a.getValue();
        Pair pairM90091to = TuplesKt.m90091to("sns_root_checkForBinary", Boolean.valueOf(c33413d.f68124a));
        Pair pairM90091to2 = TuplesKt.m90091to("sns_root_checkForMagiskBinary", Boolean.valueOf(c33413d.f68125b));
        if (!c33413d.f68124a && !c33413d.f68125b) {
            z11 = false;
        }
        mutableMap.putAll(AbstractC28458h.m69350b(MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to("sns_root_isRooted", Boolean.valueOf(z11)))));
        C33394d c33394d = this.f65365j;
        c33394d.getClass();
        List listPlus = CollectionsKt.plus((Collection) c33394d.m71685a(XposedVirtualCameraDirectory.INTERNAL), (Iterable) c33394d.m71685a(XposedVirtualCameraDirectory.EXTERNAL));
        Pair pairM90091to3 = TuplesKt.m90091to("xposed_traces", CollectionsKt.joinToString$default(c33394d.f68101b.f68108b, ", ", null, null, 0, null, null, 62, null));
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listPlus, 10)), 16));
        Iterator it = listPlus.iterator();
        while (it.hasNext()) {
            Pair pairM71684a = ((C33392b) it.next()).m71684a();
            linkedHashMap.put(pairM71684a.getFirst(), pairM71684a.getSecond());
        }
        mutableMap.putAll(AbstractC28458h.m69350b(MapsKt.plus(linkedHashMap, pairM90091to3)));
        mutableMap.put("is_emulator", String.valueOf(((C29957e) this.f65362g).f60159e.m68994a()));
        Logger.DefaultImpls.d$default(C33272c.f67812a, "Fingerprinter", "Fingerprint size: " + mutableMap.size(), null, 4, null);
        return mutableMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m71036a(C29894i c29894i, ContinuationImpl continuationImpl) {
        C32047W c32047w;
        String str;
        if (continuationImpl instanceof C32047W) {
            c32047w = (C32047W) continuationImpl;
            int i11 = c32047w.f65198d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32047w.f65198d = i11 - Integer.MIN_VALUE;
            } else {
                c32047w = new C32047W(this, continuationImpl);
            }
        } else {
            c32047w = new C32047W(this, continuationImpl);
        }
        Object string = c32047w.f65196b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32047w.f65198d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(string);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format("sns_facescan_result_%s_title", Arrays.copyOf(new Object[]{m71028a(c29894i.f59995a)}, 1));
            c32047w.f65195a = c29894i;
            c32047w.f65198d = 1;
            string = getString(str2, c32047w);
            if (string != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            c29894i = (C29894i) c32047w.f65195a;
            ResultKt.throwOnFailure(string);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c32047w.f65195a;
            ResultKt.throwOnFailure(string);
        }
        return new C32003H(str, (String) string);
        String str3 = (String) string;
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str4 = String.format("sns_facescan_result_%s_text", Arrays.copyOf(new Object[]{m71028a(c29894i.f59995a)}, 1));
        c32047w.f65195a = str3;
        c32047w.f65198d = 2;
        Object string2 = getString(str4, c32047w);
        if (string2 != coroutine_suspended) {
            string = string2;
            str = str3;
            return new C32003H(str, (String) string);
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: a */
    public static String m71029a(CharSequence charSequence, List list) {
        StringBuilder sb2 = new StringBuilder();
        if (charSequence != null) {
            sb2.append(String.valueOf(charSequence));
            sb2.append('\n');
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb2.append(" - " + ((Object) ((CharSequence) it.next())));
                sb2.append("\n\n");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m71042a(AbstractC29807J abstractC29807J, String str) {
        AbstractC32267d.m71078a("finishWithReason: " + abstractC29807J + ", answer=" + str);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C32038T(this, abstractC29807J, null), 3, null);
    }
}
