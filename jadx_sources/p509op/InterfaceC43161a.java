package p509op;

import com.kubi.resources.widget.MarqueeTextView;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: op.a */
/* JADX INFO: compiled from: DisplayBanner.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/margin/trade/banner/DisplayBanner;", "", "Common", "Income", "ContentItem", "Lcom/kubi/margin/trade/banner/DisplayBanner$Common;", "Lcom/kubi/margin/trade/banner/DisplayBanner$Income;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC43161a {

    /* JADX INFO: renamed from: op.a$a, reason: from toString */
    /* JADX INFO: compiled from: DisplayBanner.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/margin/trade/banner/DisplayBanner$Common;", "Lcom/kubi/margin/trade/banner/DisplayBanner;", "bannerId", "", "contentItem", "Lcom/kubi/margin/trade/banner/DisplayBanner$ContentItem;", "closeKeepDay", "<init>", "(Ljava/lang/String;Lcom/kubi/margin/trade/banner/DisplayBanner$ContentItem;Ljava/lang/String;)V", "getBannerId", "()Ljava/lang/String;", "getContentItem", "()Lcom/kubi/margin/trade/banner/DisplayBanner$ContentItem;", "getCloseKeepDay", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Common implements InterfaceC43161a {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final String bannerId;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final ContentItem contentItem;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final String closeKeepDay;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Common)) {
                return false;
            }
            Common common = (Common) other;
            return Intrinsics.areEqual(this.bannerId, common.bannerId) && Intrinsics.areEqual(this.contentItem, common.contentItem) && Intrinsics.areEqual(this.closeKeepDay, common.closeKeepDay);
        }

        public Common(@Nullable String str, @NotNull ContentItem contentItem, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(contentItem, "contentItem");
            this.bannerId = str;
            this.contentItem = contentItem;
            this.closeKeepDay = str2;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBannerId() {
            return this.bannerId;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ContentItem getContentItem() {
            return this.contentItem;
        }

        public int hashCode() {
            String str = this.bannerId;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.contentItem.hashCode()) * 31;
            String str2 = this.closeKeepDay;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Common(bannerId=" + this.bannerId + ", contentItem=" + this.contentItem + ", closeKeepDay=" + this.closeKeepDay + ')';
        }
    }

    /* JADX INFO: renamed from: op.a$b, reason: from toString */
    /* JADX INFO: compiled from: DisplayBanner.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u0003H\u0016J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/margin/trade/banner/DisplayBanner$ContentItem;", "Lcom/kubi/resources/widget/MarqueeTextView$IString;", "content", "", "webUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getWebUrl", TUIConstants.TUIChat.METHOD_GET_DISPLAY_STRING, "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ContentItem implements MarqueeTextView.InterfaceC22932e {

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final String content;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final String webUrl;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContentItem)) {
                return false;
            }
            ContentItem contentItem = (ContentItem) other;
            return Intrinsics.areEqual(this.content, contentItem.content) && Intrinsics.areEqual(this.webUrl, contentItem.webUrl);
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getWebUrl() {
            return this.webUrl;
        }

        @Override // com.kubi.resources.widget.MarqueeTextView.InterfaceC22932e
        @NotNull
        public String getDisplayString() {
            String str = this.content;
            return str == null ? "" : str;
        }

        public int hashCode() {
            String str = this.content;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.webUrl;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ContentItem(content=" + this.content + ", webUrl=" + this.webUrl + ')';
        }

        public ContentItem(@Nullable String str, @Nullable String str2) {
            this.content = str;
            this.webUrl = str2;
        }
    }

    /* JADX INFO: renamed from: op.a$c, reason: from toString */
    /* JADX INFO: compiled from: DisplayBanner.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/margin/trade/banner/DisplayBanner$Income;", "Lcom/kubi/margin/trade/banner/DisplayBanner;", "bannerId", "", "contentList", "", "Lcom/kubi/margin/trade/banner/DisplayBanner$ContentItem;", "closeKeepDay", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getBannerId", "()Ljava/lang/String;", "getContentList", "()Ljava/util/List;", "getCloseKeepDay", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Income implements InterfaceC43161a {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final String bannerId;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final List<ContentItem> contentList;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final String closeKeepDay;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Income)) {
                return false;
            }
            Income income = (Income) other;
            return Intrinsics.areEqual(this.bannerId, income.bannerId) && Intrinsics.areEqual(this.contentList, income.contentList) && Intrinsics.areEqual(this.closeKeepDay, income.closeKeepDay);
        }

        public Income(@Nullable String str, @NotNull List<ContentItem> contentList, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(contentList, "contentList");
            this.bannerId = str;
            this.contentList = contentList;
            this.closeKeepDay = str2;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBannerId() {
            return this.bannerId;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final List<ContentItem> m94760b() {
            return this.contentList;
        }

        public int hashCode() {
            String str = this.bannerId;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.contentList.hashCode()) * 31;
            String str2 = this.closeKeepDay;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Income(bannerId=" + this.bannerId + ", contentList=" + this.contentList + ", closeKeepDay=" + this.closeKeepDay + ')';
        }
    }
}
