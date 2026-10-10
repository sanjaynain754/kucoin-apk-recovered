package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.tencent.bugly.proguard.C33627eb;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class BiometricFragment extends Fragment {
    static final int CANCELED_FROM_CLIENT = 3;
    static final int CANCELED_FROM_INTERNAL = 0;
    static final int CANCELED_FROM_NEGATIVE_BUTTON = 2;
    static final int CANCELED_FROM_USER = 1;
    private static final int DISMISS_INSTANTLY_DELAY_MS = 500;
    private static final String FINGERPRINT_DIALOG_FRAGMENT_TAG = "androidx.biometric.FingerprintDialogFragment";
    private static final int HIDE_DIALOG_DELAY_MS = 2000;
    private static final int REQUEST_CONFIRM_CREDENTIAL = 1;
    private static final int SHOW_PROMPT_DELAY_MS = 600;
    private static final String TAG = "BiometricFragment";

    @VisibleForTesting
    Handler mHandler = new Handler(Looper.getMainLooper());

    @VisibleForTesting
    BiometricViewModel mViewModel;

    @RequiresApi(28)
    public static class Api28Impl {
        public static void authenticate(@NonNull android.hardware.biometrics.BiometricPrompt biometricPrompt, @NonNull CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull android.hardware.biometrics.BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        public static void authenticate(@NonNull android.hardware.biometrics.BiometricPrompt biometricPrompt, @NonNull android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject, @NonNull CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull android.hardware.biometrics.BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        @NonNull
        public static android.hardware.biometrics.BiometricPrompt.Builder createPromptBuilder(@NonNull Context context) {
            return new android.hardware.biometrics.BiometricPrompt.Builder(context);
        }

        private Api28Impl() {
        }

        @NonNull
        public static android.hardware.biometrics.BiometricPrompt buildPrompt(@NonNull android.hardware.biometrics.BiometricPrompt.Builder builder) {
            return builder.build();
        }

        public static void setDescription(@NonNull android.hardware.biometrics.BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void setNegativeButton(@NonNull android.hardware.biometrics.BiometricPrompt.Builder builder, @NonNull CharSequence charSequence, @NonNull Executor executor, @NonNull DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        public static void setSubtitle(@NonNull android.hardware.biometrics.BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void setTitle(@NonNull android.hardware.biometrics.BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    public static class PromptExecutor implements Executor {
        private final Handler mPromptHandler = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.mPromptHandler.post(runnable);
        }
    }

    public static class ShowPromptForAuthenticationRunnable implements Runnable {

        @NonNull
        private final WeakReference<BiometricFragment> mFragmentRef;

        @Override // java.lang.Runnable
        public void run() {
            if (this.mFragmentRef.get() != null) {
                this.mFragmentRef.get().showPromptForAuthentication();
            }
        }

        public ShowPromptForAuthenticationRunnable(@Nullable BiometricFragment biometricFragment) {
            this.mFragmentRef = new WeakReference<>(biometricFragment);
        }
    }

    public static class StopDelayingPromptRunnable implements Runnable {

        @NonNull
        private final WeakReference<BiometricViewModel> mViewModelRef;

        @Override // java.lang.Runnable
        public void run() {
            if (this.mViewModelRef.get() != null) {
                this.mViewModelRef.get().setDelayingPrompt(false);
            }
        }

        public StopDelayingPromptRunnable(@Nullable BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }
    }

    public static class StopIgnoringCancelRunnable implements Runnable {

        @NonNull
        private final WeakReference<BiometricViewModel> mViewModelRef;

        @Override // java.lang.Runnable
        public void run() {
            if (this.mViewModelRef.get() != null) {
                this.mViewModelRef.get().setIgnoringCancel(false);
            }
        }

        public StopIgnoringCancelRunnable(@Nullable BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }
    }

    private void handleConfirmCredentialResult(int i11) {
        if (i11 == -1) {
            sendSuccessAndDismiss(new BiometricPrompt.AuthenticationResult(null, 1));
        } else {
            sendErrorAndDismiss(10, getString(C0640R.string.generic_error_user_canceled));
        }
    }

    public void cancelAuthentication(int i11) {
        if (i11 == 3 || !this.mViewModel.isIgnoringCancel()) {
            if (isUsingFingerprintDialog()) {
                this.mViewModel.setCanceledFrom(i11);
                if (i11 == 1) {
                    sendErrorToClient(10, ErrorUtils.getFingerprintErrorString(getContext(), 10));
                }
            }
            this.mViewModel.getCancellationSignalProvider().cancel();
        }
    }

    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        @Nullable
        public static Intent createConfirmDeviceCredentialIntent(@NonNull KeyguardManager keyguardManager, @Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    @RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
        }

        public static void setConfirmationRequired(@NonNull android.hardware.biometrics.BiometricPrompt.Builder builder, boolean z11) {
            builder.setConfirmationRequired(z11);
        }

        public static void setDeviceCredentialAllowed(@NonNull android.hardware.biometrics.BiometricPrompt.Builder builder, boolean z11) {
            builder.setDeviceCredentialAllowed(z11);
        }
    }

    @RequiresApi(30)
    public static class Api30Impl {
        private Api30Impl() {
        }

        public static void setAllowedAuthenticators(@NonNull android.hardware.biometrics.BiometricPrompt.Builder builder, int i11) {
            builder.setAllowedAuthenticators(i11);
        }
    }

    private void dismissFingerprintDialog() {
        this.mViewModel.setPromptShowing(false);
        if (isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) parentFragmentManager.findFragmentByTag(FINGERPRINT_DIALOG_FRAGMENT_TAG);
            if (fingerprintDialogFragment != null) {
                if (fingerprintDialogFragment.isAdded()) {
                    fingerprintDialogFragment.dismissAllowingStateLoss();
                } else {
                    parentFragmentManager.beginTransaction().remove(fingerprintDialogFragment).commitAllowingStateLoss();
                }
            }
        }
    }

    private boolean isFingerprintDialogNeededForErrorHandling() {
        return Build.VERSION.SDK_INT == 28 && !PackageUtils.hasSystemFeatureFingerprint(getContext());
    }

    private boolean isUsingFingerprintDialog() {
        return Build.VERSION.SDK_INT < 28 || isFingerprintDialogNeededForCrypto() || isFingerprintDialogNeededForErrorHandling();
    }

    public static BiometricFragment newInstance() {
        return new BiometricFragment();
    }

    private void sendErrorToClient(final int i11, @NonNull final CharSequence charSequence) {
        if (this.mViewModel.isConfirmingDeviceCredential()) {
            Log.v(TAG, "Error not sent to client. User is confirming their device credential.");
        } else if (!this.mViewModel.isAwaitingResult()) {
            Log.w(TAG, "Error not sent to client. Client is not awaiting a result.");
        } else {
            this.mViewModel.setAwaitingResult(false);
            this.mViewModel.getClientExecutor().execute(new Runnable() { // from class: androidx.biometric.BiometricFragment.10
                @Override // java.lang.Runnable
                public void run() {
                    BiometricFragment.this.mViewModel.getClientCallback().onAuthenticationError(i11, charSequence);
                }
            });
        }
    }

    private void sendFailureToClient() {
        if (this.mViewModel.isAwaitingResult()) {
            this.mViewModel.getClientExecutor().execute(new Runnable() { // from class: androidx.biometric.BiometricFragment.11
                @Override // java.lang.Runnable
                public void run() {
                    BiometricFragment.this.mViewModel.getClientCallback().onAuthenticationFailed();
                }
            });
        } else {
            Log.w(TAG, "Failure not sent to client. Client is not awaiting a result.");
        }
    }

    private void sendSuccessToClient(@NonNull final BiometricPrompt.AuthenticationResult authenticationResult) {
        if (!this.mViewModel.isAwaitingResult()) {
            Log.w(TAG, "Success not sent to client. Client is not awaiting a result.");
        } else {
            this.mViewModel.setAwaitingResult(false);
            this.mViewModel.getClientExecutor().execute(new Runnable() { // from class: androidx.biometric.BiometricFragment.9
                @Override // java.lang.Runnable
                public void run() {
                    BiometricFragment.this.mViewModel.getClientCallback().onAuthenticationSucceeded(authenticationResult);
                }
            });
        }
    }

    private void showFingerprintErrorMessage(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(C0640R.string.default_error_msg);
        }
        this.mViewModel.setFingerprintDialogState(2);
        this.mViewModel.setFingerprintDialogHelpMessage(charSequence);
    }

    @RequiresApi(28)
    @VisibleForTesting
    public void authenticateWithBiometricPrompt(@NonNull android.hardware.biometrics.BiometricPrompt biometricPrompt, @Nullable Context context) {
        android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObjectWrapForBiometricPrompt = CryptoObjectUtils.wrapForBiometricPrompt(this.mViewModel.getCryptoObject());
        CancellationSignal biometricCancellationSignal = this.mViewModel.getCancellationSignalProvider().getBiometricCancellationSignal();
        PromptExecutor promptExecutor = new PromptExecutor();
        android.hardware.biometrics.BiometricPrompt$AuthenticationCallback biometricCallback = this.mViewModel.getAuthenticationCallbackProvider().getBiometricCallback();
        try {
            if (cryptoObjectWrapForBiometricPrompt == null) {
                Api28Impl.authenticate(biometricPrompt, biometricCancellationSignal, promptExecutor, biometricCallback);
            } else {
                Api28Impl.authenticate(biometricPrompt, cryptoObjectWrapForBiometricPrompt, biometricCancellationSignal, promptExecutor, biometricCallback);
            }
        } catch (NullPointerException e11) {
            Log.e(TAG, "Got NPE while authenticating with biometric prompt.", e11);
            sendErrorAndDismiss(1, context != null ? context.getString(C0640R.string.default_error_msg) : "");
        }
    }

    @VisibleForTesting
    public void authenticateWithFingerprint(@NonNull FingerprintManagerCompat fingerprintManagerCompat, @NonNull Context context) {
        try {
            fingerprintManagerCompat.authenticate(CryptoObjectUtils.wrapForFingerprintManager(this.mViewModel.getCryptoObject()), 0, this.mViewModel.getCancellationSignalProvider().getFingerprintCancellationSignal(), this.mViewModel.getAuthenticationCallbackProvider().getFingerprintCallback(), (Handler) null);
        } catch (NullPointerException e11) {
            Log.e(TAG, "Got NPE while authenticating with fingerprint.", e11);
            sendErrorAndDismiss(1, ErrorUtils.getFingerprintErrorString(context, 1));
        }
    }

    public void dismiss() {
        this.mViewModel.setPromptShowing(false);
        dismissFingerprintDialog();
        if (!this.mViewModel.isConfirmingDeviceCredential() && isAdded()) {
            getParentFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        }
        Context context = getContext();
        if (context == null || !DeviceUtils.shouldDelayShowingPrompt(context, Build.MODEL)) {
            return;
        }
        this.mViewModel.setDelayingPrompt(true);
        this.mHandler.postDelayed(new StopDelayingPromptRunnable(this.mViewModel), 600L);
    }

    public boolean isManagingDeviceCredentialButton() {
        return Build.VERSION.SDK_INT <= 28 && AuthenticatorUtils.isDeviceCredentialAllowed(this.mViewModel.getAllowedAuthenticators());
    }

    public void onCancelButtonPressed() {
        CharSequence negativeButtonText = this.mViewModel.getNegativeButtonText();
        if (negativeButtonText == null) {
            negativeButtonText = getString(C0640R.string.default_error_msg);
        }
        sendErrorAndDismiss(13, negativeButtonText);
        cancelAuthentication(2);
    }

    public void showPromptForAuthentication() {
        if (this.mViewModel.isPromptShowing()) {
            return;
        }
        if (getContext() == null) {
            Log.w(TAG, "Not showing biometric prompt. Context is null.");
            return;
        }
        this.mViewModel.setPromptShowing(true);
        this.mViewModel.setAwaitingResult(true);
        if (isUsingFingerprintDialog()) {
            showFingerprintDialogForAuthentication();
        } else {
            showBiometricPromptForAuthentication();
        }
    }

    private static int checkForFingerprintPreAuthenticationErrors(FingerprintManagerCompat fingerprintManagerCompat) {
        if (!fingerprintManagerCompat.isHardwareDetected()) {
            return 12;
        }
        if (!fingerprintManagerCompat.hasEnrolledFingerprints()) {
            return 11;
        }
        return 0;
    }

    private void connectViewModel() {
        if (getActivity() == null) {
            return;
        }
        BiometricViewModel biometricViewModel = (BiometricViewModel) new ViewModelProvider(getActivity()).get(BiometricViewModel.class);
        this.mViewModel = biometricViewModel;
        biometricViewModel.getAuthenticationResult().observe(this, new Observer<BiometricPrompt.AuthenticationResult>() { // from class: androidx.biometric.BiometricFragment.1
            @Override // androidx.lifecycle.Observer
            public void onChanged(BiometricPrompt.AuthenticationResult authenticationResult) {
                if (authenticationResult != null) {
                    BiometricFragment.this.onAuthenticationSucceeded(authenticationResult);
                    BiometricFragment.this.mViewModel.setAuthenticationResult(null);
                }
            }
        });
        this.mViewModel.getAuthenticationError().observe(this, new Observer<BiometricErrorData>() { // from class: androidx.biometric.BiometricFragment.2
            @Override // androidx.lifecycle.Observer
            public void onChanged(BiometricErrorData biometricErrorData) {
                if (biometricErrorData != null) {
                    BiometricFragment.this.onAuthenticationError(biometricErrorData.getErrorCode(), biometricErrorData.getErrorMessage());
                    BiometricFragment.this.mViewModel.setAuthenticationError(null);
                }
            }
        });
        this.mViewModel.getAuthenticationHelpMessage().observe(this, new Observer<CharSequence>() { // from class: androidx.biometric.BiometricFragment.3
            @Override // androidx.lifecycle.Observer
            public void onChanged(CharSequence charSequence) {
                if (charSequence != null) {
                    BiometricFragment.this.onAuthenticationHelp(charSequence);
                    BiometricFragment.this.mViewModel.setAuthenticationError(null);
                }
            }
        });
        this.mViewModel.isAuthenticationFailurePending().observe(this, new Observer<Boolean>() { // from class: androidx.biometric.BiometricFragment.4
            @Override // androidx.lifecycle.Observer
            public void onChanged(Boolean bool) {
                if (bool.booleanValue()) {
                    BiometricFragment.this.onAuthenticationFailed();
                    BiometricFragment.this.mViewModel.setAuthenticationFailurePending(false);
                }
            }
        });
        this.mViewModel.isNegativeButtonPressPending().observe(this, new Observer<Boolean>() { // from class: androidx.biometric.BiometricFragment.5
            @Override // androidx.lifecycle.Observer
            public void onChanged(Boolean bool) {
                if (bool.booleanValue()) {
                    if (BiometricFragment.this.isManagingDeviceCredentialButton()) {
                        BiometricFragment.this.onDeviceCredentialButtonPressed();
                    } else {
                        BiometricFragment.this.onCancelButtonPressed();
                    }
                    BiometricFragment.this.mViewModel.setNegativeButtonPressPending(false);
                }
            }
        });
        this.mViewModel.isFingerprintDialogCancelPending().observe(this, new Observer<Boolean>() { // from class: androidx.biometric.BiometricFragment.6
            @Override // androidx.lifecycle.Observer
            public void onChanged(Boolean bool) {
                if (bool.booleanValue()) {
                    BiometricFragment.this.cancelAuthentication(1);
                    BiometricFragment.this.dismiss();
                    BiometricFragment.this.mViewModel.setFingerprintDialogCancelPending(false);
                }
            }
        });
    }

    private int getDismissDialogDelay() {
        Context context = getContext();
        if (context != null && DeviceUtils.shouldHideFingerprintDialog(context, Build.MODEL)) {
            return 0;
        }
        return 2000;
    }

    private boolean isChangingConfigurations() {
        FragmentActivity activity = getActivity();
        if (activity != null && activity.isChangingConfigurations()) {
            return true;
        }
        return false;
    }

    private boolean isFingerprintDialogNeededForCrypto() {
        FragmentActivity activity = getActivity();
        if (activity != null && this.mViewModel.getCryptoObject() != null && DeviceUtils.shouldUseFingerprintForCrypto(activity, Build.MANUFACTURER, Build.MODEL)) {
            return true;
        }
        return false;
    }

    @RequiresApi(21)
    private void launchConfirmCredentialActivity() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Log.e(TAG, "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager keyguardManager = KeyguardUtils.getKeyguardManager(activity);
        if (keyguardManager == null) {
            sendErrorAndDismiss(12, getString(C0640R.string.generic_error_no_keyguard));
            return;
        }
        CharSequence title = this.mViewModel.getTitle();
        CharSequence subtitle = this.mViewModel.getSubtitle();
        CharSequence description = this.mViewModel.getDescription();
        if (subtitle == null) {
            subtitle = description;
        }
        Intent intentCreateConfirmDeviceCredentialIntent = Api21Impl.createConfirmDeviceCredentialIntent(keyguardManager, title, subtitle);
        if (intentCreateConfirmDeviceCredentialIntent == null) {
            sendErrorAndDismiss(14, getString(C0640R.string.generic_error_no_device_credential));
            return;
        }
        this.mViewModel.setConfirmingDeviceCredential(true);
        if (isUsingFingerprintDialog()) {
            dismissFingerprintDialog();
        }
        intentCreateConfirmDeviceCredentialIntent.setFlags(134742016);
        startActivityForResult(intentCreateConfirmDeviceCredentialIntent, 1);
    }

    private void sendSuccessAndDismiss(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
        sendSuccessToClient(authenticationResult);
        dismiss();
    }

    @RequiresApi(28)
    private void showBiometricPromptForAuthentication() {
        android.hardware.biometrics.BiometricPrompt.Builder builderCreatePromptBuilder = Api28Impl.createPromptBuilder(requireContext().getApplicationContext());
        CharSequence title = this.mViewModel.getTitle();
        CharSequence subtitle = this.mViewModel.getSubtitle();
        CharSequence description = this.mViewModel.getDescription();
        if (title != null) {
            Api28Impl.setTitle(builderCreatePromptBuilder, title);
        }
        if (subtitle != null) {
            Api28Impl.setSubtitle(builderCreatePromptBuilder, subtitle);
        }
        if (description != null) {
            Api28Impl.setDescription(builderCreatePromptBuilder, description);
        }
        CharSequence negativeButtonText = this.mViewModel.getNegativeButtonText();
        if (!TextUtils.isEmpty(negativeButtonText)) {
            Api28Impl.setNegativeButton(builderCreatePromptBuilder, negativeButtonText, this.mViewModel.getClientExecutor(), this.mViewModel.getNegativeButtonListener());
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            Api29Impl.setConfirmationRequired(builderCreatePromptBuilder, this.mViewModel.isConfirmationRequired());
        }
        int allowedAuthenticators = this.mViewModel.getAllowedAuthenticators();
        if (i11 >= 30) {
            Api30Impl.setAllowedAuthenticators(builderCreatePromptBuilder, allowedAuthenticators);
        } else if (i11 >= 29) {
            Api29Impl.setDeviceCredentialAllowed(builderCreatePromptBuilder, AuthenticatorUtils.isDeviceCredentialAllowed(allowedAuthenticators));
        }
        authenticateWithBiometricPrompt(Api28Impl.buildPrompt(builderCreatePromptBuilder), getContext());
    }

    private void showFingerprintDialogForAuthentication() {
        Context applicationContext = requireContext().getApplicationContext();
        FingerprintManagerCompat fingerprintManagerCompatFrom = FingerprintManagerCompat.from(applicationContext);
        int iCheckForFingerprintPreAuthenticationErrors = checkForFingerprintPreAuthenticationErrors(fingerprintManagerCompatFrom);
        if (iCheckForFingerprintPreAuthenticationErrors != 0) {
            sendErrorAndDismiss(iCheckForFingerprintPreAuthenticationErrors, ErrorUtils.getFingerprintErrorString(applicationContext, iCheckForFingerprintPreAuthenticationErrors));
            return;
        }
        if (isAdded()) {
            this.mViewModel.setFingerprintDialogDismissedInstantly(true);
            if (!DeviceUtils.shouldHideFingerprintDialog(applicationContext, Build.MODEL)) {
                this.mHandler.postDelayed(new Runnable() { // from class: androidx.biometric.BiometricFragment.7
                    @Override // java.lang.Runnable
                    public void run() {
                        BiometricFragment.this.mViewModel.setFingerprintDialogDismissedInstantly(false);
                    }
                }, 500L);
                FingerprintDialogFragment.newInstance().show(getParentFragmentManager(), FINGERPRINT_DIALOG_FRAGMENT_TAG);
            }
            this.mViewModel.setCanceledFrom(0);
            authenticateWithFingerprint(fingerprintManagerCompatFrom, applicationContext);
        }
    }

    public void authenticate(@NonNull BiometricPrompt.PromptInfo promptInfo, @Nullable BiometricPrompt.CryptoObject cryptoObject) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Log.e(TAG, "Not launching prompt. Client activity was null.");
            return;
        }
        this.mViewModel.setPromptInfo(promptInfo);
        int consolidatedAuthenticators = AuthenticatorUtils.getConsolidatedAuthenticators(promptInfo, cryptoObject);
        if (Build.VERSION.SDK_INT < 30 && consolidatedAuthenticators == 15 && cryptoObject == null) {
            this.mViewModel.setCryptoObject(CryptoObjectUtils.createFakeCryptoObject());
        } else {
            this.mViewModel.setCryptoObject(cryptoObject);
        }
        if (isManagingDeviceCredentialButton()) {
            this.mViewModel.setNegativeButtonTextOverride(getString(C0640R.string.confirm_device_credential_password));
        } else {
            this.mViewModel.setNegativeButtonTextOverride(null);
        }
        if (isManagingDeviceCredentialButton() && BiometricManager.from(activity).canAuthenticate(255) != 0) {
            this.mViewModel.setAwaitingResult(true);
            launchConfirmCredentialActivity();
        } else if (this.mViewModel.isDelayingPrompt()) {
            this.mHandler.postDelayed(new ShowPromptForAuthenticationRunnable(this), 600L);
        } else {
            showPromptForAuthentication();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i11, int i12, @Nullable Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1) {
            this.mViewModel.setConfirmingDeviceCredential(false);
            handleConfirmCredentialResult(i12);
        }
    }

    @VisibleForTesting
    public void onAuthenticationError(final int i11, @Nullable final CharSequence charSequence) {
        if (!ErrorUtils.isKnownError(i11)) {
            i11 = 8;
        }
        Context context = getContext();
        if (Build.VERSION.SDK_INT < 29 && ErrorUtils.isLockoutError(i11) && context != null && KeyguardUtils.isDeviceSecuredWithCredential(context) && AuthenticatorUtils.isDeviceCredentialAllowed(this.mViewModel.getAllowedAuthenticators())) {
            launchConfirmCredentialActivity();
            return;
        }
        if (isUsingFingerprintDialog()) {
            if (charSequence == null) {
                charSequence = ErrorUtils.getFingerprintErrorString(getContext(), i11);
            }
            if (i11 == 5) {
                int canceledFrom = this.mViewModel.getCanceledFrom();
                if (canceledFrom == 0 || canceledFrom == 3) {
                    sendErrorToClient(i11, charSequence);
                }
                dismiss();
                return;
            }
            if (this.mViewModel.isFingerprintDialogDismissedInstantly()) {
                sendErrorAndDismiss(i11, charSequence);
            } else {
                showFingerprintErrorMessage(charSequence);
                this.mHandler.postDelayed(new Runnable() { // from class: androidx.biometric.BiometricFragment.8
                    @Override // java.lang.Runnable
                    public void run() {
                        BiometricFragment.this.sendErrorAndDismiss(i11, charSequence);
                    }
                }, getDismissDialogDelay());
            }
            this.mViewModel.setFingerprintDialogDismissedInstantly(true);
            return;
        }
        if (charSequence == null) {
            charSequence = getString(C0640R.string.default_error_msg) + C33627eb.f69716f + i11;
        }
        sendErrorAndDismiss(i11, charSequence);
    }

    public void onAuthenticationFailed() {
        if (isUsingFingerprintDialog()) {
            showFingerprintErrorMessage(getString(C0640R.string.fingerprint_not_recognized));
        }
        sendFailureToClient();
    }

    public void onAuthenticationHelp(@NonNull CharSequence charSequence) {
        if (isUsingFingerprintDialog()) {
            showFingerprintErrorMessage(charSequence);
        }
    }

    @VisibleForTesting
    public void onAuthenticationSucceeded(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
        sendSuccessAndDismiss(authenticationResult);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        connectViewModel();
    }

    public void onDeviceCredentialButtonPressed() {
        launchConfirmCredentialActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && AuthenticatorUtils.isDeviceCredentialAllowed(this.mViewModel.getAllowedAuthenticators())) {
            this.mViewModel.setIgnoringCancel(true);
            this.mHandler.postDelayed(new StopIgnoringCancelRunnable(this.mViewModel), 250L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT < 29 && !this.mViewModel.isConfirmingDeviceCredential() && !isChangingConfigurations()) {
            cancelAuthentication(0);
        }
    }

    public void sendErrorAndDismiss(int i11, @NonNull CharSequence charSequence) {
        sendErrorToClient(i11, charSequence);
        dismiss();
    }
}
