package com.kubi.spot.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReaperEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00108\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u00109\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010:\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J¢\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0014\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020\u000b2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\u0003HÖ\u0001J\t\u0010C\u001a\u00020\bHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010 R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b&\u0010\u0018R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010)\u001a\u0004\b*\u0010(R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u001a\u0010\u0014\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010/\"\u0004\b0\u00101¨\u0006D"}, m90084d2 = {"Lcom/kubi/spot/entity/PostItem;", "", "commentNum", "", "content", "", "Lcom/kubi/spot/entity/PostsContent;", "layoutType", "", "likeNum", "likeState", "", "postResource", "postsId", "", "releaseTime", "socialUserResponse", "Lcom/kubi/spot/entity/SocialUser;", "title", "type", "isTracked", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Lcom/kubi/spot/entity/SocialUser;Ljava/lang/String;Ljava/lang/String;Z)V", "getCommentNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContent", "()Ljava/util/List;", "getLayoutType", "()Ljava/lang/String;", "getLikeNum", "setLikeNum", "(Ljava/lang/Integer;)V", "getLikeState", "()Ljava/lang/Boolean;", "setLikeState", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPostResource", "getPostsId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getReleaseTime", "getSocialUserResponse", "()Lcom/kubi/spot/entity/SocialUser;", "getTitle", "getType", "()Z", "setTracked", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Lcom/kubi/spot/entity/SocialUser;Ljava/lang/String;Ljava/lang/String;Z)Lcom/kubi/spot/entity/PostItem;", "equals", "other", "hashCode", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PostItem {

    @Nullable
    private final Integer commentNum;

    @Nullable
    private final List<PostsContent> content;
    private boolean isTracked;

    @Nullable
    private final String layoutType;

    @Nullable
    private Integer likeNum;

    @Nullable
    private Boolean likeState;

    @Nullable
    private final Integer postResource;

    @Nullable
    private final Long postsId;

    @Nullable
    private final Long releaseTime;

    @Nullable
    private final SocialUser socialUserResponse;

    @Nullable
    private final String title;

    @Nullable
    private final String type;

    public PostItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, false, 4095, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostItem)) {
            return false;
        }
        PostItem postItem = (PostItem) other;
        return Intrinsics.areEqual(this.commentNum, postItem.commentNum) && Intrinsics.areEqual(this.content, postItem.content) && Intrinsics.areEqual(this.layoutType, postItem.layoutType) && Intrinsics.areEqual(this.likeNum, postItem.likeNum) && Intrinsics.areEqual(this.likeState, postItem.likeState) && Intrinsics.areEqual(this.postResource, postItem.postResource) && Intrinsics.areEqual(this.postsId, postItem.postsId) && Intrinsics.areEqual(this.releaseTime, postItem.releaseTime) && Intrinsics.areEqual(this.socialUserResponse, postItem.socialUserResponse) && Intrinsics.areEqual(this.title, postItem.title) && Intrinsics.areEqual(this.type, postItem.type) && this.isTracked == postItem.isTracked;
    }

    public PostItem(@Nullable Integer num, @Nullable List<PostsContent> list, @Nullable String str, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Integer num3, @Nullable Long l11, @Nullable Long l12, @Nullable SocialUser socialUser, @Nullable String str2, @Nullable String str3, boolean z11) {
        this.commentNum = num;
        this.content = list;
        this.layoutType = str;
        this.likeNum = num2;
        this.likeState = bool;
        this.postResource = num3;
        this.postsId = l11;
        this.releaseTime = l12;
        this.socialUserResponse = socialUser;
        this.title = str2;
        this.type = str3;
        this.isTracked = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PostItem copy$default(PostItem postItem, Integer num, List list, String str, Integer num2, Boolean bool, Integer num3, Long l11, Long l12, SocialUser socialUser, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = postItem.commentNum;
        }
        if ((i11 & 2) != 0) {
            list = postItem.content;
        }
        if ((i11 & 4) != 0) {
            str = postItem.layoutType;
        }
        if ((i11 & 8) != 0) {
            num2 = postItem.likeNum;
        }
        if ((i11 & 16) != 0) {
            bool = postItem.likeState;
        }
        if ((i11 & 32) != 0) {
            num3 = postItem.postResource;
        }
        if ((i11 & 64) != 0) {
            l11 = postItem.postsId;
        }
        if ((i11 & 128) != 0) {
            l12 = postItem.releaseTime;
        }
        if ((i11 & 256) != 0) {
            socialUser = postItem.socialUserResponse;
        }
        if ((i11 & 512) != 0) {
            str2 = postItem.title;
        }
        if ((i11 & 1024) != 0) {
            str3 = postItem.type;
        }
        if ((i11 & 2048) != 0) {
            z11 = postItem.isTracked;
        }
        String str4 = str3;
        boolean z12 = z11;
        SocialUser socialUser2 = socialUser;
        String str5 = str2;
        Long l13 = l11;
        Long l14 = l12;
        Boolean bool2 = bool;
        Integer num4 = num3;
        return postItem.copy(num, list, str, num2, bool2, num4, l13, l14, socialUser2, str5, str4, z12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCommentNum() {
        return this.commentNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsTracked() {
        return this.isTracked;
    }

    @Nullable
    public final List<PostsContent> component2() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLayoutType() {
        return this.layoutType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getLikeNum() {
        return this.likeNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getLikeState() {
        return this.likeState;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getPostResource() {
        return this.postResource;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getPostsId() {
        return this.postsId;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getReleaseTime() {
        return this.releaseTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final SocialUser getSocialUserResponse() {
        return this.socialUserResponse;
    }

    @NotNull
    public final PostItem copy(@Nullable Integer commentNum, @Nullable List<PostsContent> content, @Nullable String layoutType, @Nullable Integer likeNum, @Nullable Boolean likeState, @Nullable Integer postResource, @Nullable Long postsId, @Nullable Long releaseTime, @Nullable SocialUser socialUserResponse, @Nullable String title, @Nullable String type, boolean isTracked) {
        return new PostItem(commentNum, content, layoutType, likeNum, likeState, postResource, postsId, releaseTime, socialUserResponse, title, type, isTracked);
    }

    @Nullable
    public final Integer getCommentNum() {
        return this.commentNum;
    }

    @Nullable
    public final List<PostsContent> getContent() {
        return this.content;
    }

    @Nullable
    public final String getLayoutType() {
        return this.layoutType;
    }

    @Nullable
    public final Integer getLikeNum() {
        return this.likeNum;
    }

    @Nullable
    public final Boolean getLikeState() {
        return this.likeState;
    }

    @Nullable
    public final Integer getPostResource() {
        return this.postResource;
    }

    @Nullable
    public final Long getPostsId() {
        return this.postsId;
    }

    @Nullable
    public final Long getReleaseTime() {
        return this.releaseTime;
    }

    @Nullable
    public final SocialUser getSocialUserResponse() {
        return this.socialUserResponse;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        Integer num = this.commentNum;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<PostsContent> list = this.content;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.layoutType;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.likeNum;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.likeState;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.postResource;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l11 = this.postsId;
        int iHashCode7 = (iHashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.releaseTime;
        int iHashCode8 = (iHashCode7 + (l12 == null ? 0 : l12.hashCode())) * 31;
        SocialUser socialUser = this.socialUserResponse;
        int iHashCode9 = (iHashCode8 + (socialUser == null ? 0 : socialUser.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        return ((iHashCode10 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isTracked);
    }

    public final boolean isTracked() {
        return this.isTracked;
    }

    public final void setLikeNum(@Nullable Integer num) {
        this.likeNum = num;
    }

    public final void setLikeState(@Nullable Boolean bool) {
        this.likeState = bool;
    }

    public final void setTracked(boolean z11) {
        this.isTracked = z11;
    }

    @NotNull
    public String toString() {
        return "PostItem(commentNum=" + this.commentNum + ", content=" + this.content + ", layoutType=" + this.layoutType + ", likeNum=" + this.likeNum + ", likeState=" + this.likeState + ", postResource=" + this.postResource + ", postsId=" + this.postsId + ", releaseTime=" + this.releaseTime + ", socialUserResponse=" + this.socialUserResponse + ", title=" + this.title + ", type=" + this.type + ", isTracked=" + this.isTracked + ')';
    }

    public /* synthetic */ PostItem(Integer num, List list, String str, Integer num2, Boolean bool, Integer num3, Long l11, Long l12, SocialUser socialUser, String str2, String str3, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : num2, (i11 & 16) != 0 ? null : bool, (i11 & 32) != 0 ? null : num3, (i11 & 64) != 0 ? null : l11, (i11 & 128) != 0 ? null : l12, (i11 & 256) != 0 ? null : socialUser, (i11 & 512) != 0 ? null : str2, (i11 & 1024) != 0 ? null : str3, (i11 & 2048) != 0 ? false : z11);
    }
}
