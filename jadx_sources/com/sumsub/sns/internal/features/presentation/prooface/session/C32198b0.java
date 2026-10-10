package com.sumsub.sns.internal.features.presentation.prooface.session;

import android.graphics.RectF;
import androidx.camera.core.ImageProxy;
import com.sumsub.sns.internal.features.data.model.common.AnswerType;
import com.sumsub.sns.internal.features.data.model.common.C29112f;
import com.sumsub.sns.internal.features.data.model.prooface.C29810M;
import com.sumsub.sns.internal.features.data.network.prooface.C29891f;
import com.sumsub.sns.internal.features.data.network.prooface.C29893h;
import com.sumsub.sns.internal.features.data.network.prooface.Liveness3dFaceRepository$LivenessRepositoryResult;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.time.Duration;
import p852kotlin.time.DurationKt;
import p852kotlin.time.DurationUnit;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.b0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32198b0 implements InterfaceC32204d0 {

    /* JADX INFO: renamed from: c */
    public static final long f65571c;

    /* JADX INFO: renamed from: a */
    public final InterfaceC41669n f65572a = C41679x.m91009a(C32201c0.f65577a);

    /* JADX INFO: renamed from: b */
    public final InterfaceC41668m f65573b = C41674s.m91001b(0, 0, null, 7, null);

    @Override // com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32204d0
    /* JADX INFO: renamed from: a */
    public final boolean mo71054a(ImageProxy imageProxy, RectF rectF, float f11) {
        return false;
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f65571c = DurationKt.toDuration(120, DurationUnit.SECONDS);
    }

    @Override // com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32204d0
    /* JADX INFO: renamed from: a */
    public final Object mo71051a(Liveness3dFaceRepository$LivenessRepositoryResult liveness3dFaceRepository$LivenessRepositoryResult, C32219i0 c32219i0) {
        Object objEmit = this.f65573b.emit(liveness3dFaceRepository$LivenessRepositoryResult, c32219i0);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32204d0
    public final InterfaceC41634e getState() {
        return this.f65572a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:55:0x0107 A[LOOP:0: B:51:0x00f7->B:55:0x0107, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x010b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x00c6, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public final Object m71055a(ContinuationImpl continuationImpl) {
        C32178S c32178s;
        int iIntValue;
        int i11;
        String str;
        C29891f c29891f;
        C29810M c29810m;
        String str2;
        int i12;
        if (continuationImpl instanceof C32178S) {
            c32178s = (C32178S) continuationImpl;
            int i13 = c32178s.f65533f;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c32178s.f65533f = i13 - Integer.MIN_VALUE;
            } else {
                c32178s = new C32178S(this, continuationImpl);
            }
        } else {
            c32178s = new C32178S(this, continuationImpl);
        }
        Object objM90470e = c32178s.f65531d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = c32178s.f65533f;
        AnswerType answerType = null;
        if (i14 == 0) {
            ResultKt.throwOnFailure(objM90470e);
            long j11 = f65571c;
            C32195a0 c32195a0 = new C32195a0(this, null);
            c32178s.f65533f = 1;
            objM90470e = TimeoutKt.m90470e(j11, c32195a0, c32178s);
            if (objM90470e != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i14 == 1) {
            ResultKt.throwOnFailure(objM90470e);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = c32178s.f65529b;
            iIntValue = c32178s.f65528a;
            str = c32178s.f65530c;
            ResultKt.throwOnFailure(objM90470e);
        }
        c29891f = (C29891f) objM90470e;
        if (c29891f == null) {
            C32171O c32171o = C32171O.f65514a;
            AbstractC32267d.m71078a("Init phase: OnProgress event timeout: " + Duration.m105227toStringimpl(f65571c));
            return c32171o;
        }
        c29810m = c29891f.f59992a;
        if (c29810m != null && (str2 = c29810m.f59887d) != null) {
            AnswerType.Companion.getClass();
            for (AnswerType answerType2 : AnswerType.values()) {
                if (Intrinsics.areEqual(answerType2.getValue(), str2)) {
                    answerType = answerType2;
                    break;
                }
            }
            if (answerType == null) {
                answerType = AnswerType.Error;
            }
        }
        AbstractC32267d.m71078a("Init phase: session.answer: " + answerType);
        C29112f c29112f = AnswerType.Companion;
        C32205d1 c32205d1 = new C32205d1(iIntValue, str, i11 != 0);
        AbstractC32267d.m71078a("Init phase: finished: " + c32205d1);
        return new C32173P(c32205d1);
        C29893h c29893h = (C29893h) objM90470e;
        if (c29893h == null) {
            C32171O c32171o2 = C32171O.f65514a;
            AbstractC32267d.m71078a("Init phase: OnStarted event timeout: " + Duration.m105227toStringimpl(f65571c));
            return c32171o2;
        }
        C29810M c29810m2 = c29893h.f59994a;
        if (c29810m2 == null) {
            C32171O c32171o3 = C32171O.f65514a;
            AbstractC32267d.m71078a("Init phase: session not received");
            return c32171o3;
        }
        Integer num = c29810m2.f59886c;
        if (num != null) {
            if (num.intValue() <= 0) {
                num = null;
            }
            if (num != null) {
                iIntValue = num.intValue();
                String str3 = c29810m2.f59885b;
                if (str3 == null) {
                    C32171O c32171o4 = C32171O.f65514a;
                    AbstractC32267d.m71078a("Init phase: sessionKey not received");
                    return c32171o4;
                }
                int i15 = !Intrinsics.areEqual(c29810m2.f59889f, Boxing.boxBoolean(true)) ? 1 : 0;
                long j12 = f65571c;
                C32186W c32186w = new C32186W(this, null);
                c32178s.f65530c = str3;
                c32178s.f65528a = iIntValue;
                c32178s.f65529b = i15;
                c32178s.f65533f = 2;
                Object objM90470e2 = TimeoutKt.m90470e(j12, c32186w, c32178s);
                if (objM90470e2 != coroutine_suspended) {
                    i11 = i15;
                    objM90470e = objM90470e2;
                    str = str3;
                    c29891f = (C29891f) objM90470e;
                    if (c29891f == null) {
                        C32171O c32171o5 = C32171O.f65514a;
                        AbstractC32267d.m71078a("Init phase: OnProgress event timeout: " + Duration.m105227toStringimpl(f65571c));
                        return c32171o5;
                    }
                    c29810m = c29891f.f59992a;
                    if (c29810m != null) {
                        AnswerType.Companion.getClass();
                        while (i12 < r7) {
                            if (Intrinsics.areEqual(answerType2.getValue(), str2)) {
                                answerType = answerType2;
                                break;
                            }
                        }
                        if (answerType == null) {
                            answerType = AnswerType.Error;
                        }
                    }
                    AbstractC32267d.m71078a("Init phase: session.answer: " + answerType);
                    C29112f c29112f2 = AnswerType.Companion;
                    C32205d1 c32205d2 = new C32205d1(iIntValue, str, i11 != 0);
                    AbstractC32267d.m71078a("Init phase: finished: " + c32205d2);
                    return new C32173P(c32205d2);
                }
                return coroutine_suspended;
            }
        }
        C32171O c32171o6 = C32171O.f65514a;
        AbstractC32267d.m71078a("Init phase: illegal requiredFragments: " + c29810m2.f59886c);
        return c32171o6;
    }
}
