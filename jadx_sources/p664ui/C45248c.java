package p664ui;

import android.view.View;
import android.widget.EditText;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.kumex.utils.Log;
import com.kubi.kumex.utils.SimpleTextWatcher;
import com.kubi.resources.widget.ITradeInputLayoutOperations;
import com.kubi.resources.widget.TradeInputLayoutEditor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: ui.c */
/* JADX INFO: compiled from: FuturesTradeTrack.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/futures/trade/track/DelegationPriceAmountTrack;", "", "delegationPrice", "Lcom/kubi/resources/widget/ITradeInputLayoutOperations;", "delegationAmount", "<init>", "(Lcom/kubi/resources/widget/ITradeInputLayoutOperations;Lcom/kubi/resources/widget/ITradeInputLayoutOperations;)V", "tag", "", "delegationPriceClicked", "", "delegationAmountClicked", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45248c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f101781a = "DelegationPriceAmountTrack";

    /* JADX INFO: renamed from: b */
    public boolean f101782b;

    /* JADX INFO: renamed from: c */
    public boolean f101783c;

    /* JADX INFO: renamed from: ui.c$a */
    /* JADX INFO: compiled from: FuturesTradeTrack.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/futures/trade/track/DelegationPriceAmountTrack$1", "Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnSubOrAddClickListener;", "click", "", "isSub", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements TradeInputLayoutEditor.InterfaceC22960b {
        public a() {
        }

        @Override // com.kubi.resources.widget.TradeInputLayoutEditor.InterfaceC22960b
        /* JADX INFO: renamed from: a */
        public void mo22972a(boolean z11) throws JSONException {
            Log.f30813a.m36615a(C45248c.this.f101781a, "delegationPrice:isSub:" + z11);
            C45251f.m100018b(null, "TradePrice", z11 ? "3" : "2", null, 9, null);
        }
    }

    /* JADX INFO: renamed from: ui.c$b */
    /* JADX INFO: compiled from: FuturesTradeTrack.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/trade/track/DelegationPriceAmountTrack$3", "Lcom/kubi/kumex/utils/SimpleTextWatcher;", "onTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "", "start", "", TtmlNode.ANNOTATION_POSITION_BEFORE, "count", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends SimpleTextWatcher {
        public b() {
        }

        @Override // com.kubi.kumex.utils.SimpleTextWatcher, android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) throws JSONException {
            if (C45248c.this.f101782b) {
                C45248c.this.f101782b = false;
                C45251f.m100018b(null, "TradePrice", null, null, 13, null);
                Log.f30813a.m36615a(C45248c.this.f101781a, "delegationPrice:tradeTrackClicked:" + C45248c.this.f101782b);
            }
        }
    }

    /* JADX INFO: renamed from: ui.c$c */
    /* JADX INFO: compiled from: FuturesTradeTrack.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/futures/trade/track/DelegationPriceAmountTrack$4", "Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnSubOrAddClickListener;", "click", "", "isSub", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c implements TradeInputLayoutEditor.InterfaceC22960b {
        public c() {
        }

        @Override // com.kubi.resources.widget.TradeInputLayoutEditor.InterfaceC22960b
        /* JADX INFO: renamed from: a */
        public void mo22972a(boolean z11) throws JSONException {
            Log.f30813a.m36615a(C45248c.this.f101781a, "delegationAmount:isSub:" + z11);
            C45251f.m100018b(null, "TradeQty", z11 ? "3" : "2", null, 9, null);
        }
    }

    /* JADX INFO: renamed from: ui.c$d */
    /* JADX INFO: compiled from: FuturesTradeTrack.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/trade/track/DelegationPriceAmountTrack$6", "Lcom/kubi/kumex/utils/SimpleTextWatcher;", "onTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "", "start", "", TtmlNode.ANNOTATION_POSITION_BEFORE, "count", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class d extends SimpleTextWatcher {
        public d() {
        }

        @Override // com.kubi.kumex.utils.SimpleTextWatcher, android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) throws JSONException {
            if (C45248c.this.f101783c) {
                C45248c.this.f101783c = false;
                C45251f.m100018b(null, "TradeQty", null, null, 13, null);
                Log.f30813a.m36615a(C45248c.this.f101781a, "delegationAmount:tradeTrackClicked:" + C45248c.this.f101783c);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m100007c(C45248c c45248c, View view, boolean z11) {
        Log.f30813a.m36615a(c45248c.f101781a, "delegationPrice:hasFocus:" + z11);
        c45248c.f101782b = z11;
    }

    /* JADX INFO: renamed from: d */
    public static final void m100008d(C45248c c45248c, View view, boolean z11) {
        Log.f30813a.m36615a(c45248c.f101781a, "delegationAmount:hasFocus:" + z11);
        c45248c.f101783c = z11;
    }

    public C45248c(@Nullable ITradeInputLayoutOperations iTradeInputLayoutOperations, @Nullable ITradeInputLayoutOperations iTradeInputLayoutOperations2) {
        EditText editText;
        EditText editText2;
        if (iTradeInputLayoutOperations != null) {
            iTradeInputLayoutOperations.setSubOrAddClickListener(new a());
        }
        if (iTradeInputLayoutOperations != null) {
            iTradeInputLayoutOperations.setInnerFocusChangeListener(new View.OnFocusChangeListener() { // from class: ui.a
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    C45248c.m100007c(this.f101779b, view, z11);
                }
            });
        }
        if (iTradeInputLayoutOperations != null && (editText2 = iTradeInputLayoutOperations.getEditText()) != null) {
            editText2.addTextChangedListener(new b());
        }
        if (iTradeInputLayoutOperations2 != null) {
            iTradeInputLayoutOperations2.setSubOrAddClickListener(new c());
        }
        if (iTradeInputLayoutOperations2 != null) {
            iTradeInputLayoutOperations2.setInnerFocusChangeListener(new View.OnFocusChangeListener() { // from class: ui.b
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    C45248c.m100008d(this.f101780b, view, z11);
                }
            });
        }
        if (iTradeInputLayoutOperations2 != null && (editText = iTradeInputLayoutOperations2.getEditText()) != null) {
            editText.addTextChangedListener(new d());
        }
    }
}
