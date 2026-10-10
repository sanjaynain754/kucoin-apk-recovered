package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes23.dex */
public class ActivityOptionsCompat {
    public static final String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";

    public static class ActivityOptionsCompatImpl extends ActivityOptionsCompat {
        private final ActivityOptions mActivityOptions;

        @Override // androidx.core.app.ActivityOptionsCompat
        public Rect getLaunchBounds() {
            return Api24Impl.getLaunchBounds(this.mActivityOptions);
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void requestUsageTimeReport(@NonNull PendingIntent pendingIntent) {
            Api23Impl.requestUsageTimeReport(this.mActivityOptions, pendingIntent);
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        @NonNull
        public ActivityOptionsCompat setLaunchBounds(@Nullable Rect rect) {
            return new ActivityOptionsCompatImpl(Api24Impl.setLaunchBounds(this.mActivityOptions, rect));
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        @NonNull
        public ActivityOptionsCompat setPendingIntentBackgroundActivityStartMode(int i11) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 34) {
                Api34Impl.setPendingIntentBackgroundActivityStartMode(this.mActivityOptions, i11);
                return this;
            }
            if (i12 >= 33) {
                Api33Impl.setPendingIntentBackgroundActivityLaunchAllowed(this.mActivityOptions, i11 != 2);
            }
            return this;
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        @NonNull
        public ActivityOptionsCompat setShareIdentityEnabled(boolean z11) {
            return Build.VERSION.SDK_INT < 34 ? this : new ActivityOptionsCompatImpl(Api34Impl.setShareIdentityEnabled(this.mActivityOptions, z11));
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public Bundle toBundle() {
            return this.mActivityOptions.toBundle();
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void update(@NonNull ActivityOptionsCompat activityOptionsCompat) {
            if (activityOptionsCompat instanceof ActivityOptionsCompatImpl) {
                this.mActivityOptions.update(((ActivityOptionsCompatImpl) activityOptionsCompat).mActivityOptions);
            }
        }

        public ActivityOptionsCompatImpl(ActivityOptions activityOptions) {
            this.mActivityOptions = activityOptions;
        }
    }

    @RequiresApi(21)
    public static class Api21Impl {
        public static ActivityOptions makeSceneTransitionAnimation(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        public static ActivityOptions makeSceneTransitionAnimation(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        private Api21Impl() {
        }

        public static ActivityOptions makeTaskLaunchBehind() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface BackgroundActivityStartMode {
    }

    @NonNull
    public static ActivityOptionsCompat makeSceneTransitionAnimation(@NonNull Activity activity, @NonNull View view, @NonNull String str) {
        return new ActivityOptionsCompatImpl(Api21Impl.makeSceneTransitionAnimation(activity, view, str));
    }

    @Nullable
    public Rect getLaunchBounds() {
        return null;
    }

    @Nullable
    public Bundle toBundle() {
        return null;
    }

    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static ActivityOptions makeBasic() {
            return ActivityOptions.makeBasic();
        }

        public static ActivityOptions makeClipRevealAnimation(View view, int i11, int i12, int i13, int i14) {
            return ActivityOptions.makeClipRevealAnimation(view, i11, i12, i13, i14);
        }

        public static void requestUsageTimeReport(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    @RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
        }

        public static Rect getLaunchBounds(ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }

        public static ActivityOptions setLaunchBounds(ActivityOptions activityOptions, Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }
    }

    @RequiresApi(33)
    public static class Api33Impl {
        private Api33Impl() {
        }

        public static void setPendingIntentBackgroundActivityLaunchAllowed(ActivityOptions activityOptions, boolean z11) {
            activityOptions.setPendingIntentBackgroundActivityLaunchAllowed(z11);
        }
    }

    @RequiresApi(34)
    public static class Api34Impl {
        private Api34Impl() {
        }

        public static ActivityOptions setPendingIntentBackgroundActivityStartMode(ActivityOptions activityOptions, int i11) {
            return activityOptions.setPendingIntentBackgroundActivityStartMode(i11);
        }

        public static ActivityOptions setShareIdentityEnabled(ActivityOptions activityOptions, boolean z11) {
            return activityOptions.setShareIdentityEnabled(z11);
        }
    }

    @NonNull
    public static ActivityOptionsCompat makeBasic() {
        return new ActivityOptionsCompatImpl(Api23Impl.makeBasic());
    }

    @NonNull
    public static ActivityOptionsCompat makeClipRevealAnimation(@NonNull View view, int i11, int i12, int i13, int i14) {
        return new ActivityOptionsCompatImpl(Api23Impl.makeClipRevealAnimation(view, i11, i12, i13, i14));
    }

    @NonNull
    public static ActivityOptionsCompat makeCustomAnimation(@NonNull Context context, int i11, int i12) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeCustomAnimation(context, i11, i12));
    }

    @NonNull
    public static ActivityOptionsCompat makeScaleUpAnimation(@NonNull View view, int i11, int i12, int i13, int i14) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeScaleUpAnimation(view, i11, i12, i13, i14));
    }

    @NonNull
    public static ActivityOptionsCompat makeTaskLaunchBehind() {
        return new ActivityOptionsCompatImpl(Api21Impl.makeTaskLaunchBehind());
    }

    @NonNull
    public static ActivityOptionsCompat makeThumbnailScaleUpAnimation(@NonNull View view, @NonNull Bitmap bitmap, int i11, int i12) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i11, i12));
    }

    @NonNull
    public static ActivityOptionsCompat makeSceneTransitionAnimation(@NonNull Activity activity, @Nullable androidx.core.util.Pair<View, String>... pairArr) {
        Pair[] pairArr2;
        if (pairArr != null) {
            pairArr2 = new Pair[pairArr.length];
            for (int i11 = 0; i11 < pairArr.length; i11++) {
                androidx.core.util.Pair<View, String> pair = pairArr[i11];
                pairArr2[i11] = Pair.create(pair.first, pair.second);
            }
        } else {
            pairArr2 = null;
        }
        return new ActivityOptionsCompatImpl(Api21Impl.makeSceneTransitionAnimation(activity, pairArr2));
    }

    public void requestUsageTimeReport(@NonNull PendingIntent pendingIntent) {
    }

    @NonNull
    public ActivityOptionsCompat setLaunchBounds(@Nullable Rect rect) {
        return this;
    }

    @NonNull
    public ActivityOptionsCompat setPendingIntentBackgroundActivityStartMode(int i11) {
        return this;
    }

    @NonNull
    public ActivityOptionsCompat setShareIdentityEnabled(boolean z11) {
        return this;
    }

    public void update(@NonNull ActivityOptionsCompat activityOptionsCompat) {
    }
}
