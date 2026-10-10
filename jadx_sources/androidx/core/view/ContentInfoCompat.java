package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.core.util.Predicate;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public final class ContentInfoCompat {
    public static final int FLAG_CONVERT_TO_PLAIN_TEXT = 1;
    public static final int SOURCE_APP = 0;
    public static final int SOURCE_AUTOFILL = 4;
    public static final int SOURCE_CLIPBOARD = 1;
    public static final int SOURCE_DRAG_AND_DROP = 3;
    public static final int SOURCE_INPUT_METHOD = 2;
    public static final int SOURCE_PROCESS_TEXT = 5;

    @NonNull
    private final Compat mCompat;

    public static final class Builder {

        @NonNull
        private final BuilderCompat mBuilderCompat;

        public Builder(@NonNull ContentInfoCompat contentInfoCompat) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.mBuilderCompat = new BuilderCompat31Impl(contentInfoCompat);
            } else {
                this.mBuilderCompat = new BuilderCompatImpl(contentInfoCompat);
            }
        }

        @NonNull
        public ContentInfoCompat build() {
            return this.mBuilderCompat.build();
        }

        @NonNull
        public Builder setClip(@NonNull ClipData clipData) {
            this.mBuilderCompat.setClip(clipData);
            return this;
        }

        @NonNull
        public Builder setExtras(@Nullable Bundle bundle) {
            this.mBuilderCompat.setExtras(bundle);
            return this;
        }

        @NonNull
        public Builder setFlags(int i11) {
            this.mBuilderCompat.setFlags(i11);
            return this;
        }

        @NonNull
        public Builder setLinkUri(@Nullable Uri uri) {
            this.mBuilderCompat.setLinkUri(uri);
            return this;
        }

        @NonNull
        public Builder setSource(int i11) {
            this.mBuilderCompat.setSource(i11);
            return this;
        }

        public Builder(@NonNull ClipData clipData, int i11) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.mBuilderCompat = new BuilderCompat31Impl(clipData, i11);
            } else {
                this.mBuilderCompat = new BuilderCompatImpl(clipData, i11);
            }
        }
    }

    public interface BuilderCompat {
        @NonNull
        ContentInfoCompat build();

        void setClip(@NonNull ClipData clipData);

        void setExtras(@Nullable Bundle bundle);

        void setFlags(int i11);

        void setLinkUri(@Nullable Uri uri);

        void setSource(int i11);
    }

    @RequiresApi(31)
    public static final class BuilderCompat31Impl implements BuilderCompat {

        @NonNull
        private final ContentInfo.Builder mPlatformBuilder;

        public BuilderCompat31Impl(@NonNull ClipData clipData, int i11) {
            this.mPlatformBuilder = C1875i.m2555a(clipData, i11);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        @NonNull
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new Compat31Impl(this.mPlatformBuilder.build()));
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setClip(@NonNull ClipData clipData) {
            this.mPlatformBuilder.setClip(clipData);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setExtras(@Nullable Bundle bundle) {
            this.mPlatformBuilder.setExtras(bundle);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setFlags(int i11) {
            this.mPlatformBuilder.setFlags(i11);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setLinkUri(@Nullable Uri uri) {
            this.mPlatformBuilder.setLinkUri(uri);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setSource(int i11) {
            this.mPlatformBuilder.setSource(i11);
        }

        public BuilderCompat31Impl(@NonNull ContentInfoCompat contentInfoCompat) {
            C1889k.m2565a();
            this.mPlatformBuilder = C1885j.m2562a(contentInfoCompat.toContentInfo());
        }
    }

    public static final class BuilderCompatImpl implements BuilderCompat {

        @NonNull
        ClipData mClip;

        @Nullable
        Bundle mExtras;
        int mFlags;

        @Nullable
        Uri mLinkUri;
        int mSource;

        public BuilderCompatImpl(@NonNull ClipData clipData, int i11) {
            this.mClip = clipData;
            this.mSource = i11;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        @NonNull
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new CompatImpl(this));
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setClip(@NonNull ClipData clipData) {
            this.mClip = clipData;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setExtras(@Nullable Bundle bundle) {
            this.mExtras = bundle;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setFlags(int i11) {
            this.mFlags = i11;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setLinkUri(@Nullable Uri uri) {
            this.mLinkUri = uri;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setSource(int i11) {
            this.mSource = i11;
        }

        public BuilderCompatImpl(@NonNull ContentInfoCompat contentInfoCompat) {
            this.mClip = contentInfoCompat.getClip();
            this.mSource = contentInfoCompat.getSource();
            this.mFlags = contentInfoCompat.getFlags();
            this.mLinkUri = contentInfoCompat.getLinkUri();
            this.mExtras = contentInfoCompat.getExtras();
        }
    }

    public interface Compat {
        @NonNull
        ClipData getClip();

        @Nullable
        Bundle getExtras();

        int getFlags();

        @Nullable
        Uri getLinkUri();

        int getSource();

        @Nullable
        ContentInfo getWrapped();
    }

    @RequiresApi(31)
    public static final class Compat31Impl implements Compat {

        @NonNull
        private final ContentInfo mWrapped;

        @Override // androidx.core.view.ContentInfoCompat.Compat
        @NonNull
        public ClipData getClip() {
            return this.mWrapped.getClip();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        @Nullable
        public Bundle getExtras() {
            return this.mWrapped.getExtras();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getFlags() {
            return this.mWrapped.getFlags();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        @Nullable
        public Uri getLinkUri() {
            return this.mWrapped.getLinkUri();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getSource() {
            return this.mWrapped.getSource();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        @NonNull
        public ContentInfo getWrapped() {
            return this.mWrapped;
        }

        @NonNull
        public String toString() {
            return "ContentInfoCompat{" + this.mWrapped + "}";
        }

        public Compat31Impl(@NonNull ContentInfo contentInfo) {
            this.mWrapped = C1807a.m2492a(Preconditions.checkNotNull(contentInfo));
        }
    }

    public static final class CompatImpl implements Compat {

        @NonNull
        private final ClipData mClip;

        @Nullable
        private final Bundle mExtras;
        private final int mFlags;

        @Nullable
        private final Uri mLinkUri;
        private final int mSource;

        @Override // androidx.core.view.ContentInfoCompat.Compat
        @Nullable
        public ContentInfo getWrapped() {
            return null;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        @NonNull
        public ClipData getClip() {
            return this.mClip;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        @Nullable
        public Bundle getExtras() {
            return this.mExtras;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getFlags() {
            return this.mFlags;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        @Nullable
        public Uri getLinkUri() {
            return this.mLinkUri;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getSource() {
            return this.mSource;
        }

        @NonNull
        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.mClip.getDescription());
            sb2.append(", source=");
            sb2.append(ContentInfoCompat.sourceToString(this.mSource));
            sb2.append(", flags=");
            sb2.append(ContentInfoCompat.flagsToString(this.mFlags));
            if (this.mLinkUri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.mLinkUri.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.mExtras != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }

        public CompatImpl(BuilderCompatImpl builderCompatImpl) {
            this.mClip = (ClipData) Preconditions.checkNotNull(builderCompatImpl.mClip);
            this.mSource = Preconditions.checkArgumentInRange(builderCompatImpl.mSource, 0, 5, "source");
            this.mFlags = Preconditions.checkFlagsArgument(builderCompatImpl.mFlags, 1);
            this.mLinkUri = builderCompatImpl.mLinkUri;
            this.mExtras = builderCompatImpl.mExtras;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Flags {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Source {
    }

    @NonNull
    public Pair<ContentInfoCompat, ContentInfoCompat> partition(@NonNull Predicate<ClipData.Item> predicate) {
        ClipData clip = this.mCompat.getClip();
        if (clip.getItemCount() == 1) {
            boolean zTest = predicate.test(clip.getItemAt(0));
            return Pair.create(zTest ? this : null, zTest ? null : this);
        }
        Pair<ClipData, ClipData> pairPartition = partition(clip, predicate);
        if (pairPartition.first == null) {
            return Pair.create(null, this);
        }
        return pairPartition.second == null ? Pair.create(this, null) : Pair.create(new Builder(this).setClip((ClipData) pairPartition.first).build(), new Builder(this).setClip((ClipData) pairPartition.second).build());
    }

    @RequiresApi(31)
    public static final class Api31Impl {
        private Api31Impl() {
        }

        @NonNull
        public static Pair<ContentInfo, ContentInfo> partition(@NonNull ContentInfo contentInfo, @NonNull final java.util.function.Predicate<ClipData.Item> predicate) {
            ContentInfo contentInfo2;
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() == 1) {
                boolean zTest = predicate.test(clip.getItemAt(0));
                if (zTest) {
                    contentInfo2 = contentInfo;
                } else {
                    contentInfo2 = null;
                }
                if (zTest) {
                    contentInfo = null;
                }
                return Pair.create(contentInfo2, contentInfo);
            }
            Objects.requireNonNull(predicate);
            Pair<ClipData, ClipData> pairPartition = ContentInfoCompat.partition(clip, (Predicate<ClipData.Item>) new Predicate() { // from class: androidx.core.view.b
                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return predicate.test((ClipData.Item) obj);
                }
            });
            if (pairPartition.first == null) {
                return Pair.create(null, contentInfo);
            }
            if (pairPartition.second == null) {
                return Pair.create(contentInfo, null);
            }
            return Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) pairPartition.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) pairPartition.second).build());
        }
    }

    @NonNull
    public static ClipData buildClipData(@NonNull ClipDescription clipDescription, @NonNull List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i11 = 1; i11 < list.size(); i11++) {
            clipData.addItem(list.get(i11));
        }
        return clipData;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static String flagsToString(int i11) {
        return (i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static String sourceToString(int i11) {
        if (i11 == 0) {
            return "SOURCE_APP";
        }
        if (i11 == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i11 == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i11 == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i11 != 4) {
            return i11 != 5 ? String.valueOf(i11) : "SOURCE_PROCESS_TEXT";
        }
        return "SOURCE_AUTOFILL";
    }

    @NonNull
    @RequiresApi(31)
    public static ContentInfoCompat toContentInfoCompat(@NonNull ContentInfo contentInfo) {
        return new ContentInfoCompat(new Compat31Impl(contentInfo));
    }

    @NonNull
    public ClipData getClip() {
        return this.mCompat.getClip();
    }

    @Nullable
    public Bundle getExtras() {
        return this.mCompat.getExtras();
    }

    public int getFlags() {
        return this.mCompat.getFlags();
    }

    @Nullable
    public Uri getLinkUri() {
        return this.mCompat.getLinkUri();
    }

    public int getSource() {
        return this.mCompat.getSource();
    }

    @NonNull
    @RequiresApi(31)
    public ContentInfo toContentInfo() {
        ContentInfo wrapped = this.mCompat.getWrapped();
        Objects.requireNonNull(wrapped);
        return C1807a.m2492a(wrapped);
    }

    @NonNull
    public String toString() {
        return this.mCompat.toString();
    }

    public ContentInfoCompat(@NonNull Compat compat) {
        this.mCompat = compat;
    }

    @NonNull
    public static Pair<ClipData, ClipData> partition(@NonNull ClipData clipData, @NonNull Predicate<ClipData.Item> predicate) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i11 = 0; i11 < clipData.getItemCount(); i11++) {
            ClipData.Item itemAt = clipData.getItemAt(i11);
            if (predicate.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        if (arrayList == null) {
            return Pair.create(null, clipData);
        }
        if (arrayList2 == null) {
            return Pair.create(clipData, null);
        }
        return Pair.create(buildClipData(clipData.getDescription(), arrayList), buildClipData(clipData.getDescription(), arrayList2));
    }

    @NonNull
    @RequiresApi(31)
    public static Pair<ContentInfo, ContentInfo> partition(@NonNull ContentInfo contentInfo, @NonNull java.util.function.Predicate<ClipData.Item> predicate) {
        return Api31Impl.partition(contentInfo, predicate);
    }
}
