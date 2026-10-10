package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes23.dex */
public class KeyFrames {
    private static final String CUSTOM_ATTRIBUTE = "CustomAttribute";
    private static final String CUSTOM_METHOD = "CustomMethod";
    private static final String TAG = "KeyFrames";
    public static final int UNSET = -1;
    static HashMap<String, Constructor<? extends Key>> sKeyMakers;
    private HashMap<Integer, ArrayList<Key>> mFramesMap = new HashMap<>();

    public KeyFrames() {
    }

    static {
        HashMap<String, Constructor<? extends Key>> map = new HashMap<>();
        sKeyMakers = map;
        try {
            map.put("KeyAttribute", KeyAttributes.class.getConstructor(new Class[0]));
            sKeyMakers.put(TypedValues.PositionType.NAME, KeyPosition.class.getConstructor(new Class[0]));
            sKeyMakers.put(TypedValues.CycleType.NAME, KeyCycle.class.getConstructor(new Class[0]));
            sKeyMakers.put("KeyTimeCycle", KeyTimeCycle.class.getConstructor(new Class[0]));
            sKeyMakers.put(TypedValues.TriggerType.NAME, KeyTrigger.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e11) {
            Log.e(TAG, "unable to load", e11);
        }
    }

    public void addAllFrames(MotionController motionController) {
        ArrayList<Key> arrayList = this.mFramesMap.get(-1);
        if (arrayList != null) {
            motionController.addKeys(arrayList);
        }
    }

    public void addFrames(MotionController motionController) {
        ArrayList<Key> arrayList = this.mFramesMap.get(Integer.valueOf(motionController.mId));
        if (arrayList != null) {
            motionController.addKeys(arrayList);
        }
        ArrayList<Key> arrayList2 = this.mFramesMap.get(-1);
        if (arrayList2 != null) {
            for (Key key : arrayList2) {
                if (key.matches(((ConstraintLayout.LayoutParams) motionController.mView.getLayoutParams()).constraintTag)) {
                    motionController.addKey(key);
                }
            }
        }
    }

    public void addKey(Key key) {
        if (!this.mFramesMap.containsKey(Integer.valueOf(key.mTargetId))) {
            this.mFramesMap.put(Integer.valueOf(key.mTargetId), new ArrayList<>());
        }
        ArrayList<Key> arrayList = this.mFramesMap.get(Integer.valueOf(key.mTargetId));
        if (arrayList != null) {
            arrayList.add(key);
        }
    }

    public ArrayList<Key> getKeyFramesForView(int i11) {
        return this.mFramesMap.get(Integer.valueOf(i11));
    }

    public Set<Integer> getKeys() {
        return this.mFramesMap.keySet();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public KeyFrames(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, ConstraintAttribute> map;
        HashMap<String, ConstraintAttribute> map2;
        byte b11;
        Key keyAttributes;
        try {
            int eventType = xmlPullParser.getEventType();
            Key key = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && ViewTransition.KEY_FRAME_SET_TAG.equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    if (sKeyMakers.containsKey(name)) {
                        switch (name.hashCode()) {
                            case -300573030:
                                if (!name.equals("KeyTimeCycle")) {
                                    b11 = -1;
                                } else {
                                    b11 = 3;
                                }
                                break;
                            case -298435811:
                                if (!name.equals("KeyAttribute")) {
                                    b11 = -1;
                                } else {
                                    b11 = 0;
                                }
                                break;
                            case 540053991:
                                if (!name.equals(TypedValues.CycleType.NAME)) {
                                    b11 = -1;
                                } else {
                                    b11 = 2;
                                }
                                break;
                            case 1153397896:
                                if (!name.equals(TypedValues.PositionType.NAME)) {
                                    b11 = -1;
                                } else {
                                    b11 = 1;
                                }
                                break;
                            case 1308496505:
                                if (!name.equals(TypedValues.TriggerType.NAME)) {
                                    b11 = -1;
                                } else {
                                    b11 = 4;
                                }
                                break;
                            default:
                                b11 = -1;
                                break;
                        }
                        if (b11 == 0) {
                            keyAttributes = new KeyAttributes();
                        } else if (b11 == 1) {
                            keyAttributes = new KeyPosition();
                        } else if (b11 == 2) {
                            keyAttributes = new KeyCycle();
                        } else if (b11 == 3) {
                            keyAttributes = new KeyTimeCycle();
                        } else if (b11 == 4) {
                            keyAttributes = new KeyTrigger();
                        } else {
                            throw new NullPointerException("Key " + name + " not found");
                        }
                        keyAttributes.load(context, Xml.asAttributeSet(xmlPullParser));
                        addKey(keyAttributes);
                        key = keyAttributes;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (key != null && (map2 = key.mCustomConstraints) != null) {
                            ConstraintAttribute.parse(context, xmlPullParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && key != null && (map = key.mCustomConstraints) != null) {
                        ConstraintAttribute.parse(context, xmlPullParser, map);
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e11) {
            Log.e(TAG, "Error parsing XML resource", e11);
        } catch (XmlPullParserException e12) {
            Log.e(TAG, "Error parsing XML resource", e12);
        }
    }

    public static String name(int i11, Context context) {
        return context.getResources().getResourceEntryName(i11);
    }
}
