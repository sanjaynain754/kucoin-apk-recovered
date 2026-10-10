package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.tencent.bugly.proguard.C33954u6;
import p192d6.C36621b;
import p631t4.InterfaceC44686a;
import p631t4.InterfaceC44687b;
import p652u4.C45121a;
import p712w3.C45706f;

/* JADX INFO: loaded from: classes34.dex */
@Deprecated
public class DraweeView<DH extends InterfaceC44687b> extends ImageView {
    private static boolean sGlobalLegacyVisibilityHandlingEnabled;
    private float mAspectRatio;
    private C45121a<DH> mDraweeHolder;
    private Object mExtraData;
    private boolean mInitialised;
    private boolean mLegacyVisibilityHandlingEnabled;
    private final C5608a.a mMeasureSpec;

    public DraweeView(Context context) {
        super(context);
        this.mMeasureSpec = new C5608a.a();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        this.mExtraData = null;
        init(context);
    }

    public void resetActualImage() {
        setController(null);
    }

    private void maybeOverrideVisibilityHandling() {
        Drawable drawable;
        if (!this.mLegacyVisibilityHandlingEnabled || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z11) {
        sGlobalLegacyVisibilityHandlingEnabled = z11;
    }

    public void doAttach() {
        this.mDraweeHolder.m99736k();
    }

    public void doDetach() {
        this.mDraweeHolder.m99737l();
    }

    public float getAspectRatio() {
        return this.mAspectRatio;
    }

    public InterfaceC44686a getController() {
        return this.mDraweeHolder.m99731f();
    }

    public Object getExtraData() {
        return this.mExtraData;
    }

    public DH getHierarchy() {
        return (DH) this.mDraweeHolder.m99732g();
    }

    public Drawable getTopLevelDrawable() {
        return this.mDraweeHolder.m99733h();
    }

    public boolean hasController() {
        return this.mDraweeHolder.m99731f() != null;
    }

    public boolean hasHierarchy() {
        return this.mDraweeHolder.m99734i();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i11, int i12) {
        C5608a.a aVar = this.mMeasureSpec;
        aVar.f8385a = i11;
        aVar.f8386b = i12;
        C5608a.m8743b(aVar, this.mAspectRatio, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        C5608a.a aVar2 = this.mMeasureSpec;
        super.onMeasure(aVar2.f8385a, aVar2.f8386b);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mDraweeHolder.m99738m(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f11) {
        if (f11 == this.mAspectRatio) {
            return;
        }
        this.mAspectRatio = f11;
        requestLayout();
    }

    public void setController(InterfaceC44686a interfaceC44686a) {
        this.mDraweeHolder.m99741p(interfaceC44686a);
        super.setImageDrawable(this.mDraweeHolder.m99733h());
    }

    public void setExtraData(Object obj) {
        this.mExtraData = obj;
    }

    public void setHierarchy(DH dh2) {
        this.mDraweeHolder.m99742q(dh2);
        super.setImageDrawable(this.mDraweeHolder.m99733h());
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z11) {
        this.mLegacyVisibilityHandlingEnabled = z11;
    }

    private void init(Context context) {
        boolean zM81959d;
        try {
            if (C36621b.m81959d()) {
                C36621b.m81957a("DraweeView#init");
            }
            if (this.mInitialised) {
                if (zM81959d) {
                    return;
                } else {
                    return;
                }
            }
            boolean z11 = true;
            this.mInitialised = true;
            this.mDraweeHolder = C45121a.m99727d(null, context);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                if (zM81959d) {
                    return;
                } else {
                    return;
                }
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!sGlobalLegacyVisibilityHandlingEnabled || context.getApplicationInfo().targetSdkVersion < 24) {
                z11 = false;
            }
            this.mLegacyVisibilityHandlingEnabled = z11;
        } finally {
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
        }
    }

    public void onAttach() {
        doAttach();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    public void onDetach() {
        doDetach();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        maybeOverrideVisibilityHandling();
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        init(getContext());
        this.mDraweeHolder.m99740o();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        init(getContext());
        this.mDraweeHolder.m99740o();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i11) {
        init(getContext());
        this.mDraweeHolder.m99740o();
        super.setImageResource(i11);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        init(getContext());
        this.mDraweeHolder.m99740o();
        super.setImageURI(uri);
    }

    @Override // android.view.View
    public String toString() {
        String string;
        C45706f.a aVarM100884b = C45706f.m100884b(this);
        C45121a<DH> c45121a = this.mDraweeHolder;
        if (c45121a != null) {
            string = c45121a.toString();
        } else {
            string = "<no holder set>";
        }
        return aVarM100884b.m100886b(C33954u6.f72238i, string).toString();
    }

    public DraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMeasureSpec = new C5608a.a();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        this.mExtraData = null;
        init(context);
    }

    public DraweeView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mMeasureSpec = new C5608a.a();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        this.mExtraData = null;
        init(context);
    }

    @TargetApi(21)
    public DraweeView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.mMeasureSpec = new C5608a.a();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        this.mExtraData = null;
        init(context);
    }
}
