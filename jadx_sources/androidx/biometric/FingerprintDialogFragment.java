package androidx.biometric;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class FingerprintDialogFragment extends DialogFragment {
    private static final int MESSAGE_DISPLAY_TIME_MS = 2000;
    static final int STATE_FINGERPRINT = 1;
    static final int STATE_FINGERPRINT_AUTHENTICATED = 3;
    static final int STATE_FINGERPRINT_ERROR = 2;
    static final int STATE_NONE = 0;
    private static final String TAG = "FingerprintFragment";
    private int mErrorTextColor;

    @Nullable
    private ImageView mFingerprintIcon;

    @Nullable
    TextView mHelpMessageView;
    private int mNormalTextColor;
    BiometricViewModel mViewModel;
    final Handler mHandler = new Handler(Looper.getMainLooper());
    final Runnable mResetDialogRunnable = new Runnable() { // from class: androidx.biometric.FingerprintDialogFragment.1
        @Override // java.lang.Runnable
        public void run() {
            FingerprintDialogFragment.this.resetDialog();
        }
    };

    @RequiresApi(21)
    public static class Api21Impl {
        public static void startAnimation(@NonNull Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }

        private Api21Impl() {
        }
    }

    @RequiresApi(26)
    public static class Api26Impl {
        public static int getColorErrorAttr() {
            return C0640R.attr.colorError;
        }

        private Api26Impl() {
        }
    }

    private boolean shouldAnimateForTransition(int i11, int i12) {
        if (i11 == 0 && i12 == 1) {
            return false;
        }
        if (i11 == 1 && i12 == 2) {
            return true;
        }
        return i11 == 2 && i12 == 1;
    }

    @NonNull
    public static FingerprintDialogFragment newInstance() {
        return new FingerprintDialogFragment();
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        builder.setTitle(this.mViewModel.getTitle());
        View viewInflate = LayoutInflater.from(builder.getContext()).inflate(C0640R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(C0640R.id.fingerprint_subtitle);
        if (textView != null) {
            CharSequence subtitle = this.mViewModel.getSubtitle();
            if (TextUtils.isEmpty(subtitle)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(subtitle);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(C0640R.id.fingerprint_description);
        if (textView2 != null) {
            CharSequence description = this.mViewModel.getDescription();
            if (TextUtils.isEmpty(description)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(description);
            }
        }
        this.mFingerprintIcon = (ImageView) viewInflate.findViewById(C0640R.id.fingerprint_icon);
        this.mHelpMessageView = (TextView) viewInflate.findViewById(C0640R.id.fingerprint_error);
        builder.setNegativeButton(AuthenticatorUtils.isDeviceCredentialAllowed(this.mViewModel.getAllowedAuthenticators()) ? getString(C0640R.string.confirm_device_credential_password) : this.mViewModel.getNegativeButtonText(), new DialogInterface.OnClickListener() { // from class: androidx.biometric.FingerprintDialogFragment.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                FingerprintDialogFragment.this.mViewModel.setNegativeButtonPressPending(true);
            }
        });
        builder.setView(viewInflate);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setCanceledOnTouchOutside(false);
        return alertDialogCreate;
    }

    public void updateFingerprintIcon(int i11) {
        int fingerprintDialogPreviousState;
        Drawable assetForTransition;
        if (this.mFingerprintIcon == null || (assetForTransition = getAssetForTransition((fingerprintDialogPreviousState = this.mViewModel.getFingerprintDialogPreviousState()), i11)) == null) {
            return;
        }
        this.mFingerprintIcon.setImageDrawable(assetForTransition);
        if (shouldAnimateForTransition(fingerprintDialogPreviousState, i11)) {
            Api21Impl.startAnimation(assetForTransition);
        }
        this.mViewModel.setFingerprintDialogPreviousState(i11);
    }

    public void updateHelpMessageColor(int i11) {
        TextView textView = this.mHelpMessageView;
        if (textView != null) {
            textView.setTextColor(i11 == 2 ? this.mErrorTextColor : this.mNormalTextColor);
        }
    }

    public void updateHelpMessageText(@Nullable CharSequence charSequence) {
        TextView textView = this.mHelpMessageView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    private void connectViewModel() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        BiometricViewModel biometricViewModel = (BiometricViewModel) new ViewModelProvider(activity).get(BiometricViewModel.class);
        this.mViewModel = biometricViewModel;
        biometricViewModel.getFingerprintDialogState().observe(this, new Observer<Integer>() { // from class: androidx.biometric.FingerprintDialogFragment.3
            @Override // androidx.lifecycle.Observer
            public void onChanged(Integer num) {
                FingerprintDialogFragment fingerprintDialogFragment = FingerprintDialogFragment.this;
                fingerprintDialogFragment.mHandler.removeCallbacks(fingerprintDialogFragment.mResetDialogRunnable);
                FingerprintDialogFragment.this.updateFingerprintIcon(num.intValue());
                FingerprintDialogFragment.this.updateHelpMessageColor(num.intValue());
                FingerprintDialogFragment fingerprintDialogFragment2 = FingerprintDialogFragment.this;
                fingerprintDialogFragment2.mHandler.postDelayed(fingerprintDialogFragment2.mResetDialogRunnable, 2000L);
            }
        });
        this.mViewModel.getFingerprintDialogHelpMessage().observe(this, new Observer<CharSequence>() { // from class: androidx.biometric.FingerprintDialogFragment.4
            @Override // androidx.lifecycle.Observer
            public void onChanged(CharSequence charSequence) {
                FingerprintDialogFragment fingerprintDialogFragment = FingerprintDialogFragment.this;
                fingerprintDialogFragment.mHandler.removeCallbacks(fingerprintDialogFragment.mResetDialogRunnable);
                FingerprintDialogFragment.this.updateHelpMessageText(charSequence);
                FingerprintDialogFragment fingerprintDialogFragment2 = FingerprintDialogFragment.this;
                fingerprintDialogFragment2.mHandler.postDelayed(fingerprintDialogFragment2.mResetDialogRunnable, 2000L);
            }
        });
    }

    private Drawable getAssetForTransition(int i11, int i12) {
        int i13;
        Context context = getContext();
        if (context == null) {
            Log.w(TAG, "Unable to get asset. Context is null.");
            return null;
        }
        if (i11 == 0 && i12 == 1) {
            i13 = C0640R.drawable.fingerprint_dialog_fp_icon;
        } else if (i11 == 1 && i12 == 2) {
            i13 = C0640R.drawable.fingerprint_dialog_error;
        } else if (i11 == 2 && i12 == 1) {
            i13 = C0640R.drawable.fingerprint_dialog_fp_icon;
        } else {
            if (i11 != 1 || i12 != 3) {
                return null;
            }
            i13 = C0640R.drawable.fingerprint_dialog_fp_icon;
        }
        return ContextCompat.getDrawable(context, i13);
    }

    private int getThemedColorFor(int i11) {
        Context context = getContext();
        FragmentActivity activity = getActivity();
        if (context != null && activity != null) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(i11, typedValue, true);
            TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(typedValue.data, new int[]{i11});
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            return color;
        }
        Log.w(TAG, "Unable to get themed color. Context or activity is null.");
        return 0;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.mViewModel.setFingerprintDialogCancelPending(true);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        int color;
        super.onCreate(bundle);
        connectViewModel();
        if (Build.VERSION.SDK_INT >= 26) {
            this.mErrorTextColor = getThemedColorFor(Api26Impl.getColorErrorAttr());
        } else {
            Context context = getContext();
            if (context != null) {
                color = ContextCompat.getColor(context, C0640R.color.biometric_error_color);
            } else {
                color = 0;
            }
            this.mErrorTextColor = color;
        }
        this.mNormalTextColor = getThemedColorFor(android.R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.mViewModel.setFingerprintDialogPreviousState(0);
        this.mViewModel.setFingerprintDialogState(1);
        this.mViewModel.setFingerprintDialogHelpMessage(getString(C0640R.string.fingerprint_dialog_touch_sensor));
    }

    public void resetDialog() {
        Context context = getContext();
        if (context == null) {
            Log.w(TAG, "Not resetting the dialog. Context is null.");
        } else {
            this.mViewModel.setFingerprintDialogState(1);
            this.mViewModel.setFingerprintDialogHelpMessage(context.getString(C0640R.string.fingerprint_dialog_touch_sensor));
        }
    }
}
