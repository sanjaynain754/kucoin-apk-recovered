package p811yw;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.sdk.res.R$string;
import com.kubi.utils.ToastCompat;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yw.a */
/* JADX INFO: compiled from: KCCustomTextInputEditText.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J(\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/resources/widget/input/FilterEmojiTextWatcher;", "Landroid/text/TextWatcher;", "filterEmoji", "", "filterEmojiToast", "<init>", "(ZZ)V", "beforeTextChanged", "", "charSequence", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "afterTextChanged", "editable", "Landroid/text/Editable;", "isEmoji", "input", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46603a implements TextWatcher {

    /* JADX INFO: renamed from: b */
    public boolean f104353b;

    /* JADX INFO: renamed from: c */
    public boolean f104354c;

    /* JADX INFO: renamed from: a */
    public final boolean m102761a(String str) {
        return Pattern.compile("[🀀-🏿]|[🐀-\u1f7ff]|[🠀-\u1fbff]|[☀-⟿]").matcher(str).find();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@NotNull CharSequence charSequence, int start, int before, int count) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        if (this.f104353b && count - before >= 1) {
            int i11 = before + start;
            int i12 = start + count;
            if (m102761a(charSequence.subSequence(i11, i12).toString())) {
                if (this.f104354c) {
                    ToastCompat.m66465z(R$string.not_support_emoji);
                }
                ((SpannableStringBuilder) charSequence).delete(i11, i12);
            }
        }
    }

    public C46603a(boolean z11, boolean z12) {
        this.f104353b = z11;
        this.f104354c = z12;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence charSequence, int start, int count, int after) {
    }
}
