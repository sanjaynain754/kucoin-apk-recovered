package com.sumsub.sns.internal.features.presentation.main;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.data.model.SNSNeedRestartSDKException;
import com.sumsub.sns.core.data.model.SNSSDKState;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.InterfaceC28492s0;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29095c0;
import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import com.sumsub.sns.internal.features.data.model.common.C29697t2;
import com.sumsub.sns.internal.features.data.repository.common.C29957e;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.log.C33272c;
import java.util.Iterator;
import kotlinx.coroutines.InterfaceC41769w;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.i2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC31275i2 extends AbstractC28073M0 implements InterfaceC28492s0 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty[] f63367c = {AbstractC28639a.m69485a(AbstractC31275i2.class, "callbacksLostOopsStrings", "getCallbacksLostOopsStrings()Lcom/sumsub/sns/internal/features/presentation/main/CallbacksLostOopsStrings;", 0)};

    /* JADX INFO: renamed from: a */
    public final InterfaceC29953a f63368a;

    /* JADX INFO: renamed from: b */
    public final C28936t f63369b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r5.m70664a(r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m70663a(AbstractC31275i2 abstractC31275i2, ContinuationImpl continuationImpl) {
        C31267g2 c31267g2;
        if (continuationImpl instanceof C31267g2) {
            c31267g2 = (C31267g2) continuationImpl;
            int i11 = c31267g2.f63339d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31267g2.f63339d = i11 - Integer.MIN_VALUE;
            } else {
                c31267g2 = new C31267g2(abstractC31275i2, continuationImpl);
            }
        } else {
            c31267g2 = new C31267g2(abstractC31275i2, continuationImpl);
        }
        Object obj = c31267g2.f63337b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31267g2.f63339d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c31267g2.f63336a = abstractC31275i2;
            c31267g2.f63339d = 1;
            if (AbstractC28073M0.onPrepare$suspendImpl(abstractC31275i2, c31267g2) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            abstractC31275i2 = c31267g2.f63336a;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        c31267g2.f63336a = null;
        c31267g2.f63339d = 2;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo70620a(SNSCompletionResult sNSCompletionResult, boolean z11);

    /* JADX INFO: renamed from: a */
    public abstract void mo70621a(AbstractC28503w abstractC28503w, long j11);

    /* JADX INFO: renamed from: a */
    public abstract void mo70622a(C29070X c29070x);

    /* JADX INFO: renamed from: a */
    public abstract void mo70624a(C29697t2 c29697t2, Parcelable parcelable, String str);

    /* JADX INFO: renamed from: a */
    public abstract void mo70626a(boolean z11, boolean z12);

    /* JADX INFO: renamed from: b */
    public abstract void mo70628b(String str);

    /* JADX INFO: renamed from: c */
    public abstract void mo70629c(boolean z11);

    /* JADX INFO: renamed from: d */
    public abstract void mo70630d(boolean z11);

    /* JADX INFO: renamed from: e */
    public abstract void mo70631e();

    /* JADX INFO: renamed from: e */
    public abstract void mo70632e(boolean z11);

    /* JADX INFO: renamed from: f */
    public abstract C31252d mo70633f();

    /* JADX INFO: renamed from: g */
    public abstract C31292k2 mo70635g();

    /* JADX INFO: renamed from: h */
    public final boolean m70665h() {
        if (!C28468k0.f57990h) {
            return false;
        }
        C33272c.f67816e.f67810a.mo68955d("SNSBaseAppViewModel", "SDK restored without callbacks, terminating with the oops screen", null);
        ((C29957e) this.f63368a).m70036a(SNSSDKState.Ready.INSTANCE);
        onPrepareError();
        fireEvent(C31342s.f63531c);
        SNSNeedRestartSDKException sNSNeedRestartSDKException = new SNSNeedRestartSDKException();
        C28936t c28936t = this.f63369b;
        KProperty[] kPropertyArr = f63367c;
        KProperty kProperty = kPropertyArr[0];
        C31244b c31244b = (C31244b) c28936t.m69705a();
        String str = c31244b != null ? c31244b.f63241a : null;
        C28936t c28936t2 = this.f63369b;
        KProperty kProperty2 = kPropertyArr[0];
        C31244b c31244b2 = (C31244b) c28936t2.m69705a();
        String str2 = c31244b2 != null ? c31244b2.f63242b : null;
        C28936t c28936t3 = this.f63369b;
        KProperty kProperty3 = kPropertyArr[0];
        C31244b c31244b3 = (C31244b) c28936t3.m69705a();
        AbstractC28052C.throwError$default(this, new C29107e0(sNSNeedRestartSDKException, null, new C29095c0(str, str2, c31244b3 != null ? c31244b3.f63243c : null, SNSIconHandler.SNSResultIcons.INFO.getImageName(), SNSColorElement.BACKGROUND_INFO), 2), "TYPE_UNKNOWN", false, null, 8, null);
        return true;
    }

    public AbstractC31275i2(SavedStateHandle savedStateHandle, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m) {
        super(interfaceC29953a, interfaceC29984m);
        this.f63368a = interfaceC29953a;
        this.f63369b = new C28936t(savedStateHandle, "KEY_CALLBACKS_LOST_OOPS_STRINGS", null, false);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        C31252d c31252dMo70633f = mo70633f();
        Iterator it = c31252dMo70633f.f63294b.values().iterator();
        while (it.hasNext()) {
            InterfaceC41775x1.a.m91377a((InterfaceC41769w) it.next(), null, 1, null);
        }
        c31252dMo70633f.f63294b.clear();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4 A[PHI: r2 r5 r10
      0x00b4: PHI (r2v9 com.sumsub.sns.internal.features.presentation.main.i2) = 
      (r2v7 com.sumsub.sns.internal.features.presentation.main.i2)
      (r2v11 com.sumsub.sns.internal.features.presentation.main.i2)
      (r2v11 com.sumsub.sns.internal.features.presentation.main.i2)
      (r2v11 com.sumsub.sns.internal.features.presentation.main.i2)
     binds: [B:23:0x0096, B:28:0x00ac, B:31:0x00b3, B:30:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b4: PHI (r5v3 com.sumsub.sns.internal.features.presentation.main.b) = 
      (r5v1 com.sumsub.sns.internal.features.presentation.main.b)
      (r5v5 com.sumsub.sns.internal.features.presentation.main.b)
      (r5v5 com.sumsub.sns.internal.features.presentation.main.b)
      (r5v5 com.sumsub.sns.internal.features.presentation.main.b)
     binds: [B:23:0x0096, B:28:0x00ac, B:31:0x00b3, B:30:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b4: PHI (r10v11 java.lang.String) = (r10v7 java.lang.String), (r10v14 java.lang.String), (r10v15 java.lang.String), (r10v16 java.lang.String) binds: [B:23:0x0096, B:28:0x00ac, B:31:0x00b3, B:30:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed A[PHI: r2 r5 r6 r10
      0x00ed: PHI (r2v15 java.lang.String) = (r2v13 java.lang.String), (r2v17 java.lang.String), (r2v17 java.lang.String), (r2v17 java.lang.String) binds: [B:37:0x00ce, B:42:0x00e5, B:45:0x00ec, B:44:0x00e9] A[DONT_GENERATE, DONT_INLINE]
      0x00ed: PHI (r5v9 com.sumsub.sns.internal.features.presentation.main.i2) = 
      (r5v7 com.sumsub.sns.internal.features.presentation.main.i2)
      (r5v11 com.sumsub.sns.internal.features.presentation.main.i2)
      (r5v11 com.sumsub.sns.internal.features.presentation.main.i2)
      (r5v11 com.sumsub.sns.internal.features.presentation.main.i2)
     binds: [B:37:0x00ce, B:42:0x00e5, B:45:0x00ec, B:44:0x00e9] A[DONT_GENERATE, DONT_INLINE]
      0x00ed: PHI (r6v6 com.sumsub.sns.internal.features.presentation.main.b) = 
      (r6v4 com.sumsub.sns.internal.features.presentation.main.b)
      (r6v7 com.sumsub.sns.internal.features.presentation.main.b)
      (r6v7 com.sumsub.sns.internal.features.presentation.main.b)
      (r6v7 com.sumsub.sns.internal.features.presentation.main.b)
     binds: [B:37:0x00ce, B:42:0x00e5, B:45:0x00ec, B:44:0x00e9] A[DONT_GENERATE, DONT_INLINE]
      0x00ed: PHI (r10v22 java.lang.String) = (r10v18 java.lang.String), (r10v25 java.lang.String), (r10v26 java.lang.String), (r10v27 java.lang.String) binds: [B:37:0x00ce, B:42:0x00e5, B:45:0x00ec, B:44:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    /* JADX WARN: Code duplicated, block: B:52:0x010b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0120  */
    /* JADX WARN: Code duplicated, block: B:58:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x012a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x0132  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        if (r10 == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e0, code lost:
    
        if (r10 == r1) goto L54;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70664a(ContinuationImpl continuationImpl) {
        C31271h2 c31271h2;
        C31244b c31244b;
        AbstractC31275i2 abstractC31275i2;
        String str;
        Object string;
        String str2;
        C31244b c31244b2;
        AbstractC31275i2 abstractC31275i3;
        String str3;
        Object string2;
        String str4;
        AbstractC31275i2 abstractC31275i4;
        String str5;
        String str6;
        String str7;
        String str8;
        C31244b c31244b3;
        AbstractC31275i2 abstractC31275i5;
        String str9;
        if (continuationImpl instanceof C31271h2) {
            c31271h2 = (C31271h2) continuationImpl;
            int i11 = c31271h2.f63357g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31271h2.f63357g = i11 - Integer.MIN_VALUE;
            } else {
                c31271h2 = new C31271h2(this, continuationImpl);
            }
        } else {
            c31271h2 = new C31271h2(this, continuationImpl);
        }
        Object string3 = c31271h2.f63355e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        String str10 = null;
        switch (c31271h2.f63357g) {
            case 0:
                ResultKt.throwOnFailure(string3);
                C28936t c28936t = this.f63369b;
                KProperty kProperty = f63367c[0];
                C31244b c31244b4 = (C31244b) c28936t.m69705a();
                c31271h2.f63351a = c31244b4;
                c31271h2.f63352b = this;
                c31271h2.f63357g = 1;
                Object string4 = getString("sns_oops_restartSdk_title", c31271h2);
                if (string4 != coroutine_suspended) {
                    c31244b = c31244b4;
                    string3 = string4;
                    abstractC31275i2 = this;
                    str = (String) string3;
                    if (str == null) {
                        c31271h2.f63351a = c31244b;
                        c31271h2.f63352b = abstractC31275i2;
                        c31271h2.f63357g = 2;
                        string3 = getString("sns_oops_fatal_title", c31271h2);
                    } else {
                        c31271h2.f63351a = c31244b;
                        c31271h2.f63352b = abstractC31275i2;
                        c31271h2.f63353c = str;
                        c31271h2.f63357g = 3;
                        string = getString("sns_oops_restartSdk_html", c31271h2);
                        if (string != coroutine_suspended) {
                            AbstractC31275i2 abstractC31275i6 = abstractC31275i2;
                            str2 = str;
                            string3 = string;
                            c31244b2 = c31244b;
                            abstractC31275i3 = abstractC31275i6;
                            str3 = (String) string3;
                            if (str3 == null) {
                                c31271h2.f63351a = c31244b2;
                                c31271h2.f63352b = abstractC31275i3;
                                c31271h2.f63353c = str2;
                                c31271h2.f63357g = 4;
                                string3 = getString("sns_oops_fatal_html", c31271h2);
                            } else {
                                c31271h2.f63351a = c31244b2;
                                c31271h2.f63352b = abstractC31275i3;
                                c31271h2.f63353c = str2;
                                c31271h2.f63354d = str3;
                                c31271h2.f63357g = 5;
                                string2 = getString("sns_oops_restartSdk_action", c31271h2);
                                if (string2 != coroutine_suspended) {
                                    String str11 = str2;
                                    str4 = str3;
                                    string3 = string2;
                                    abstractC31275i4 = abstractC31275i3;
                                    str5 = str11;
                                    str6 = (String) string3;
                                    if (str6 == null) {
                                        c31271h2.f63351a = c31244b2;
                                        c31271h2.f63352b = abstractC31275i4;
                                        c31271h2.f63353c = str5;
                                        c31271h2.f63354d = str4;
                                        c31271h2.f63357g = 6;
                                        string3 = getString("sns_oops_action_goBack", c31271h2);
                                        if (string3 != coroutine_suspended) {
                                            str7 = str4;
                                            str8 = str5;
                                            c31244b3 = c31244b2;
                                            abstractC31275i5 = abstractC31275i4;
                                            str9 = (String) string3;
                                            if (str9 != null) {
                                                str10 = str9;
                                            } else if (c31244b3 != null) {
                                                str10 = c31244b3.f63243c;
                                            }
                                            abstractC31275i4 = abstractC31275i5;
                                            str5 = str8;
                                            str4 = str7;
                                        }
                                    } else {
                                        str10 = str6;
                                    }
                                    C31244b c31244b5 = new C31244b(str5, str4, str10);
                                    C28936t c28936t2 = abstractC31275i4.f63369b;
                                    KProperty kProperty2 = f63367c[0];
                                    c28936t2.f58834a.set(c28936t2.f58835b, c31244b5);
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                    break;
                }
                return coroutine_suspended;
            case 1:
                abstractC31275i2 = c31271h2.f63352b;
                c31244b = c31271h2.f63351a;
                ResultKt.throwOnFailure(string3);
                str = (String) string3;
                if (str == null) {
                    c31271h2.f63351a = c31244b;
                    c31271h2.f63352b = abstractC31275i2;
                    c31271h2.f63357g = 2;
                    string3 = getString("sns_oops_fatal_title", c31271h2);
                    break;
                } else {
                    c31271h2.f63351a = c31244b;
                    c31271h2.f63352b = abstractC31275i2;
                    c31271h2.f63353c = str;
                    c31271h2.f63357g = 3;
                    string = getString("sns_oops_restartSdk_html", c31271h2);
                    if (string != coroutine_suspended) {
                        AbstractC31275i2 abstractC31275i7 = abstractC31275i2;
                        str2 = str;
                        string3 = string;
                        c31244b2 = c31244b;
                        abstractC31275i3 = abstractC31275i7;
                        str3 = (String) string3;
                        if (str3 == null) {
                            c31271h2.f63351a = c31244b2;
                            c31271h2.f63352b = abstractC31275i3;
                            c31271h2.f63353c = str2;
                            c31271h2.f63357g = 4;
                            string3 = getString("sns_oops_fatal_html", c31271h2);
                        } else {
                            c31271h2.f63351a = c31244b2;
                            c31271h2.f63352b = abstractC31275i3;
                            c31271h2.f63353c = str2;
                            c31271h2.f63354d = str3;
                            c31271h2.f63357g = 5;
                            string2 = getString("sns_oops_restartSdk_action", c31271h2);
                            if (string2 != coroutine_suspended) {
                                String str12 = str2;
                                str4 = str3;
                                string3 = string2;
                                abstractC31275i4 = abstractC31275i3;
                                str5 = str12;
                                str6 = (String) string3;
                                if (str6 == null) {
                                    c31271h2.f63351a = c31244b2;
                                    c31271h2.f63352b = abstractC31275i4;
                                    c31271h2.f63353c = str5;
                                    c31271h2.f63354d = str4;
                                    c31271h2.f63357g = 6;
                                    string3 = getString("sns_oops_action_goBack", c31271h2);
                                    if (string3 != coroutine_suspended) {
                                        str7 = str4;
                                        str8 = str5;
                                        c31244b3 = c31244b2;
                                        abstractC31275i5 = abstractC31275i4;
                                        str9 = (String) string3;
                                        if (str9 != null) {
                                            str10 = str9;
                                        } else if (c31244b3 != null) {
                                            str10 = c31244b3.f63243c;
                                        }
                                        abstractC31275i4 = abstractC31275i5;
                                        str5 = str8;
                                        str4 = str7;
                                    }
                                } else {
                                    str10 = str6;
                                }
                                C31244b c31244b6 = new C31244b(str5, str4, str10);
                                C28936t c28936t3 = abstractC31275i4.f63369b;
                                KProperty kProperty3 = f63367c[0];
                                c28936t3.f58834a.set(c28936t3.f58835b, c31244b6);
                                return Unit.INSTANCE;
                            }
                        }
                    }
                    break;
                }
                return coroutine_suspended;
            case 2:
                abstractC31275i2 = c31271h2.f63352b;
                c31244b = c31271h2.f63351a;
                ResultKt.throwOnFailure(string3);
                str = (String) string3;
                if (str == null) {
                    str = c31244b != null ? c31244b.f63241a : null;
                }
                c31271h2.f63351a = c31244b;
                c31271h2.f63352b = abstractC31275i2;
                c31271h2.f63353c = str;
                c31271h2.f63357g = 3;
                string = getString("sns_oops_restartSdk_html", c31271h2);
                if (string != coroutine_suspended) {
                    AbstractC31275i2 abstractC31275i8 = abstractC31275i2;
                    str2 = str;
                    string3 = string;
                    c31244b2 = c31244b;
                    abstractC31275i3 = abstractC31275i8;
                    str3 = (String) string3;
                    if (str3 == null) {
                        c31271h2.f63351a = c31244b2;
                        c31271h2.f63352b = abstractC31275i3;
                        c31271h2.f63353c = str2;
                        c31271h2.f63357g = 4;
                        string3 = getString("sns_oops_fatal_html", c31271h2);
                    } else {
                        c31271h2.f63351a = c31244b2;
                        c31271h2.f63352b = abstractC31275i3;
                        c31271h2.f63353c = str2;
                        c31271h2.f63354d = str3;
                        c31271h2.f63357g = 5;
                        string2 = getString("sns_oops_restartSdk_action", c31271h2);
                        if (string2 != coroutine_suspended) {
                            String str13 = str2;
                            str4 = str3;
                            string3 = string2;
                            abstractC31275i4 = abstractC31275i3;
                            str5 = str13;
                            str6 = (String) string3;
                            if (str6 == null) {
                                c31271h2.f63351a = c31244b2;
                                c31271h2.f63352b = abstractC31275i4;
                                c31271h2.f63353c = str5;
                                c31271h2.f63354d = str4;
                                c31271h2.f63357g = 6;
                                string3 = getString("sns_oops_action_goBack", c31271h2);
                                if (string3 != coroutine_suspended) {
                                    str7 = str4;
                                    str8 = str5;
                                    c31244b3 = c31244b2;
                                    abstractC31275i5 = abstractC31275i4;
                                    str9 = (String) string3;
                                    if (str9 != null) {
                                        str10 = str9;
                                    } else if (c31244b3 != null) {
                                        str10 = c31244b3.f63243c;
                                    }
                                    abstractC31275i4 = abstractC31275i5;
                                    str5 = str8;
                                    str4 = str7;
                                }
                            } else {
                                str10 = str6;
                            }
                            C31244b c31244b7 = new C31244b(str5, str4, str10);
                            C28936t c28936t4 = abstractC31275i4.f63369b;
                            KProperty kProperty4 = f63367c[0];
                            c28936t4.f58834a.set(c28936t4.f58835b, c31244b7);
                            return Unit.INSTANCE;
                        }
                    }
                    break;
                }
                return coroutine_suspended;
            case 3:
                str2 = c31271h2.f63353c;
                abstractC31275i3 = c31271h2.f63352b;
                c31244b2 = c31271h2.f63351a;
                ResultKt.throwOnFailure(string3);
                str3 = (String) string3;
                if (str3 == null) {
                    c31271h2.f63351a = c31244b2;
                    c31271h2.f63352b = abstractC31275i3;
                    c31271h2.f63353c = str2;
                    c31271h2.f63357g = 4;
                    string3 = getString("sns_oops_fatal_html", c31271h2);
                    break;
                } else {
                    c31271h2.f63351a = c31244b2;
                    c31271h2.f63352b = abstractC31275i3;
                    c31271h2.f63353c = str2;
                    c31271h2.f63354d = str3;
                    c31271h2.f63357g = 5;
                    string2 = getString("sns_oops_restartSdk_action", c31271h2);
                    if (string2 != coroutine_suspended) {
                        String str14 = str2;
                        str4 = str3;
                        string3 = string2;
                        abstractC31275i4 = abstractC31275i3;
                        str5 = str14;
                        str6 = (String) string3;
                        if (str6 == null) {
                            c31271h2.f63351a = c31244b2;
                            c31271h2.f63352b = abstractC31275i4;
                            c31271h2.f63353c = str5;
                            c31271h2.f63354d = str4;
                            c31271h2.f63357g = 6;
                            string3 = getString("sns_oops_action_goBack", c31271h2);
                            if (string3 != coroutine_suspended) {
                                str7 = str4;
                                str8 = str5;
                                c31244b3 = c31244b2;
                                abstractC31275i5 = abstractC31275i4;
                                str9 = (String) string3;
                                if (str9 != null) {
                                    str10 = str9;
                                } else if (c31244b3 != null) {
                                    str10 = c31244b3.f63243c;
                                }
                                abstractC31275i4 = abstractC31275i5;
                                str5 = str8;
                                str4 = str7;
                            }
                        } else {
                            str10 = str6;
                        }
                        C31244b c31244b8 = new C31244b(str5, str4, str10);
                        C28936t c28936t5 = abstractC31275i4.f63369b;
                        KProperty kProperty5 = f63367c[0];
                        c28936t5.f58834a.set(c28936t5.f58835b, c31244b8);
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            case 4:
                str2 = c31271h2.f63353c;
                abstractC31275i3 = c31271h2.f63352b;
                c31244b2 = c31271h2.f63351a;
                ResultKt.throwOnFailure(string3);
                str3 = (String) string3;
                if (str3 == null) {
                    str3 = c31244b2 != null ? c31244b2.f63242b : null;
                }
                c31271h2.f63351a = c31244b2;
                c31271h2.f63352b = abstractC31275i3;
                c31271h2.f63353c = str2;
                c31271h2.f63354d = str3;
                c31271h2.f63357g = 5;
                string2 = getString("sns_oops_restartSdk_action", c31271h2);
                if (string2 != coroutine_suspended) {
                    String str15 = str2;
                    str4 = str3;
                    string3 = string2;
                    abstractC31275i4 = abstractC31275i3;
                    str5 = str15;
                    str6 = (String) string3;
                    if (str6 == null) {
                        c31271h2.f63351a = c31244b2;
                        c31271h2.f63352b = abstractC31275i4;
                        c31271h2.f63353c = str5;
                        c31271h2.f63354d = str4;
                        c31271h2.f63357g = 6;
                        string3 = getString("sns_oops_action_goBack", c31271h2);
                        if (string3 != coroutine_suspended) {
                            str7 = str4;
                            str8 = str5;
                            c31244b3 = c31244b2;
                            abstractC31275i5 = abstractC31275i4;
                            str9 = (String) string3;
                            if (str9 != null) {
                                str10 = str9;
                            } else if (c31244b3 != null) {
                                str10 = c31244b3.f63243c;
                            }
                            abstractC31275i4 = abstractC31275i5;
                            str5 = str8;
                            str4 = str7;
                        }
                    } else {
                        str10 = str6;
                    }
                    C31244b c31244b9 = new C31244b(str5, str4, str10);
                    C28936t c28936t6 = abstractC31275i4.f63369b;
                    KProperty kProperty6 = f63367c[0];
                    c28936t6.f58834a.set(c28936t6.f58835b, c31244b9);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            case 5:
                str4 = c31271h2.f63354d;
                str5 = c31271h2.f63353c;
                AbstractC31275i2 abstractC31275i9 = c31271h2.f63352b;
                C31244b c31244b10 = c31271h2.f63351a;
                ResultKt.throwOnFailure(string3);
                abstractC31275i4 = abstractC31275i9;
                c31244b2 = c31244b10;
                str6 = (String) string3;
                if (str6 == null) {
                    c31271h2.f63351a = c31244b2;
                    c31271h2.f63352b = abstractC31275i4;
                    c31271h2.f63353c = str5;
                    c31271h2.f63354d = str4;
                    c31271h2.f63357g = 6;
                    string3 = getString("sns_oops_action_goBack", c31271h2);
                    if (string3 != coroutine_suspended) {
                        str7 = str4;
                        str8 = str5;
                        c31244b3 = c31244b2;
                        abstractC31275i5 = abstractC31275i4;
                        str9 = (String) string3;
                        if (str9 != null) {
                            str10 = str9;
                        } else if (c31244b3 != null) {
                            str10 = c31244b3.f63243c;
                        }
                        abstractC31275i4 = abstractC31275i5;
                        str5 = str8;
                        str4 = str7;
                    }
                    return coroutine_suspended;
                }
                str10 = str6;
                C31244b c31244b11 = new C31244b(str5, str4, str10);
                C28936t c28936t7 = abstractC31275i4.f63369b;
                KProperty kProperty7 = f63367c[0];
                c28936t7.f58834a.set(c28936t7.f58835b, c31244b11);
                return Unit.INSTANCE;
            case 6:
                str7 = c31271h2.f63354d;
                str8 = c31271h2.f63353c;
                abstractC31275i5 = c31271h2.f63352b;
                c31244b3 = c31271h2.f63351a;
                ResultKt.throwOnFailure(string3);
                str9 = (String) string3;
                if (str9 != null) {
                    str10 = str9;
                } else if (c31244b3 != null) {
                    str10 = c31244b3.f63243c;
                }
                abstractC31275i4 = abstractC31275i5;
                str5 = str8;
                str4 = str7;
                C31244b c31244b12 = new C31244b(str5, str4, str10);
                C28936t c28936t8 = abstractC31275i4.f63369b;
                KProperty kProperty8 = f63367c[0];
                c28936t8.f58834a.set(c28936t8.f58835b, c31244b12);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
