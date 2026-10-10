package gf0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;

/* JADX INFO: renamed from: gf0.d */
/* JADX INFO: compiled from: HtmlEmptyTagReplacement.java */
/* JADX INFO: loaded from: classes60.dex */
public class C37906d {
    @Nullable
    /* JADX INFO: renamed from: a */
    public String m85689a(@NonNull InterfaceC37908f interfaceC37908f) {
        String strName = interfaceC37908f.name();
        if ("br".equals(strName)) {
            return ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
        }
        if ("img".equals(strName)) {
            String str = interfaceC37908f.mo85696b().get("alt");
            if (str != null && str.length() != 0) {
                return str;
            }
            return "￼";
        }
        if ("iframe".equals(strName)) {
            return " ";
        }
        return null;
    }
}
