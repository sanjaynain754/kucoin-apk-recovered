package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.bugly.proguard.C33978va;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes34.dex */
class PreferenceInflater {
    private static final String EXTRA_TAG_NAME = "extra";
    private static final String INTENT_TAG_NAME = "intent";
    private final Object[] mConstructorArgs = new Object[2];

    @NonNull
    private final Context mContext;
    private String[] mDefaultPackages;
    private PreferenceManager mPreferenceManager;
    private static final Class<?>[] CONSTRUCTOR_SIGNATURE = {Context.class, AttributeSet.class};
    private static final HashMap<String, Constructor<?>> CONSTRUCTOR_MAP = new HashMap<>();

    @NonNull
    public Preference inflate(int i11, @Nullable PreferenceGroup preferenceGroup) {
        XmlResourceParser xml = getContext().getResources().getXml(i11);
        try {
            return inflate(xml, preferenceGroup);
        } finally {
            xml.close();
        }
    }

    private Preference createItem(@NonNull String str, @Nullable String[] strArr, AttributeSet attributeSet) throws InflateException, ClassNotFoundException {
        Class<?> cls;
        Constructor<?> constructor = CONSTRUCTOR_MAP.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.mContext.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e11 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e12) {
                                e11 = e12;
                            }
                        }
                        if (cls == null) {
                            if (e11 != null) {
                                throw e11;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                    }
                    constructor = cls.getConstructor(CONSTRUCTOR_SIGNATURE);
                    constructor.setAccessible(true);
                    CONSTRUCTOR_MAP.put(str, constructor);
                } catch (Exception e13) {
                    InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                    inflateException.initCause(e13);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e14) {
                throw e14;
            }
        }
        Object[] objArr = this.mConstructorArgs;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    private Preference createItemFromTag(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? onCreateItem(str, attributeSet) : createItem(str, null, attributeSet);
        } catch (InflateException e11) {
            throw e11;
        } catch (ClassNotFoundException e12) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e12);
            throw inflateException;
        } catch (Exception e13) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e13);
            throw inflateException2;
        }
    }

    private void init(PreferenceManager preferenceManager) {
        this.mPreferenceManager = preferenceManager;
        setDefaultPackages(new String[]{Preference.class.getPackage().getName() + C33978va.f72339h, SwitchPreference.class.getPackage().getName() + C33978va.f72339h});
    }

    @NonNull
    private PreferenceGroup onMergeRoots(PreferenceGroup preferenceGroup, @NonNull PreferenceGroup preferenceGroup2) {
        if (preferenceGroup != null) {
            return preferenceGroup;
        }
        preferenceGroup2.onAttachedToHierarchy(this.mPreferenceManager);
        return preferenceGroup2;
    }

    @NonNull
    public Context getContext() {
        return this.mContext;
    }

    public String[] getDefaultPackages() {
        return this.mDefaultPackages;
    }

    public Preference onCreateItem(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        return createItem(str, this.mDefaultPackages, attributeSet);
    }

    public void setDefaultPackages(String[] strArr) {
        this.mDefaultPackages = strArr;
    }

    public PreferenceInflater(@NonNull Context context, PreferenceManager preferenceManager) {
        this.mContext = context;
        init(preferenceManager);
    }

    private void rInflate(@NonNull XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (INTENT_TAG_NAME.equals(name)) {
                        try {
                            preference.setIntent(Intent.parseIntent(getContext().getResources(), xmlPullParser, attributeSet));
                        } catch (IOException e11) {
                            XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException.initCause(e11);
                            throw xmlPullParserException;
                        }
                    } else if ("extra".equals(name)) {
                        getContext().getResources().parseBundleExtra("extra", attributeSet, preference.getExtras());
                        try {
                            skipCurrentTag(xmlPullParser);
                        } catch (IOException e12) {
                            XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException2.initCause(e12);
                            throw xmlPullParserException2;
                        }
                    } else {
                        Preference preferenceCreateItemFromTag = createItemFromTag(name, attributeSet);
                        ((PreferenceGroup) preference).addItemFromInflater(preferenceCreateItemFromTag);
                        rInflate(xmlPullParser, preferenceCreateItemFromTag, attributeSet);
                    }
                }
            } else {
                return;
            }
        }
    }

    private static void skipCurrentTag(@NonNull XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                if (next == 3 && xmlPullParser.getDepth() <= depth) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @NonNull
    public Preference inflate(XmlPullParser xmlPullParser, @Nullable PreferenceGroup preferenceGroup) {
        int next;
        PreferenceGroup preferenceGroupOnMergeRoots;
        synchronized (this.mConstructorArgs) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.mConstructorArgs[0] = this.mContext;
            do {
                try {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        break;
                    }
                } catch (InflateException e11) {
                    throw e11;
                } catch (IOException e12) {
                    InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e12.getMessage());
                    inflateException.initCause(e12);
                    throw inflateException;
                } catch (XmlPullParserException e13) {
                    InflateException inflateException2 = new InflateException(e13.getMessage());
                    inflateException2.initCause(e13);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next == 2) {
                preferenceGroupOnMergeRoots = onMergeRoots(preferenceGroup, (PreferenceGroup) createItemFromTag(xmlPullParser.getName(), attributeSetAsAttributeSet));
                rInflate(xmlPullParser, preferenceGroupOnMergeRoots, attributeSetAsAttributeSet);
            } else {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
        }
        return preferenceGroupOnMergeRoots;
    }
}
