package p664ui;

import android.view.View;
import android.widget.EditText;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.kumex.utils.Log;
import com.kubi.kumex.utils.SimpleTextWatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: ui.i */
/* JADX INFO: compiled from: FuturesTradeTrack.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/futures/trade/track/StopProfitLossTrack;", "", "priceEdit", "Landroid/widget/EditText;", "rateEdit", "isProfit", "", "<init>", "(Landroid/widget/EditText;Landroid/widget/EditText;Z)V", "()Z", "tag", "", "priceEditFocused", "rateEditFocused", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45254i {

    /* JADX INFO: renamed from: a */
    public final boolean f101791a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f101792b = "StopProfitLossTrack";

    /* JADX INFO: renamed from: c */
    public boolean f101793c;

    /* JADX INFO: renamed from: d */
    public boolean f101794d;

    /* JADX INFO: renamed from: ui.i$a */
    /* JADX INFO: compiled from: FuturesTradeTrack.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/trade/track/StopProfitLossTrack$2", "Lcom/kubi/kumex/utils/SimpleTextWatcher;", "onTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "", "start", "", TtmlNode.ANNOTATION_POSITION_BEFORE, "count", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends SimpleTextWatcher {
        public a() {
        }

        @Override // com.kubi.kumex.utils.SimpleTextWatcher, android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) throws JSONException {
            if (C45254i.this.f101793c) {
                C45254i.this.f101793c = false;
                C45251f.m100018b(null, "TradeStopLossSet", C45254i.this.getF101791a() ? "2" : "4", null, 9, null);
                Log.f30813a.m36615a(C45254i.this.f101792b, "priceEdit:tradeTrackClicked:" + C45254i.this.f101793c);
            }
        }
    }

    /* JADX INFO: renamed from: ui.i$b */
    /* JADX INFO: compiled from: FuturesTradeTrack.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/trade/track/StopProfitLossTrack$4", "Lcom/kubi/kumex/utils/SimpleTextWatcher;", "onTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "", "start", "", TtmlNode.ANNOTATION_POSITION_BEFORE, "count", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends SimpleTextWatcher {
        public b() {
        }

        @Override // com.kubi.kumex.utils.SimpleTextWatcher, android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) throws JSONException {
            if (C45254i.this.f101794d) {
                C45254i.this.f101794d = false;
                C45251f.m100018b(null, "TradeStopLossSet", C45254i.this.getF101791a() ? "3" : "5", null, 9, null);
                Log.f30813a.m36615a(C45254i.this.f101792b, "rateEdit:tradeTrackClicked:" + C45254i.this.f101794d);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m100023c(C45254i c45254i, View view, boolean z11) {
        Log.f30813a.m36615a(c45254i.f101792b, "priceEdit:hasFocus:" + z11 + ",isProfit:" + c45254i.f101791a);
        c45254i.f101793c = z11;
    }

    /* JADX INFO: renamed from: d */
    public static final void m100024d(C45254i c45254i, View view, boolean z11) {
        Log.f30813a.m36615a(c45254i.f101792b, "rateEdit:hasFocus:" + z11 + ",isProfit:" + c45254i.f101791a);
        c45254i.f101794d = z11;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getF101791a() {
        return this.f101791a;
    }

    public C45254i(@Nullable EditText editText, @Nullable EditText editText2, boolean z11) {
        this.f101791a = z11;
        if (editText != null) {
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ui.g
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z12) {
                    C45254i.m100023c(this.f101789b, view, z12);
                }
            });
        }
        if (editText != null) {
            editText.addTextChangedListener(new a());
        }
        if (editText2 != null) {
            editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ui.h
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z12) {
                    C45254i.m100024d(this.f101790b, view, z12);
                }
            });
        }
        if (editText2 != null) {
            editText2.addTextChangedListener(new b());
        }
    }
}
