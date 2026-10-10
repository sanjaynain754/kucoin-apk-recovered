package bb0;

import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.TextWatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: bb0.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C4544a implements TextWatcher {

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final a f3990h = new a(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC4545b f3991b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public TextWatcher f3992c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public String f3993d;

    /* JADX INFO: renamed from: e */
    public boolean f3994e;

    /* JADX INFO: renamed from: f */
    public boolean f3995f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Function1<? super String, Unit> f3996g;

    /* JADX INFO: renamed from: bb0.a$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4427c(CharSequence charSequence, int i11, int i12) {
        CharSequence charSequenceSlice;
        if (charSequence != null && (charSequenceSlice = StringsKt.slice(charSequence, RangesKt.until(i11, i12 + i11))) != null) {
            for (int i13 = 0; i13 < charSequenceSlice.length(); i13++) {
                if (!m4426b(charSequenceSlice.charAt(i13))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m4425a(@Nullable Function1<? super String, Unit> function1) {
        this.f3996g = function1;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable editable) {
        if (this.f3994e || editable == null) {
            return;
        }
        if (!this.f3995f) {
            this.f3994e = true;
            this.f3992c.afterTextChanged(editable.insert(0, this.f3993d));
            editable.replace(0, editable.length(), StringsKt.trimStart(StringsKt.removePrefix(editable, this.f3993d)));
            this.f3994e = false;
        }
        if (editable.length() == 0) {
            this.f3995f = false;
        }
        if (editable.length() > 18) {
            this.f3994e = true;
            editable.delete(19, editable.length());
            this.f3994e = false;
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence charSequence, int i11, int i12, int i13) {
        if (this.f3994e) {
            return;
        }
        if (i12 > 0 && m4427c(charSequence, i11, i12)) {
            this.f3995f = true;
        }
        if (this.f3995f) {
            return;
        }
        this.f3992c.beforeTextChanged(this.f3993d + ((Object) charSequence), this.f3993d.length() + i11, i12, i13);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence charSequence, int i11, int i12, int i13) {
        if (this.f3994e) {
            return;
        }
        Function1<? super String, Unit> function1 = this.f3996g;
        if (function1 != null) {
            function1.invoke(String.valueOf(charSequence));
        }
        if (i13 > 0 && m4427c(charSequence, i11, i13)) {
            this.f3995f = true;
        }
        if (this.f3995f) {
            return;
        }
        this.f3992c.onTextChanged(this.f3993d + ((Object) charSequence), this.f3993d.length() + i11, i12, i13);
    }

    public C4544a(@NotNull InterfaceC4545b phoneNumberFormattingTextWatcherProvider) {
        Intrinsics.checkNotNullParameter(phoneNumberFormattingTextWatcherProvider, "phoneNumberFormattingTextWatcherProvider");
        this.f3991b = phoneNumberFormattingTextWatcherProvider;
        this.f3992c = new PhoneNumberFormattingTextWatcher();
        this.f3993d = "";
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4426b(char c11) {
        if (!Character.isDigit(c11) && c11 != '*' && c11 != '#' && c11 != '+' && c11 != ',' && c11 != ';' && c11 != 'N') {
            return false;
        }
        return true;
    }
}
