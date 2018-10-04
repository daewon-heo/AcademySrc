$('input:checkbox[name^=colorAll]').change(function(){
    if($(this).prop("checked")){
        $(this).parent().attr("class", $(this).val());
        $(this).siblings("input").prop("checked",false);
        $(this).parents("tr").siblings().children("td[id^=row]").children("input[value=" +$(this).val() + "]").parent().attr("class", $(this).val());
        $(this).parents("tr").siblings().children("td[id^=row]").children("input[value=" +$(this).val() + "]").prop("checked", true);
        $(this).parents("tr").siblings().children("td[id^=row]").children("input[value!=" +$(this).val() + "]").prop("checked", false);
    }else{
        $(this).parents("tr").siblings().children("td[id^=row]").children("input[value=" +$(this).val() + "]").prop("checked", false);
        $(this).parents("tr").siblings().children("td[id^=row]").removeClass($(this).val());
        $(this).parents("td").removeClass($(this).val());
    }
});

$('input:checkbox[name^=rainbow]').change(function(){
    $(this).parent().attr("class", $(this).val());
    $(this).siblings("input").prop("checked",false);

    if($("input:checkbox[name^=rain][value=" + $(this).val() + "]:checked").length == 7){
        $("#row0").attr("class",$(this).val());
        $("#row0>input[value=" + $(this).val()+ "]").prop("checked", true);
    }else{
        $("#row0>input").prop("checked", false);
        $("#row0").removeClass();
    }

    if(!$(this).prop("checked")) $(this).parents("td").removeClass($(this).val());
});

$("#resetFrm").click(function(){
    $("td").removeClass();
    $("input").prop("checked", false);
});