package io.trtc.tuikit.atomicxcore.api.search;

import androidx.autofill.HintConstants;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39396a;
import io.trtc.tuikit.atomicxcore.api.login.Gender;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/search/UserSearchFilter;", "", HintConstants.AUTOFILL_HINT_GENDER, "Lio/trtc/tuikit/atomicxcore/api/login/Gender;", "minBirthday", "", "maxBirthday", "(Lio/trtc/tuikit/atomicxcore/api/login/Gender;ILjava/lang/Integer;)V", "getGender", "()Lio/trtc/tuikit/atomicxcore/api/login/Gender;", "setGender", "(Lio/trtc/tuikit/atomicxcore/api/login/Gender;)V", "getMaxBirthday", "()Ljava/lang/Integer;", "setMaxBirthday", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMinBirthday", "()I", "setMinBirthday", "(I)V", "component1", "component2", "component3", "copy", "(Lio/trtc/tuikit/atomicxcore/api/login/Gender;ILjava/lang/Integer;)Lio/trtc/tuikit/atomicxcore/api/search/UserSearchFilter;", "equals", "", "other", "hashCode", "toString", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class UserSearchFilter {

    @NotNull
    private Gender gender;

    @Nullable
    private Integer maxBirthday;
    private int minBirthday;

    public UserSearchFilter() {
        this(null, 0, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSearchFilter)) {
            return false;
        }
        UserSearchFilter userSearchFilter = (UserSearchFilter) other;
        return this.gender == userSearchFilter.gender && this.minBirthday == userSearchFilter.minBirthday && Intrinsics.areEqual(this.maxBirthday, userSearchFilter.maxBirthday);
    }

    public UserSearchFilter(@NotNull Gender gender, int i11, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        this.gender = gender;
        this.minBirthday = i11;
        this.maxBirthday = num;
    }

    public static /* synthetic */ UserSearchFilter copy$default(UserSearchFilter userSearchFilter, Gender gender, int i11, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            gender = userSearchFilter.gender;
        }
        if ((i12 & 2) != 0) {
            i11 = userSearchFilter.minBirthday;
        }
        if ((i12 & 4) != 0) {
            num = userSearchFilter.maxBirthday;
        }
        return userSearchFilter.copy(gender, i11, num);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Gender getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinBirthday() {
        return this.minBirthday;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMaxBirthday() {
        return this.maxBirthday;
    }

    @NotNull
    public final UserSearchFilter copy(@NotNull Gender gender, int minBirthday, @Nullable Integer maxBirthday) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        return new UserSearchFilter(gender, minBirthday, maxBirthday);
    }

    @NotNull
    public final Gender getGender() {
        return this.gender;
    }

    @Nullable
    public final Integer getMaxBirthday() {
        return this.maxBirthday;
    }

    public final int getMinBirthday() {
        return this.minBirthday;
    }

    public int hashCode() {
        int iM88225a = AbstractC39396a.m88225a(this.minBirthday, this.gender.hashCode() * 31, 31);
        Integer num = this.maxBirthday;
        return iM88225a + (num == null ? 0 : num.hashCode());
    }

    public final void setGender(@NotNull Gender gender) {
        Intrinsics.checkNotNullParameter(gender, "<set-?>");
        this.gender = gender;
    }

    public final void setMaxBirthday(@Nullable Integer num) {
        this.maxBirthday = num;
    }

    public final void setMinBirthday(int i11) {
        this.minBirthday = i11;
    }

    @NotNull
    public String toString() {
        return "UserSearchFilter(gender=" + this.gender + ", minBirthday=" + this.minBirthday + ", maxBirthday=" + this.maxBirthday + ')';
    }

    public /* synthetic */ UserSearchFilter(Gender gender, int i11, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? Gender.UNKNOWN : gender, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? null : num);
    }
}
