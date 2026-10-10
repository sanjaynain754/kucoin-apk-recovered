package com.kubi.kumex.trade;

import com.kubi.resources.widget.MarqueeTextView;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.trade.a, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: FuturesFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u0003H\u0016J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/kumex/trade/BannerItem;", "Lcom/kubi/resources/widget/MarqueeTextView$IString;", "content", "", "path", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getPath", TUIConstants.TUIChat.METHOD_GET_DISPLAY_STRING, "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BannerItem implements MarqueeTextView.InterfaceC22932e {

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String content;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final String path;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerItem)) {
            return false;
        }
        BannerItem bannerItem = (BannerItem) other;
        return Intrinsics.areEqual(this.content, bannerItem.content) && Intrinsics.areEqual(this.path, bannerItem.path);
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
        String str2 = this.path;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BannerItem(content=" + this.content + ", path=" + this.path + ')';
    }

    public BannerItem(@Nullable String str, @Nullable String str2) {
        this.content = str;
        this.path = str2;
    }
}
