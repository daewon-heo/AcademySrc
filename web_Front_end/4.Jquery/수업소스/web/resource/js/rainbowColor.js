$('input:checkbox[name^=color]').click(function(){
    if($(this).prop("checked")){                                        // 전체 체크했을때
        $("td[id^=row]").attr("class", $(this).val());                      // td 색깔 클래스 추가
        $("input[value=" + $(this).val() + "]").prop("checked", true);      // 같은값 input 체크
        $("input[value!=" + $(this).val() + "]").prop("checked", false);    // 다른값 input 체크 해제
    }else{                                                              // 전체 체크 풀었을때
        $("input[value=" + $(this).val() + "]").prop("checked", false);     // 같은값 input 체크 해제
        $("td[id^=row]").removeClass();                                     // td 색깔 클래스 제거
    }
});

$('input:checkbox[name^=rain]').click(function(){
    if($(this).prop("checked")) {                                                         // 일반 체크했을때
        $(this).parent().attr("class", $(this).val());                                        // td 색깔 클래스 추가
        $(this).siblings().prop("checked",false);                                             // 나머지 input 체크 해제
    }else                                                                                 // 일반 체크 풀었을때
        $(this).parent().removeClass();                                                      // td 색깔 클래스 제거
    
    if($("input:checkbox[name^=rain][value=" + $(this).val() + "]:checked").length == 7){ // 일반 & 같은값 input이 7개일때 
        $("#row0").attr("class", $(this).val());                                              // 전체 td 색깔 클래스 추가
        $("#row0>input[value=" + $(this).val() + "]").prop("checked", true);                  // 전체 input 체크
    }else{                                                                                // 일반 & 같은값 input이 7개가 아닐떄
        $("#row0>input").prop("checked", false);                                              // 전체 input 체크 해제
        $("#row0").removeClass();                                                             // 전체 td 클래스 제거
    }
});

$("#resetFrm").click(function(){        // 리셋클릭시
    $("td").removeClass();                  // 전체 td 클래스 제거
    $("input").prop("checked", false);      // 전체 input 체크 해제
});