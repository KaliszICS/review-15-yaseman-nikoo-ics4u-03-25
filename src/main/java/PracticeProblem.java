public class PracticeProblem {

	public static void main(String args[]) {


	}
	public static int goodString(String word){
		String[] wordArr=word.split("");
		int remove = wordArr.length;
		int tempremove= 0;
		for (int i=0; i<wordArr.length-1; i++){
			if (word.indexOf(wordArr[i])!= word.lastIndexOf(wordArr[i])){
				tempremove = wordArr.length-(word.lastIndexOf(wordArr[i])-word.indexOf(wordArr[i])+1);
				if (tempremove<remove){
					remove=tempremove;
				}
			}
		}
		if (remove == wordArr.length){
			remove=-1;
		}
		return remove;
	}

}
