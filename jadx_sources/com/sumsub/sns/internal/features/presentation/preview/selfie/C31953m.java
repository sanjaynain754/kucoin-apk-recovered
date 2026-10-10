package com.sumsub.sns.internal.features.presentation.preview.selfie;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.selfie.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31953m extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public CharSequence f64974a;

    /* JADX INFO: renamed from: b */
    public CharSequence f64975b;

    /* JADX INFO: renamed from: c */
    public CharSequence f64976c;

    /* JADX INFO: renamed from: d */
    public int f64977d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f64978e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C31957q f64979f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31953m(C31957q c31957q, Continuation continuation) {
        super(2, continuation);
        this.f64979f = c31957q;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31953m c31953m = new C31953m(this.f64979f, continuation);
        c31953m.f64978e = obj;
        return c31953m;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31953m c31953m = new C31953m(this.f64979f, (Continuation) obj2);
        c31953m.f64978e = (C31950j) obj;
        return c31953m.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C31950j c31950j;
        CharSequence charSequence;
        C31950j c31950j2;
        CharSequence charSequence2;
        Object string;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        Object string2;
        C31950j c31950j3;
        CharSequence charSequence6;
        CharSequence charSequence7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64977d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            CharSequence charSequence8 = this.f64976c;
                            charSequence3 = this.f64975b;
                            charSequence7 = this.f64974a;
                            C31950j c31950j4 = (C31950j) this.f64978e;
                            ResultKt.throwOnFailure(obj);
                            charSequence6 = charSequence8;
                            c31950j3 = c31950j4;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        charSequence3 = this.f64975b;
                        charSequence4 = this.f64974a;
                        c31950j2 = (C31950j) this.f64978e;
                        ResultKt.throwOnFailure(obj);
                        charSequence5 = (CharSequence) obj;
                        C31957q c31957q = this.f64979f;
                        this.f64978e = c31950j2;
                        this.f64974a = charSequence4;
                        this.f64975b = charSequence3;
                        this.f64976c = charSequence5;
                        this.f64977d = 4;
                        string2 = c31957q.getString("sns_preview_video_action_retake", this);
                        if (string2 != coroutine_suspended) {
                            c31950j3 = c31950j2;
                            charSequence6 = charSequence5;
                            obj = string2;
                            charSequence7 = charSequence4;
                        }
                        return coroutine_suspended;
                    }
                } else {
                    charSequence = this.f64974a;
                    c31950j2 = (C31950j) this.f64978e;
                    ResultKt.throwOnFailure(obj);
                    charSequence2 = (CharSequence) obj;
                    C31957q c31957q2 = this.f64979f;
                    this.f64978e = c31950j2;
                    this.f64974a = charSequence;
                    this.f64975b = charSequence2;
                    this.f64977d = 3;
                    string = c31957q2.getString("sns_preview_video_action_accept", this);
                    if (string != coroutine_suspended) {
                        CharSequence charSequence9 = charSequence;
                        charSequence3 = charSequence2;
                        obj = string;
                        charSequence4 = charSequence9;
                        charSequence5 = (CharSequence) obj;
                        C31957q c31957q3 = this.f64979f;
                        this.f64978e = c31950j2;
                        this.f64974a = charSequence4;
                        this.f64975b = charSequence3;
                        this.f64976c = charSequence5;
                        this.f64977d = 4;
                        string2 = c31957q3.getString("sns_preview_video_action_retake", this);
                        if (string2 != coroutine_suspended) {
                            c31950j3 = c31950j2;
                            charSequence6 = charSequence5;
                            obj = string2;
                            charSequence7 = charSequence4;
                        }
                    }
                    return coroutine_suspended;
                }
            } else {
                c31950j = (C31950j) this.f64978e;
                ResultKt.throwOnFailure(obj);
            }
            return C31950j.m70960a(c31950j3, null, charSequence7, charSequence3, charSequence6, (CharSequence) obj, false, 33);
        }
        ResultKt.throwOnFailure(obj);
        C31950j c31950j5 = (C31950j) this.f64978e;
        C31957q c31957q4 = this.f64979f;
        this.f64978e = c31950j5;
        this.f64977d = 1;
        Object string3 = c31957q4.getString("sns_preview_video_title", this);
        if (string3 != coroutine_suspended) {
            c31950j = c31950j5;
            obj = string3;
        }
        return coroutine_suspended;
        CharSequence charSequence10 = (CharSequence) obj;
        C31957q c31957q5 = this.f64979f;
        this.f64978e = c31950j;
        this.f64974a = charSequence10;
        this.f64977d = 2;
        Object string4 = c31957q5.getString("sns_preview_video_subtitle", this);
        if (string4 != coroutine_suspended) {
            C31950j c31950j6 = c31950j;
            charSequence = charSequence10;
            obj = string4;
            c31950j2 = c31950j6;
            charSequence2 = (CharSequence) obj;
            C31957q c31957q6 = this.f64979f;
            this.f64978e = c31950j2;
            this.f64974a = charSequence;
            this.f64975b = charSequence2;
            this.f64977d = 3;
            string = c31957q6.getString("sns_preview_video_action_accept", this);
            if (string != coroutine_suspended) {
                CharSequence charSequence11 = charSequence;
                charSequence3 = charSequence2;
                obj = string;
                charSequence4 = charSequence11;
                charSequence5 = (CharSequence) obj;
                C31957q c31957q7 = this.f64979f;
                this.f64978e = c31950j2;
                this.f64974a = charSequence4;
                this.f64975b = charSequence3;
                this.f64976c = charSequence5;
                this.f64977d = 4;
                string2 = c31957q7.getString("sns_preview_video_action_retake", this);
                if (string2 != coroutine_suspended) {
                    c31950j3 = c31950j2;
                    charSequence6 = charSequence5;
                    obj = string2;
                    charSequence7 = charSequence4;
                    return C31950j.m70960a(c31950j3, null, charSequence7, charSequence3, charSequence6, (CharSequence) obj, false, 33);
                }
            }
        }
        return coroutine_suspended;
    }
}
