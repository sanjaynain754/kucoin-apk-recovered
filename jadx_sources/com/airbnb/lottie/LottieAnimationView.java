package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import p297h1.C38074d;
import p484o1.C42924f;
import p484o1.C42930l;
import p522p1.C43349b;
import p522p1.C43350c;
import p522p1.InterfaceC43352e;

/* JADX INFO: loaded from: classes34.dex */
public class LottieAnimationView extends AppCompatImageView {
    private static final InterfaceC5085j0<Throwable> DEFAULT_FAILURE_LISTENER = new InterfaceC5085j0() { // from class: com.airbnb.lottie.f
        @Override // com.airbnb.lottie.InterfaceC5085j0
        public final void onResult(Object obj) {
            LottieAnimationView.m5525b((Throwable) obj);
        }
    };
    private static final String TAG = "LottieAnimationView";
    private String animationName;

    @RawRes
    private int animationResId;
    private boolean autoPlay;
    private boolean cacheComposition;

    @Nullable
    private C5102p0<C5080h> compositionTask;

    @Nullable
    private InterfaceC5085j0<Throwable> failureListener;

    @DrawableRes
    private int fallbackResource;
    private boolean ignoreUnschedule;
    private final InterfaceC5085j0<C5080h> loadedListener;
    private final LottieDrawable lottieDrawable;
    private final Set<InterfaceC5089l0> lottieOnCompositionLoadedListeners;
    private final Set<UserActionTaken> userActionsTaken;
    private final InterfaceC5085j0<Throwable> wrappedFailureListener;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C5060a();
        String animationName;
        int animationResId;
        String imageAssetsFolder;
        boolean isAnimating;
        float progress;
        int repeatCount;
        int repeatMode;

        /* JADX INFO: renamed from: com.airbnb.lottie.LottieAnimationView$SavedState$a */
        public class C5060a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, C5061a c5061a) {
            this(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.animationName = parcel.readString();
            this.progress = parcel.readFloat();
            this.isAnimating = parcel.readInt() == 1;
            this.imageAssetsFolder = parcel.readString();
            this.repeatMode = parcel.readInt();
            this.repeatCount = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeString(this.animationName);
            parcel.writeFloat(this.progress);
            parcel.writeInt(this.isAnimating ? 1 : 0);
            parcel.writeString(this.imageAssetsFolder);
            parcel.writeInt(this.repeatMode);
            parcel.writeInt(this.repeatCount);
        }
    }

    public enum UserActionTaken {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.airbnb.lottie.LottieAnimationView$a */
    public class C5061a<T> extends C43350c<T> {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC43352e f5874d;

        public C5061a(InterfaceC43352e interfaceC43352e) {
            this.f5874d = interfaceC43352e;
        }

        @Override // p522p1.C43350c
        /* JADX INFO: renamed from: a */
        public T mo5530a(C43349b<T> c43349b) {
            return (T) this.f5874d.mo69378a(c43349b);
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.LottieAnimationView$b */
    public static class C5062b implements InterfaceC5085j0<Throwable> {

        /* JADX INFO: renamed from: a */
        public final WeakReference<LottieAnimationView> f5876a;

        @Override // com.airbnb.lottie.InterfaceC5085j0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th2) {
            LottieAnimationView lottieAnimationView = this.f5876a.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.fallbackResource != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.fallbackResource);
            }
            (lottieAnimationView.failureListener == null ? LottieAnimationView.DEFAULT_FAILURE_LISTENER : lottieAnimationView.failureListener).onResult(th2);
        }

        public C5062b(LottieAnimationView lottieAnimationView) {
            this.f5876a = new WeakReference<>(lottieAnimationView);
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.LottieAnimationView$c */
    public static class C5063c implements InterfaceC5085j0<C5080h> {

        /* JADX INFO: renamed from: a */
        public final WeakReference<LottieAnimationView> f5877a;

        @Override // com.airbnb.lottie.InterfaceC5085j0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(C5080h c5080h) {
            LottieAnimationView lottieAnimationView = this.f5877a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(c5080h);
        }

        public C5063c(LottieAnimationView lottieAnimationView) {
            this.f5877a = new WeakReference<>(lottieAnimationView);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.loadedListener = new C5063c(this);
        this.wrappedFailureListener = new C5062b(this);
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(null, R$attr.lottieAnimationViewStyle);
    }

    public <T> void addValueCallback(C38074d c38074d, T t11, C43350c<T> c43350c) {
        this.lottieDrawable.m5621s(c38074d, t11, c43350c);
    }

    @MainThread
    public void cancelAnimation() {
        this.autoPlay = false;
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.m5627v();
    }

    @MainThread
    public void pauseAnimation() {
        this.autoPlay = false;
        this.lottieDrawable.m5609i0();
    }

    public void setAnimation(@RawRes int i11) {
        this.animationResId = i11;
        this.animationName = null;
        setCompositionTask(fromRawRes(i11));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.cacheComposition ? C5107r.m5897y(getContext(), str) : C5107r.m5898z(getContext(), str, null));
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.animationResId = 0;
        this.animationName = null;
        cancelLoaderTask();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.animationResId = 0;
        this.animationName = null;
        cancelLoaderTask();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i11) {
        this.animationResId = 0;
        this.animationName = null;
        cancelLoaderTask();
        super.setImageResource(i11);
    }

    public void setMaxFrame(int i11) {
        this.lottieDrawable.m5560F0(i11);
    }

    public void setMinAndMaxFrame(String str) {
        this.lottieDrawable.m5568J0(str);
    }

    public void setMinFrame(int i11) {
        this.lottieDrawable.m5570K0(i11);
    }

    public void setProgress(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        setProgressInternal(f11, true);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C5098n0 m5524a(LottieAnimationView lottieAnimationView, String str) {
        return lottieAnimationView.cacheComposition ? C5107r.m5886n(lottieAnimationView.getContext(), str) : C5107r.m5887o(lottieAnimationView.getContext(), str, null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C5098n0 m5526c(LottieAnimationView lottieAnimationView, int i11) {
        return lottieAnimationView.cacheComposition ? C5107r.m5895w(lottieAnimationView.getContext(), i11) : C5107r.m5896x(lottieAnimationView.getContext(), i11, null);
    }

    private void cancelLoaderTask() {
        C5102p0<C5080h> c5102p0 = this.compositionTask;
        if (c5102p0 != null) {
            c5102p0.m5823k(this.loadedListener);
            this.compositionTask.m5822j(this.wrappedFailureListener);
        }
    }

    private void clearComposition() {
        this.lottieDrawable.m5629w();
    }

    private void setProgressInternal(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11, boolean z11) {
        if (z11) {
            this.userActionsTaken.add(UserActionTaken.SET_PROGRESS);
        }
        this.lottieDrawable.m5580P0(f11);
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.m5617q(animatorListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.m5619r(animatorUpdateListener);
    }

    public <T> void addValueCallback(C38074d c38074d, T t11, InterfaceC43352e<T> interfaceC43352e) {
        this.lottieDrawable.m5621s(c38074d, t11, new C5061a(interfaceC43352e));
    }

    public void enableMergePathsForKitKatAndAbove(boolean z11) {
        this.lottieDrawable.m5551B(z11);
    }

    public AsyncUpdates getAsyncUpdates() {
        return this.lottieDrawable.m5561G();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.lottieDrawable.m5563H();
    }

    public boolean getClipTextToBoundingBox() {
        return this.lottieDrawable.m5567J();
    }

    public boolean getClipToCompositionBounds() {
        return this.lottieDrawable.m5569K();
    }

    public int getFrame() {
        return this.lottieDrawable.m5577O();
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.lottieDrawable.m5581Q();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.lottieDrawable.m5585S();
    }

    public float getMaxFrame() {
        return this.lottieDrawable.m5589U();
    }

    public float getMinFrame() {
        return this.lottieDrawable.m5591V();
    }

    @Nullable
    public C5108r0 getPerformanceTracker() {
        return this.lottieDrawable.m5593W();
    }

    @FloatRange(from = 0.0d, m1552to = 1.0d)
    public float getProgress() {
        return this.lottieDrawable.m5595X();
    }

    public RenderMode getRenderMode() {
        return this.lottieDrawable.m5597Y();
    }

    public int getRepeatCount() {
        return this.lottieDrawable.m5599Z();
    }

    public int getRepeatMode() {
        return this.lottieDrawable.m5601a0();
    }

    public float getSpeed() {
        return this.lottieDrawable.m5602b0();
    }

    public boolean isAnimating() {
        return this.lottieDrawable.m5606f0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i11;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.animationName = savedState.animationName;
        Set<UserActionTaken> set = this.userActionsTaken;
        UserActionTaken userActionTaken = UserActionTaken.SET_ANIMATION;
        if (!set.contains(userActionTaken) && !TextUtils.isEmpty(this.animationName)) {
            setAnimation(this.animationName);
        }
        this.animationResId = savedState.animationResId;
        if (!this.userActionsTaken.contains(userActionTaken) && (i11 = this.animationResId) != 0) {
            setAnimation(i11);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_PROGRESS)) {
            setProgressInternal(savedState.progress, false);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.PLAY_OPTION) && savedState.isAnimating) {
            playAnimation();
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.imageAssetsFolder);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.repeatMode);
        }
        if (this.userActionsTaken.contains(UserActionTaken.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.repeatCount);
    }

    @MainThread
    public void playAnimation() {
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.m5610j0();
    }

    public void removeAllAnimatorListeners() {
        this.lottieDrawable.m5611k0();
    }

    public void removeAllUpdateListeners() {
        this.lottieDrawable.m5612l0();
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.m5613m0(animatorListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(@NonNull InterfaceC5089l0 interfaceC5089l0) {
        return this.lottieOnCompositionLoadedListeners.remove(interfaceC5089l0);
    }

    @MainThread
    public void resumeAnimation() {
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.m5616p0();
    }

    public void reverseAnimationSpeed() {
        this.lottieDrawable.m5618q0();
    }

    public void setAnimationFromJson(String str, @Nullable String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z11) {
        this.lottieDrawable.m5622s0(z11);
    }

    public void setAsyncUpdates(AsyncUpdates asyncUpdates) {
        this.lottieDrawable.m5624t0(asyncUpdates);
    }

    public void setCacheComposition(boolean z11) {
        this.cacheComposition = z11;
    }

    public void setClipTextToBoundingBox(boolean z11) {
        this.lottieDrawable.m5626u0(z11);
    }

    public void setClipToCompositionBounds(boolean z11) {
        this.lottieDrawable.m5628v0(z11);
    }

    public void setComposition(@NonNull C5080h c5080h) {
        if (C5072d.f5935a) {
            Log.v(TAG, "Set Composition \n" + c5080h);
        }
        this.lottieDrawable.setCallback(this);
        this.ignoreUnschedule = true;
        boolean zM5630w0 = this.lottieDrawable.m5630w0(c5080h);
        if (this.autoPlay) {
            this.lottieDrawable.m5610j0();
        }
        this.ignoreUnschedule = false;
        if (getDrawable() != this.lottieDrawable || zM5630w0) {
            if (!zM5630w0) {
                setLottieDrawable();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<InterfaceC5089l0> it = this.lottieOnCompositionLoadedListeners.iterator();
            while (it.hasNext()) {
                it.next().mo5522a(c5080h);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.lottieDrawable.m5632x0(str);
    }

    public void setFailureListener(@Nullable InterfaceC5085j0<Throwable> interfaceC5085j0) {
        this.failureListener = interfaceC5085j0;
    }

    public void setFallbackResource(@DrawableRes int i11) {
        this.fallbackResource = i11;
    }

    public void setFontAssetDelegate(C5066a c5066a) {
        this.lottieDrawable.m5634y0(c5066a);
    }

    public void setFontMap(@Nullable Map<String, Typeface> map) {
        this.lottieDrawable.m5636z0(map);
    }

    public void setFrame(int i11) {
        this.lottieDrawable.m5550A0(i11);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z11) {
        this.lottieDrawable.m5552B0(z11);
    }

    public void setImageAssetDelegate(InterfaceC5068b interfaceC5068b) {
        this.lottieDrawable.m5554C0(interfaceC5068b);
    }

    public void setImageAssetsFolder(String str) {
        this.lottieDrawable.m5556D0(str);
    }

    public void setMaintainOriginalImageBounds(boolean z11) {
        this.lottieDrawable.m5558E0(z11);
    }

    public void setMaxFrame(String str) {
        this.lottieDrawable.m5562G0(str);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        this.lottieDrawable.m5564H0(f11);
    }

    public void setMinAndMaxFrame(int i11, int i12) {
        this.lottieDrawable.m5566I0(i11, i12);
    }

    public void setMinFrame(String str) {
        this.lottieDrawable.m5572L0(str);
    }

    public void setMinProgress(float f11) {
        this.lottieDrawable.m5574M0(f11);
    }

    public void setOutlineMasksAndMattes(boolean z11) {
        this.lottieDrawable.m5576N0(z11);
    }

    public void setPerformanceTrackingEnabled(boolean z11) {
        this.lottieDrawable.m5578O0(z11);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.lottieDrawable.m5582Q0(renderMode);
    }

    public void setRepeatCount(int i11) {
        this.userActionsTaken.add(UserActionTaken.SET_REPEAT_COUNT);
        this.lottieDrawable.m5584R0(i11);
    }

    public void setRepeatMode(int i11) {
        this.userActionsTaken.add(UserActionTaken.SET_REPEAT_MODE);
        this.lottieDrawable.m5586S0(i11);
    }

    public void setSafeMode(boolean z11) {
        this.lottieDrawable.m5588T0(z11);
    }

    public void setSpeed(float f11) {
        this.lottieDrawable.m5590U0(f11);
    }

    public void setTextDelegate(C5112t0 c5112t0) {
        this.lottieDrawable.m5594W0(c5112t0);
    }

    public void setUseCompositionFrameRate(boolean z11) {
        this.lottieDrawable.m5596X0(z11);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable;
        if (!this.ignoreUnschedule && drawable == (lottieDrawable = this.lottieDrawable) && lottieDrawable.m5606f0()) {
            pauseAnimation();
        } else if (!this.ignoreUnschedule && (drawable instanceof LottieDrawable)) {
            LottieDrawable lottieDrawable2 = (LottieDrawable) drawable;
            if (lottieDrawable2.m5606f0()) {
                lottieDrawable2.m5609i0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5525b(Throwable th2) {
        if (C42930l.m94208k(th2)) {
            C42924f.m94159d("Unable to load composition.", th2);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th2);
    }

    private C5102p0<C5080h> fromAssets(final String str) {
        if (isInEditMode()) {
            return new C5102p0<>(new Callable() { // from class: com.airbnb.lottie.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.m5524a(this.f5946b, str);
                }
            }, true);
        }
        if (this.cacheComposition) {
            return C5107r.m5884l(getContext(), str);
        }
        return C5107r.m5885m(getContext(), str, null);
    }

    private C5102p0<C5080h> fromRawRes(@RawRes final int i11) {
        if (isInEditMode()) {
            return new C5102p0<>(new Callable() { // from class: com.airbnb.lottie.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.m5526c(this.f5951b, i11);
                }
            }, true);
        }
        if (this.cacheComposition) {
            return C5107r.m5893u(getContext(), i11);
        }
        return C5107r.m5894v(getContext(), i11, null);
    }

    private void init(@Nullable AttributeSet attributeSet, @AttrRes int i11) {
        String string;
        boolean z11 = false;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.LottieAnimationView, i11, 0);
        this.cacheComposition = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_cacheComposition, true);
        int i12 = R$styleable.LottieAnimationView_lottie_rawRes;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i12);
        int i13 = R$styleable.LottieAnimationView_lottie_fileName;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i13);
        int i14 = R$styleable.LottieAnimationView_lottie_url;
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(i14);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(i12, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(i13);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(i14)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(R$styleable.LottieAnimationView_lottie_fallbackRes, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_autoPlay, false)) {
            this.autoPlay = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_loop, false)) {
            this.lottieDrawable.m5584R0(-1);
        }
        int i15 = R$styleable.LottieAnimationView_lottie_repeatMode;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(i15, 1));
        }
        int i16 = R$styleable.LottieAnimationView_lottie_repeatCount;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(i16, -1));
        }
        int i17 = R$styleable.LottieAnimationView_lottie_speed;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(i17, 1.0f));
        }
        int i18 = R$styleable.LottieAnimationView_lottie_clipToCompositionBounds;
        if (typedArrayObtainStyledAttributes.hasValue(i18)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(i18, true));
        }
        int i19 = R$styleable.LottieAnimationView_lottie_clipTextToBoundingBox;
        if (typedArrayObtainStyledAttributes.hasValue(i19)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(i19, false));
        }
        int i21 = R$styleable.LottieAnimationView_lottie_defaultFontFileExtension;
        if (typedArrayObtainStyledAttributes.hasValue(i21)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(i21));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(R$styleable.LottieAnimationView_lottie_imageAssetsFolder));
        int i22 = R$styleable.LottieAnimationView_lottie_progress;
        setProgressInternal(typedArrayObtainStyledAttributes.getFloat(i22, 0.0f), typedArrayObtainStyledAttributes.hasValue(i22));
        enableMergePathsForKitKatAndAbove(typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        int i23 = R$styleable.LottieAnimationView_lottie_colorFilter;
        if (typedArrayObtainStyledAttributes.hasValue(i23)) {
            addValueCallback(new C38074d("**"), InterfaceC5091m0.f6001K, (C43350c<ColorFilter>) new C43350c(new C5110s0(AppCompatResources.getColorStateList(getContext(), typedArrayObtainStyledAttributes.getResourceId(i23, -1)).getDefaultColor())));
        }
        int i24 = R$styleable.LottieAnimationView_lottie_renderMode;
        if (typedArrayObtainStyledAttributes.hasValue(i24)) {
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i24, renderMode.ordinal());
            if (iOrdinal >= RenderMode.values().length) {
                iOrdinal = renderMode.ordinal();
            }
            setRenderMode(RenderMode.values()[iOrdinal]);
        }
        int i25 = R$styleable.LottieAnimationView_lottie_asyncUpdates;
        if (typedArrayObtainStyledAttributes.hasValue(i25)) {
            AsyncUpdates asyncUpdates = AsyncUpdates.AUTOMATIC;
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(i25, asyncUpdates.ordinal());
            if (iOrdinal2 >= RenderMode.values().length) {
                iOrdinal2 = asyncUpdates.ordinal();
            }
            setAsyncUpdates(AsyncUpdates.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        int i26 = R$styleable.LottieAnimationView_lottie_useCompositionFrameRate;
        if (typedArrayObtainStyledAttributes.hasValue(i26)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(i26, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (C42930l.m94203f(getContext()) != 0.0f) {
            z11 = true;
        }
        lottieDrawable.m5592V0(Boolean.valueOf(z11));
    }

    private void setCompositionTask(C5102p0<C5080h> c5102p0) {
        C5098n0<C5080h> c5098n0M5817e = c5102p0.m5817e();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (c5098n0M5817e != null && lottieDrawable == getDrawable() && lottieDrawable.m5571L() == c5098n0M5817e.m5811b()) {
            return;
        }
        this.userActionsTaken.add(UserActionTaken.SET_ANIMATION);
        clearComposition();
        cancelLoaderTask();
        this.compositionTask = c5102p0.m5816d(this.loadedListener).m5815c(this.wrappedFailureListener);
    }

    private void setLottieDrawable() {
        boolean zIsAnimating = isAnimating();
        setImageDrawable(null);
        setImageDrawable(this.lottieDrawable);
        if (zIsAnimating) {
            this.lottieDrawable.m5616p0();
        }
    }

    public boolean addLottieOnCompositionLoadedListener(@NonNull InterfaceC5089l0 interfaceC5089l0) {
        C5080h composition = getComposition();
        if (composition != null) {
            interfaceC5089l0.mo5522a(composition);
        }
        return this.lottieOnCompositionLoadedListeners.add(interfaceC5089l0);
    }

    @Nullable
    public C5080h getComposition() {
        Drawable drawable = getDrawable();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (drawable == lottieDrawable) {
            return lottieDrawable.m5571L();
        }
        return null;
    }

    public long getDuration() {
        C5080h composition = getComposition();
        if (composition != null) {
            return (long) composition.m5653d();
        }
        return 0L;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof LottieDrawable) && ((LottieDrawable) drawable).m5597Y() == RenderMode.SOFTWARE) {
            this.lottieDrawable.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.autoPlay) {
            this.lottieDrawable.m5610j0();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.animationName = this.animationName;
        savedState.animationResId = this.animationResId;
        savedState.progress = this.lottieDrawable.m5595X();
        savedState.isAnimating = this.lottieDrawable.m5607g0();
        savedState.imageAssetsFolder = this.lottieDrawable.m5581Q();
        savedState.repeatMode = this.lottieDrawable.m5601a0();
        savedState.repeatCount = this.lottieDrawable.m5599Z();
        return savedState;
    }

    public void setAnimation(String str) {
        this.animationName = str;
        this.animationResId = 0;
        setCompositionTask(fromAssets(str));
    }

    public void setAnimationFromUrl(String str, @Nullable String str2) {
        setCompositionTask(C5107r.m5898z(getContext(), str, str2));
    }

    public void setAnimation(InputStream inputStream, @Nullable String str) {
        setCompositionTask(C5107r.m5888p(inputStream, str));
    }

    public void setAnimation(ZipInputStream zipInputStream, @Nullable String str) {
        setCompositionTask(C5107r.m5862B(zipInputStream, str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.loadedListener = new C5063c(this);
        this.wrappedFailureListener = new C5062b(this);
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(attributeSet, R$attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.loadedListener = new C5063c(this);
        this.wrappedFailureListener = new C5062b(this);
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(attributeSet, i11);
    }
}
