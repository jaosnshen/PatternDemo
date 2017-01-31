package PrototypePattern;

import java.util.ArrayList;

/**
 *
 * 实现cloneable接口 copy
 * Created by chenhangye on 2017/1/30.
 */
public class WordDocument implements Cloneable {
   private String mText;

   private ArrayList<String> mImages=new ArrayList<>();

    public WordDocument() {
        System.out.printf("---------------WordDocument构造函数--------------------");
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getmImages() {
        return mImages;
    }

    public void setmImages(ArrayList<String> mImages) {
        this.mImages = mImages;
    }

    @Override
    public String toString() {
        return "WordDocument{" +
                "mText='" + mText + '\'' +
                ", mImages=" + mImages +
                '}';
    }

    @Override
    protected WordDocument clone() throws CloneNotSupportedException {
        WordDocument doc= (WordDocument) super.clone();
        doc.mImages=this.mImages;
        doc.mText=this.mText;
        return doc;
    }
}
