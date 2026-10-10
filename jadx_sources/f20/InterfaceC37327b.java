package f20;

import com.kubi.resources.widget.MarqueeTextView;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: f20.b */
/* JADX INFO: compiled from: SpotDisplayBanner.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/spot/business/banner/SpotDisplayBanner;", "", "Common", "ContentItem", "Lcom/kubi/spot/business/banner/SpotDisplayBanner$Common;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC37327b {

    /* JADX INFO: renamed from: f20.b$a, reason: from toString */
    /* JADX INFO: compiled from: SpotDisplayBanner.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/spot/business/banner/SpotDisplayBanner$Common;", "Lcom/kubi/spot/business/banner/SpotDisplayBanner;", "bannerId", "", "contentItem", "Lcom/kubi/spot/business/banner/SpotDisplayBanner$ContentItem;", "<init>", "(Ljava/lang/String;Lcom/kubi/spot/business/banner/SpotDisplayBanner$ContentItem;)V", "getBannerId", "()Ljava/lang/String;", "getContentItem", "()Lcom/kubi/spot/business/banner/SpotDisplayBanner$ContentItem;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Common implements InterfaceC37327b {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final String bannerId;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final ContentItem contentItem;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Common)) {
                return false;
            }
            Common common = (Common) other;
            return Intrinsics.areEqual(this.bannerId, common.bannerId) && Intrinsics.areEqual(this.contentItem, common.contentItem);
        }

        public Common(@Nullable String str, @NotNull ContentItem contentItem) {
            Intrinsics.checkNotNullParameter(contentItem, "contentItem");
            this.bannerId = str;
            this.contentItem = contentItem;
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
            return ((str == null ? 0 : str.hashCode()) * 31) + this.contentItem.hashCode();
        }

        @NotNull
        public String toString() {
            return "Common(bannerId=" + this.bannerId + ", contentItem=" + this.contentItem + ')';
        }
    }

    /* JADX INFO: renamed from: f20.b$b, reason: from toString */
    /* JADX INFO: compiled from: SpotDisplayBanner.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u0003H\u0016J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/spot/business/banner/SpotDisplayBanner$ContentItem;", "Lcom/kubi/resources/widget/MarqueeTextView$IString;", "content", "", "appUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getAppUrl", TUIConstants.TUIChat.METHOD_GET_DISPLAY_STRING, "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ContentItem implements MarqueeTextView.InterfaceC22932e {

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final String content;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final String appUrl;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContentItem)) {
                return false;
            }
            ContentItem contentItem = (ContentItem) other;
            return Intrinsics.areEqual(this.content, contentItem.content) && Intrinsics.areEqual(this.appUrl, contentItem.appUrl);
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAppUrl() {
            return this.appUrl;
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
            String str2 = this.appUrl;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ContentItem(content=" + this.content + ", appUrl=" + this.appUrl + ')';
        }

        public ContentItem(@Nullable String str, @Nullable String str2) {
            this.content = str;
            this.appUrl = str2;
        }
    }
}
