package com.trtc.uikit.livekit.p180kc.helper;

import android.content.Context;
import androidx.media3.common.C2711C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.p180kc.data.entity.LiveRoomInfo;
import com.trtc.uikit.livekit.p180kc.data.entity.LiveTxUserInfo;
import com.trtc.uikit.livekit.p180kc.data.entity.Report;
import je0.C40397b;
import kotlinx.coroutines.TimeoutKt;
import le0.InterfaceC42178a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: LiveHelper.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\fJ \u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0012J\"\u0010\u0013\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u0010\u0012¨\u0006\u0015"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;", "", "<init>", "()V", FirebaseAnalytics.Event.LOGIN, "", "context", "Landroid/content/Context;", "roomId", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLiveTxUserInfo", "Lcom/trtc/uikit/livekit/kc/data/entity/LiveTxUserInfo;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "txUserInfo", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/kc/data/entity/LiveTxUserInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportShare", "", "fromInviteOpenId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportReplay", "eventId", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LiveHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final LiveHelper f79157a = new LiveHelper();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m81510b(@NotNull String str, @NotNull Continuation<? super LiveTxUserInfo> continuation) {
        LiveHelper$loadLiveTxUserInfo$1 liveHelper$loadLiveTxUserInfo$1;
        if (continuation instanceof LiveHelper$loadLiveTxUserInfo$1) {
            liveHelper$loadLiveTxUserInfo$1 = (LiveHelper$loadLiveTxUserInfo$1) continuation;
            int i11 = liveHelper$loadLiveTxUserInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                liveHelper$loadLiveTxUserInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                liveHelper$loadLiveTxUserInfo$1 = new LiveHelper$loadLiveTxUserInfo$1(this, continuation);
            }
        } else {
            liveHelper$loadLiveTxUserInfo$1 = new LiveHelper$loadLiveTxUserInfo$1(this, continuation);
        }
        Object objM92615c = liveHelper$loadLiveTxUserInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = liveHelper$loadLiveTxUserInfo$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM92615c);
                InterfaceC42178a interfaceC42178aM89024b = C40397b.f89707a.m89024b();
                LiveRoomInfo liveRoomInfo = new LiveRoomInfo(str);
                liveHelper$loadLiveTxUserInfo$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
                liveHelper$loadLiveTxUserInfo$1.label = 1;
                objM92615c = interfaceC42178aM89024b.m92615c(liveRoomInfo, liveHelper$loadLiveTxUserInfo$1);
                if (objM92615c == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM92615c);
            }
            return (LiveTxUserInfo) objM92615c;
        } catch (Exception e11) {
            if (!(e11 instanceof ApiException)) {
                ToastCompat.m66437C(R$string.live_kc_common_error);
            } else if (!Intrinsics.areEqual(((ApiException) e11).code, "500004")) {
                if (C27041f.m66668h(e11.getMessage()).length() > 0) {
                    ToastCompat.m66441G(e11.getMessage(), new Object[0]);
                } else {
                    ToastCompat.m66437C(R$string.live_kc_common_error);
                }
            }
            C44128b.m97261e("Live", "loadLiveTxUserInfo error " + e11.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m81511c(Context context, LiveTxUserInfo liveTxUserInfo, Continuation<? super String> continuation) {
        LiveHelper$login$2 liveHelper$login$2;
        if (continuation instanceof LiveHelper$login$2) {
            liveHelper$login$2 = (LiveHelper$login$2) continuation;
            int i11 = liveHelper$login$2.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                liveHelper$login$2.label = i11 - Integer.MIN_VALUE;
            } else {
                liveHelper$login$2 = new LiveHelper$login$2(this, continuation);
            }
        } else {
            liveHelper$login$2 = new LiveHelper$login$2(this, continuation);
        }
        Object objM90469d = liveHelper$login$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = liveHelper$login$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM90469d);
            LiveHelper$login$3 liveHelper$login$3 = new LiveHelper$login$3(context, liveTxUserInfo, null);
            liveHelper$login$2.L$0 = SpillingKt.nullOutSpilledVariable(context);
            liveHelper$login$2.L$1 = SpillingKt.nullOutSpilledVariable(liveTxUserInfo);
            liveHelper$login$2.label = 1;
            objM90469d = TimeoutKt.m90469d(C2711C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, liveHelper$login$3, liveHelper$login$2);
            if (objM90469d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM90469d);
        }
        if (((String) objM90469d) == null) {
            ToastCompat.m66437C(R$string.live_kc_common_error);
            C44128b.m97261e("Live", "login tx timeout after 15s");
        }
        return objM90469d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (r8 == r1) goto L25;
     */
    @Nullable
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m81512d(@NotNull Context context, @NotNull String str, @NotNull Continuation<? super String> continuation) {
        LiveHelper$login$1 liveHelper$login$1;
        if (continuation instanceof LiveHelper$login$1) {
            liveHelper$login$1 = (LiveHelper$login$1) continuation;
            int i11 = liveHelper$login$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                liveHelper$login$1.label = i11 - Integer.MIN_VALUE;
            } else {
                liveHelper$login$1 = new LiveHelper$login$1(this, continuation);
            }
        } else {
            liveHelper$login$1 = new LiveHelper$login$1(this, continuation);
        }
        Object objM81510b = liveHelper$login$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = liveHelper$login$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM81510b);
            liveHelper$login$1.L$0 = context;
            liveHelper$login$1.L$1 = SpillingKt.nullOutSpilledVariable(str);
            liveHelper$login$1.label = 1;
            objM81510b = m81510b(str, liveHelper$login$1);
            if (objM81510b != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            str = (String) liveHelper$login$1.L$1;
            context = (Context) liveHelper$login$1.L$0;
            ResultKt.throwOnFailure(objM81510b);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM81510b);
        }
        return (String) objM81510b;
        LiveTxUserInfo liveTxUserInfo = (LiveTxUserInfo) objM81510b;
        if (liveTxUserInfo == null) {
            return null;
        }
        liveHelper$login$1.L$0 = SpillingKt.nullOutSpilledVariable(context);
        liveHelper$login$1.L$1 = SpillingKt.nullOutSpilledVariable(str);
        liveHelper$login$1.L$2 = SpillingKt.nullOutSpilledVariable(liveTxUserInfo);
        liveHelper$login$1.label = 2;
        objM81510b = m81511c(context, liveTxUserInfo, liveHelper$login$1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m81513e(@Nullable String str, @Nullable String str2, @NotNull Continuation<? super Unit> continuation) {
        LiveHelper$reportReplay$1 liveHelper$reportReplay$1;
        if (continuation instanceof LiveHelper$reportReplay$1) {
            liveHelper$reportReplay$1 = (LiveHelper$reportReplay$1) continuation;
            int i11 = liveHelper$reportReplay$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                liveHelper$reportReplay$1.label = i11 - Integer.MIN_VALUE;
            } else {
                liveHelper$reportReplay$1 = new LiveHelper$reportReplay$1(this, continuation);
            }
        } else {
            liveHelper$reportReplay$1 = new LiveHelper$reportReplay$1(this, continuation);
        }
        Object objM92619g = liveHelper$reportReplay$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = liveHelper$reportReplay$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM92619g);
                if (str == null || StringsKt.isBlank(str) || str2 == null || StringsKt.isBlank(str2)) {
                    C44128b.m97261e("Live", "reportReplay failed: roomId is blank");
                    return Unit.INSTANCE;
                }
                Report.Request request = new Report.Request(str, Report.Request.REPORT_TYPE_REPLAY, new Report.Request.ReportData(null, Report.Request.ReportData.REPLAY_ACTION_LEAVE, str2, 1, null));
                InterfaceC42178a interfaceC42178aM89024b = C40397b.f89707a.m89024b();
                liveHelper$reportReplay$1.L$0 = str;
                liveHelper$reportReplay$1.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                liveHelper$reportReplay$1.L$2 = SpillingKt.nullOutSpilledVariable(request);
                liveHelper$reportReplay$1.label = 1;
                objM92619g = interfaceC42178aM89024b.m92619g(request, liveHelper$reportReplay$1);
                if (objM92619g == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) liveHelper$reportReplay$1.L$0;
                ResultKt.throwOnFailure(objM92619g);
            }
            if (Intrinsics.areEqual(((Report.Response) objM92619g).getResult(), Boxing.boxBoolean(true))) {
                C44128b.m97266j("Live", "reportReplay success, roomId: " + str);
            } else {
                C44128b.m97261e("Live", "reportReplay failed, roomId: " + str);
            }
        } catch (Exception e11) {
            C44128b.m97261e("Live", "reportReplay error, roomId: " + str);
            C44128b.m97263g("Live", e11);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m81514f(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation) {
        LiveHelper$reportShare$1 liveHelper$reportShare$1;
        if (continuation instanceof LiveHelper$reportShare$1) {
            liveHelper$reportShare$1 = (LiveHelper$reportShare$1) continuation;
            int i11 = liveHelper$reportShare$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                liveHelper$reportShare$1.label = i11 - Integer.MIN_VALUE;
            } else {
                liveHelper$reportShare$1 = new LiveHelper$reportShare$1(this, continuation);
            }
        } else {
            liveHelper$reportShare$1 = new LiveHelper$reportShare$1(this, continuation);
        }
        Object objM92619g = liveHelper$reportShare$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = liveHelper$reportShare$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM92619g);
                if (StringsKt.isBlank(str) || StringsKt.isBlank(str2)) {
                    return Unit.INSTANCE;
                }
                Report.Request request = new Report.Request(str, Report.Request.REPORT_TYPE_SHARE, new Report.Request.ReportData(str2, null, null, 6, null));
                InterfaceC42178a interfaceC42178aM89024b = C40397b.f89707a.m89024b();
                liveHelper$reportShare$1.L$0 = str;
                liveHelper$reportShare$1.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                liveHelper$reportShare$1.L$2 = SpillingKt.nullOutSpilledVariable(request);
                liveHelper$reportShare$1.label = 1;
                objM92619g = interfaceC42178aM89024b.m92619g(request, liveHelper$reportShare$1);
                if (objM92619g == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) liveHelper$reportShare$1.L$0;
                ResultKt.throwOnFailure(objM92619g);
            }
            C44128b.m97266j("Live", "reportShare result:" + Intrinsics.areEqual(((Report.Response) objM92619g).getResult(), Boxing.boxBoolean(true)) + ", roomId: " + str);
        } catch (Exception e11) {
            C44128b.m97262f("Live", "reportShare", e11);
        }
        return Unit.INSTANCE;
    }
}
