export class cdn_lists{
	
	cdn_search(){
		if(search.word.value==""){
			alert("검색어를 입력하세요")
		}
		else{
			search.submit();
		}
	}
	
	cdn_listdel(){
		//console.log("test");
		//querySelector : 한 개의 오브젝트 값을 가져오는 역할
		//querySelectorAll : 한개 이상의 같은 이름을 가지 오브젝트를 자뎌오는 역할
		var count = 0;
		var ob = document.querySelectorAll("#ls .ck");
		//console.log(ob);
		var i = 0;
		do{
			if(ob[i].checked){
				//console.log(ob[i].checked);
				count++;
			}
			i++;
		}while(i < ob.length);
		
		if(count == 0){
			alert("선택 삭제시 하나라도 선택이 되어야만 삭제 진행 됩니다.");
		}
		else{
			if(confirm("삭제시 데이터는 복구되지 않습니다. \n삭제 진행 하시겠습니까?")){
				frm.submit();		
			}
		}
	}
}