package p435ln;

import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.webkit.ProxyConfig;
import com.kubi.kyc.R$layout;
import com.kubi.kyc.R$string;
import com.kubi.sdk.BaseApplication;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.regex.Pattern;
import p011a9.C0206f;
import p205dn.C36887g;
import zg0.AbstractC46843b;

/* JADX INFO: renamed from: ln.s */
/* JADX INFO: compiled from: InputCellViewBinder.java */
/* JADX INFO: loaded from: classes21.dex */
public class C42270s extends AbstractC46843b<C42267p, a> {

    /* JADX INFO: renamed from: ln.s$a */
    /* JADX INFO: compiled from: InputCellViewBinder.java */
    public static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        public final C36887g f93753g;

        public a(View view) {
            super(view);
            this.f93753g = C36887g.m82643a(view);
        }
    }

    /* JADX INFO: renamed from: j */
    public String m92774j(String str) {
        return Pattern.compile("[0123456789`~!@#$%^&*()_+=\\[\\]{}|':;,<>/?～！¥…％＆＊￥（）【】「」、｜；：‘’”“，。《》？ˇ€£₤｛｝\\\\｀\"]").matcher(str).replaceAll("");
    }

    @Override // zg0.AbstractC46843b
    @NonNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a mo36823d(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        return new a(layoutInflater.inflate(R$layout.busercenter_item_cell_input, viewGroup, false));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m92773i(C42270s c42270s, a aVar, C42267p c42267p, CharSequence charSequence) throws Exception {
        c42270s.getClass();
        Editable text = aVar.f93753g.f81462b.getText();
        if (text != null) {
            if (text.length() > c42267p.m92767i()) {
                int selectionEnd = Selection.getSelectionEnd(text);
                aVar.f93753g.f81462b.setText(text.toString().substring(0, c42267p.m92767i()));
                text = aVar.f93753g.f81462b.getText();
                if (text != null) {
                    if (selectionEnd > text.length()) {
                        selectionEnd = text.length();
                    }
                    Selection.setSelection(text, selectionEnd);
                } else {
                    return;
                }
            }
            if (c42267p.m92769k()) {
                String string = aVar.f93753g.f81462b.getText().toString();
                String strM92774j = c42270s.m92774j(string);
                if (!string.equals(strM92774j)) {
                    aVar.f93753g.f81462b.setText(strM92774j);
                    aVar.f93753g.f81462b.setSelection(aVar.f93753g.f81462b.getText().length());
                }
            }
            if (c42267p.m92764f() != null && !c42267p.m92764f().isEmpty() && aVar.f93753g.f81462b.getText().toString().contains(ProxyConfig.MATCH_ALL_SCHEMES)) {
                aVar.f93753g.f81462b.setText("");
            }
            if (!c42267p.m92762d().equals(text.toString().trim())) {
                c42267p.m92770l(false);
                aVar.f93753g.f81462b.setActivated(false);
                aVar.f93753g.f81464d.setVisibility(8);
            }
            c42267p.m92771m(text.toString().trim());
            if (c42267p.m92761c() != null) {
                c42267p.m92761c().accept(text.toString().trim());
            }
        }
    }

    @Override // zg0.AbstractC46843b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo36822b(@NonNull final a aVar, @NonNull final C42267p c42267p) {
        if (!TextUtils.isEmpty(c42267p.m92766h())) {
            aVar.f93753g.f81463c.setVisibility(0);
            if (c42267p.m92768j()) {
                aVar.f93753g.f81463c.setTextLabel(c42267p.m92766h());
            } else {
                aVar.f93753g.f81463c.setText(c42267p.m92766h());
            }
        } else {
            aVar.f93753g.f81463c.setVisibility(8);
        }
        if (TextUtils.isEmpty(c42267p.m92763e())) {
            c42267p.m92772n(BaseApplication.get().getResources().getString(R$string.email_not_valid));
        }
        aVar.f93753g.f81464d.setText(c42267p.m92763e());
        if (c42267p.f93695c) {
            aVar.f93753g.f81462b.setActivated(true);
            aVar.f93753g.f81464d.setVisibility(0);
        } else {
            aVar.f93753g.f81462b.setActivated(false);
            aVar.f93753g.f81464d.setVisibility(8);
        }
        Object tag = aVar.f93753g.f81462b.getTag(aVar.f93753g.f81462b.getId());
        if (tag instanceof Disposable) {
            ((Disposable) tag).dispose();
        }
        aVar.f93753g.f81462b.setText(c42267p.m92762d());
        aVar.f93753g.f81462b.setInputType(c42267p.m92765g());
        aVar.f93753g.f81462b.setHint(c42267p.m92764f());
        c42267p.m92760b();
        aVar.f93753g.f81462b.setTag(aVar.f93753g.f81462b.getId(), C0206f.m784d(aVar.f93753g.f81462b).subscribe(new Consumer() { // from class: ln.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                C42270s.m92773i(this.f93750b, aVar, c42267p, (CharSequence) obj);
            }
        }, new Consumer() { // from class: ln.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }));
    }
}
