package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0467R;
import com.tencent.bugly.proguard.InterfaceC33953u5;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
class TooltipPopup {
    private static final String TAG = "TooltipPopup";
    private final View mContentView;
    private final Context mContext;
    private final WindowManager.LayoutParams mLayoutParams;
    private final TextView mMessageView;
    private final int[] mTmpAnchorPos;
    private final int[] mTmpAppPos;
    private final Rect mTmpDisplayFrame;

    public boolean isShowing() {
        return this.mContentView.getParent() != null;
    }

    public TooltipPopup(@NonNull Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.mLayoutParams = layoutParams;
        this.mTmpDisplayFrame = new Rect();
        this.mTmpAnchorPos = new int[2];
        this.mTmpAppPos = new int[2];
        this.mContext = context;
        View viewInflate = LayoutInflater.from(context).inflate(C0467R.layout.abc_tooltip, (ViewGroup) null);
        this.mContentView = viewInflate;
        this.mMessageView = (TextView) viewInflate.findViewById(C0467R.id.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C0467R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    private void computePosition(View view, int i11, int i12, boolean z11, WindowManager.LayoutParams layoutParams) {
        int height;
        int i13;
        int i14;
        int dimensionPixelSize;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.mContext.getResources().getDimensionPixelOffset(C0467R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i11 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.mContext.getResources().getDimensionPixelOffset(C0467R.dimen.tooltip_precise_anchor_extra_offset);
            height = i12 + dimensionPixelOffset2;
            i13 = i12 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i13 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.mContext.getResources();
        if (z11) {
            i14 = C0467R.dimen.tooltip_y_offset_touch;
        } else {
            i14 = C0467R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i14);
        View appRootView = getAppRootView(view);
        if (appRootView == null) {
            Log.e(TAG, "Cannot find app view");
            return;
        }
        appRootView.getWindowVisibleDisplayFrame(this.mTmpDisplayFrame);
        Rect rect = this.mTmpDisplayFrame;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources2 = this.mContext.getResources();
            int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier != 0) {
                dimensionPixelSize = resources2.getDimensionPixelSize(identifier);
            } else {
                dimensionPixelSize = 0;
            }
            DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
            this.mTmpDisplayFrame.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        appRootView.getLocationOnScreen(this.mTmpAppPos);
        view.getLocationOnScreen(this.mTmpAnchorPos);
        int[] iArr = this.mTmpAnchorPos;
        int i15 = iArr[0];
        int[] iArr2 = this.mTmpAppPos;
        int i16 = i15 - iArr2[0];
        iArr[0] = i16;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i16 + i11) - (appRootView.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mContentView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.mContentView.getMeasuredHeight();
        int i17 = this.mTmpAnchorPos[1];
        int i18 = ((i13 + i17) - dimensionPixelOffset3) - measuredHeight;
        int i19 = i17 + height + dimensionPixelOffset3;
        if (z11) {
            if (i18 >= 0) {
                layoutParams.y = i18;
                return;
            } else {
                layoutParams.y = i19;
                return;
            }
        }
        if (measuredHeight + i19 <= this.mTmpDisplayFrame.height()) {
            layoutParams.y = i19;
        } else {
            layoutParams.y = i18;
        }
    }

    private static View getAppRootView(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams).type != 2) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return ((Activity) context).getWindow().getDecorView();
                }
            }
        }
        return rootView;
    }

    public void hide() {
        if (!isShowing()) {
            return;
        }
        ((WindowManager) this.mContext.getSystemService(InterfaceC33953u5.f72199F)).removeView(this.mContentView);
    }

    public void show(View view, int i11, int i12, boolean z11, CharSequence charSequence) {
        if (isShowing()) {
            hide();
        }
        this.mMessageView.setText(charSequence);
        computePosition(view, i11, i12, z11, this.mLayoutParams);
        ((WindowManager) this.mContext.getSystemService(InterfaceC33953u5.f72199F)).addView(this.mContentView, this.mLayoutParams);
    }
}
