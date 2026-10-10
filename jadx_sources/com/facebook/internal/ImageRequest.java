package com.facebook.internal;

import android.net.Uri;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.AccessToken;
import com.facebook.C5501a;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p333i6.C38457p;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: ImageRequest.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/facebook/internal/ImageRequest;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ImageRequest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: ImageRequest.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0007J,\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/facebook/internal/ImageRequest$Companion;", "", "()V", "ACCESS_TOKEN_PARAM", "", "HEIGHT_PARAM", "MIGRATION_PARAM", "MIGRATION_VALUE", "PATH", "UNSPECIFIED_DIMENSION", "", "WIDTH_PARAM", "getProfilePictureUri", "Landroid/net/Uri;", "userId", "width", "height", "accessToken", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Uri getProfilePictureUri(@Nullable String userId, int width, int height) {
            return getProfilePictureUri(userId, width, height, "");
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final Uri getProfilePictureUri(@Nullable String userId, int width, int height, @Nullable String accessToken) {
            C38457p.m86729h(userId, "userId");
            int iMax = Math.max(width, 0);
            int iMax2 = Math.max(height, 0);
            if (iMax == 0 && iMax2 == 0) {
                throw new IllegalArgumentException("Either width or height must be greater than 0");
            }
            Uri.Builder builderBuildUpon = Uri.parse(C5759b.m10039c()).buildUpon();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.US, "%s/%s/picture", Arrays.copyOf(new Object[]{C5501a.m7808v(), userId}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
            Uri.Builder builderPath = builderBuildUpon.path(str);
            if (iMax2 != 0) {
                builderPath.appendQueryParameter("height", String.valueOf(iMax2));
            }
            if (iMax != 0) {
                builderPath.appendQueryParameter("width", String.valueOf(iMax));
            }
            builderPath.appendQueryParameter("migration_overrides", "{october_2012:true}");
            if (!C5760c.m10057Z(accessToken)) {
                builderPath.appendQueryParameter(AccessToken.ACCESS_TOKEN_KEY, accessToken);
            } else if (C5760c.m10057Z(C5501a.m7804r()) || C5760c.m10057Z(C5501a.m7800n())) {
                Log.d("ImageRequest", "Needs access token to fetch profile picture. Without an access token a default silhoutte picture is returned");
            } else {
                builderPath.appendQueryParameter(AccessToken.ACCESS_TOKEN_KEY, C5501a.m7800n() + '|' + C5501a.m7804r());
            }
            Uri uriBuild = builderPath.build();
            Intrinsics.checkNotNullExpressionValue(uriBuild, "builder.build()");
            return uriBuild;
        }
    }
}
