package com.sumsub.sns.internal.features.presentation.main.instructions;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.sumsub.sns.core.data.model.SNSGeneralException;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.intro.C28890b;
import com.sumsub.sns.internal.core.presentation.intro.C28895g;
import com.sumsub.sns.internal.core.presentation.intro.IntroScene;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29697t2;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.presentation.main.AbstractC31234Y;
import com.sumsub.sns.internal.features.presentation.main.AbstractC31245b0;
import com.sumsub.sns.internal.features.presentation.main.C31237Z;
import com.sumsub.sns.internal.features.presentation.main.C31260f;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.util.Set;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.instructions.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31283h {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty[] f63385d = {AbstractC28639a.m69485a(C31283h.class, "pendingInstructionsData", "getPendingInstructionsData()Lcom/sumsub/sns/internal/features/presentation/main/instructions/InstructionsResolver$PendingInstructionsData;", 0)};

    /* JADX INFO: renamed from: e */
    public static final String[] f63386e = {"VIDEO_IDENT", "PROOF_OF_RESIDENCE"};

    /* JADX INFO: renamed from: a */
    public final InterfaceC29984m f63387a;

    /* JADX INFO: renamed from: b */
    public final Set f63388b;

    /* JADX INFO: renamed from: c */
    public final C28936t f63389c;

    /* JADX INFO: renamed from: a */
    public static boolean m70668a(C29697t2 c29697t2, C29124h c29124h, AbstractC29172p abstractC29172p) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = Intrinsics.areEqual(c29697t2.f59742a, "VIDEO_IDENT") && abstractC29172p.m69800p();
        boolean zStartsWith$default = StringsKt.startsWith$default(c29697t2.f59742a, "PAYMENT_METHODS", false, 2, (Object) null);
        boolean z14 = StringsKt.startsWith$default(c29697t2.f59742a, "PROOF_OF_RESIDENCE", false, 2, (Object) null) && C33048a.f67460W.m71434a();
        String[] strArr = f63386e;
        int length = strArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                z11 = false;
                break;
            }
            if (StringsKt.startsWith$default(c29697t2.f59742a, strArr[i11], false, 2, (Object) null)) {
                z11 = true;
                break;
            }
            i11++;
        }
        boolean zM69774a = AbstractC29130i.m69774a(c29124h, c29697t2.f59742a, Intrinsics.areEqual(c29697t2.f59743b, IntroScene.SCAN_BACKSIDE.getSceneName()));
        boolean z15 = (!z11 || z14) && zM69774a;
        if (!z15 && !z13 && !zStartsWith$default) {
            z12 = false;
        }
        C33272c.f67816e.f67810a.mo68955d("InstructionsResolver", "instructionsRequired: step=" + c29697t2.f59742a + ", scene=" + c29697t2.f59743b + ", matchesHardcoded=" + z11 + ", isOldPoa=" + z14 + ", config.showIntroScreen=" + zM69774a + " → required=" + z15 + " (orVideoIdent=" + z13 + ", orPaymentMethods=" + zStartsWith$default + ") result=" + z12, null);
        return z12;
    }

    public C31283h(SavedStateHandle savedStateHandle, InterfaceC29984m interfaceC29984m, Set set) {
        this.f63387a = interfaceC29984m;
        this.f63388b = set;
        this.f63389c = new C28936t(savedStateHandle, "KEY_AFTER_INSTRUCTIONS_DATA", null, false);
    }

    /* JADX INFO: renamed from: a */
    public static String m70667a(C29697t2 c29697t2) {
        return c29697t2.f59742a + "|" + c29697t2.f59743b + "|" + c29697t2.f59744c;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0171  */
    /* JADX WARN: Code duplicated, block: B:61:0x0176  */
    /* JADX WARN: Code duplicated, block: B:63:0x0179  */
    /* JADX WARN: Code duplicated, block: B:64:0x017e  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70670a(C29983l c29983l, C29697t2 c29697t2, Parcelable parcelable, String str, ContinuationImpl continuationImpl) {
        C31282g c31282g;
        final C29983l c29983l2;
        AbstractC29172p abstractC29172p;
        final C29697t2 c29697t3;
        String str2;
        final C29124h c29124h;
        String strM69333a;
        String strM69333a2;
        String str3;
        if (continuationImpl instanceof C31282g) {
            c31282g = (C31282g) continuationImpl;
            int i11 = c31282g.f63384h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31282g.f63384h = i11 - Integer.MIN_VALUE;
            } else {
                c31282g = new C31282g(this, continuationImpl);
            }
        } else {
            c31282g = new C31282g(this, continuationImpl);
        }
        Object objM70042a = c31282g.f63382f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31282g.f63384h;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            C33272c.f67816e.f67810a.mo68955d("InstructionsResolver", "resolveInstructions, introParams=" + c29697t2 + ", payload=" + parcelable, null);
            InterfaceC29984m interfaceC29984m = this.f63387a;
            c31282g.f63377a = c29983l;
            c31282g.f63378b = c29697t2;
            c31282g.f63379c = parcelable;
            c31282g.f63380d = str;
            c31282g.f63384h = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c31282g);
            if (objM70042a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            str = c31282g.f63380d;
            parcelable = c31282g.f63379c;
            c29697t2 = c31282g.f63378b;
            c29983l = c31282g.f63377a;
            ResultKt.throwOnFailure(objM70042a);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC29172p = c31282g.f63381e;
            str2 = c31282g.f63380d;
            parcelable = c31282g.f63379c;
            c29697t3 = c31282g.f63378b;
            c29983l2 = c31282g.f63377a;
            ResultKt.throwOnFailure(objM70042a);
        }
        c29124h = (C29124h) ((AbstractC29971N) objM70042a).m70051c();
        if (c29124h == null && abstractC29172p != null) {
            if (parcelable != null) {
                C31281f c31281f = new C31281f(c29697t3, parcelable, str2);
                C28936t c28936t = this.f63389c;
                KProperty kProperty = f63385d[0];
                c28936t.f58834a.set(c28936t.f58835b, c31281f);
            }
            boolean zM70668a = m70668a(c29697t3, c29124h, abstractC29172p);
            boolean zContains = this.f63388b.contains(m70667a(c29697t3));
            Lazy lazy = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.main.instructions.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C31283h.m70666a(this.f63390b, c29983l2, c29124h, c29697t3);
                }
            });
            if (zM70668a && !zContains && ((C28890b) lazy.getValue()).m69670b()) {
                C33272c.f67816e.f67810a.mo68955d("InstructionsResolver", "resolveInstructions: instructions required", null);
                String strM69795b = c29697t3.f59746e;
                if (strM69795b == null) {
                    strM69795b = abstractC29172p.m69795b();
                }
                return new C31277b(new C31237Z(new C28895g(c29697t3.f59742a, c29697t3.f59743b, c29697t3.f59744c, strM69795b), c29697t3.f59745d, c29697t3.f59747f));
            }
            String str4 = !zM70668a ? "not required  " : null;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = zContains ? "already shown  " : null;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = !((C28890b) lazy.getValue()).m69670b() ? "no resources  " : null;
            C33272c.f67816e.f67810a.mo68955d("InstructionsResolver", "resolveInstructions: no instructions expected: " + str4 + str5 + (str6 != null ? str6 : ""), null);
            return C31278c.f63373a;
        }
        if (c29124h != null) {
            strM69333a = AbstractC28458h.m69333a(c29124h);
        } else {
            strM69333a = null;
        }
        if (abstractC29172p != null) {
            strM69333a2 = AbstractC28458h.m69333a(abstractC29172p);
        } else {
            strM69333a2 = null;
        }
        C33272c.f67816e.f67810a.mo68956e("InstructionsResolver", "resolveInstructions: config or applicant is null. c=" + strM69333a + ", a=" + strM69333a2, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Resolve instructions error. Params - ");
        sb2.append(c29697t3);
        C29107e0 c29107e0 = new C29107e0(new SNSGeneralException(sb2.toString(), null, null, 6, null), null, null, 6);
        str3 = c29697t3.f59744c;
        if (str3 == null) {
            str3 = "TYPE_UNKNOWN";
        }
        return new C31276a(c29107e0, str3);
        AbstractC29172p abstractC29172p2 = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
        InterfaceC29984m interfaceC29984m2 = this.f63387a;
        c31282g.f63377a = c29983l;
        c31282g.f63378b = c29697t2;
        c31282g.f63379c = parcelable;
        c31282g.f63380d = str;
        c31282g.f63381e = abstractC29172p2;
        c31282g.f63384h = 2;
        Object objM70045b = ((C29967J) interfaceC29984m2).m70045b(false, c31282g);
        if (objM70045b != coroutine_suspended) {
            c29983l2 = c29983l;
            abstractC29172p = abstractC29172p2;
            objM70042a = objM70045b;
            String str7 = str;
            c29697t3 = c29697t2;
            str2 = str7;
            c29124h = (C29124h) ((AbstractC29971N) objM70042a).m70051c();
            if (c29124h == null) {
            }
            if (c29124h != null) {
                strM69333a = AbstractC28458h.m69333a(c29124h);
            } else {
                strM69333a = null;
            }
            if (abstractC29172p != null) {
                strM69333a2 = AbstractC28458h.m69333a(abstractC29172p);
            } else {
                strM69333a2 = null;
            }
            C33272c.f67816e.f67810a.mo68956e("InstructionsResolver", "resolveInstructions: config or applicant is null. c=" + strM69333a + ", a=" + strM69333a2, null);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Resolve instructions error. Params - ");
            sb3.append(c29697t3);
            C29107e0 c29107e1 = new C29107e0(new SNSGeneralException(sb3.toString(), null, null, 6, null), null, null, 6);
            str3 = c29697t3.f59744c;
            if (str3 == null) {
                str3 = "TYPE_UNKNOWN";
            }
            return new C31276a(c29107e1, str3);
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: a */
    public static final C28890b m70666a(C31283h c31283h, C29983l c29983l, C29124h c29124h, C29697t2 c29697t2) {
        c31283h.getClass();
        return new C28890b(c29983l, c29124h.f59071d, c29697t2.f59742a, c29697t2.f59744c, c29697t2.f59743b, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final AbstractC31245b0 m70669a(boolean z11) {
        C33272c.f67816e.f67810a.mo68955d("InstructionsResolver", "executeAfterInstructionsAction, success=" + z11, null);
        C28936t c28936t = this.f63389c;
        KProperty[] kPropertyArr = f63385d;
        KProperty kProperty = kPropertyArr[0];
        C31281f c31281f = (C31281f) c28936t.m69705a();
        if (c31281f == null) {
            return null;
        }
        C28936t c28936t2 = this.f63389c;
        KProperty kProperty2 = kPropertyArr[0];
        c28936t2.f58834a.set(c28936t2.f58835b, null);
        if (z11) {
            Parcelable parcelable = c31281f.f63375b;
            if (parcelable instanceof AbstractC31234Y) {
                ((AbstractC31234Y) parcelable).f63190a = null;
            }
            if (parcelable instanceof AbstractC31245b0) {
                return (AbstractC31245b0) parcelable;
            }
            String str = c31281f.f63376c;
            if (str != null) {
                return new C31260f(true, parcelable, str);
            }
            return null;
        }
        String str2 = c31281f.f63376c;
        if (str2 != null) {
            return new C31260f(false, c31281f.f63375b, str2);
        }
        return null;
    }
}
