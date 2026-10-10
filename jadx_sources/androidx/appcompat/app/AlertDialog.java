package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0467R;

/* JADX INFO: loaded from: classes23.dex */
public class AlertDialog extends AppCompatDialog implements DialogInterface {
    static final int LAYOUT_HINT_NONE = 0;
    static final int LAYOUT_HINT_SIDE = 1;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f1174b = 0;
    final AlertController mAlert;

    public static class Builder {

        /* JADX INFO: renamed from: P */
        private final AlertController.AlertParams f1175P;
        private final int mTheme;

        public Builder(@NonNull Context context) {
            this(context, AlertDialog.resolveDialogTheme(context, 0));
        }

        public Builder setIcon(@DrawableRes int i11) {
            this.f1175P.mIconId = i11;
            return this;
        }

        public Builder setItems(@ArrayRes int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f1175P;
            alertParams.mItems = alertParams.mContext.getResources().getTextArray(i11);
            this.f1175P.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setMessage(@StringRes int i11) {
            AlertController.AlertParams alertParams = this.f1175P;
            alertParams.mMessage = alertParams.mContext.getText(i11);
            return this;
        }

        public Builder setMultiChoiceItems(@ArrayRes int i11, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.f1175P;
            alertParams.mItems = alertParams.mContext.getResources().getTextArray(i11);
            AlertController.AlertParams alertParams2 = this.f1175P;
            alertParams2.mOnCheckboxClickListener = onMultiChoiceClickListener;
            alertParams2.mCheckedItems = zArr;
            alertParams2.mIsMultiChoice = true;
            return this;
        }

        public Builder setNegativeButton(@StringRes int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f1175P;
            alertParams.mNegativeButtonText = alertParams.mContext.getText(i11);
            this.f1175P.mNegativeButtonListener = onClickListener;
            return this;
        }

        public Builder setNeutralButton(@StringRes int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f1175P;
            alertParams.mNeutralButtonText = alertParams.mContext.getText(i11);
            this.f1175P.mNeutralButtonListener = onClickListener;
            return this;
        }

        public Builder setPositiveButton(@StringRes int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f1175P;
            alertParams.mPositiveButtonText = alertParams.mContext.getText(i11);
            this.f1175P.mPositiveButtonListener = onClickListener;
            return this;
        }

        public Builder setSingleChoiceItems(@ArrayRes int i11, int i12, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f1175P;
            alertParams.mItems = alertParams.mContext.getResources().getTextArray(i11);
            AlertController.AlertParams alertParams2 = this.f1175P;
            alertParams2.mOnClickListener = onClickListener;
            alertParams2.mCheckedItem = i12;
            alertParams2.mIsSingleChoice = true;
            return this;
        }

        public Builder setTitle(@StringRes int i11) {
            AlertController.AlertParams alertParams = this.f1175P;
            alertParams.mTitle = alertParams.mContext.getText(i11);
            return this;
        }

        public Builder setView(int i11) {
            AlertController.AlertParams alertParams = this.f1175P;
            alertParams.mView = null;
            alertParams.mViewLayoutResId = i11;
            alertParams.mViewSpacingSpecified = false;
            return this;
        }

        public Builder(@NonNull Context context, @StyleRes int i11) {
            this.f1175P = new AlertController.AlertParams(new ContextThemeWrapper(context, AlertDialog.resolveDialogTheme(context, i11)));
            this.mTheme = i11;
        }

        @NonNull
        public AlertDialog create() {
            AlertDialog alertDialog = new AlertDialog(this.f1175P.mContext, this.mTheme);
            this.f1175P.apply(alertDialog.mAlert);
            alertDialog.setCancelable(this.f1175P.mCancelable);
            if (this.f1175P.mCancelable) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(this.f1175P.mOnCancelListener);
            alertDialog.setOnDismissListener(this.f1175P.mOnDismissListener);
            DialogInterface.OnKeyListener onKeyListener = this.f1175P.mOnKeyListener;
            if (onKeyListener != null) {
                alertDialog.setOnKeyListener(onKeyListener);
            }
            return alertDialog;
        }

        @NonNull
        public Context getContext() {
            return this.f1175P.mContext;
        }

        public Builder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f1175P;
            alertParams.mAdapter = listAdapter;
            alertParams.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setCancelable(boolean z11) {
            this.f1175P.mCancelable = z11;
            return this;
        }

        public Builder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.AlertParams alertParams = this.f1175P;
            alertParams.mCursor = cursor;
            alertParams.mLabelColumn = str;
            alertParams.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setCustomTitle(@Nullable View view) {
            this.f1175P.mCustomTitleView = view;
            return this;
        }

        public Builder setIcon(@Nullable Drawable drawable) {
            this.f1175P.mIcon = drawable;
            return this;
        }

        public Builder setIconAttribute(@AttrRes int i11) {
            TypedValue typedValue = new TypedValue();
            this.f1175P.mContext.getTheme().resolveAttribute(i11, typedValue, true);
            this.f1175P.mIconId = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public Builder setInverseBackgroundForced(boolean z11) {
            this.f1175P.mForceInverseBackground = z11;
            return this;
        }

        public Builder setMessage(@Nullable CharSequence charSequence) {
            this.f1175P.mMessage = charSequence;
            return this;
        }

        public Builder setNegativeButtonIcon(Drawable drawable) {
            this.f1175P.mNegativeButtonIcon = drawable;
            return this;
        }

        public Builder setNeutralButtonIcon(Drawable drawable) {
            this.f1175P.mNeutralButtonIcon = drawable;
            return this;
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.f1175P.mOnCancelListener = onCancelListener;
            return this;
        }

        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.f1175P.mOnDismissListener = onDismissListener;
            return this;
        }

        public Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f1175P.mOnItemSelectedListener = onItemSelectedListener;
            return this;
        }

        public Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.f1175P.mOnKeyListener = onKeyListener;
            return this;
        }

        public Builder setPositiveButtonIcon(Drawable drawable) {
            this.f1175P.mPositiveButtonIcon = drawable;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder setRecycleOnMeasureEnabled(boolean z11) {
            this.f1175P.mRecycleOnMeasure = z11;
            return this;
        }

        public Builder setTitle(@Nullable CharSequence charSequence) {
            this.f1175P.mTitle = charSequence;
            return this;
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f1175P;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f1175P;
            alertParams.mNegativeButtonText = charSequence;
            alertParams.mNegativeButtonListener = onClickListener;
            return this;
        }

        public Builder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f1175P;
            alertParams.mNeutralButtonText = charSequence;
            alertParams.mNeutralButtonListener = onClickListener;
            return this;
        }

        public Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f1175P;
            alertParams.mPositiveButtonText = charSequence;
            alertParams.mPositiveButtonListener = onClickListener;
            return this;
        }

        public AlertDialog show() {
            AlertDialog alertDialogCreate = create();
            alertDialogCreate.show();
            return alertDialogCreate;
        }

        public Builder setView(View view) {
            AlertController.AlertParams alertParams = this.f1175P;
            alertParams.mView = view;
            alertParams.mViewLayoutResId = 0;
            alertParams.mViewSpacingSpecified = false;
            return this;
        }

        public Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.f1175P;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnCheckboxClickListener = onMultiChoiceClickListener;
            alertParams.mCheckedItems = zArr;
            alertParams.mIsMultiChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(Cursor cursor, int i11, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f1175P;
            alertParams.mCursor = cursor;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mCheckedItem = i11;
            alertParams.mLabelColumn = str;
            alertParams.mIsSingleChoice = true;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public Builder setView(View view, int i11, int i12, int i13, int i14) {
            AlertController.AlertParams alertParams = this.f1175P;
            alertParams.mView = view;
            alertParams.mViewLayoutResId = 0;
            alertParams.mViewSpacingSpecified = true;
            alertParams.mViewSpacingLeft = i11;
            alertParams.mViewSpacingTop = i12;
            alertParams.mViewSpacingRight = i13;
            alertParams.mViewSpacingBottom = i14;
            return this;
        }

        public Builder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.f1175P;
            alertParams.mCursor = cursor;
            alertParams.mOnCheckboxClickListener = onMultiChoiceClickListener;
            alertParams.mIsCheckedColumn = str;
            alertParams.mLabelColumn = str2;
            alertParams.mIsMultiChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f1175P;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mCheckedItem = i11;
            alertParams.mIsSingleChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(ListAdapter listAdapter, int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f1175P;
            alertParams.mAdapter = listAdapter;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mCheckedItem = i11;
            alertParams.mIsSingleChoice = true;
            return this;
        }
    }

    public AlertDialog(@NonNull Context context) {
        this(context, 0);
    }

    public void setButton(int i11, CharSequence charSequence, Message message) {
        this.mAlert.setButton(i11, charSequence, null, message, null);
    }

    public void setIcon(int i11) {
        this.mAlert.setIcon(i11);
    }

    public void setView(View view) {
        this.mAlert.setView(view);
    }

    public AlertDialog(@NonNull Context context, @StyleRes int i11) {
        super(context, resolveDialogTheme(context, i11));
        this.mAlert = new AlertController(getContext(), this, getWindow());
    }

    public static int resolveDialogTheme(@NonNull Context context, @StyleRes int i11) {
        if (((i11 >>> 24) & 255) >= 1) {
            return i11;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0467R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button getButton(int i11) {
        return this.mAlert.getButton(i11);
    }

    public ListView getListView() {
        return this.mAlert.getListView();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (this.mAlert.onKeyDown(i11, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i11, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (this.mAlert.onKeyUp(i11, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    public void setButton(int i11, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.mAlert.setButton(i11, charSequence, onClickListener, null, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setButtonPanelLayoutHint(int i11) {
        this.mAlert.setButtonPanelLayoutHint(i11);
    }

    public void setCustomTitle(View view) {
        this.mAlert.setCustomTitle(view);
    }

    public void setIcon(Drawable drawable) {
        this.mAlert.setIcon(drawable);
    }

    public void setIconAttribute(int i11) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i11, typedValue, true);
        this.mAlert.setIcon(typedValue.resourceId);
    }

    public void setMessage(CharSequence charSequence) {
        this.mAlert.setMessage(charSequence);
    }

    public void setView(View view, int i11, int i12, int i13, int i14) {
        this.mAlert.setView(view, i11, i12, i13, i14);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mAlert.installContent();
    }

    public void setButton(int i11, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.mAlert.setButton(i11, charSequence, onClickListener, null, drawable);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.mAlert.setTitle(charSequence);
    }

    public AlertDialog(@NonNull Context context, boolean z11, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z11);
        setOnCancelListener(onCancelListener);
    }
}
