package com.sumsub.sns.internal.features.presentation.camera.video;

import android.os.CountDownTimer;
import androidx.lifecycle.SavedStateHandle;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.internal.core.common.AbstractC28398I;
import com.sumsub.sns.internal.core.presentation.android.C28651g;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30302o;
import com.sumsub.sns.internal.features.presentation.preview.selfie.AbstractC31959s;
import java.io.File;
import java.util.Arrays;
import java.util.Map;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.random.Random;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.video.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30763G extends AbstractC28073M0 {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ int f62152V = 0;

    /* JADX INFO: renamed from: a */
    public final C30302o f62153a;

    /* JADX INFO: renamed from: b */
    public final String f62154b;

    /* JADX INFO: renamed from: c */
    public final String f62155c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC29984m f62156d;

    /* JADX INFO: renamed from: e */
    public CountDownTimer f62157e;

    /* JADX INFO: renamed from: f */
    public String f62158f;

    /* JADX INFO: renamed from: g */
    public File f62159g;

    /* JADX INFO: renamed from: h */
    public final C28651g f62160h;

    /* JADX WARN: Code duplicated, block: B:40:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70448a(ContinuationImpl continuationImpl) {
        C30787t c30787t;
        int i11;
        int i12;
        String str;
        String str2;
        if (continuationImpl instanceof C30787t) {
            c30787t = (C30787t) continuationImpl;
            int i13 = c30787t.f62204f;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c30787t.f62204f = i13 - Integer.MIN_VALUE;
            } else {
                c30787t = new C30787t(this, continuationImpl);
            }
        } else {
            c30787t = new C30787t(this, continuationImpl);
        }
        Object objM70045b = c30787t.f62202d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = c30787t.f62204f;
        if (i14 == 0) {
            ResultKt.throwOnFailure(objM70045b);
            InterfaceC29984m interfaceC29984m = this.f62156d;
            c30787t.f62204f = 1;
            objM70045b = ((C29967J) interfaceC29984m).m70045b(false, c30787t);
            if (objM70045b != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i14 == 1) {
            ResultKt.throwOnFailure(objM70045b);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = c30787t.f62199a;
            str2 = c30787t.f62201c;
            str = c30787t.f62200b;
            ResultKt.throwOnFailure(objM70045b);
        }
        this.f62158f = (String) CollectionsKt.random(StringsKt.split$default((CharSequence) AbstractC28398I.m69284a((C29983l) objM70045b, str, str2), new String[]{";"}, false, 0, 6, (Object) null), Random.INSTANCE);
        i11 = i12;
        boolean z11 = i11 == 0;
        AbstractC31959s.m70965a("initPhase: fromConfig=" + z11 + ", phrase=" + this.f62158f);
        return Unit.INSTANCE;
        C29124h c29124h = (C29124h) ((AbstractC29971N) objM70045b).m70051c();
        if (c29124h != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str3 = String.format("selfiePhrase_%s", Arrays.copyOf(new Object[]{this.f62155c}, 1));
            Map map = c29124h.f59075h;
            this.f62158f = map != null ? (String) map.get(str3) : null;
        }
        String str4 = this.f62158f;
        i11 = (str4 == null || StringsKt.isBlank(str4)) ? 1 : 0;
        if (i11 != 0) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str5 = String.format("sns_step_%s_recording_readAloudText", Arrays.copyOf(new Object[]{this.f62154b}, 1));
            String str6 = String.format("sns_step_%s_recording_readAloudText", Arrays.copyOf(new Object[]{RemoteConfigComponent.DEFAULTS_FILE_NAME}, 1));
            c30787t.f62200b = str5;
            c30787t.f62201c = str6;
            c30787t.f62199a = i11;
            c30787t.f62204f = 2;
            Object strings = getStrings(c30787t);
            if (strings != coroutine_suspended) {
                i12 = i11;
                objM70045b = strings;
                str = str5;
                str2 = str6;
                this.f62158f = (String) CollectionsKt.random(StringsKt.split$default((CharSequence) AbstractC28398I.m69284a((C29983l) objM70045b, str, str2), new String[]{";"}, false, 0, 6, (Object) null), Random.INSTANCE);
                i11 = i12;
            }
            return coroutine_suspended;
        }
        if (i11 == 0) {
        }
        AbstractC31959s.m70965a("initPhase: fromConfig=" + z11 + ", phrase=" + this.f62158f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final void m70449e() {
        File file = this.f62159g;
        AbstractC31959s.m70965a("File is created. File - " + (file != null ? file.getAbsolutePath() : null));
        File file2 = this.f62159g;
        if (file2 != null) {
            String str = this.f62158f;
            if (str == null) {
                str = "";
            }
            fireEvent(new C30777j(new C30784q(file2, str)));
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void fireEvent(InterfaceC28145r interfaceC28145r) {
        if (interfaceC28145r instanceof C30781n) {
            fireEvent(interfaceC28145r, false);
        } else {
            super.fireEvent(interfaceC28145r);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final InterfaceC28147s getDefaultState() {
        return new C30785r();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final Object onPrepare(Continuation continuation) {
        C30791x c30791x;
        if (continuation instanceof C30791x) {
            c30791x = (C30791x) continuation;
            int i11 = c30791x.f62212c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30791x.f62212c = i11 - Integer.MIN_VALUE;
            } else {
                c30791x = new C30791x(this, (ContinuationImpl) continuation);
            }
        } else {
            c30791x = new C30791x(this, (ContinuationImpl) continuation);
        }
        Object obj = c30791x.f62210a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30791x.f62212c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c30791x.f62212c = 1;
            if (AbstractC28073M0.onPrepare$suspendImpl(this, c30791x) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        AbstractC28073M0.updateState$default(this, false, new C30792y(this, null), 1, null);
        return Unit.INSTANCE;
    }

    public C30763G(SavedStateHandle savedStateHandle, C30302o c30302o, String str, String str2, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m) {
        super(interfaceC29953a, interfaceC29984m);
        this.f62153a = c30302o;
        this.f62154b = str;
        this.f62155c = str2;
        this.f62156d = interfaceC29984m;
        this.f62160h = new C28651g(savedStateHandle);
        AbstractC31959s.m70965a("Video Selfie is created");
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        CountDownTimer countDownTimer = this.f62157e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f62157e = null;
    }
}
