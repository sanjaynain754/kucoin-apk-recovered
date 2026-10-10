package androidx.core.text;

import android.text.Html;
import android.text.Spanned;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: Html.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086\b\u001a\u0017\u0010\t\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0086\b¨\u0006\u000b"}, m90084d2 = {"parseAsHtml", "Landroid/text/Spanned;", "", "flags", "", "imageGetter", "Landroid/text/Html$ImageGetter;", "tagHandler", "Landroid/text/Html$TagHandler;", "toHtml", TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT, "core-ktx_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class HtmlKt {
    public static /* synthetic */ Spanned parseAsHtml$default(String str, int i11, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        if ((i12 & 2) != 0) {
            imageGetter = null;
        }
        if ((i12 & 4) != 0) {
            tagHandler = null;
        }
        return HtmlCompat.fromHtml(str, i11, imageGetter, tagHandler);
    }

    public static /* synthetic */ String toHtml$default(Spanned spanned, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return HtmlCompat.toHtml(spanned, i11);
    }

    @NotNull
    public static final Spanned parseAsHtml(@NotNull String str, int i11, @Nullable Html.ImageGetter imageGetter, @Nullable Html.TagHandler tagHandler) {
        return HtmlCompat.fromHtml(str, i11, imageGetter, tagHandler);
    }

    @NotNull
    public static final String toHtml(@NotNull Spanned spanned, int i11) {
        return HtmlCompat.toHtml(spanned, i11);
    }
}
