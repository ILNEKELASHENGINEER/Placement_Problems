# 2877. Create a DataFrame from List
import pandas as pd

def createDataframe(student_data: List[List[int]]) -> pd.DataFrame:
    return pd.DataFrame(student_data,columns=['student_id','age'])
    
