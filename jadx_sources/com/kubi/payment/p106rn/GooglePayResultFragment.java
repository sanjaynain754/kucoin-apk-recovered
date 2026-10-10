package com.kubi.payment.p106rn;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.contract.ApiTaskResult;
import com.google.android.gms.wallet.contract.TaskResultContracts;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GooglePayResultFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\r\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0005R&\u0010\u0004\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R8\u0010\t\u001a,\u0012(\u0012&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00060\u0006 \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u000b0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/payment/rn/GooglePayResultFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "pendingCallback", "Lkotlin/Function2;", "Lcom/google/android/gms/wallet/PaymentData;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/google/android/gms/tasks/Task;", "kotlin.jvm.PlatformType", InterfaceC33617e1.f69659h, "task", TUIConstants.TUIChat.CALL_BACK, "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GooglePayResultFragment extends Fragment {

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f40169W = new Companion(null);

    /* JADX INFO: renamed from: U */
    @Nullable
    public Function2<? super PaymentData, ? super ProtocolException, Unit> f40170U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final ActivityResultLauncher<Task<PaymentData>> f40171V;

    /* JADX INFO: compiled from: GooglePayResultFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/rn/GooglePayResultFragment$Companion;", "", "<init>", "()V", "FRAGMENT_TAG", "", "getOrCreate", "Lcom/kubi/payment/rn/GooglePayResultFragment;", "activity", "Landroidx/fragment/app/FragmentActivity;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final GooglePayResultFragment getOrCreate(@NotNull FragmentActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag("GooglePayResultFragment");
            GooglePayResultFragment googlePayResultFragment = fragmentFindFragmentByTag instanceof GooglePayResultFragment ? (GooglePayResultFragment) fragmentFindFragmentByTag : null;
            if (googlePayResultFragment != null) {
                return googlePayResultFragment;
            }
            GooglePayResultFragment googlePayResultFragment2 = new GooglePayResultFragment();
            supportFragmentManager.beginTransaction().add(googlePayResultFragment2, "GooglePayResultFragment").commitAllowingStateLoss();
            return googlePayResultFragment2;
        }
    }

    /* JADX INFO: renamed from: g3 */
    public static final void m49419g3(GooglePayResultFragment googlePayResultFragment, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        googlePayResultFragment.f40171V.launch(it);
    }

    /* JADX INFO: renamed from: h3 */
    public static final void m49420h3(GooglePayResultFragment googlePayResultFragment, ApiTaskResult apiTaskResult) {
        String statusMessage;
        Status status;
        Status status2;
        Function2<? super PaymentData, ? super ProtocolException, Unit> function2 = googlePayResultFragment.f40170U;
        if (function2 == null) {
            return;
        }
        googlePayResultFragment.f40170U = null;
        Integer numValueOf = (apiTaskResult == null || (status2 = apiTaskResult.getStatus()) == null) ? null : Integer.valueOf(status2.getStatusCode());
        if (numValueOf != null && numValueOf.intValue() == 0) {
            function2.invoke(apiTaskResult.getResult(), null);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 16) {
            String statusMessage2 = apiTaskResult.getStatus().getStatusMessage();
            if (statusMessage2 == null) {
                statusMessage2 = "USER_CANCELED";
            }
            function2.invoke(null, new ProtocolException(statusMessage2, null, null, false, 14, null));
            return;
        }
        if (apiTaskResult == null || (status = apiTaskResult.getStatus()) == null || (statusMessage = status.getStatusMessage()) == null) {
            statusMessage = "GooglePay error";
        }
        function2.invoke(null, new ProtocolException(statusMessage, null, null, false, 14, null));
    }

    /* JADX INFO: renamed from: f3 */
    public final void m49421f3(@NotNull Task<PaymentData> task, @NotNull Function2<? super PaymentData, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f40170U = callback;
        task.addOnCompleteListener(new OnCompleteListener() { // from class: com.kubi.payment.rn.b
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                GooglePayResultFragment.m49419g3(this.f40174b, task2);
            }
        });
    }

    public GooglePayResultFragment() {
        ActivityResultLauncher<Task<PaymentData>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new TaskResultContracts.GetPaymentDataResult(), new ActivityResultCallback() { // from class: com.kubi.payment.rn.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                GooglePayResultFragment.m49420h3(this.f40173a, (ApiTaskResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f40171V = activityResultLauncherRegisterForActivityResult;
    }
}
