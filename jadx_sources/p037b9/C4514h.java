package p037b9;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: renamed from: b9.h */
/* JADX INFO: compiled from: DefaultDecoderFactory.java */
/* JADX INFO: loaded from: classes56.dex */
public class C4514h implements InterfaceC4511e {

    /* JADX INFO: renamed from: a */
    public Collection<BarcodeFormat> f3939a;

    /* JADX INFO: renamed from: b */
    public Map<DecodeHintType, ?> f3940b;

    /* JADX INFO: renamed from: c */
    public String f3941c;

    /* JADX INFO: renamed from: d */
    public int f3942d;

    public C4514h() {
    }

    public C4514h(Collection<BarcodeFormat> collection, Map<DecodeHintType, ?> map, String str, int i11) {
        this.f3939a = collection;
        this.f3940b = map;
        this.f3941c = str;
        this.f3942d = i11;
    }

    @Override // p037b9.InterfaceC4511e
    /* JADX INFO: renamed from: a */
    public C4510d mo4328a(Map<DecodeHintType, ?> map) {
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        enumMap.putAll(map);
        Map<DecodeHintType, ?> map2 = this.f3940b;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        Collection<BarcodeFormat> collection = this.f3939a;
        if (collection != null) {
            enumMap.put(DecodeHintType.POSSIBLE_FORMATS, collection);
        }
        String str = this.f3941c;
        if (str != null) {
            enumMap.put(DecodeHintType.CHARACTER_SET, str);
        }
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        multiFormatReader.setHints(enumMap);
        int i11 = this.f3942d;
        if (i11 == 0) {
            return new C4510d(multiFormatReader);
        }
        if (i11 != 1) {
            return i11 != 2 ? new C4510d(multiFormatReader) : new C4516j(multiFormatReader);
        }
        return new C4515i(multiFormatReader);
    }
}
