/*
	실습 문제 2: javascript 파일
	작성자 : 허대원 
	작성일 : 2018-09-30
	스크립트 설명 :
	   실습2 에 해당하는 자바스크립트 파일입니다.
*/
		function showDiv(element){
		 	// 요구한 내용을 변수, 연산자, 제어문 등을 사용하여 실행되게 하세요.
		 	// 제목 체크시, titleBox 만 보여지게
		 	// 날짜 체크시, dateBox 만 보여지게
		 	// 작성자 체크시, writerBox 만 보여지게 함
			// hint : 선택한 요소의 체크여부는 속성 중 checked라는 속성을 이용하시면 됩니다.

			// 1.
			var elements = document.getElementsByClassName("box");

			for(var i=0;i<elements.length; i++){
				var visibleBox = element.value;

				if(visibleBox == elements[i].id.substr(0,elements[i].id.length-3)){
					elements[i].setAttribute("style", "display:");
				}else{
					elements[i].setAttribute("style", "display:none");
				}
			}

			// 2.
			// var elements = document.getElementsByName('category');

			// for(var i = 0 ; i < elements.length; i++){
			// 	if(elements[i].checked){
			// 		document.getElementById(elements[i].value + 'Box').setAttribute("style", "display:");
			// 	}else{
			// 		document.getElementById(elements[i].value + 'Box').setAttribute("style", "display:none");
			// 	}
			// }
		}
