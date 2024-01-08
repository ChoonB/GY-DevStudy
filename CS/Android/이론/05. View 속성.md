***
## 주요 View 속성

### id
> XML에 선언한 객체를 코드에서 사용해야할 때, 식별자를 부여하기 위한 속성

```xml
    <TextView
        android:id="@+id/text1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="hello" />
```
* 위의 코드에서 `android:id="@+id/text1"`의 형태로 id값을 추가한다.
text1이 id값이고, 이 값은 식별자로 이용되므로 앱에서 유일해야 한다.

* xml 속성값이 @로 시작되면 R.java 파일을 의미한다.
즉, 위의 표현식은 R.java 파일에 text1이라는 상수 변수를 추가한다는 의미다.

* 아래의 코드처럼 액티비티에서 findViewById(R.id.아이디값)으로 가져올 수 있다.
```kotlin
// xml 화면 출력
setContentView(R.layout.practice1)
// id값으로 뷰 객체 획득. 두 방식 다 가능
val textView1: TextView = findViewById(R.id.text1)
val textView2 = findViewById<TextView>(R.id.text1)
```

* XML에 입력한 뷰 객체를 코드에서 적절하게 이용해야할 때 이렇게 사용한다.

***

### 크기
> 크기의 속성값은 수치, match_parent, wrap_content 3가지 값이 들어갈 수 있다.

* layout_width : 너비
layout_height : 높이

* 수치는 100px, 200dp 와 같이 구체적인 숫자와 단위를 사용한다

* match_parent는 계층구조에서 부모의 크기 전체를 의미한다.(자신보다 상위 계층의 크기)

* wrap_content는 해당 객체의 크기에 따라 적절한 크기로 설정된다.

* 안드로이드 기기의 크기가 다양하므로 호환성을 위해 구체적 수치보다는 wrap이나 match를 많이 쓰는 편이다.

***
### 간격
> 뷰의 간격은 margin과 padding 속성으로 설정한다.

![](https://velog.velcdn.com/images/choonbok22/post/70ef7930-a50c-4b67-b5bf-abda02838ed4/image.png)

* margin : 뷰와 뷰 사이의 간격

* padding : 뷰의 content(내용)과 border(테두리) 사이의 간격

* 위의 두 속성을 사용하면 4방향 모두 같은 크기의 간격이 설정된다.

* 특정 한방향의 간격만 설정하고 싶으면, paddingLeft, paddingRight, paddingTop, paddingBottom과 layout_marginLeft, layout_marginRight, layout_marginTop, layout_marginBottom 속성을 이용하면 된다.

***

### 뷰의 화면 표시 여부
> visibility 속성을 이용하면 뷰가 화면에 출력되어야 하는지 여부를 설정할 수 있다. 처음엔 화면에 보이지 않다가 어느순간에 보여야 할 때 처리하기 위함이다.

```xml
<TextView
    <-...->
	android:visibility="invisible" />
```

* visible : 기본값. 화면에 보인다.

* invisible : 뷰가 화면에 보이지는 않지만 자리는 차지한다.

* gone : 뷰가 화면에 보이지도 않고 자리도 차지하지 않는다.

* xml이 아닌 코드에서 속성을 조정하려면 view.VISIBLE이나 view.INVISIBLE을 사용하면 된다.
***

## TextView
> 문자열을 화면에 출력하는 뷰

1. android:text
TextView에 출력할 문자열을 지정. 문자열을 대입하거나 android:text="@string/hello"처럼 문자열 리소스를 지정해도 된다.

2. android:textColor
문자열의 색상을 16진수 RGB형식을 사용해 지정한다.

3. android:textSize
문자열의 크기를 지정. 단위는 생략 불가능하며 px, dp, sp, in, mm, px등을 사용

4. android:textStyle
문자열의 스타일 지정. bold, italic, normal중에서 선택 가능

5. android:maxLines
긴 문자열은 자동으로 줄바꿈이 되지만 특정 줄까지만 나오도록 해야할때 사용한다.
ex) android:maxLines="3" 이면 최대 3줄까지만 출력

6. android:ellipsize
maxLines 속성으로 출력되지 않은 문자열이 더 있다는 것을 표시하려면 말줄임표(...)를 넣는데 이때 이 속성을 사용한다. end는 문자열 뒤에 추가된다.
singleLine="true"로 문자열을 한줄로 출력했을때만 start는 앞, middle은 중간에 추가된다.

### android:autoLink
> 특정 형태의 문자열에 자동 링크를 추가해준다.

* 기본값은 none.

* web, phone, email, map과 모두 가능한 all 속성이 있다.

* `|`를 이용해 web|phone 처럼 여러 속성을 선택 가능하다.

![](https://velog.velcdn.com/images/choonbok22/post/6ee7ae03-a1bb-402a-835e-f3cfeed812bc/image.png)


```xml
    <TextView
        android:id="@+id/text1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="테스트업체 - 웹페이지: http://never.com, 전화번호: 010-0123-4567, 이메일: ne@ver.com"
        android:autoLink="web|phone|email"
        android:visibility="visible"
        android:textColor="#FF0000"
        android:textSize="15pt"
        android:textStyle="bold"
        />
```

***

## ImageView
> 이미지를 화면에 출력하는 뷰

* android:src
출력할 이미지를 설정한다. 리소스, 파일, 네트워크 이미지 등을 출력할 수 있다.
android:src="@drawable/image3"처럼 리소스이미지를 쓸 수 있다.

### 최대 크기 설정
> maxWidth, maxHeight, adjustViewBounds로 이미지의 최대 크기를 지정한다.

* layout_width와 layout_height로 이미지 뷰의 크기를 설정하지만, 이 속성은 크기가 고정되어 있어 뷰에 넣을 이미지의 크기가 다양하면 맞지 않을 수 있다. 그리고 wrap_content를 사용할 경우 지나치게 커질 수 있다.

* 따라서, adjustViewBounds 속성을 true로 설정한 후 maxWidth, maxHeight로 최대 크기를 지정하면 된다.

***

## 버튼
* Button : 사용자 이벤트 처리
* CheckBox : 다중선택. 여러개가 있어도 독립적
* RadioButton : 단일 선택 제공. 그룹으로 묶은 라디오 버튼 중 하나만 선택 가능

![](https://velog.velcdn.com/images/choonbok22/post/b1e748af-89a0-468e-84d7-eb94e9b46436/image.png)


```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button1" />
    <CheckBox
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="check1" />
    <CheckBox
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="check2" />
    <RadioGroup
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">
        <RadioButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="radio1"/>
        <RadioButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="radio2"/>
    </RadioGroup>

</LinearLayout>
```

***
## EditText
> 사용자가 글을 입력할 수 있는 뷰

* android:lines
기본적으로 EditText는 한 줄 입력 크기로 출력되었다가 엔터를 누르면 아래줄이 늘어 여러줄 입력 크기가 되는데, 이 속성을 "3"으로 설정하면 처음부터 3줄 입력 크기로 설정된다.

* android:maxLines
"3"으로 설정하면 처음엔 한줄 입력 크기이다가 엔터를 누르면 3줄까지 늘어나며 더는 늘어나지 않는다.

* android:inputType
EditText에 글을 입력할 때 올라오는 키보드를 지정하는 속성
기본적으로는 아래의 표와 같지만 더 많은 속성을 보기 위해서 [안드로이드 개발자 홈페이지](https://developer.android.com/reference/android/widget/TextView#attr_android:inputType) 참고

![](https://velog.velcdn.com/images/choonbok22/post/77eeba53-f147-4196-a407-0b801636cae5/image.png)


![](https://velog.velcdn.com/images/choonbok22/post/bca014ce-8119-41c2-85e2-e605b09896d4/image.png)


