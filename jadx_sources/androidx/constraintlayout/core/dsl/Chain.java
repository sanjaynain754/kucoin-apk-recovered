package androidx.constraintlayout.core.dsl;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tencent.bugly.proguard.C33844oi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public abstract class Chain extends Helper {
    protected static final Map<Style, String> styleMap;
    private Style mStyle;
    protected ArrayList<Ref> references;

    public class Anchor {
        Constraint.Anchor mConnection = null;
        int mGoneMargin = Integer.MIN_VALUE;
        int mMargin;
        final Constraint.Side mSide;

        public Anchor(Constraint.Side side) {
            this.mSide = side;
        }

        public void build(StringBuilder sb2) {
            if (this.mConnection != null) {
                sb2.append(this.mSide.toString().toLowerCase());
                sb2.append(C33844oi.f71346o);
                sb2.append(this);
                sb2.append(",\n");
            }
        }

        public String getId() {
            return Chain.this.name;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            if (this.mConnection != null) {
                sb2.append("'");
                sb2.append(this.mConnection.getId());
                sb2.append("',");
                sb2.append("'");
                sb2.append(this.mConnection.mSide.toString().toLowerCase());
                sb2.append("'");
            }
            if (this.mMargin != 0) {
                sb2.append(",");
                sb2.append(this.mMargin);
            }
            if (this.mGoneMargin != Integer.MIN_VALUE) {
                if (this.mMargin == 0) {
                    sb2.append(",0,");
                    sb2.append(this.mGoneMargin);
                } else {
                    sb2.append(",");
                    sb2.append(this.mGoneMargin);
                }
            }
            sb2.append("]");
            return sb2.toString();
        }
    }

    public enum Style {
        PACKED,
        SPREAD,
        SPREAD_INSIDE
    }

    public Chain addReference(Ref ref) {
        this.references.add(ref);
        this.configMap.put("contains", referencesToString());
        return this;
    }

    static {
        HashMap map = new HashMap();
        styleMap = map;
        map.put(Style.SPREAD, "'spread'");
        map.put(Style.SPREAD_INSIDE, "'spread_inside'");
        map.put(Style.PACKED, "'packed'");
    }

    public Chain(String str) {
        super(str, new Helper.HelperType(""));
        this.mStyle = null;
        this.references = new ArrayList<>();
    }

    public Style getStyle() {
        return this.mStyle;
    }

    public String referencesToString() {
        if (this.references.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder("[");
        Iterator<Ref> it = this.references.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void setStyle(Style style) {
        this.mStyle = style;
        this.configMap.put(TtmlNode.TAG_STYLE, styleMap.get(style));
    }

    public Chain addReference(String str) {
        return addReference(Ref.parseStringToRef(str));
    }
}
